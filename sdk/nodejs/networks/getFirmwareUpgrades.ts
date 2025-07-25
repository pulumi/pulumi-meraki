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
 * const example = meraki.networks.getFirmwareUpgrades({
 *     networkId: "string",
 * });
 * export const merakiNetworksFirmwareUpgradesExample = example.then(example => example.item);
 * ```
 */
export function getFirmwareUpgrades(args: GetFirmwareUpgradesArgs, opts?: pulumi.InvokeOptions): Promise<GetFirmwareUpgradesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getFirmwareUpgrades:getFirmwareUpgrades", {
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getFirmwareUpgrades.
 */
export interface GetFirmwareUpgradesArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: string;
}

/**
 * A collection of values returned by getFirmwareUpgrades.
 */
export interface GetFirmwareUpgradesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.networks.GetFirmwareUpgradesItem;
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
 * const example = meraki.networks.getFirmwareUpgrades({
 *     networkId: "string",
 * });
 * export const merakiNetworksFirmwareUpgradesExample = example.then(example => example.item);
 * ```
 */
export function getFirmwareUpgradesOutput(args: GetFirmwareUpgradesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetFirmwareUpgradesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:networks/getFirmwareUpgrades:getFirmwareUpgrades", {
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getFirmwareUpgrades.
 */
export interface GetFirmwareUpgradesOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}
