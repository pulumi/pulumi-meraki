// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ~>Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
 * already existed previously.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = new meraki.networks.DevicesClaimVmx("example", {
 *     networkId: "string",
 *     parameters: {
 *         size: "small",
 *     },
 * });
 * export const merakiNetworksDevicesClaimVmxExample = example;
 * ```
 */
export class DevicesClaimVmx extends pulumi.CustomResource {
    /**
     * Get an existing DevicesClaimVmx resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DevicesClaimVmxState, opts?: pulumi.CustomResourceOptions): DevicesClaimVmx {
        return new DevicesClaimVmx(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/devicesClaimVmx:DevicesClaimVmx';

    /**
     * Returns true if the given object is an instance of DevicesClaimVmx.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DevicesClaimVmx {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DevicesClaimVmx.__pulumiType;
    }

    public /*out*/ readonly item!: pulumi.Output<outputs.networks.DevicesClaimVmxItem>;
    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;
    public readonly parameters!: pulumi.Output<outputs.networks.DevicesClaimVmxParameters>;

    /**
     * Create a DevicesClaimVmx resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DevicesClaimVmxArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DevicesClaimVmxArgs | DevicesClaimVmxState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DevicesClaimVmxState | undefined;
            resourceInputs["item"] = state ? state.item : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
        } else {
            const args = argsOrState as DevicesClaimVmxArgs | undefined;
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            if ((!args || args.parameters === undefined) && !opts.urn) {
                throw new Error("Missing required property 'parameters'");
            }
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["item"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DevicesClaimVmx.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DevicesClaimVmx resources.
 */
export interface DevicesClaimVmxState {
    item?: pulumi.Input<inputs.networks.DevicesClaimVmxItem>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    parameters?: pulumi.Input<inputs.networks.DevicesClaimVmxParameters>;
}

/**
 * The set of arguments for constructing a DevicesClaimVmx resource.
 */
export interface DevicesClaimVmxArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    parameters: pulumi.Input<inputs.networks.DevicesClaimVmxParameters>;
}
