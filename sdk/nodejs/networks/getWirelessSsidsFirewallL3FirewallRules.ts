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
 * const example = meraki.networks.getWirelessSsidsFirewallL3FirewallRules({
 *     networkId: "string",
 *     number: "string",
 * });
 * export const merakiNetworksWirelessSsidsFirewallL3FirewallRulesExample = example.then(example => example.item);
 * ```
 */
export function getWirelessSsidsFirewallL3FirewallRules(args: GetWirelessSsidsFirewallL3FirewallRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetWirelessSsidsFirewallL3FirewallRulesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getWirelessSsidsFirewallL3FirewallRules:getWirelessSsidsFirewallL3FirewallRules", {
        "networkId": args.networkId,
        "number": args.number,
    }, opts);
}

/**
 * A collection of arguments for invoking getWirelessSsidsFirewallL3FirewallRules.
 */
export interface GetWirelessSsidsFirewallL3FirewallRulesArgs {
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
 * A collection of values returned by getWirelessSsidsFirewallL3FirewallRules.
 */
export interface GetWirelessSsidsFirewallL3FirewallRulesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.networks.GetWirelessSsidsFirewallL3FirewallRulesItem;
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
 * const example = meraki.networks.getWirelessSsidsFirewallL3FirewallRules({
 *     networkId: "string",
 *     number: "string",
 * });
 * export const merakiNetworksWirelessSsidsFirewallL3FirewallRulesExample = example.then(example => example.item);
 * ```
 */
export function getWirelessSsidsFirewallL3FirewallRulesOutput(args: GetWirelessSsidsFirewallL3FirewallRulesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetWirelessSsidsFirewallL3FirewallRulesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:networks/getWirelessSsidsFirewallL3FirewallRules:getWirelessSsidsFirewallL3FirewallRules", {
        "networkId": args.networkId,
        "number": args.number,
    }, opts);
}

/**
 * A collection of arguments for invoking getWirelessSsidsFirewallL3FirewallRules.
 */
export interface GetWirelessSsidsFirewallL3FirewallRulesOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    /**
     * number path parameter.
     */
    number: pulumi.Input<string>;
}
