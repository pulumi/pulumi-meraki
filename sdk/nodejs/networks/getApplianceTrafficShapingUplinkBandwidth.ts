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
 * const example = meraki.networks.getApplianceTrafficShapingUplinkBandwidth({
 *     networkId: "string",
 * });
 * export const merakiNetworksApplianceTrafficShapingUplinkBandwidthExample = example.then(example => example.item);
 * ```
 */
export function getApplianceTrafficShapingUplinkBandwidth(args: GetApplianceTrafficShapingUplinkBandwidthArgs, opts?: pulumi.InvokeOptions): Promise<GetApplianceTrafficShapingUplinkBandwidthResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getApplianceTrafficShapingUplinkBandwidth:getApplianceTrafficShapingUplinkBandwidth", {
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplianceTrafficShapingUplinkBandwidth.
 */
export interface GetApplianceTrafficShapingUplinkBandwidthArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: string;
}

/**
 * A collection of values returned by getApplianceTrafficShapingUplinkBandwidth.
 */
export interface GetApplianceTrafficShapingUplinkBandwidthResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.networks.GetApplianceTrafficShapingUplinkBandwidthItem;
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
 * const example = meraki.networks.getApplianceTrafficShapingUplinkBandwidth({
 *     networkId: "string",
 * });
 * export const merakiNetworksApplianceTrafficShapingUplinkBandwidthExample = example.then(example => example.item);
 * ```
 */
export function getApplianceTrafficShapingUplinkBandwidthOutput(args: GetApplianceTrafficShapingUplinkBandwidthOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetApplianceTrafficShapingUplinkBandwidthResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:networks/getApplianceTrafficShapingUplinkBandwidth:getApplianceTrafficShapingUplinkBandwidth", {
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplianceTrafficShapingUplinkBandwidth.
 */
export interface GetApplianceTrafficShapingUplinkBandwidthOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}
