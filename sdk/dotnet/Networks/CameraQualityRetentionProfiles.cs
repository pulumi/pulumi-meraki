// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Meraki = Pulumi.Meraki;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Meraki.Networks.CameraQualityRetentionProfiles("example", new()
    ///     {
    ///         Name = "Sample quality retention profile",
    ///         NetworkId = "string",
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiNetworksCameraQualityRetentionProfilesExample"] = example,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:networks/cameraQualityRetentionProfiles:CameraQualityRetentionProfiles example "network_id,quality_retention_profile_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/cameraQualityRetentionProfiles:CameraQualityRetentionProfiles")]
    public partial class CameraQualityRetentionProfiles : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether or not to record audio. Can be either true or false. Defaults to false.
        /// </summary>
        [Output("audioRecordingEnabled")]
        public Output<bool> AudioRecordingEnabled { get; private set; } = null!;

        /// <summary>
        /// Create redundant video backup using Cloud Archive. Can be either true or false. Defaults to false.
        /// </summary>
        [Output("cloudArchiveEnabled")]
        public Output<bool> CloudArchiveEnabled { get; private set; } = null!;

        /// <summary>
        /// The maximum number of days for which the data will be stored, or 'null' to keep data until storage space runs out. If the former, it can be one of [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 30, 60, 90] days.
        /// </summary>
        [Output("maxRetentionDays")]
        public Output<int> MaxRetentionDays { get; private set; } = null!;

        /// <summary>
        /// Deletes footage older than 3 days in which no motion was detected. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
        /// </summary>
        [Output("motionBasedRetentionEnabled")]
        public Output<bool> MotionBasedRetentionEnabled { get; private set; } = null!;

        /// <summary>
        /// The version of the motion detector that will be used by the camera. Only applies to Gen 2 cameras. Defaults to v2.
        /// </summary>
        [Output("motionDetectorVersion")]
        public Output<int> MotionDetectorVersion { get; private set; } = null!;

        /// <summary>
        /// The name of the new profile. Must be unique. This parameter is required.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;

        /// <summary>
        /// qualityRetentionProfileId path parameter. Quality retention profile ID
        /// </summary>
        [Output("qualityRetentionProfileId")]
        public Output<string> QualityRetentionProfileId { get; private set; } = null!;

        /// <summary>
        /// Disable features that require additional bandwidth such as Motion Recap. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
        /// </summary>
        [Output("restrictedBandwidthModeEnabled")]
        public Output<bool> RestrictedBandwidthModeEnabled { get; private set; } = null!;

        /// <summary>
        /// Schedule for which this camera will record video, or 'null' to always record.
        /// </summary>
        [Output("scheduleId")]
        public Output<string> ScheduleId { get; private set; } = null!;

        /// <summary>
        /// Video quality and resolution settings for all the camera models.
        /// </summary>
        [Output("videoSettings")]
        public Output<Outputs.CameraQualityRetentionProfilesVideoSettings> VideoSettings { get; private set; } = null!;


        /// <summary>
        /// Create a CameraQualityRetentionProfiles resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CameraQualityRetentionProfiles(string name, CameraQualityRetentionProfilesArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/cameraQualityRetentionProfiles:CameraQualityRetentionProfiles", name, args ?? new CameraQualityRetentionProfilesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CameraQualityRetentionProfiles(string name, Input<string> id, CameraQualityRetentionProfilesState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/cameraQualityRetentionProfiles:CameraQualityRetentionProfiles", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi/pulumi-meraki",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing CameraQualityRetentionProfiles resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CameraQualityRetentionProfiles Get(string name, Input<string> id, CameraQualityRetentionProfilesState? state = null, CustomResourceOptions? options = null)
        {
            return new CameraQualityRetentionProfiles(name, id, state, options);
        }
    }

    public sealed class CameraQualityRetentionProfilesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether or not to record audio. Can be either true or false. Defaults to false.
        /// </summary>
        [Input("audioRecordingEnabled")]
        public Input<bool>? AudioRecordingEnabled { get; set; }

        /// <summary>
        /// Create redundant video backup using Cloud Archive. Can be either true or false. Defaults to false.
        /// </summary>
        [Input("cloudArchiveEnabled")]
        public Input<bool>? CloudArchiveEnabled { get; set; }

        /// <summary>
        /// The maximum number of days for which the data will be stored, or 'null' to keep data until storage space runs out. If the former, it can be one of [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 30, 60, 90] days.
        /// </summary>
        [Input("maxRetentionDays")]
        public Input<int>? MaxRetentionDays { get; set; }

        /// <summary>
        /// Deletes footage older than 3 days in which no motion was detected. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
        /// </summary>
        [Input("motionBasedRetentionEnabled")]
        public Input<bool>? MotionBasedRetentionEnabled { get; set; }

        /// <summary>
        /// The version of the motion detector that will be used by the camera. Only applies to Gen 2 cameras. Defaults to v2.
        /// </summary>
        [Input("motionDetectorVersion")]
        public Input<int>? MotionDetectorVersion { get; set; }

        /// <summary>
        /// The name of the new profile. Must be unique. This parameter is required.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        /// <summary>
        /// qualityRetentionProfileId path parameter. Quality retention profile ID
        /// </summary>
        [Input("qualityRetentionProfileId")]
        public Input<string>? QualityRetentionProfileId { get; set; }

        /// <summary>
        /// Disable features that require additional bandwidth such as Motion Recap. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
        /// </summary>
        [Input("restrictedBandwidthModeEnabled")]
        public Input<bool>? RestrictedBandwidthModeEnabled { get; set; }

        /// <summary>
        /// Schedule for which this camera will record video, or 'null' to always record.
        /// </summary>
        [Input("scheduleId")]
        public Input<string>? ScheduleId { get; set; }

        /// <summary>
        /// Video quality and resolution settings for all the camera models.
        /// </summary>
        [Input("videoSettings")]
        public Input<Inputs.CameraQualityRetentionProfilesVideoSettingsArgs>? VideoSettings { get; set; }

        public CameraQualityRetentionProfilesArgs()
        {
        }
        public static new CameraQualityRetentionProfilesArgs Empty => new CameraQualityRetentionProfilesArgs();
    }

    public sealed class CameraQualityRetentionProfilesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether or not to record audio. Can be either true or false. Defaults to false.
        /// </summary>
        [Input("audioRecordingEnabled")]
        public Input<bool>? AudioRecordingEnabled { get; set; }

        /// <summary>
        /// Create redundant video backup using Cloud Archive. Can be either true or false. Defaults to false.
        /// </summary>
        [Input("cloudArchiveEnabled")]
        public Input<bool>? CloudArchiveEnabled { get; set; }

        /// <summary>
        /// The maximum number of days for which the data will be stored, or 'null' to keep data until storage space runs out. If the former, it can be one of [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 30, 60, 90] days.
        /// </summary>
        [Input("maxRetentionDays")]
        public Input<int>? MaxRetentionDays { get; set; }

        /// <summary>
        /// Deletes footage older than 3 days in which no motion was detected. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
        /// </summary>
        [Input("motionBasedRetentionEnabled")]
        public Input<bool>? MotionBasedRetentionEnabled { get; set; }

        /// <summary>
        /// The version of the motion detector that will be used by the camera. Only applies to Gen 2 cameras. Defaults to v2.
        /// </summary>
        [Input("motionDetectorVersion")]
        public Input<int>? MotionDetectorVersion { get; set; }

        /// <summary>
        /// The name of the new profile. Must be unique. This parameter is required.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// qualityRetentionProfileId path parameter. Quality retention profile ID
        /// </summary>
        [Input("qualityRetentionProfileId")]
        public Input<string>? QualityRetentionProfileId { get; set; }

        /// <summary>
        /// Disable features that require additional bandwidth such as Motion Recap. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
        /// </summary>
        [Input("restrictedBandwidthModeEnabled")]
        public Input<bool>? RestrictedBandwidthModeEnabled { get; set; }

        /// <summary>
        /// Schedule for which this camera will record video, or 'null' to always record.
        /// </summary>
        [Input("scheduleId")]
        public Input<string>? ScheduleId { get; set; }

        /// <summary>
        /// Video quality and resolution settings for all the camera models.
        /// </summary>
        [Input("videoSettings")]
        public Input<Inputs.CameraQualityRetentionProfilesVideoSettingsGetArgs>? VideoSettings { get; set; }

        public CameraQualityRetentionProfilesState()
        {
        }
        public static new CameraQualityRetentionProfilesState Empty => new CameraQualityRetentionProfilesState();
    }
}