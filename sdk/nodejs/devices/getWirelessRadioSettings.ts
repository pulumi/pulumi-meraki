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
 * const example = meraki.devices.getWirelessRadioSettings({
 *     serial: "string",
 * });
 * export const merakiDevicesWirelessRadioSettingsExample = example.then(example => example.item);
 * ```
 */
export function getWirelessRadioSettings(args: GetWirelessRadioSettingsArgs, opts?: pulumi.InvokeOptions): Promise<GetWirelessRadioSettingsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:devices/getWirelessRadioSettings:getWirelessRadioSettings", {
        "serial": args.serial,
    }, opts);
}

/**
 * A collection of arguments for invoking getWirelessRadioSettings.
 */
export interface GetWirelessRadioSettingsArgs {
    /**
     * serial path parameter.
     */
    serial: string;
}

/**
 * A collection of values returned by getWirelessRadioSettings.
 */
export interface GetWirelessRadioSettingsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.devices.GetWirelessRadioSettingsItem;
    /**
     * serial path parameter.
     */
    readonly serial: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.devices.getWirelessRadioSettings({
 *     serial: "string",
 * });
 * export const merakiDevicesWirelessRadioSettingsExample = example.then(example => example.item);
 * ```
 */
export function getWirelessRadioSettingsOutput(args: GetWirelessRadioSettingsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetWirelessRadioSettingsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:devices/getWirelessRadioSettings:getWirelessRadioSettings", {
        "serial": args.serial,
    }, opts);
}

/**
 * A collection of arguments for invoking getWirelessRadioSettings.
 */
export interface GetWirelessRadioSettingsOutputArgs {
    /**
     * serial path parameter.
     */
    serial: pulumi.Input<string>;
}
