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
 * const example = new meraki.networks.SmTargetGroups("example", {
 *     name: "Target group name",
 *     networkId: "string",
 *     scope: "withAny, tag1, tag2",
 * });
 * export const merakiNetworksSmTargetGroupsExample = example;
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import meraki:networks/smTargetGroups:SmTargetGroups example "network_id,target_group_id"
 * ```
 */
export class SmTargetGroups extends pulumi.CustomResource {
    /**
     * Get an existing SmTargetGroups resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SmTargetGroupsState, opts?: pulumi.CustomResourceOptions): SmTargetGroups {
        return new SmTargetGroups(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/smTargetGroups:SmTargetGroups';

    /**
     * Returns true if the given object is an instance of SmTargetGroups.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SmTargetGroups {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SmTargetGroups.__pulumiType;
    }

    /**
     * The name of this target group.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;
    /**
     * The scope of the target group.
     */
    public readonly scope!: pulumi.Output<string>;
    /**
     * The tags of the target group.
     */
    public /*out*/ readonly tags!: pulumi.Output<string[]>;
    /**
     * targetGroupId path parameter. Target group ID
     */
    public readonly targetGroupId!: pulumi.Output<string | undefined>;

    /**
     * Create a SmTargetGroups resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SmTargetGroupsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SmTargetGroupsArgs | SmTargetGroupsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SmTargetGroupsState | undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["scope"] = state ? state.scope : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["targetGroupId"] = state ? state.targetGroupId : undefined;
        } else {
            const args = argsOrState as SmTargetGroupsArgs | undefined;
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["scope"] = args ? args.scope : undefined;
            resourceInputs["targetGroupId"] = args ? args.targetGroupId : undefined;
            resourceInputs["tags"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SmTargetGroups.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SmTargetGroups resources.
 */
export interface SmTargetGroupsState {
    /**
     * The name of this target group.
     */
    name?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * The scope of the target group.
     */
    scope?: pulumi.Input<string>;
    /**
     * The tags of the target group.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * targetGroupId path parameter. Target group ID
     */
    targetGroupId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SmTargetGroups resource.
 */
export interface SmTargetGroupsArgs {
    /**
     * The name of this target group.
     */
    name?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    /**
     * The scope of the target group.
     */
    scope?: pulumi.Input<string>;
    /**
     * targetGroupId path parameter. Target group ID
     */
    targetGroupId?: pulumi.Input<string>;
}
