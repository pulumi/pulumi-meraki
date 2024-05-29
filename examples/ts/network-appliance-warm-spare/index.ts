import * as meraki from "@pulumi/meraki";

export = async () => {
    const orgs = await meraki.getOrganizations();
    const org = orgs.items[0];
    const networks = await meraki.getNetworks({
        organizationId: org.id
    });

    const network = networks.items[1];

    new meraki.networks.ApplianceWarmSpare("example", {
        enabled: true,
        networkId: network.id,
        spareSerial: "Q3GB-WEYB-MDH3",
        uplinkMode: "virtual",
        virtualIp1: "1.2.3.4",
        virtualIp2: "1.2.3.4"
    });

    return {
        networks: networks,
    }
};