import * as meraki from "@pulumi/meraki";

export = async () => {
    const orgs = await meraki.getOrganizations();
    const org = orgs.items[0];
    const networks = await meraki.getNetworks({
        organizationId: org.id
    });

    const network = networks.items[1];

    new meraki.networks.SwitchStp("example", {
        networkId: network.id,
        rstpEnabled: true,
        stpBridgePriorities: [{
            stpPriority: 32768,
            switches: ["Q234-ABCD-0001", "Q234-ABCD-0002", "Q234-ABCD-0003"]
        }]
    });

    return {
        networks: networks,
    }
};