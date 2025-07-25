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
 * const example = meraki.networks.getApplianceWarmSpare({
 *     networkId: "string",
 * });
 * export const merakiNetworksApplianceWarmSpareExample = example.then(example => example.item);
 * ```
 */
export function getApplianceWarmSpare(args: GetApplianceWarmSpareArgs, opts?: pulumi.InvokeOptions): Promise<GetApplianceWarmSpareResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getApplianceWarmSpare:getApplianceWarmSpare", {
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplianceWarmSpare.
 */
export interface GetApplianceWarmSpareArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: string;
}

/**
 * A collection of values returned by getApplianceWarmSpare.
 */
export interface GetApplianceWarmSpareResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.networks.GetApplianceWarmSpareItem;
    /**
     * networkId path parameter. Network ID
     */
    readonly networkId: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.networks.getApplianceWarmSpare({
 *     networkId: "string",
 * });
 * export const merakiNetworksApplianceWarmSpareExample = example.then(example => example.item);
 * ```
 */
export function getApplianceWarmSpareOutput(args: GetApplianceWarmSpareOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetApplianceWarmSpareResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:networks/getApplianceWarmSpare:getApplianceWarmSpare", {
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplianceWarmSpare.
 */
export interface GetApplianceWarmSpareOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}
