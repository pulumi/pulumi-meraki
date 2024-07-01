import * as meraki from "@pulumi/meraki";

export = async () => {
    const orgs = await meraki.getOrganizations();
    const org = orgs.items[0];
    const networks = await meraki.getNetworks({
        organizationId: org.id
    });

    const network = networks.items[0];

    // https://github.com/pulumi/pulumi-meraki/issues/29
    new meraki.networks.ApplianceContentFiltering("filter", {
        allowedUrlPatterns: [
            "https://www.example.com",
            "https://www.example.org"
        ],
        blockedUrlCategoriesRs: [
            "meraki:contentFiltering/category/C1",
            "meraki:contentFiltering/category/C2",
            "meraki:contentFiltering/category/C3",
        ],
        blockedUrlPatterns: [
            "https://www.example.net",
            "https://www.example.io"
        ],
        networkId: network.id,
        urlCategoryListSize: "topSites"
    });

    return {
        networks: networks,
    }
};