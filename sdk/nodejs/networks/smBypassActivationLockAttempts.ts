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
 * const example = new meraki.networks.SmBypassActivationLockAttempts("example", {
 *     ids: [
 *         "1284392014819",
 *         "2983092129865",
 *     ],
 *     networkId: "string",
 * });
 * export const merakiNetworksSmBypassActivationLockAttemptsExample = example;
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import meraki:networks/smBypassActivationLockAttempts:SmBypassActivationLockAttempts example "attempt_id,network_id"
 * ```
 */
export class SmBypassActivationLockAttempts extends pulumi.CustomResource {
    /**
     * Get an existing SmBypassActivationLockAttempts resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SmBypassActivationLockAttemptsState, opts?: pulumi.CustomResourceOptions): SmBypassActivationLockAttempts {
        return new SmBypassActivationLockAttempts(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/smBypassActivationLockAttempts:SmBypassActivationLockAttempts';

    /**
     * Returns true if the given object is an instance of SmBypassActivationLockAttempts.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SmBypassActivationLockAttempts {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SmBypassActivationLockAttempts.__pulumiType;
    }

    /**
     * attemptId path parameter. Attempt ID
     */
    public readonly attemptId!: pulumi.Output<string | undefined>;
    public /*out*/ readonly data!: pulumi.Output<outputs.networks.SmBypassActivationLockAttemptsData>;
    /**
     * The ids of the devices to attempt activation lock bypass.
     */
    public readonly ids!: pulumi.Output<string[]>;
    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a SmBypassActivationLockAttempts resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SmBypassActivationLockAttemptsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SmBypassActivationLockAttemptsArgs | SmBypassActivationLockAttemptsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SmBypassActivationLockAttemptsState | undefined;
            resourceInputs["attemptId"] = state ? state.attemptId : undefined;
            resourceInputs["data"] = state ? state.data : undefined;
            resourceInputs["ids"] = state ? state.ids : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as SmBypassActivationLockAttemptsArgs | undefined;
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            resourceInputs["attemptId"] = args ? args.attemptId : undefined;
            resourceInputs["ids"] = args ? args.ids : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["data"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SmBypassActivationLockAttempts.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SmBypassActivationLockAttempts resources.
 */
export interface SmBypassActivationLockAttemptsState {
    /**
     * attemptId path parameter. Attempt ID
     */
    attemptId?: pulumi.Input<string>;
    data?: pulumi.Input<inputs.networks.SmBypassActivationLockAttemptsData>;
    /**
     * The ids of the devices to attempt activation lock bypass.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SmBypassActivationLockAttempts resource.
 */
export interface SmBypassActivationLockAttemptsArgs {
    /**
     * attemptId path parameter. Attempt ID
     */
    attemptId?: pulumi.Input<string>;
    /**
     * The ids of the devices to attempt activation lock bypass.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}
