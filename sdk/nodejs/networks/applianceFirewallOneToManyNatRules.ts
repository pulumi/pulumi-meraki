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
 * $ pulumi import meraki:networks/applianceFirewallOneToManyNatRules:ApplianceFirewallOneToManyNatRules example "network_id"
 * ```
 */
export class ApplianceFirewallOneToManyNatRules extends pulumi.CustomResource {
    /**
     * Get an existing ApplianceFirewallOneToManyNatRules resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplianceFirewallOneToManyNatRulesState, opts?: pulumi.CustomResourceOptions): ApplianceFirewallOneToManyNatRules {
        return new ApplianceFirewallOneToManyNatRules(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/applianceFirewallOneToManyNatRules:ApplianceFirewallOneToManyNatRules';

    /**
     * Returns true if the given object is an instance of ApplianceFirewallOneToManyNatRules.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApplianceFirewallOneToManyNatRules {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApplianceFirewallOneToManyNatRules.__pulumiType;
    }

    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;
    /**
     * An array of 1:Many nat rules
     */
    public readonly rules!: pulumi.Output<outputs.networks.ApplianceFirewallOneToManyNatRulesRule[]>;

    /**
     * Create a ApplianceFirewallOneToManyNatRules resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApplianceFirewallOneToManyNatRulesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApplianceFirewallOneToManyNatRulesArgs | ApplianceFirewallOneToManyNatRulesState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApplianceFirewallOneToManyNatRulesState | undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
        } else {
            const args = argsOrState as ApplianceFirewallOneToManyNatRulesArgs | undefined;
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["rules"] = args ? args.rules : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ApplianceFirewallOneToManyNatRules.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApplianceFirewallOneToManyNatRules resources.
 */
export interface ApplianceFirewallOneToManyNatRulesState {
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * An array of 1:Many nat rules
     */
    rules?: pulumi.Input<pulumi.Input<inputs.networks.ApplianceFirewallOneToManyNatRulesRule>[]>;
}

/**
 * The set of arguments for constructing a ApplianceFirewallOneToManyNatRules resource.
 */
export interface ApplianceFirewallOneToManyNatRulesArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    /**
     * An array of 1:Many nat rules
     */
    rules?: pulumi.Input<pulumi.Input<inputs.networks.ApplianceFirewallOneToManyNatRulesRule>[]>;
}
