// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
 * const example = meraki.devices.getLiveToolsPingDevice({
 *     id: "string",
 *     serial: "string",
 * });
 * export const merakiDevicesLiveToolsPingDeviceExample = example.then(example => example.item);
 * ```
 */
export function getLiveToolsPingDevice(args: GetLiveToolsPingDeviceArgs, opts?: pulumi.InvokeOptions): Promise<GetLiveToolsPingDeviceResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:devices/getLiveToolsPingDevice:getLiveToolsPingDevice", {
        "id": args.id,
        "serial": args.serial,
    }, opts);
}

/**
 * A collection of arguments for invoking getLiveToolsPingDevice.
 */
export interface GetLiveToolsPingDeviceArgs {
    /**
     * id path parameter.
     */
    id: string;
    /**
     * serial path parameter.
     */
    serial: string;
}

/**
 * A collection of values returned by getLiveToolsPingDevice.
 */
export interface GetLiveToolsPingDeviceResult {
    /**
     * id path parameter.
     */
    readonly id: string;
    readonly item: outputs.devices.GetLiveToolsPingDeviceItem;
    /**
     * serial path parameter.
     */
    readonly serial: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.devices.getLiveToolsPingDevice({
 *     id: "string",
 *     serial: "string",
 * });
 * export const merakiDevicesLiveToolsPingDeviceExample = example.then(example => example.item);
 * ```
 */
export function getLiveToolsPingDeviceOutput(args: GetLiveToolsPingDeviceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLiveToolsPingDeviceResult> {
    return pulumi.output(args).apply((a: any) => getLiveToolsPingDevice(a, opts))
}

/**
 * A collection of arguments for invoking getLiveToolsPingDevice.
 */
export interface GetLiveToolsPingDeviceOutputArgs {
    /**
     * id path parameter.
     */
    id: pulumi.Input<string>;
    /**
     * serial path parameter.
     */
    serial: pulumi.Input<string>;
}