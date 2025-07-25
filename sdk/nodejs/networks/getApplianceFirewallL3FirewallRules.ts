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
 * const example = meraki.networks.getApplianceFirewallL3FirewallRules({
 *     networkId: "string",
 * });
 * export const merakiNetworksApplianceFirewallL3FirewallRulesExample = example.then(example => example.item);
 * ```
 */
export function getApplianceFirewallL3FirewallRules(args: GetApplianceFirewallL3FirewallRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetApplianceFirewallL3FirewallRulesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getApplianceFirewallL3FirewallRules:getApplianceFirewallL3FirewallRules", {
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplianceFirewallL3FirewallRules.
 */
export interface GetApplianceFirewallL3FirewallRulesArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: string;
}

/**
 * A collection of values returned by getApplianceFirewallL3FirewallRules.
 */
export interface GetApplianceFirewallL3FirewallRulesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.networks.GetApplianceFirewallL3FirewallRulesItem;
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
 * const example = meraki.networks.getApplianceFirewallL3FirewallRules({
 *     networkId: "string",
 * });
 * export const merakiNetworksApplianceFirewallL3FirewallRulesExample = example.then(example => example.item);
 * ```
 */
export function getApplianceFirewallL3FirewallRulesOutput(args: GetApplianceFirewallL3FirewallRulesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetApplianceFirewallL3FirewallRulesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:networks/getApplianceFirewallL3FirewallRules:getApplianceFirewallL3FirewallRules", {
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplianceFirewallL3FirewallRules.
 */
export interface GetApplianceFirewallL3FirewallRulesOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}
