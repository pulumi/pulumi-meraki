// *** WARNING: this file was generated by pulumi-language-nodejs. ***
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
 * $ pulumi import meraki:organizations/applianceSecurityIntrusion:ApplianceSecurityIntrusion example "organization_id"
 * ```
 */
export class ApplianceSecurityIntrusion extends pulumi.CustomResource {
    /**
     * Get an existing ApplianceSecurityIntrusion resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplianceSecurityIntrusionState, opts?: pulumi.CustomResourceOptions): ApplianceSecurityIntrusion {
        return new ApplianceSecurityIntrusion(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:organizations/applianceSecurityIntrusion:ApplianceSecurityIntrusion';

    /**
     * Returns true if the given object is an instance of ApplianceSecurityIntrusion.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApplianceSecurityIntrusion {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApplianceSecurityIntrusion.__pulumiType;
    }

    /**
     * Sets a list of specific SNORT signatures to allow
     */
    public readonly allowedRules!: pulumi.Output<outputs.organizations.ApplianceSecurityIntrusionAllowedRule[]>;
    /**
     * organizationId path parameter. Organization ID
     */
    public readonly organizationId!: pulumi.Output<string>;

    /**
     * Create a ApplianceSecurityIntrusion resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApplianceSecurityIntrusionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApplianceSecurityIntrusionArgs | ApplianceSecurityIntrusionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApplianceSecurityIntrusionState | undefined;
            resourceInputs["allowedRules"] = state ? state.allowedRules : undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
        } else {
            const args = argsOrState as ApplianceSecurityIntrusionArgs | undefined;
            if ((!args || args.organizationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organizationId'");
            }
            resourceInputs["allowedRules"] = args ? args.allowedRules : undefined;
            resourceInputs["organizationId"] = args ? args.organizationId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ApplianceSecurityIntrusion.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApplianceSecurityIntrusion resources.
 */
export interface ApplianceSecurityIntrusionState {
    /**
     * Sets a list of specific SNORT signatures to allow
     */
    allowedRules?: pulumi.Input<pulumi.Input<inputs.organizations.ApplianceSecurityIntrusionAllowedRule>[]>;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApplianceSecurityIntrusion resource.
 */
export interface ApplianceSecurityIntrusionArgs {
    /**
     * Sets a list of specific SNORT signatures to allow
     */
    allowedRules?: pulumi.Input<pulumi.Input<inputs.organizations.ApplianceSecurityIntrusionAllowedRule>[]>;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: pulumi.Input<string>;
}
