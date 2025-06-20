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
 * const example = meraki.networks.getApplianceVpnBgp({
 *     networkId: "string",
 * });
 * export const merakiNetworksApplianceVpnBgpExample = example.then(example => example.item);
 * ```
 */
export function getApplianceVpnBgp(args: GetApplianceVpnBgpArgs, opts?: pulumi.InvokeOptions): Promise<GetApplianceVpnBgpResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getApplianceVpnBgp:getApplianceVpnBgp", {
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplianceVpnBgp.
 */
export interface GetApplianceVpnBgpArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: string;
}

/**
 * A collection of values returned by getApplianceVpnBgp.
 */
export interface GetApplianceVpnBgpResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.networks.GetApplianceVpnBgpItem;
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
 * const example = meraki.networks.getApplianceVpnBgp({
 *     networkId: "string",
 * });
 * export const merakiNetworksApplianceVpnBgpExample = example.then(example => example.item);
 * ```
 */
export function getApplianceVpnBgpOutput(args: GetApplianceVpnBgpOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetApplianceVpnBgpResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:networks/getApplianceVpnBgp:getApplianceVpnBgp", {
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplianceVpnBgp.
 */
export interface GetApplianceVpnBgpOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}
