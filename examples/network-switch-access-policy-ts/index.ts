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

  new meraki.networks.SwitchAccessPolicies("example", {
    accessPolicyType: "Hybrid authentication",
    dot1x: {
      controlDirection: "inbound",
    },
    guestPortBouncing: false,
    guestVlanId: 100,
    hostMode: "Single-Host",
    increaseAccessSpeed: false,
    name: "Access policy #1",
    networkId: network.id,
    radius: {
      criticalAuth: {
        dataVlanId: 100,
        suspendPortBounce: true,
        voiceVlanId: 100,
      },
      failedAuthVlanId: 100,
      reAuthenticationInterval: 120,
    },
    radiusAccountingEnabled: true,
    radiusAccountingServers: [
      {
        host: "1.2.3.4",
        port: 22,
        secret: "secret",
      },
    ],
    radiusCoaSupportEnabled: false,
    radiusGroupAttribute: "11",
    radiusServers: [
      {
        host: "1.2.3.4",
        port: 22,
        secret: "secret",
      },
    ],
    radiusTestingEnabled: false,
    urlRedirectWalledGardenEnabled: true,
    urlRedirectWalledGardenRanges: ["192.168.1.0/24"],
    voiceVlanClients: true,
  });
};
