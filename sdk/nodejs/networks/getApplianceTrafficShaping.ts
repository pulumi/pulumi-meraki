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
 * const example = meraki.networks.getApplianceTrafficShaping({
 *     networkId: "string",
 * });
 * export const merakiNetworksApplianceTrafficShapingExample = example.then(example => example.item);
 * ```
 */
export function getApplianceTrafficShaping(args: GetApplianceTrafficShapingArgs, opts?: pulumi.InvokeOptions): Promise<GetApplianceTrafficShapingResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getApplianceTrafficShaping:getApplianceTrafficShaping", {
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplianceTrafficShaping.
 */
export interface GetApplianceTrafficShapingArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: string;
}

/**
 * A collection of values returned by getApplianceTrafficShaping.
 */
export interface GetApplianceTrafficShapingResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.networks.GetApplianceTrafficShapingItem;
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
 * const example = meraki.networks.getApplianceTrafficShaping({
 *     networkId: "string",
 * });
 * export const merakiNetworksApplianceTrafficShapingExample = example.then(example => example.item);
 * ```
 */
export function getApplianceTrafficShapingOutput(args: GetApplianceTrafficShapingOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetApplianceTrafficShapingResult> {
    return pulumi.output(args).apply((a: any) => getApplianceTrafficShaping(a, opts))
}

/**
 * A collection of arguments for invoking getApplianceTrafficShaping.
 */
export interface GetApplianceTrafficShapingOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}