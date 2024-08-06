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

  // ERROR: "Unsupported for networks without a failover capable MX"
  new meraki.networks.ApplianceTrafficShapingCustomPerformanceClasses(
    "example",
    {
      networkId: network.id,
      parameters: {
        maxJitter: 100,
        maxLatency: 100,
        maxLossPercentage: 5,
        name: "My Performance Class",
      },
    }
  );
};
