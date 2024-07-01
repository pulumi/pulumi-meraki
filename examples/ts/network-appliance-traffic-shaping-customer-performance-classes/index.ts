import * as meraki from "@pulumi/meraki";

export = async () => {
    const orgs = await meraki.getOrganizations();
    const org = orgs.items[0];
    const networks = await meraki.getNetworks({
        organizationId: org.id
    });

    const network = networks.items[1];

    // ERROR: "Unsupported for networks without a failover capable MX"
    new meraki.networks.ApplianceTrafficShapingCustomPerformanceClasses("example", {
        networkId: network.id,
        parameters: {
            maxJitter: 100,
            maxLatency: 100,
            maxLossPercentage: 5,
            name: "My Performance Class",
        }
    });

    return {
        networks: networks,
    }
};