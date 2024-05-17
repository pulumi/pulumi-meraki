// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package provider

import (
	"context"
	"fmt"
	"path"
	"strings"

	_ "embed" // Allow embedding provider metadata

	"terraform-provider-meraki/meraki"

	pf "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tks "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/walk"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"

	"github.com/pulumi/pulumi-meraki/provider/pkg/version"
)

//go:embed cmd/pulumi-resource-meraki/bridge-metadata.json
var bridgeMetadata []byte

const (
	mainPkg = "meraki"

	mainMod = "index"
)

func makeResource(mod string, res string) tokens.Type {
	mod = strings.ToLower(mod)
	return tfbridge.MakeResource(mainPkg, mod, res)
}

type computeIDFunc = func(ctx context.Context, state resource.PropertyMap) (resource.ID, error)

func delegateIDField(field resource.PropertyKey) computeIDFunc {
	return tfbridge.DelegateIDField(field, "meraki", "https://github.com/pulumi/pulumi-meraki")
}

func delegateIDProperty(field resource.PropertyPath) computeIDFunc {
	return tfbridge.DelegateIDProperty(field, "meraki", "https://github.com/pulumi/pulumi-meraki")
}

// applyResourceIDs (when passed to tfbridge.MustTraverseProperties) sets ComputeID as
// appropriate.
//
// Unlike other TF providers, meraki doesn't have a consistent ID name ("id"), instead
// each module (as distinguished by prefix) has it's own consistent ID name.
func applyResourceIDs(info tfbridge.PropertyVisitInfo) (tfbridge.PropertyVisitResult, error) {
	path := info.SchemaPath()

	// If the property is not on a resource at the top level, or if ComputeID is
	// already set, do nothing.
	res, ok := info.Root.(tfbridge.VisitResourceRoot)
	if !ok || len(path) > 1 || (res.Info != nil && res.Info.ComputeID != nil) {
		return tfbridge.PropertyVisitResult{HasEffect: false}, nil
	}

	// If the resource already has an ID property, just use that.
	if id, ok := res.Schema.Schema().GetOk("id"); ok && id.Computed() && !id.Optional() {
		return tfbridge.PropertyVisitResult{HasEffect: false}, nil
	}

	field := path[0].(walk.GetAttrStep).Name
	setField := func() (tfbridge.PropertyVisitResult, error) {
		res.Info.ComputeID = delegateIDField(resource.PropertyKey(
			tfbridge.TerraformToPulumiNameV2(field,
				info.EnclosingSchemaMap(), info.EnclosingSchemaInfoMap())))
		return tfbridge.PropertyVisitResult{HasEffect: true}, nil
	}

	// The actual mapping between ID property name and the module prefix they are used
	// in. Each case looks like, given $ID_NAME and $MODULE:
	//
	//	case "$ID_NAME":
	//		if strings.HasPrefix(res.TfToken, "meraki_$MODULE") {
	//			return setField()
	//		}
	//
	switch field {
	case "subscription_id":
		if strings.HasPrefix(res.TfToken, "meraki_administered_licensing_subscription") {
			return setField()
		}
	case "serial":
		if strings.HasPrefix(res.TfToken, "meraki_devices") {
			return setField()
		}
	case "network_id":
		if strings.HasPrefix(res.TfToken, "meraki_networks") {
			return setField()
		}
	case "organization_id":
		if strings.HasPrefix(res.TfToken, "meraki_organizations") {
			return setField()
		}
	}
	return tfbridge.PropertyVisitResult{HasEffect: false}, nil
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := pf.ShimProvider(meraki.Provider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:    p,
		Name: "meraki",
		// DisplayName is a way to be able to change the casing of the provider
		// name when being displayed on the Pulumi registry
		DisplayName: "Meraki",
		// The default publisher for all packages is Pulumi.
		// Change this to your personal name (or a company name) that you
		// would like to be shown in the Pulumi Registry if this package is published
		// there.
		Publisher: "pulumi",
		// LogoURL points to the assets/meraki.png file on the assets branch of
		// this repo.
		LogoURL: "https://raw.githubusercontent.com/pulumi/pulumi-meraki/assets/assets/meraki.png",
		// PluginDownloadURL is an optional URL used to download the Provider
		// for use in Pulumi programs
		// e.g https://github.com/org/pulumi-provider-name/releases/
		PluginDownloadURL: "github://api.github.com/pulumi/pulumi-meraki",
		Description:       "A Pulumi package for creating and managing Meraki resources",
		// category/cloud tag helps with categorizing the package in the Pulumi Registry.
		// For all available categories, see `Keywords` in
		// https://www.pulumi.com/docs/guides/pulumi-packages/schema/#package.
		Keywords: []string{
			"pulumi",
			"meraki",
			"category/network",
		},
		License:    "Apache-2.0",
		Homepage:   "https://github.com/pulumi/pulumi-meraki",
		Repository: "https://github.com/pulumi/pulumi-meraki",
		// The GitHub Org for the provider - defaults to `terraform-providers`. Note that this
		// should match the TF provider module's require directive, not any replace directives.
		Version:           version.Version,
		GitHubOrg:         "cisco-open",
		MetadataInfo:      tfbridge.NewProviderMetadata(bridgeMetadata),
		TFProviderVersion: "0.2.0",
		UpstreamRepoPath:  "./upstream",
		Resources: map[string]*tfbridge.ResourceInfo{
			"meraki_administered_licensing_subscription_subscriptions_claim": {
				ComputeID: delegateIDProperty(resource.PropertyPath{
					"item", "subscriptionId",
				}),
			},
			"meraki_administered_licensing_subscription_subscriptions_claim_key_validate": {
				ComputeID: delegateIDProperty(resource.PropertyPath{
					"item", "subscriptionId",
				}),
			},

			"meraki_devices":       {Tok: makeResource("devices", "base")},
			"meraki_networks":      {Tok: makeResource("networks", "base")},
			"meraki_organizations": {Tok: makeResource("organizations", "base")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			PackageName: "@pulumi/meraki",

			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Python: &tfbridge.PythonInfo{
			RespectSchemaVersion: true,
			PackageName:          "pulumi_meraki",

			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},

			PyProject: struct{ Enabled bool }{true},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: path.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", "meraki"),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				"meraki",
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			RootNamespace:        "Pulumi",

			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		},
		Java: &tfbridge.JavaInfo{
			BasePackage: "com.pulumi",
		},
	}

	tfbridge.MustTraverseProperties(&prov, "ids", applyResourceIDs)

	prov.MustComputeTokens(tks.KnownModules("meraki_", mainMod, []string{
		"administered_",
		"devices_",
		"networks_",
		"organizations_",
	}, tks.MakeStandard(mainPkg)))
	prov.SetAutonaming(255, "-")
	prov.MustApplyAutoAliases()

	return prov
}
