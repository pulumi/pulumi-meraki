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
 * const example = new meraki.networks.ApplianceFirewallFirewalledServices("example", {
 *     access: "restricted",
 *     allowedIps: ["123.123.123.1"],
 *     networkId: "string",
 *     service: "string",
 * });
 * export const merakiNetworksApplianceFirewallFirewalledServicesExample = example;
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import meraki:networks/applianceFirewallFirewalledServices:ApplianceFirewallFirewalledServices example "network_id,service"
 * ```
 */
export class ApplianceFirewallFirewalledServices extends pulumi.CustomResource {
    /**
     * Get an existing ApplianceFirewallFirewalledServices resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplianceFirewallFirewalledServicesState, opts?: pulumi.CustomResourceOptions): ApplianceFirewallFirewalledServices {
        return new ApplianceFirewallFirewalledServices(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/applianceFirewallFirewalledServices:ApplianceFirewallFirewalledServices';

    /**
     * Returns true if the given object is an instance of ApplianceFirewallFirewalledServices.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApplianceFirewallFirewalledServices {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApplianceFirewallFirewalledServices.__pulumiType;
    }

    /**
     * A string indicating the rule for which IPs are allowed to use the specified service
     */
    public readonly access!: pulumi.Output<string>;
    /**
     * An array of allowed IPs that can access the service
     */
    public readonly allowedIps!: pulumi.Output<string[]>;
    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;
    /**
     * Appliance service name
     */
    public readonly service!: pulumi.Output<string>;

    /**
     * Create a ApplianceFirewallFirewalledServices resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApplianceFirewallFirewalledServicesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApplianceFirewallFirewalledServicesArgs | ApplianceFirewallFirewalledServicesState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApplianceFirewallFirewalledServicesState | undefined;
            resourceInputs["access"] = state ? state.access : undefined;
            resourceInputs["allowedIps"] = state ? state.allowedIps : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["service"] = state ? state.service : undefined;
        } else {
            const args = argsOrState as ApplianceFirewallFirewalledServicesArgs | undefined;
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            if ((!args || args.service === undefined) && !opts.urn) {
                throw new Error("Missing required property 'service'");
            }
            resourceInputs["access"] = args ? args.access : undefined;
            resourceInputs["allowedIps"] = args ? args.allowedIps : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["service"] = args ? args.service : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ApplianceFirewallFirewalledServices.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApplianceFirewallFirewalledServices resources.
 */
export interface ApplianceFirewallFirewalledServicesState {
    /**
     * A string indicating the rule for which IPs are allowed to use the specified service
     */
    access?: pulumi.Input<string>;
    /**
     * An array of allowed IPs that can access the service
     */
    allowedIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * Appliance service name
     */
    service?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApplianceFirewallFirewalledServices resource.
 */
export interface ApplianceFirewallFirewalledServicesArgs {
    /**
     * A string indicating the rule for which IPs are allowed to use the specified service
     */
    access?: pulumi.Input<string>;
    /**
     * An array of allowed IPs that can access the service
     */
    allowedIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    /**
     * Appliance service name
     */
    service: pulumi.Input<string>;
}
