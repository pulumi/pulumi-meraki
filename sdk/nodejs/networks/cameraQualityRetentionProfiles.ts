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
 * const example = new meraki.networks.CameraQualityRetentionProfiles("example", {
 *     name: "Sample quality retention profile",
 *     networkId: "string",
 * });
 * export const merakiNetworksCameraQualityRetentionProfilesExample = example;
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import meraki:networks/cameraQualityRetentionProfiles:CameraQualityRetentionProfiles example "network_id,quality_retention_profile_id"
 * ```
 */
export class CameraQualityRetentionProfiles extends pulumi.CustomResource {
    /**
     * Get an existing CameraQualityRetentionProfiles resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CameraQualityRetentionProfilesState, opts?: pulumi.CustomResourceOptions): CameraQualityRetentionProfiles {
        return new CameraQualityRetentionProfiles(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/cameraQualityRetentionProfiles:CameraQualityRetentionProfiles';

    /**
     * Returns true if the given object is an instance of CameraQualityRetentionProfiles.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CameraQualityRetentionProfiles {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CameraQualityRetentionProfiles.__pulumiType;
    }

    /**
     * Whether or not to record audio. Can be either true or false. Defaults to false.
     */
    public readonly audioRecordingEnabled!: pulumi.Output<boolean>;
    /**
     * Create redundant video backup using Cloud Archive. Can be either true or false. Defaults to false.
     */
    public readonly cloudArchiveEnabled!: pulumi.Output<boolean>;
    /**
     * The maximum number of days for which the data will be stored, or 'null' to keep data until storage space runs out. If the former, it can be one of [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 30, 60, 90] days.
     */
    public readonly maxRetentionDays!: pulumi.Output<number>;
    /**
     * Deletes footage older than 3 days in which no motion was detected. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
     */
    public readonly motionBasedRetentionEnabled!: pulumi.Output<boolean>;
    /**
     * The version of the motion detector that will be used by the camera. Only applies to Gen 2 cameras. Defaults to v2.
     */
    public readonly motionDetectorVersion!: pulumi.Output<number>;
    /**
     * The name of the new profile. Must be unique. This parameter is required.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;
    /**
     * qualityRetentionProfileId path parameter. Quality retention profile ID
     */
    public readonly qualityRetentionProfileId!: pulumi.Output<string>;
    /**
     * Disable features that require additional bandwidth such as Motion Recap. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
     */
    public readonly restrictedBandwidthModeEnabled!: pulumi.Output<boolean>;
    /**
     * Schedule for which this camera will record video, or 'null' to always record.
     */
    public readonly scheduleId!: pulumi.Output<string>;
    /**
     * Video quality and resolution settings for all the camera models.
     */
    public readonly videoSettings!: pulumi.Output<outputs.networks.CameraQualityRetentionProfilesVideoSettings>;

    /**
     * Create a CameraQualityRetentionProfiles resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CameraQualityRetentionProfilesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CameraQualityRetentionProfilesArgs | CameraQualityRetentionProfilesState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CameraQualityRetentionProfilesState | undefined;
            resourceInputs["audioRecordingEnabled"] = state ? state.audioRecordingEnabled : undefined;
            resourceInputs["cloudArchiveEnabled"] = state ? state.cloudArchiveEnabled : undefined;
            resourceInputs["maxRetentionDays"] = state ? state.maxRetentionDays : undefined;
            resourceInputs["motionBasedRetentionEnabled"] = state ? state.motionBasedRetentionEnabled : undefined;
            resourceInputs["motionDetectorVersion"] = state ? state.motionDetectorVersion : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["qualityRetentionProfileId"] = state ? state.qualityRetentionProfileId : undefined;
            resourceInputs["restrictedBandwidthModeEnabled"] = state ? state.restrictedBandwidthModeEnabled : undefined;
            resourceInputs["scheduleId"] = state ? state.scheduleId : undefined;
            resourceInputs["videoSettings"] = state ? state.videoSettings : undefined;
        } else {
            const args = argsOrState as CameraQualityRetentionProfilesArgs | undefined;
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            resourceInputs["audioRecordingEnabled"] = args ? args.audioRecordingEnabled : undefined;
            resourceInputs["cloudArchiveEnabled"] = args ? args.cloudArchiveEnabled : undefined;
            resourceInputs["maxRetentionDays"] = args ? args.maxRetentionDays : undefined;
            resourceInputs["motionBasedRetentionEnabled"] = args ? args.motionBasedRetentionEnabled : undefined;
            resourceInputs["motionDetectorVersion"] = args ? args.motionDetectorVersion : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["qualityRetentionProfileId"] = args ? args.qualityRetentionProfileId : undefined;
            resourceInputs["restrictedBandwidthModeEnabled"] = args ? args.restrictedBandwidthModeEnabled : undefined;
            resourceInputs["scheduleId"] = args ? args.scheduleId : undefined;
            resourceInputs["videoSettings"] = args ? args.videoSettings : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CameraQualityRetentionProfiles.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CameraQualityRetentionProfiles resources.
 */
export interface CameraQualityRetentionProfilesState {
    /**
     * Whether or not to record audio. Can be either true or false. Defaults to false.
     */
    audioRecordingEnabled?: pulumi.Input<boolean>;
    /**
     * Create redundant video backup using Cloud Archive. Can be either true or false. Defaults to false.
     */
    cloudArchiveEnabled?: pulumi.Input<boolean>;
    /**
     * The maximum number of days for which the data will be stored, or 'null' to keep data until storage space runs out. If the former, it can be one of [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 30, 60, 90] days.
     */
    maxRetentionDays?: pulumi.Input<number>;
    /**
     * Deletes footage older than 3 days in which no motion was detected. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
     */
    motionBasedRetentionEnabled?: pulumi.Input<boolean>;
    /**
     * The version of the motion detector that will be used by the camera. Only applies to Gen 2 cameras. Defaults to v2.
     */
    motionDetectorVersion?: pulumi.Input<number>;
    /**
     * The name of the new profile. Must be unique. This parameter is required.
     */
    name?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * qualityRetentionProfileId path parameter. Quality retention profile ID
     */
    qualityRetentionProfileId?: pulumi.Input<string>;
    /**
     * Disable features that require additional bandwidth such as Motion Recap. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
     */
    restrictedBandwidthModeEnabled?: pulumi.Input<boolean>;
    /**
     * Schedule for which this camera will record video, or 'null' to always record.
     */
    scheduleId?: pulumi.Input<string>;
    /**
     * Video quality and resolution settings for all the camera models.
     */
    videoSettings?: pulumi.Input<inputs.networks.CameraQualityRetentionProfilesVideoSettings>;
}

/**
 * The set of arguments for constructing a CameraQualityRetentionProfiles resource.
 */
export interface CameraQualityRetentionProfilesArgs {
    /**
     * Whether or not to record audio. Can be either true or false. Defaults to false.
     */
    audioRecordingEnabled?: pulumi.Input<boolean>;
    /**
     * Create redundant video backup using Cloud Archive. Can be either true or false. Defaults to false.
     */
    cloudArchiveEnabled?: pulumi.Input<boolean>;
    /**
     * The maximum number of days for which the data will be stored, or 'null' to keep data until storage space runs out. If the former, it can be one of [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 30, 60, 90] days.
     */
    maxRetentionDays?: pulumi.Input<number>;
    /**
     * Deletes footage older than 3 days in which no motion was detected. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
     */
    motionBasedRetentionEnabled?: pulumi.Input<boolean>;
    /**
     * The version of the motion detector that will be used by the camera. Only applies to Gen 2 cameras. Defaults to v2.
     */
    motionDetectorVersion?: pulumi.Input<number>;
    /**
     * The name of the new profile. Must be unique. This parameter is required.
     */
    name?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    /**
     * qualityRetentionProfileId path parameter. Quality retention profile ID
     */
    qualityRetentionProfileId?: pulumi.Input<string>;
    /**
     * Disable features that require additional bandwidth such as Motion Recap. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
     */
    restrictedBandwidthModeEnabled?: pulumi.Input<boolean>;
    /**
     * Schedule for which this camera will record video, or 'null' to always record.
     */
    scheduleId?: pulumi.Input<string>;
    /**
     * Video quality and resolution settings for all the camera models.
     */
    videoSettings?: pulumi.Input<inputs.networks.CameraQualityRetentionProfilesVideoSettings>;
}
