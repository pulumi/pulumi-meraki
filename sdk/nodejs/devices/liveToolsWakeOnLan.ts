// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import meraki:devices/liveToolsWakeOnLan:LiveToolsWakeOnLan example "serial,wake_on_lan_id"
 * ```
 */
export class LiveToolsWakeOnLan extends pulumi.CustomResource {
    /**
     * Get an existing LiveToolsWakeOnLan resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LiveToolsWakeOnLanState, opts?: pulumi.CustomResourceOptions): LiveToolsWakeOnLan {
        return new LiveToolsWakeOnLan(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:devices/liveToolsWakeOnLan:LiveToolsWakeOnLan';

    /**
     * Returns true if the given object is an instance of LiveToolsWakeOnLan.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LiveToolsWakeOnLan {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LiveToolsWakeOnLan.__pulumiType;
    }

    /**
     * Details for the callback. Please include either an httpServerId OR url and sharedSecret
     */
    public readonly callback!: pulumi.Output<outputs.devices.LiveToolsWakeOnLanCallback>;
    /**
     * An error message for a failed execution
     */
    public /*out*/ readonly error!: pulumi.Output<string>;
    /**
     * The target's MAC address
     */
    public readonly mac!: pulumi.Output<string>;
    /**
     * The parameters of the Wake-on-LAN request
     */
    public /*out*/ readonly request!: pulumi.Output<outputs.devices.LiveToolsWakeOnLanRequest>;
    /**
     * serial path parameter.
     */
    public readonly serial!: pulumi.Output<string>;
    /**
     * Status of the Wake-on-LAN request
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * GET this url to check the status of your ping request
     */
    public /*out*/ readonly url!: pulumi.Output<string>;
    /**
     * The target's VLAN (1 to 4094)
     */
    public readonly vlanId!: pulumi.Output<number>;
    /**
     * ID of the Wake-on-LAN job
     */
    public readonly wakeOnLanId!: pulumi.Output<string>;

    /**
     * Create a LiveToolsWakeOnLan resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LiveToolsWakeOnLanArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LiveToolsWakeOnLanArgs | LiveToolsWakeOnLanState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LiveToolsWakeOnLanState | undefined;
            resourceInputs["callback"] = state ? state.callback : undefined;
            resourceInputs["error"] = state ? state.error : undefined;
            resourceInputs["mac"] = state ? state.mac : undefined;
            resourceInputs["request"] = state ? state.request : undefined;
            resourceInputs["serial"] = state ? state.serial : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
            resourceInputs["vlanId"] = state ? state.vlanId : undefined;
            resourceInputs["wakeOnLanId"] = state ? state.wakeOnLanId : undefined;
        } else {
            const args = argsOrState as LiveToolsWakeOnLanArgs | undefined;
            if ((!args || args.serial === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serial'");
            }
            resourceInputs["callback"] = args ? args.callback : undefined;
            resourceInputs["mac"] = args ? args.mac : undefined;
            resourceInputs["serial"] = args ? args.serial : undefined;
            resourceInputs["vlanId"] = args ? args.vlanId : undefined;
            resourceInputs["wakeOnLanId"] = args ? args.wakeOnLanId : undefined;
            resourceInputs["error"] = undefined /*out*/;
            resourceInputs["request"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["url"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LiveToolsWakeOnLan.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LiveToolsWakeOnLan resources.
 */
export interface LiveToolsWakeOnLanState {
    /**
     * Details for the callback. Please include either an httpServerId OR url and sharedSecret
     */
    callback?: pulumi.Input<inputs.devices.LiveToolsWakeOnLanCallback>;
    /**
     * An error message for a failed execution
     */
    error?: pulumi.Input<string>;
    /**
     * The target's MAC address
     */
    mac?: pulumi.Input<string>;
    /**
     * The parameters of the Wake-on-LAN request
     */
    request?: pulumi.Input<inputs.devices.LiveToolsWakeOnLanRequest>;
    /**
     * serial path parameter.
     */
    serial?: pulumi.Input<string>;
    /**
     * Status of the Wake-on-LAN request
     */
    status?: pulumi.Input<string>;
    /**
     * GET this url to check the status of your ping request
     */
    url?: pulumi.Input<string>;
    /**
     * The target's VLAN (1 to 4094)
     */
    vlanId?: pulumi.Input<number>;
    /**
     * ID of the Wake-on-LAN job
     */
    wakeOnLanId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LiveToolsWakeOnLan resource.
 */
export interface LiveToolsWakeOnLanArgs {
    /**
     * Details for the callback. Please include either an httpServerId OR url and sharedSecret
     */
    callback?: pulumi.Input<inputs.devices.LiveToolsWakeOnLanCallback>;
    /**
     * The target's MAC address
     */
    mac?: pulumi.Input<string>;
    /**
     * serial path parameter.
     */
    serial: pulumi.Input<string>;
    /**
     * The target's VLAN (1 to 4094)
     */
    vlanId?: pulumi.Input<number>;
    /**
     * ID of the Wake-on-LAN job
     */
    wakeOnLanId?: pulumi.Input<string>;
}