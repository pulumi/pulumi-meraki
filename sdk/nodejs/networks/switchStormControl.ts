// *** WARNING: this file was generated by pulumi-language-nodejs. ***
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
 * const example = new meraki.networks.SwitchStormControl("example", {
 *     broadcastThreshold: 30,
 *     multicastThreshold: 30,
 *     networkId: "string",
 *     unknownUnicastThreshold: 30,
 * });
 * export const merakiNetworksSwitchStormControlExample = example;
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import meraki:networks/switchStormControl:SwitchStormControl example "network_id"
 * ```
 */
export class SwitchStormControl extends pulumi.CustomResource {
    /**
     * Get an existing SwitchStormControl resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SwitchStormControlState, opts?: pulumi.CustomResourceOptions): SwitchStormControl {
        return new SwitchStormControl(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/switchStormControl:SwitchStormControl';

    /**
     * Returns true if the given object is an instance of SwitchStormControl.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SwitchStormControl {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SwitchStormControl.__pulumiType;
    }

    /**
     * Broadcast threshold.
     */
    public readonly broadcastThreshold!: pulumi.Output<number>;
    /**
     * Multicast threshold.
     */
    public readonly multicastThreshold!: pulumi.Output<number>;
    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;
    /**
     * Unknown Unicast threshold.
     */
    public readonly unknownUnicastThreshold!: pulumi.Output<number>;

    /**
     * Create a SwitchStormControl resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SwitchStormControlArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SwitchStormControlArgs | SwitchStormControlState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SwitchStormControlState | undefined;
            resourceInputs["broadcastThreshold"] = state ? state.broadcastThreshold : undefined;
            resourceInputs["multicastThreshold"] = state ? state.multicastThreshold : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["unknownUnicastThreshold"] = state ? state.unknownUnicastThreshold : undefined;
        } else {
            const args = argsOrState as SwitchStormControlArgs | undefined;
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            resourceInputs["broadcastThreshold"] = args ? args.broadcastThreshold : undefined;
            resourceInputs["multicastThreshold"] = args ? args.multicastThreshold : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["unknownUnicastThreshold"] = args ? args.unknownUnicastThreshold : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SwitchStormControl.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SwitchStormControl resources.
 */
export interface SwitchStormControlState {
    /**
     * Broadcast threshold.
     */
    broadcastThreshold?: pulumi.Input<number>;
    /**
     * Multicast threshold.
     */
    multicastThreshold?: pulumi.Input<number>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * Unknown Unicast threshold.
     */
    unknownUnicastThreshold?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a SwitchStormControl resource.
 */
export interface SwitchStormControlArgs {
    /**
     * Broadcast threshold.
     */
    broadcastThreshold?: pulumi.Input<number>;
    /**
     * Multicast threshold.
     */
    multicastThreshold?: pulumi.Input<number>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    /**
     * Unknown Unicast threshold.
     */
    unknownUnicastThreshold?: pulumi.Input<number>;
}
