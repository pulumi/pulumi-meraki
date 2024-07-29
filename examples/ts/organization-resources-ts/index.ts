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

    const org = orgs.items[0];
    const networks = await meraki.getNetworks({
        organizationId: org.id
    });

    const network = networks.items[0];

    // broken until https://github.com/pulumi/pulumi-meraki/issues/28 is resolved
    new meraki.networks.AlertsSettings("alertsSettingsResource", {
        networkId: network.id,
        alerts: [{
            alertDestinations: {
                allAdmins: false,
                emails: ["test@email.com"],
                httpServerIds: ["aHR0cHM6Ly93d3cuZXhhbXBsZS5jb20vd2ViaG9va3M"],
                snmp: false,
            },
            enabled: true,
            filters: {
                period: 0,
                threshold: 0,
                timeout: 0,
            },
            type: "gatewayDown",
        }],
        defaultDestinations: {
            allAdmins: false,
            emails: ["test@email.com"],
            httpServerIds: ["aHR0cHM6Ly93d3cuZXhhbXBsZS5jb20vd2ViaG9va3M"],
            snmp: false,
        },
    });

    return {
        polGroups: adaptivePolicyGroups
    }
};