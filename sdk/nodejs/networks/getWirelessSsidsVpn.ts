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
 * const example = meraki.networks.getWirelessSsidsVpn({
 *     networkId: "string",
 *     number: "string",
 * });
 * export const merakiNetworksWirelessSsidsVpnExample = example.then(example => example.item);
 * ```
 */
export function getWirelessSsidsVpn(args: GetWirelessSsidsVpnArgs, opts?: pulumi.InvokeOptions): Promise<GetWirelessSsidsVpnResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getWirelessSsidsVpn:getWirelessSsidsVpn", {
        "networkId": args.networkId,
        "number": args.number,
    }, opts);
}

/**
 * A collection of arguments for invoking getWirelessSsidsVpn.
 */
export interface GetWirelessSsidsVpnArgs {
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
 * A collection of values returned by getWirelessSsidsVpn.
 */
export interface GetWirelessSsidsVpnResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.networks.GetWirelessSsidsVpnItem;
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
 * const example = meraki.networks.getWirelessSsidsVpn({
 *     networkId: "string",
 *     number: "string",
 * });
 * export const merakiNetworksWirelessSsidsVpnExample = example.then(example => example.item);
 * ```
 */
export function getWirelessSsidsVpnOutput(args: GetWirelessSsidsVpnOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetWirelessSsidsVpnResult> {
    return pulumi.output(args).apply((a: any) => getWirelessSsidsVpn(a, opts))
}

/**
 * A collection of arguments for invoking getWirelessSsidsVpn.
 */
export interface GetWirelessSsidsVpnOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    /**
     * number path parameter.
     */
    number: pulumi.Input<string>;
}