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
 * $ pulumi import meraki:organizations/alertsProfiles:AlertsProfiles example "organization_id"
 * ```
 */
export class AlertsProfiles extends pulumi.CustomResource {
    /**
     * Get an existing AlertsProfiles resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AlertsProfilesState, opts?: pulumi.CustomResourceOptions): AlertsProfiles {
        return new AlertsProfiles(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:organizations/alertsProfiles:AlertsProfiles';

    /**
     * Returns true if the given object is an instance of AlertsProfiles.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AlertsProfiles {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AlertsProfiles.__pulumiType;
    }

    /**
     * The conditions that determine if the alert triggers
     */
    public readonly alertCondition!: pulumi.Output<outputs.organizations.AlertsProfilesAlertCondition>;
    /**
     * alertConfigId path parameter. Alert config ID
     */
    public readonly alertConfigId!: pulumi.Output<string>;
    /**
     * User supplied description of the alert
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Is the alert config enabled
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * Networks with these tags will be monitored for the alert
     */
    public readonly networkTags!: pulumi.Output<string[]>;
    /**
     * organizationId path parameter. Organization ID
     */
    public readonly organizationId!: pulumi.Output<string>;
    /**
     * List of recipients that will recieve the alert.
     */
    public readonly recipients!: pulumi.Output<outputs.organizations.AlertsProfilesRecipients>;
    /**
     * The alert type
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a AlertsProfiles resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AlertsProfilesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AlertsProfilesArgs | AlertsProfilesState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AlertsProfilesState | undefined;
            resourceInputs["alertCondition"] = state ? state.alertCondition : undefined;
            resourceInputs["alertConfigId"] = state ? state.alertConfigId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["networkTags"] = state ? state.networkTags : undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
            resourceInputs["recipients"] = state ? state.recipients : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as AlertsProfilesArgs | undefined;
            if ((!args || args.organizationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organizationId'");
            }
            resourceInputs["alertCondition"] = args ? args.alertCondition : undefined;
            resourceInputs["alertConfigId"] = args ? args.alertConfigId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["networkTags"] = args ? args.networkTags : undefined;
            resourceInputs["organizationId"] = args ? args.organizationId : undefined;
            resourceInputs["recipients"] = args ? args.recipients : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AlertsProfiles.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AlertsProfiles resources.
 */
export interface AlertsProfilesState {
    /**
     * The conditions that determine if the alert triggers
     */
    alertCondition?: pulumi.Input<inputs.organizations.AlertsProfilesAlertCondition>;
    /**
     * alertConfigId path parameter. Alert config ID
     */
    alertConfigId?: pulumi.Input<string>;
    /**
     * User supplied description of the alert
     */
    description?: pulumi.Input<string>;
    /**
     * Is the alert config enabled
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Networks with these tags will be monitored for the alert
     */
    networkTags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId?: pulumi.Input<string>;
    /**
     * List of recipients that will recieve the alert.
     */
    recipients?: pulumi.Input<inputs.organizations.AlertsProfilesRecipients>;
    /**
     * The alert type
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AlertsProfiles resource.
 */
export interface AlertsProfilesArgs {
    /**
     * The conditions that determine if the alert triggers
     */
    alertCondition?: pulumi.Input<inputs.organizations.AlertsProfilesAlertCondition>;
    /**
     * alertConfigId path parameter. Alert config ID
     */
    alertConfigId?: pulumi.Input<string>;
    /**
     * User supplied description of the alert
     */
    description?: pulumi.Input<string>;
    /**
     * Is the alert config enabled
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Networks with these tags will be monitored for the alert
     */
    networkTags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: pulumi.Input<string>;
    /**
     * List of recipients that will recieve the alert.
     */
    recipients?: pulumi.Input<inputs.organizations.AlertsProfilesRecipients>;
    /**
     * The alert type
     */
    type?: pulumi.Input<string>;
}
