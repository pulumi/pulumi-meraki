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
 * const example = meraki.devices.getLldpCdp({
 *     serial: "string",
 * });
 * export const merakiDevicesLldpCdpExample = example.then(example => example.item);
 * ```
 */
export function getLldpCdp(args: GetLldpCdpArgs, opts?: pulumi.InvokeOptions): Promise<GetLldpCdpResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:devices/getLldpCdp:getLldpCdp", {
        "serial": args.serial,
    }, opts);
}

/**
 * A collection of arguments for invoking getLldpCdp.
 */
export interface GetLldpCdpArgs {
    /**
     * serial path parameter.
     */
    serial: string;
}

/**
 * A collection of values returned by getLldpCdp.
 */
export interface GetLldpCdpResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.devices.GetLldpCdpItem;
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
 * const example = meraki.devices.getLldpCdp({
 *     serial: "string",
 * });
 * export const merakiDevicesLldpCdpExample = example.then(example => example.item);
 * ```
 */
export function getLldpCdpOutput(args: GetLldpCdpOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLldpCdpResult> {
    return pulumi.output(args).apply((a: any) => getLldpCdp(a, opts))
}

/**
 * A collection of arguments for invoking getLldpCdp.
 */
export interface GetLldpCdpOutputArgs {
    /**
     * serial path parameter.
     */
    serial: pulumi.Input<string>;
}