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

  // ERROR: "'protectedNetworks' is not supported by this network. Please ensure the network is set to 'passthrough' mode"
  new meraki.networks.ApplianceSecurityIntrusion("example", {
    idsRulesets: "balanced",
    mode: "prevention",
    networkId: network.id,
    protectedNetworks: {
      excludedCidrs: ["10.0.0.0/8", "127.0.0.0/8"],
      includedCidrs: [
        "10.0.0.0/8",
        "127.0.0.0/8",
        "169.254.0.0/16",
        "172.16.0.0/12",
      ],
      useDefault: false,
    },
  });
};
