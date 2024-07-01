import * as meraki from "@pulumi/meraki";

export = async () => {
    const orgs = await meraki.getOrganizations();
    const org = orgs.items[0];
    const networks = await meraki.getNetworks({
        organizationId: org.id
    });

    const network = networks.items[0];

    new meraki.networks.AppliancePorts("example", {
        accessPolicy: "open",
        allowedVlans: "all",
        dropUntaggedTraffic: false,
        enabled: true,
        networkId: network.id,
        portId: "string",
        type: "access",
        vlan: 3
    });

    return {
        networks: networks,
    }
};