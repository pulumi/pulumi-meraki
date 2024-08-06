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

  new meraki.networks.ApplianceContentFiltering("filter", {
    allowedUrlPatterns: ["https://www.example.com", "https://www.example.org"],
    blockedUrlCategories: [
      "meraki:contentFiltering/category/C1",
      "meraki:contentFiltering/category/C2",
      "meraki:contentFiltering/category/C3",
    ],
    blockedUrlPatterns: ["https://www.example.net", "https://www.example.io"],
    networkId: network.id,
    urlCategoryListSize: "topSites",
  });
};
