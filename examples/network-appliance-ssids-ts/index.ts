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

  // error: Resource NetworksApplianceSSIDs only have update context, not create.: error with operation GetNetworkApplianceSsid
  new meraki.networks.ApplianceSsids("example", {
    authMode: "8021x-radius",
    defaultVlanId: 1,
    dhcpEnforcedDeauthentication: {
      enabled: true,
    },
    dot11w: {
      enabled: true,
      required: true,
    },
    enabled: true,
    encryptionMode: "wpa",
    name: "My SSID",
    networkId: network.id,
    number: 0,
    psk: "psk",
    radiusServers: [
      {
        host: "0.0.0.0",
        port: 1000,
        secret: "secret",
      },
    ],
    visible: true,
    wpaEncryptionMode: "WPA2 only",
  });
};
