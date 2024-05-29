import * as meraki from "@pulumi/meraki";

export = async () => {
    const orgs = await meraki.getOrganizations();
    const org = orgs.items[0];
    const networks = await meraki.getNetworks({
        organizationId: org.id
    });

    const network = networks.items[0];

    // error: Resource NetworksApplianceSSIDs only have update context, not create.: error with operation GetNetworkApplianceSsid
    new meraki.networks.ApplianceSsids("example", {
        authMode: "8021x-radius",
        defaultVlanId: 1,
        dhcpEnforcedDeauthentication: {
            enabled: true
        },
        dot11w: {
            enabled: true,
            required: true
        },
        enabled: true,
        encryptionMode: "wpa",
        name: "My SSID",
        networkId: network.id,
        number: 0,
        psk: "psk",
        radiusServers: [{
            host: "0.0.0.0",
            port: 1000,
            secret: "secret"
        }],
        visible: true,
        wpaEncryptionMode: "WPA2 only"
    });

    return {
        networks: networks,
    }
};