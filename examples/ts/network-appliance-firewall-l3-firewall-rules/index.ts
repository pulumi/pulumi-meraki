import * as meraki from "@pulumi/meraki";

export = async () => {
    const orgs = await meraki.getOrganizations();
    const org = orgs.items[0];
    const networks = await meraki.getNetworks({
        organizationId: org.id
    });

    const network = networks.items[0];

    new meraki.networks.ApplianceFirewallL3FirewallRules("l3rules", {
        networkId: network.id,
        rules: [{
            comment: "Allow TCP traffic to subnet",
            destCidr: "192.168.0.0/24",
            destPort: "443",
            policy: "allow",
            protocol: "tcp",
            srcCidr: "Any",
            srcPort: "Any",
            syslogEnabled: false
        }]
    });

    return {
        networks: networks,
    }
};