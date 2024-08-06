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

  new meraki.networks.AlertsSettings("alert-settings", {
    networkId: network.id,
    defaultDestinations: {
      snmp: false,
      allAdmins: true,
    },
    alerts: [
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: true,
        filters: {
          timeout: 5,
        },
        type: "applianceDown",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: false,
        filters: {
          period: 1200,
          threshold: 104857600,
        },
        type: "usageAlert",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: true,
        filters: {
          timeout: 5,
        },
        type: "portDown",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: true,
        filters: {
          timeout: 5,
        },
        type: "switchDown",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: true,
        filters: {
          timeout: 5,
        },
        type: "cellularGatewayDown",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: true,
        filters: {
          timeout: 5,
        },
        type: "gatewayDown",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: false,
        filters: {
          timeout: 60,
        },
        type: "repeaterDown",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: true,
        filters: {},
        type: "ampMalwareDetected",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: false,
        filters: {},
        type: "ampMalwareBlocked",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: true,
        filters: {},
        type: "failoverEvent",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: true,
        filters: {},
        type: "dhcpNoLeases",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: true,
        filters: {},
        type: "rogueDhcp",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: true,
        filters: {},
        type: "ipConflict",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: false,
        filters: {},
        type: "ip6Conflict",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: false,
        filters: {},
        type: "dhcp6naRenumber",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: false,
        filters: {},
        type: "dhcp6pdRenumber",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: true,
        filters: {},
        type: "cellularUpDown",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: false,
        filters: {},
        type: "clientConnectivity",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: true,
        filters: {},
        type: "vrrp",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: true,
        filters: {},
        type: "vpnConnectivityChange",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: true,
        filters: {},
        type: "settingsChanged",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: false,
        filters: {},
        type: "weeklyUmbrella",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: false,
        filters: {},
        type: "prefixStarvation",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: true,
        filters: {},
        type: "powerSupplyDown",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: true,
        filters: {},
        type: "rpsBackup",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: true,
        filters: {},
        type: "udldError",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: true,
        filters: {},
        type: "portError",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: true,
        filters: {},
        type: "portSpeed",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: true,
        filters: {},
        type: "newDhcpServer",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: true,
        filters: {},
        type: "switchCriticalTemperature",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: true,
        filters: {},
        type: "gatewayToRepeater",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: true,
        filters: {},
        type: "rogueAp",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: false,
        filters: {},
        type: "snr",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: false,
        filters: {},
        type: "highWirelessUsage",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: false,
        filters: {},
        type: "onboarding",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: false,
        filters: {},
        type: "weeklyPresence",
      },
      {
        alertDestinations: {
          allAdmins: false,
          snmp: false,
        },
        enabled: false,
        filters: {},
        type: "uplinkIp6Conflict",
      },
    ],
    muting: {
      byPortSchedules: {
        enabled: true,
      },
    },
  });
};
