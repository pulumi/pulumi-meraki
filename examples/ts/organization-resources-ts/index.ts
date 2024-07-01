import * as pulumi from "@pulumi/pulumi";
import * as meraki from "@pulumi/meraki";

export = async () => {
    const orgs = await meraki.getOrganizations();

    const adaptivePolicyGroups = new meraki.organizations.AdaptivePolicyGroups("grps", {
        organizationId: orgs.items[0].id,
        description: "test group by Pulumi",
        name: "pulumi test",
        sgt: 1005
    });

    return {
        polGroups: adaptivePolicyGroups
    }
};