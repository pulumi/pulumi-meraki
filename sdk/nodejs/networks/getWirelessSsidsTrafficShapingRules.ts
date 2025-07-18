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
 * const example = meraki.networks.getWirelessSsidsTrafficShapingRules({
 *     networkId: "string",
 *     number: "string",
 * });
 * export const merakiNetworksWirelessSsidsTrafficShapingRulesExample = example.then(example => example.item);
 * ```
 */
export function getWirelessSsidsTrafficShapingRules(args: GetWirelessSsidsTrafficShapingRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetWirelessSsidsTrafficShapingRulesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getWirelessSsidsTrafficShapingRules:getWirelessSsidsTrafficShapingRules", {
        "networkId": args.networkId,
        "number": args.number,
    }, opts);
}

/**
 * A collection of arguments for invoking getWirelessSsidsTrafficShapingRules.
 */
export interface GetWirelessSsidsTrafficShapingRulesArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: string;
    /**
     * number path parameter.
     */
    number: string;
}

/**
 * A collection of values returned by getWirelessSsidsTrafficShapingRules.
 */
export interface GetWirelessSsidsTrafficShapingRulesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.networks.GetWirelessSsidsTrafficShapingRulesItem;
    /**
     * networkId path parameter. Network ID
     */
    readonly networkId: string;
    /**
     * number path parameter.
     */
    readonly number: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.networks.getWirelessSsidsTrafficShapingRules({
 *     networkId: "string",
 *     number: "string",
 * });
 * export const merakiNetworksWirelessSsidsTrafficShapingRulesExample = example.then(example => example.item);
 * ```
 */
export function getWirelessSsidsTrafficShapingRulesOutput(args: GetWirelessSsidsTrafficShapingRulesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetWirelessSsidsTrafficShapingRulesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:networks/getWirelessSsidsTrafficShapingRules:getWirelessSsidsTrafficShapingRules", {
        "networkId": args.networkId,
        "number": args.number,
    }, opts);
}

/**
 * A collection of arguments for invoking getWirelessSsidsTrafficShapingRules.
 */
export interface GetWirelessSsidsTrafficShapingRulesOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    /**
     * number path parameter.
     */
    number: pulumi.Input<string>;
}
