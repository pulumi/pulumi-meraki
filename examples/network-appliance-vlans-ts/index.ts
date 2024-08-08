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

  const vlanSettings = new meraki.networks.ApplianceVlansSettings(
    "vlan-settings",
    {
      networkId: network.id,
      vlansEnabled: true,
    }
  );

  new meraki.networks.ApplianceVlans(
    "appliance-vlans",
    {
      name: "guest",
      networkId: network.id,
      vlanId: "2",
      subnet: "192.168.2.0/24",
      applianceIp: "192.168.2.1",
      dhcpHandling: "Run a DHCP server",
      dnsNameservers: "upstream_dns",
      dhcpLeaseTime: "1 day",
      dhcpBootOptionsEnabled: false,
      reservedIpRanges: [
        { comment: "reserved", start: "192.168.2.2", end: "192.168.2.3" },
        { comment: "excluded", start: "192.168.2.4", end: "192.168.2.5" },
      ],
    },
    { dependsOn: [vlanSettings] }
  );
};
