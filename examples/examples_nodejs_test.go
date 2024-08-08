// Copyright 2016-2024, Pulumi Corporation.  All rights reserved.
//go:build nodejs || all
// +build nodejs all

package examples

import (
	"os"
	"path/filepath"
	"testing"

	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/opttest"
)

func TestGetDevicesTs(t *testing.T) {
	t.Skip("Skipping Pulumi Test as this currently doesn't work. See https://github.com/pulumi/pulumi-meraki/issues/134 for more details")
	checkBaseEnvVars(t)
	test := pulumitest.NewPulumiTest(t, "get-devices-ts",
		opttest.LocalProviderPath("meraki", filepath.Join(getCwd(t), "..", "bin")),
	)
	test.SetConfig("organizationId", os.Getenv(EnvMerakiOrgID))
	test.Preview()
}

func TestNetworkBaseTs(t *testing.T) {
	checkBaseEnvVars(t)
	test := pulumitest.NewPulumiTest(t, "network-base-ts",
		opttest.LocalProviderPath("meraki", filepath.Join(getCwd(t), "..", "bin")),
		opttest.YarnLink("@pulumi/meraki"),
	)
	test.SetConfig("organizationId", os.Getenv(EnvMerakiOrgID))
	test.SetConfig("networkName", "Pulumi Base Test Network_" + randomString(6))
	test.Up()
}

func TestNetworkSettingsTs(t *testing.T) {
	checkBaseEnvVars(t)
	test := pulumitest.NewPulumiTest(t, "network-settings-ts",
		opttest.LocalProviderPath("meraki", filepath.Join(getCwd(t), "..", "bin")),
		opttest.YarnLink("@pulumi/meraki"),
	)
	test.SetConfig("organizationId", os.Getenv(EnvMerakiOrgID))
	test.SetConfig("networkName", "Pulumi Base Test Network_" + randomString(6))
	test.Up()
}

func TestApplianceVlansTs(t *testing.T) {
	checkBaseEnvVars(t)
	test := pulumitest.NewPulumiTest(t, "network-appliance-vlans-ts",
		opttest.LocalProviderPath("meraki", filepath.Join(getCwd(t), "..", "bin")),
		opttest.YarnLink("@pulumi/meraki"),
	)
	test.SetConfig("organizationId", os.Getenv(EnvMerakiOrgID))
	test.SetConfig("networkName", "Pulumi Base Test Network_" + randomString(6))
	test.Up()
}

func TestApplianceVlanProfilesTs(t *testing.T) {
	checkBaseEnvVars(t)
	test := pulumitest.NewPulumiTest(t, "network-appliance-vlan-profiles-ts",
		opttest.LocalProviderPath("meraki", filepath.Join(getCwd(t), "..", "bin")),
		opttest.YarnLink("@pulumi/meraki"),
	)
	test.SetConfig("organizationId", os.Getenv(EnvMerakiOrgID))
	test.SetConfig("networkName", "Pulumi Base Test Network_" + randomString(6))
	test.Up()
}

func TestAlertSettingsTs(t *testing.T) {
	checkBaseEnvVars(t)
	test := pulumitest.NewPulumiTest(t, "network-alert-settings-ts",
		opttest.LocalProviderPath("meraki", filepath.Join(getCwd(t), "..", "bin")),
		opttest.YarnLink("@pulumi/meraki"),
	)
	test.SetConfig("organizationId", os.Getenv(EnvMerakiOrgID))
	test.SetConfig("networkName", "Pulumi Base Test Network_" + randomString(6))
	test.Up()
}

func TestApplianceContentFilterTs(t *testing.T) {
	checkBaseEnvVars(t)
	test := pulumitest.NewPulumiTest(t, "network-appliance-content-filtering-ts",
		opttest.LocalProviderPath("meraki", filepath.Join(getCwd(t), "..", "bin")),
		opttest.YarnLink("@pulumi/meraki"),
	)
	test.SetConfig("organizationId", os.Getenv(EnvMerakiOrgID))
	test.SetConfig("networkName", "Pulumi Base Test Network_" + randomString(6))
	test.Up()
}

func TestWebhooksHttpServersTs(t *testing.T) {
	checkBaseEnvVars(t)
	test := pulumitest.NewPulumiTest(t, "network-webhooks-http-servers-ts",
		opttest.LocalProviderPath("meraki", filepath.Join(getCwd(t), "..", "bin")),
		opttest.YarnLink("@pulumi/meraki"),
	)
	test.SetConfig("organizationId", os.Getenv(EnvMerakiOrgID))
	test.SetConfig("networkName", "Pulumi Base Test Network_" + randomString(6))
	test.Up()
}
