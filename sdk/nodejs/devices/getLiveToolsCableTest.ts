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
 * const example = meraki.devices.getLiveToolsCableTest({
 *     id: "string",
 *     serial: "string",
 * });
 * export const merakiDevicesLiveToolsCableTestExample = example.then(example => example.item);
 * ```
 */
export function getLiveToolsCableTest(args: GetLiveToolsCableTestArgs, opts?: pulumi.InvokeOptions): Promise<GetLiveToolsCableTestResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:devices/getLiveToolsCableTest:getLiveToolsCableTest", {
        "id": args.id,
        "serial": args.serial,
    }, opts);
}

/**
 * A collection of arguments for invoking getLiveToolsCableTest.
 */
export interface GetLiveToolsCableTestArgs {
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
 * A collection of values returned by getLiveToolsCableTest.
 */
export interface GetLiveToolsCableTestResult {
    /**
     * id path parameter.
     */
    readonly id: string;
    readonly item: outputs.devices.GetLiveToolsCableTestItem;
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
 * const example = meraki.devices.getLiveToolsCableTest({
 *     id: "string",
 *     serial: "string",
 * });
 * export const merakiDevicesLiveToolsCableTestExample = example.then(example => example.item);
 * ```
 */
export function getLiveToolsCableTestOutput(args: GetLiveToolsCableTestOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetLiveToolsCableTestResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:devices/getLiveToolsCableTest:getLiveToolsCableTest", {
        "id": args.id,
        "serial": args.serial,
    }, opts);
}

/**
 * A collection of arguments for invoking getLiveToolsCableTest.
 */
export interface GetLiveToolsCableTestOutputArgs {
    /**
     * id path parameter.
     */
    id: pulumi.Input<string>;
    /**
     * serial path parameter.
     */
    serial: pulumi.Input<string>;
}
