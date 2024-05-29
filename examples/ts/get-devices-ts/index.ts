import * as pulumi from "@pulumi/pulumi";
import * as meraki from "@pulumi/meraki";

export = async () => {
    const config = new pulumi.Config();
    const organizationId = config.require("organizationId");
    const devices = await meraki.getDevices({
        organizationId
    });

    return {
        devices
    }
};