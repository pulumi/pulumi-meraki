import * as meraki from "@pulumi/meraki";

export = async () => {
    const orgs = await meraki.getOrganizations();
    const org = orgs.items[0];
    const networks = await meraki.getNetworks({
        organizationId: org.id
    });

    const network = networks.items[1];

    new meraki.networks.SwitchAccessPolicies("example", {
        accessPolicyType: "Hybrid authentication",
        dot1x: {
            controlDirection: "inbound"
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
                voiceVlanId: 100
            },
            failedAuthVlanId: 100,
            reAuthenticationInterval: 120
        },
        radiusAccountingEnabled: true,
        radiusAccountingServers: [{
            host: "1.2.3.4",
            port: 22,
            secret: "secret"
        }],
        radiusCoaSupportEnabled: false,
        radiusGroupAttribute: "11",
        radiusServers: [{
            host: "1.2.3.4",
            port: 22,
            secret: "secret"
        }],
        radiusTestingEnabled: false,
        urlRedirectWalledGardenEnabled: true,
        urlRedirectWalledGardenRanges: ["192.168.1.0/24"],
        voiceVlanClients: true
    });

    return {
        networks: networks,
    }
};