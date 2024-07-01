import * as meraki from "@pulumi/meraki";

export = async () => {
    const orgs = await meraki.getOrganizations();
    const org = orgs.items[0];
    const networks = await meraki.getNetworks({
        organizationId: org.id
    });

    const network = networks.items[0];

    // broken until https://github.com/pulumi/pulumi-meraki/issues/26 is resolved
    new meraki.networks.DevicesClaim("claim", {
        networkId: network.id,
        parameters: {
            serials: [
                "Q3GB-WEYB-MDH3"
            ]
        }
    });

    return {
        networks: networks,
    }
};