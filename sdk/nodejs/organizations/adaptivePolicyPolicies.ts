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
 * const example = new meraki.organizations.AdaptivePolicyPolicies("example", {
 *     acls: [{
 *         id: "444",
 *         name: "Block web",
 *     }],
 *     destinationGroup: {
 *         id: "333",
 *         name: "IoT Servers",
 *         sgt: 51,
 *     },
 *     lastEntryRule: "allow",
 *     organizationId: "string",
 *     sourceGroup: {
 *         id: "222",
 *         name: "IoT Devices",
 *         sgt: 50,
 *     },
 * });
 * export const merakiOrganizationsAdaptivePolicyPoliciesExample = example;
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import meraki:organizations/adaptivePolicyPolicies:AdaptivePolicyPolicies example "id,organization_id"
 * ```
 */
export class AdaptivePolicyPolicies extends pulumi.CustomResource {
    /**
     * Get an existing AdaptivePolicyPolicies resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AdaptivePolicyPoliciesState, opts?: pulumi.CustomResourceOptions): AdaptivePolicyPolicies {
        return new AdaptivePolicyPolicies(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:organizations/adaptivePolicyPolicies:AdaptivePolicyPolicies';

    /**
     * Returns true if the given object is an instance of AdaptivePolicyPolicies.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AdaptivePolicyPolicies {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AdaptivePolicyPolicies.__pulumiType;
    }

    /**
     * An ordered array of adaptive policy ACLs (each requires one unique attribute) that apply to this policy (default: [])
     */
    public readonly acls!: pulumi.Output<outputs.organizations.AdaptivePolicyPoliciesAcl[]>;
    public /*out*/ readonly adaptivePolicyId!: pulumi.Output<string>;
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * The destination adaptive policy group (requires one unique attribute)
     */
    public readonly destinationGroup!: pulumi.Output<outputs.organizations.AdaptivePolicyPoliciesDestinationGroup>;
    /**
     * The rule to apply if there is no matching ACL (default: "default")
     */
    public readonly lastEntryRule!: pulumi.Output<string>;
    /**
     * organizationId path parameter. Organization ID
     */
    public readonly organizationId!: pulumi.Output<string>;
    /**
     * The source adaptive policy group (requires one unique attribute)
     */
    public readonly sourceGroup!: pulumi.Output<outputs.organizations.AdaptivePolicyPoliciesSourceGroup>;
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;

    /**
     * Create a AdaptivePolicyPolicies resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AdaptivePolicyPoliciesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AdaptivePolicyPoliciesArgs | AdaptivePolicyPoliciesState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AdaptivePolicyPoliciesState | undefined;
            resourceInputs["acls"] = state ? state.acls : undefined;
            resourceInputs["adaptivePolicyId"] = state ? state.adaptivePolicyId : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["destinationGroup"] = state ? state.destinationGroup : undefined;
            resourceInputs["lastEntryRule"] = state ? state.lastEntryRule : undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
            resourceInputs["sourceGroup"] = state ? state.sourceGroup : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
        } else {
            const args = argsOrState as AdaptivePolicyPoliciesArgs | undefined;
            if ((!args || args.organizationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organizationId'");
            }
            resourceInputs["acls"] = args ? args.acls : undefined;
            resourceInputs["destinationGroup"] = args ? args.destinationGroup : undefined;
            resourceInputs["lastEntryRule"] = args ? args.lastEntryRule : undefined;
            resourceInputs["organizationId"] = args ? args.organizationId : undefined;
            resourceInputs["sourceGroup"] = args ? args.sourceGroup : undefined;
            resourceInputs["adaptivePolicyId"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AdaptivePolicyPolicies.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AdaptivePolicyPolicies resources.
 */
export interface AdaptivePolicyPoliciesState {
    /**
     * An ordered array of adaptive policy ACLs (each requires one unique attribute) that apply to this policy (default: [])
     */
    acls?: pulumi.Input<pulumi.Input<inputs.organizations.AdaptivePolicyPoliciesAcl>[]>;
    adaptivePolicyId?: pulumi.Input<string>;
    createdAt?: pulumi.Input<string>;
    /**
     * The destination adaptive policy group (requires one unique attribute)
     */
    destinationGroup?: pulumi.Input<inputs.organizations.AdaptivePolicyPoliciesDestinationGroup>;
    /**
     * The rule to apply if there is no matching ACL (default: "default")
     */
    lastEntryRule?: pulumi.Input<string>;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId?: pulumi.Input<string>;
    /**
     * The source adaptive policy group (requires one unique attribute)
     */
    sourceGroup?: pulumi.Input<inputs.organizations.AdaptivePolicyPoliciesSourceGroup>;
    updatedAt?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AdaptivePolicyPolicies resource.
 */
export interface AdaptivePolicyPoliciesArgs {
    /**
     * An ordered array of adaptive policy ACLs (each requires one unique attribute) that apply to this policy (default: [])
     */
    acls?: pulumi.Input<pulumi.Input<inputs.organizations.AdaptivePolicyPoliciesAcl>[]>;
    /**
     * The destination adaptive policy group (requires one unique attribute)
     */
    destinationGroup?: pulumi.Input<inputs.organizations.AdaptivePolicyPoliciesDestinationGroup>;
    /**
     * The rule to apply if there is no matching ACL (default: "default")
     */
    lastEntryRule?: pulumi.Input<string>;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: pulumi.Input<string>;
    /**
     * The source adaptive policy group (requires one unique attribute)
     */
    sourceGroup?: pulumi.Input<inputs.organizations.AdaptivePolicyPoliciesSourceGroup>;
}
