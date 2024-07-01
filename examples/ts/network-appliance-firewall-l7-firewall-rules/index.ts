import * as meraki from "@pulumi/meraki";

export = async () => {
    const orgs = await meraki.getOrganizations();
    const org = orgs.items[0];
    const networks = await meraki.getNetworks({
        organizationId: org.id
    });

    const network = networks.items[0];

    new meraki.networks.ApplianceFirewallL7FirewallRules("l7rules", {
        networkId: network.id,
        rules: [{
            policy: "deny",
            type: "host",
            value: "example.com"
        }]
    });

    return {
        networks: networks,
    }
};