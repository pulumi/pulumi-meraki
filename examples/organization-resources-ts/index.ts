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

  new meraki.organizations.AdaptivePolicyGroups("grps", {
    organizationId: organizationId,
    description: "test group by Pulumi",
    name: "pulumi test",
    sgt: 1005,
  });

  // broken until https://github.com/pulumi/pulumi-meraki/issues/28 is resolved
  new meraki.networks.AlertsSettings("alertsSettingsResource", {
    networkId: network.id,
    alerts: [
      {
        alertDestinations: {
          allAdmins: false,
          emails: ["test@email.com"],
          httpServerIds: ["aHR0cHM6Ly93d3cuZXhhbXBsZS5jb20vd2ViaG9va3M"],
          snmp: false,
        },
        enabled: true,
        filters: {
          period: 0,
          threshold: 0,
          timeout: 0,
        },
        type: "gatewayDown",
      },
    ],
    defaultDestinations: {
      allAdmins: false,
      emails: ["test@email.com"],
      httpServerIds: ["aHR0cHM6Ly93d3cuZXhhbXBsZS5jb20vd2ViaG9va3M"],
      snmp: false,
    },
  });
};
