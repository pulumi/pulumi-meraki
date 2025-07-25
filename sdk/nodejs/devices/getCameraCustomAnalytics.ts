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
 * const example = meraki.devices.getCameraCustomAnalytics({
 *     serial: "string",
 * });
 * export const merakiDevicesCameraCustomAnalyticsExample = example.then(example => example.item);
 * ```
 */
export function getCameraCustomAnalytics(args: GetCameraCustomAnalyticsArgs, opts?: pulumi.InvokeOptions): Promise<GetCameraCustomAnalyticsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:devices/getCameraCustomAnalytics:getCameraCustomAnalytics", {
        "serial": args.serial,
    }, opts);
}

/**
 * A collection of arguments for invoking getCameraCustomAnalytics.
 */
export interface GetCameraCustomAnalyticsArgs {
    /**
     * serial path parameter.
     */
    serial: string;
}

/**
 * A collection of values returned by getCameraCustomAnalytics.
 */
export interface GetCameraCustomAnalyticsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.devices.GetCameraCustomAnalyticsItem;
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
 * const example = meraki.devices.getCameraCustomAnalytics({
 *     serial: "string",
 * });
 * export const merakiDevicesCameraCustomAnalyticsExample = example.then(example => example.item);
 * ```
 */
export function getCameraCustomAnalyticsOutput(args: GetCameraCustomAnalyticsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCameraCustomAnalyticsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:devices/getCameraCustomAnalytics:getCameraCustomAnalytics", {
        "serial": args.serial,
    }, opts);
}

/**
 * A collection of arguments for invoking getCameraCustomAnalytics.
 */
export interface GetCameraCustomAnalyticsOutputArgs {
    /**
     * serial path parameter.
     */
    serial: pulumi.Input<string>;
}
