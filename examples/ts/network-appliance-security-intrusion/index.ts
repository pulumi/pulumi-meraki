import * as meraki from "@pulumi/meraki";

export = async () => {
    const orgs = await meraki.getOrganizations();
    const org = orgs.items[0];
    const networks = await meraki.getNetworks({
        organizationId: org.id
    });

    const network = networks.items[1];

    // ERROR: "'protectedNetworks' is not supported by this network. Please ensure the network is set to 'passthrough' mode"
    new meraki.networks.ApplianceSecurityIntrusion("example", {
        idsRulesets: "balanced",
        mode: "prevention",
        networkId: network.id,
        protectedNetworks: {
            excludedCidrs: ["10.0.0.0/8", "127.0.0.0/8"],
            includedCidrs: ["10.0.0.0/8", "127.0.0.0/8", "169.254.0.0/16", "172.16.0.0/12"],
            useDefault: false
        }
    });

    return {
        networks: networks,
    }
};