// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.networks.getSmDevicesSecurityCenters({
 *     deviceId: "string",
 *     networkId: "string",
 * });
 * export const merakiNetworksSmDevicesSecurityCentersExample = example.then(example => example.items);
 * ```
 */
export function getSmDevicesSecurityCenters(args?: GetSmDevicesSecurityCentersArgs, opts?: pulumi.InvokeOptions): Promise<GetSmDevicesSecurityCentersResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getSmDevicesSecurityCenters:getSmDevicesSecurityCenters", {
        "deviceId": args.deviceId,
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSmDevicesSecurityCenters.
 */
export interface GetSmDevicesSecurityCentersArgs {
    /**
     * deviceId path parameter. Device ID
     */
    deviceId?: string;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: string;
}

/**
 * A collection of values returned by getSmDevicesSecurityCenters.
 */
export interface GetSmDevicesSecurityCentersResult {
    /**
     * deviceId path parameter. Device ID
     */
    readonly deviceId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Array of ResponseSmGetNetworkSmDeviceSoftwares
     */
    readonly items: outputs.networks.GetSmDevicesSecurityCentersItem[];
    /**
     * networkId path parameter. Network ID
     */
    readonly networkId?: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.networks.getSmDevicesSecurityCenters({
 *     deviceId: "string",
 *     networkId: "string",
 * });
 * export const merakiNetworksSmDevicesSecurityCentersExample = example.then(example => example.items);
 * ```
 */
export function getSmDevicesSecurityCentersOutput(args?: GetSmDevicesSecurityCentersOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSmDevicesSecurityCentersResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:networks/getSmDevicesSecurityCenters:getSmDevicesSecurityCenters", {
        "deviceId": args.deviceId,
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSmDevicesSecurityCenters.
 */
export interface GetSmDevicesSecurityCentersOutputArgs {
    /**
     * deviceId path parameter. Device ID
     */
    deviceId?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
}
