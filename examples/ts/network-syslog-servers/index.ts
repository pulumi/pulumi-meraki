import * as meraki from "@pulumi/meraki";

export = async () => {
    const orgs = await meraki.getOrganizations();
    const org = orgs.items[0];
    const networks = await meraki.getNetworks({
        organizationId: org.id
    });

    const network = networks.items[1];

    new meraki.networks.SyslogServers("example", {
        networkId: network.id,
        servers: [{
            host: "1.2.3.4",
            port: 22,
            roles: ["Wireless event log", "Appliance event log", "Switch event log"]
        }]
    });

    return {
        networks: networks,
    }
};