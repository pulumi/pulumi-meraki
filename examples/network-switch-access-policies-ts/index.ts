import * as pulumi from "@pulumi/pulumi";
import * as meraki from "@pulumi/meraki";

export = async () => {
  const config = new pulumi.Config();
  const organizationId = config.requireSecret("organizationId");
  const networkName = config.get("networkName") || "Pulumi Base Test Network";

  const network = new meraki.networks.Base("base-network", {
    name: networkName,
    notes:
      "This is a test network created by the Pulumi team in an integration test.",
    organizationId: organizationId,
    productTypes: ["appliance", "switch", "wireless", "cellularGateway"],
    timeZone: "America/Chicago",
    tags: ["US-Env01-0001", "US-Env01-0002"],
  });

  new meraki.networks.SwitchAccessPolicies("switch-access-policy", {
    name: "Access policy Test",
    networkId: network.id,
    accessPolicyType: "MAC authentication bypass",
    dot1x: {
      controlDirection: "both",
    },
    hostMode: "Single-Host",
    radius: {
      criticalAuth: {
        suspendPortBounce: false,
      },
    },
    radiusAccountingEnabled: true,
    radiusAccountingServers: [
      {
        host: "1.2.3.4",
        port: 1812,
        secret: "secret",
      },
    ],
    radiusCoaSupportEnabled: false,
    radiusServers: [
      {
        host: "1.2.3.4",
        port: 1812,
        secret: "secret",
      },
    ],
    radiusTestingEnabled: true,
    urlRedirectWalledGardenEnabled: false,
    voiceVlanClients: true,
  });
};
