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
 * const example = meraki.networks.getApplianceSettings({
 *     networkId: "string",
 * });
 * export const merakiNetworksApplianceSettingsExample = example.then(example => example.item);
 * ```
 */
export function getApplianceSettings(args: GetApplianceSettingsArgs, opts?: pulumi.InvokeOptions): Promise<GetApplianceSettingsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getApplianceSettings:getApplianceSettings", {
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplianceSettings.
 */
export interface GetApplianceSettingsArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: string;
}

/**
 * A collection of values returned by getApplianceSettings.
 */
export interface GetApplianceSettingsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.networks.GetApplianceSettingsItem;
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
 * const example = meraki.networks.getApplianceSettings({
 *     networkId: "string",
 * });
 * export const merakiNetworksApplianceSettingsExample = example.then(example => example.item);
 * ```
 */
export function getApplianceSettingsOutput(args: GetApplianceSettingsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetApplianceSettingsResult> {
    return pulumi.output(args).apply((a: any) => getApplianceSettings(a, opts))
}

/**
 * A collection of arguments for invoking getApplianceSettings.
 */
export interface GetApplianceSettingsOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}