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
 * $ pulumi import meraki:networks/sensorAlertsProfiles:SensorAlertsProfiles example "id,network_id"
 * ```
 */
export class SensorAlertsProfiles extends pulumi.CustomResource {
    /**
     * Get an existing SensorAlertsProfiles resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SensorAlertsProfilesState, opts?: pulumi.CustomResourceOptions): SensorAlertsProfiles {
        return new SensorAlertsProfiles(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/sensorAlertsProfiles:SensorAlertsProfiles';

    /**
     * Returns true if the given object is an instance of SensorAlertsProfiles.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SensorAlertsProfiles {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SensorAlertsProfiles.__pulumiType;
    }

    /**
     * List of conditions that will cause the profile to send an alert.
     */
    public readonly conditions!: pulumi.Output<outputs.networks.SensorAlertsProfilesCondition[] | undefined>;
    /**
     * List of conditions that will cause the profile to send an alert.
     */
    public /*out*/ readonly conditionsResponses!: pulumi.Output<outputs.networks.SensorAlertsProfilesConditionsResponse[]>;
    /**
     * Name of the sensor alert profile.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;
    /**
     * ID of the sensor alert profile.
     */
    public /*out*/ readonly profileId!: pulumi.Output<string>;
    /**
     * List of recipients that will receive the alert.
     */
    public readonly recipients!: pulumi.Output<outputs.networks.SensorAlertsProfilesRecipients>;
    /**
     * The sensor schedule to use with the alert profile.
     */
    public readonly schedule!: pulumi.Output<outputs.networks.SensorAlertsProfilesSchedule>;
    /**
     * List of device serials assigned to this sensor alert profile.
     */
    public readonly serials!: pulumi.Output<string[]>;

    /**
     * Create a SensorAlertsProfiles resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SensorAlertsProfilesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SensorAlertsProfilesArgs | SensorAlertsProfilesState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SensorAlertsProfilesState | undefined;
            resourceInputs["conditions"] = state ? state.conditions : undefined;
            resourceInputs["conditionsResponses"] = state ? state.conditionsResponses : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["profileId"] = state ? state.profileId : undefined;
            resourceInputs["recipients"] = state ? state.recipients : undefined;
            resourceInputs["schedule"] = state ? state.schedule : undefined;
            resourceInputs["serials"] = state ? state.serials : undefined;
        } else {
            const args = argsOrState as SensorAlertsProfilesArgs | undefined;
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            resourceInputs["conditions"] = args ? args.conditions : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["recipients"] = args ? args.recipients : undefined;
            resourceInputs["schedule"] = args ? args.schedule : undefined;
            resourceInputs["serials"] = args ? args.serials : undefined;
            resourceInputs["conditionsResponses"] = undefined /*out*/;
            resourceInputs["profileId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SensorAlertsProfiles.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SensorAlertsProfiles resources.
 */
export interface SensorAlertsProfilesState {
    /**
     * List of conditions that will cause the profile to send an alert.
     */
    conditions?: pulumi.Input<pulumi.Input<inputs.networks.SensorAlertsProfilesCondition>[]>;
    /**
     * List of conditions that will cause the profile to send an alert.
     */
    conditionsResponses?: pulumi.Input<pulumi.Input<inputs.networks.SensorAlertsProfilesConditionsResponse>[]>;
    /**
     * Name of the sensor alert profile.
     */
    name?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * ID of the sensor alert profile.
     */
    profileId?: pulumi.Input<string>;
    /**
     * List of recipients that will receive the alert.
     */
    recipients?: pulumi.Input<inputs.networks.SensorAlertsProfilesRecipients>;
    /**
     * The sensor schedule to use with the alert profile.
     */
    schedule?: pulumi.Input<inputs.networks.SensorAlertsProfilesSchedule>;
    /**
     * List of device serials assigned to this sensor alert profile.
     */
    serials?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a SensorAlertsProfiles resource.
 */
export interface SensorAlertsProfilesArgs {
    /**
     * List of conditions that will cause the profile to send an alert.
     */
    conditions?: pulumi.Input<pulumi.Input<inputs.networks.SensorAlertsProfilesCondition>[]>;
    /**
     * Name of the sensor alert profile.
     */
    name?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    /**
     * List of recipients that will receive the alert.
     */
    recipients?: pulumi.Input<inputs.networks.SensorAlertsProfilesRecipients>;
    /**
     * The sensor schedule to use with the alert profile.
     */
    schedule?: pulumi.Input<inputs.networks.SensorAlertsProfilesSchedule>;
    /**
     * List of device serials assigned to this sensor alert profile.
     */
    serials?: pulumi.Input<pulumi.Input<string>[]>;
}
