import * as meraki from "@pulumi/meraki";

export = async () => {
    const orgs = await meraki.getOrganizations();
    const org = orgs.items[0];
    const networks = await meraki.getNetworks({
        organizationId: org.id
    });

    const network = networks.items[1];

    new meraki.networks.FirmwareUpgrades("example", {
        networkId: network.id,
        products: {
            appliance: {
                nextUpgrade: {
                    time: "2019-03-17T17:22:52Z",
                    toVersion: {
                        id: "1001"
                    }
                },
                participateInNextBetaRelease: false
            },
            camera: {
                nextUpgrade: {
                    time: "2019-03-17T17:22:52Z",
                    toVersion: {
                        id: "1003"
                    }
                },
                participateInNextBetaRelease: false
            },
            cellularGateway: {
                nextUpgrade: {
                    time: "2019-03-17T17:22:52Z",
                    toVersion: {
                        id: "1004"
                    }
                },
                participateInNextBetaRelease: false
            },
            sensor: {
                nextUpgrade: {
                    time: "2019-03-17T17:22:52Z",
                    toVersion: {
                        id: "1005"
                    }
                },
                participateInNextBetaRelease: false
            },
            switch: {
                nextUpgrade: {
                    time: "2019-03-17T17:22:52Z",
                    toVersion: {
                        id: "1002"
                    }
                },
                participateInNextBetaRelease: false
            },
            switchCatalyst: {
                nextUpgrade: {
                    time: "2019-03-17T17:22:52Z",
                    toVersion: {
                        id: "1234"
                    }
                },
                participateInNextBetaRelease: false
            },
            wireless: {
                nextUpgrade: {
                    time: "2019-03-17T17:22:52Z",
                    toVersion: {
                        id: "1000"
                    }
                },
                participateInNextBetaRelease: false
            }
        },
        timezone: "America/Los_Angeles",
        upgradeWindow: {
            dayOfWeek: "sun",
            hourOfDay: "4:00"
        }
    });

    return {
        networks: networks,
    }
};