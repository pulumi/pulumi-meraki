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

func applyResourceIDs(info tfbridge.PropertyVisitInfo) (tfbridge.PropertyVisitResult, error) {
	path := info.SchemaPath()

	res, ok := info.Root.(tfbridge.VisitResourceRoot)

	if !ok || len(path) > 1 || (res.Info != nil && res.Info.ComputeID != nil) {
		return tfbridge.PropertyVisitResult{HasEffect: false}, nil
	}

	// If the resource already has an ID property, just use that.
	if _, ok := res.Schema.Schema().GetOk("id"); ok {
		return tfbridge.PropertyVisitResult{HasEffect: false}, nil
	}

	// On each resource, we check for 1 of the 4 known ID properties.
	//
	// If a resource has just one, we set that as the ID. If a resource has more then
	// 1, we error and allow an operator to pick which one.
	const (
		subID  = "subscription_id"
		serial = "serial"
		netID  = "network_id"
		orgID  = "organization_id"
	)

	field := path[0].(walk.GetAttrStep).Name
	switch field {
	case subID, serial, netID, orgID:
		for _, otherID := range []string{subID, serial, netID, orgID} {
			if otherID == field {
				continue
			}

			if _, ok := res.Schema.Schema().GetOk(otherID); ok {
				msg := "%s: Ambiguous ID fields: both %s and %s found, please resolve by manually setting ComputeID"
				return tfbridge.PropertyVisitResult{}, fmt.Errorf(msg, res.TfToken, field, otherID)
			}
		}

		res.Info.ComputeID = delegateIDField(resource.PropertyKey(field))
		return tfbridge.PropertyVisitResult{HasEffect: true}, nil

	default:
		return tfbridge.PropertyVisitResult{HasEffect: false}, nil
	}
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
		// LogoURL is optional but useful to help identify your package in the Pulumi Registry
		// if this package is published there.
		//
		// You may host a logo on a domain you control or add an SVG logo for your package
		// in your repository and use the raw content URL for that file as your logo URL.
		LogoURL: "https://raw.githubusercontent.com/pulumi/pulumi-meraki/main/docs/meraki.png",
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
					"item", "subscription_id",
				}),
			},
			"meraki_administered_licensing_subscription_subscriptions_claim_key_validate": {
				ComputeID: delegateIDProperty(resource.PropertyPath{
					"item", "subscription_id",
				}),
			},

			"meraki_devices": {
				Tok:       makeResource("devices", "base"),
				ComputeID: delegateIDField("serial"), // Ambiguous ID (also network_id)
			},
			"meraki_networks": {Tok: makeResource("networks", "base")},
			"meraki_networks_switch_routing_multicast_rendezvous_points": {
				ComputeID: delegateIDField("network_id"), // Ambiguous ID (also serial)
			},

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
		},
		Python: &tfbridge.PythonInfo{
			PackageName: "pulumi_meraki",

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
		},
		CSharp: &tfbridge.CSharpInfo{
			RootNamespace: "Pulumi",

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
