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
 * const example = meraki.networks.getTrafficShapingDscpTaggingOptions({
 *     networkId: "string",
 * });
 * export const merakiNetworksTrafficShapingDscpTaggingOptionsExample = example.then(example => example.items);
 * ```
 */
export function getTrafficShapingDscpTaggingOptions(args: GetTrafficShapingDscpTaggingOptionsArgs, opts?: pulumi.InvokeOptions): Promise<GetTrafficShapingDscpTaggingOptionsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getTrafficShapingDscpTaggingOptions:getTrafficShapingDscpTaggingOptions", {
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getTrafficShapingDscpTaggingOptions.
 */
export interface GetTrafficShapingDscpTaggingOptionsArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: string;
}

/**
 * A collection of values returned by getTrafficShapingDscpTaggingOptions.
 */
export interface GetTrafficShapingDscpTaggingOptionsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Array of ResponseNetworksGetNetworkTrafficShapingDscpTaggingOptions
     */
    readonly items: outputs.networks.GetTrafficShapingDscpTaggingOptionsItem[];
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
 * const example = meraki.networks.getTrafficShapingDscpTaggingOptions({
 *     networkId: "string",
 * });
 * export const merakiNetworksTrafficShapingDscpTaggingOptionsExample = example.then(example => example.items);
 * ```
 */
export function getTrafficShapingDscpTaggingOptionsOutput(args: GetTrafficShapingDscpTaggingOptionsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTrafficShapingDscpTaggingOptionsResult> {
    return pulumi.output(args).apply((a: any) => getTrafficShapingDscpTaggingOptions(a, opts))
}

/**
 * A collection of arguments for invoking getTrafficShapingDscpTaggingOptions.
 */
export interface GetTrafficShapingDscpTaggingOptionsOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}