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
 * const example = meraki.devices.getSwitchPortsStatuses({
 *     serial: "string",
 *     t0: "string",
 *     timespan: 1,
 * });
 * export const merakiDevicesSwitchPortsStatusesExample = example.then(example => example.items);
 * ```
 */
export function getSwitchPortsStatuses(args: GetSwitchPortsStatusesArgs, opts?: pulumi.InvokeOptions): Promise<GetSwitchPortsStatusesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:devices/getSwitchPortsStatuses:getSwitchPortsStatuses", {
        "serial": args.serial,
        "t0": args.t0,
        "timespan": args.timespan,
    }, opts);
}

/**
 * A collection of arguments for invoking getSwitchPortsStatuses.
 */
export interface GetSwitchPortsStatusesArgs {
    /**
     * serial path parameter.
     */
    serial: string;
    /**
     * t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
     */
    t0?: string;
    /**
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameter t0. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
     */
    timespan?: number;
}

/**
 * A collection of values returned by getSwitchPortsStatuses.
 */
export interface GetSwitchPortsStatusesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Array of ResponseSwitchGetDeviceSwitchPortsStatuses
     */
    readonly items: outputs.devices.GetSwitchPortsStatusesItem[];
    /**
     * serial path parameter.
     */
    readonly serial: string;
    /**
     * t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
     */
    readonly t0?: string;
    /**
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameter t0. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
     */
    readonly timespan?: number;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.devices.getSwitchPortsStatuses({
 *     serial: "string",
 *     t0: "string",
 *     timespan: 1,
 * });
 * export const merakiDevicesSwitchPortsStatusesExample = example.then(example => example.items);
 * ```
 */
export function getSwitchPortsStatusesOutput(args: GetSwitchPortsStatusesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSwitchPortsStatusesResult> {
    return pulumi.output(args).apply((a: any) => getSwitchPortsStatuses(a, opts))
}

/**
 * A collection of arguments for invoking getSwitchPortsStatuses.
 */
export interface GetSwitchPortsStatusesOutputArgs {
    /**
     * serial path parameter.
     */
    serial: pulumi.Input<string>;
    /**
     * t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
     */
    t0?: pulumi.Input<string>;
    /**
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameter t0. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
     */
    timespan?: pulumi.Input<number>;
}