// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = new meraki.devices.WirelessBluetoothSettings("example", {
 *     major: 13,
 *     minor: 125,
 *     serial: "string",
 *     uuid: "00000000-0000-0000-000-000000000000",
 * });
 * export const merakiDevicesWirelessBluetoothSettingsExample = example;
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import meraki:devices/wirelessBluetoothSettings:WirelessBluetoothSettings example "serial"
 * ```
 */
export class WirelessBluetoothSettings extends pulumi.CustomResource {
    /**
     * Get an existing WirelessBluetoothSettings resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WirelessBluetoothSettingsState, opts?: pulumi.CustomResourceOptions): WirelessBluetoothSettings {
        return new WirelessBluetoothSettings(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:devices/wirelessBluetoothSettings:WirelessBluetoothSettings';

    /**
     * Returns true if the given object is an instance of WirelessBluetoothSettings.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WirelessBluetoothSettings {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WirelessBluetoothSettings.__pulumiType;
    }

    /**
     * Desired major value of the beacon. If the value is set to null it will reset to Dashboard's automatically generated value.
     */
    public readonly major!: pulumi.Output<number>;
    /**
     * Desired minor value of the beacon. If the value is set to null it will reset to Dashboard's automatically generated value.
     */
    public readonly minor!: pulumi.Output<number>;
    /**
     * serial path parameter.
     */
    public readonly serial!: pulumi.Output<string>;
    /**
     * Desired UUID of the beacon. If the value is set to null it will reset to Dashboard's automatically generated value.
     */
    public readonly uuid!: pulumi.Output<string>;

    /**
     * Create a WirelessBluetoothSettings resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WirelessBluetoothSettingsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WirelessBluetoothSettingsArgs | WirelessBluetoothSettingsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WirelessBluetoothSettingsState | undefined;
            resourceInputs["major"] = state ? state.major : undefined;
            resourceInputs["minor"] = state ? state.minor : undefined;
            resourceInputs["serial"] = state ? state.serial : undefined;
            resourceInputs["uuid"] = state ? state.uuid : undefined;
        } else {
            const args = argsOrState as WirelessBluetoothSettingsArgs | undefined;
            if ((!args || args.serial === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serial'");
            }
            resourceInputs["major"] = args ? args.major : undefined;
            resourceInputs["minor"] = args ? args.minor : undefined;
            resourceInputs["serial"] = args ? args.serial : undefined;
            resourceInputs["uuid"] = args ? args.uuid : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WirelessBluetoothSettings.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WirelessBluetoothSettings resources.
 */
export interface WirelessBluetoothSettingsState {
    /**
     * Desired major value of the beacon. If the value is set to null it will reset to Dashboard's automatically generated value.
     */
    major?: pulumi.Input<number>;
    /**
     * Desired minor value of the beacon. If the value is set to null it will reset to Dashboard's automatically generated value.
     */
    minor?: pulumi.Input<number>;
    /**
     * serial path parameter.
     */
    serial?: pulumi.Input<string>;
    /**
     * Desired UUID of the beacon. If the value is set to null it will reset to Dashboard's automatically generated value.
     */
    uuid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WirelessBluetoothSettings resource.
 */
export interface WirelessBluetoothSettingsArgs {
    /**
     * Desired major value of the beacon. If the value is set to null it will reset to Dashboard's automatically generated value.
     */
    major?: pulumi.Input<number>;
    /**
     * Desired minor value of the beacon. If the value is set to null it will reset to Dashboard's automatically generated value.
     */
    minor?: pulumi.Input<number>;
    /**
     * serial path parameter.
     */
    serial: pulumi.Input<string>;
    /**
     * Desired UUID of the beacon. If the value is set to null it will reset to Dashboard's automatically generated value.
     */
    uuid?: pulumi.Input<string>;
}