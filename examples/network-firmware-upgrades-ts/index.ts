import * as pulumi from "@pulumi/pulumi";
import * as meraki from "@pulumi/meraki";

export = async () => {
  const config = new pulumi.Config();
  const organizationId = config.requireSecret("organizationId");
  const networkName = config.get("networkName") || "Pulumi Base Test Network";

  const network = new meraki.networks.Base("base-network", {
    name: networkName,
    notes:
      "This is a test network created by the Pulumi team in an integration test.",
    organizationId: organizationId,
    productTypes: ["appliance", "switch", "wireless", "cellularGateway"],
    timeZone: "America/Chicago",
    tags: ["US-Env01-0001", "US-Env01-0002"],
  });

  new meraki.networks.FirmwareUpgrades("example", {
    networkId: network.id,
    products: {
      appliance: {
        nextUpgrade: {
          time: "2019-03-17T17:22:52Z",
          toVersion: {
            id: "1001",
          },
        },
        participateInNextBetaRelease: false,
      },
      camera: {
        nextUpgrade: {
          time: "2019-03-17T17:22:52Z",
          toVersion: {
            id: "1003",
          },
        },
        participateInNextBetaRelease: false,
      },
      cellularGateway: {
        nextUpgrade: {
          time: "2019-03-17T17:22:52Z",
          toVersion: {
            id: "1004",
          },
        },
        participateInNextBetaRelease: false,
      },
      sensor: {
        nextUpgrade: {
          time: "2019-03-17T17:22:52Z",
          toVersion: {
            id: "1005",
          },
        },
        participateInNextBetaRelease: false,
      },
      switch: {
        nextUpgrade: {
          time: "2019-03-17T17:22:52Z",
          toVersion: {
            id: "1002",
          },
        },
        participateInNextBetaRelease: false,
      },
      switchCatalyst: {
        nextUpgrade: {
          time: "2019-03-17T17:22:52Z",
          toVersion: {
            id: "1234",
          },
        },
        participateInNextBetaRelease: false,
      },
      wireless: {
        nextUpgrade: {
          time: "2019-03-17T17:22:52Z",
          toVersion: {
            id: "1000",
          },
        },
        participateInNextBetaRelease: false,
      },
    },
    timezone: "America/Los_Angeles",
    upgradeWindow: {
      dayOfWeek: "sun",
      hourOfDay: "4:00",
    },
  });
};
