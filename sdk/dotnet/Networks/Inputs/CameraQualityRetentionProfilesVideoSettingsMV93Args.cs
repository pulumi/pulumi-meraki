// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class CameraQualityRetentionProfilesVideoSettingsMV93Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Quality of the camera. Can be one of 'Standard', 'Enhanced' or 'High'.
        /// </summary>
        [Input("quality")]
        public Input<string>? Quality { get; set; }

        /// <summary>
        /// Resolution of the camera. Can be one of '1080x1080' or '2112x2112'.
        /// </summary>
        [Input("resolution")]
        public Input<string>? Resolution { get; set; }

        public CameraQualityRetentionProfilesVideoSettingsMV93Args()
        {
        }
        public static new CameraQualityRetentionProfilesVideoSettingsMV93Args Empty => new CameraQualityRetentionProfilesVideoSettingsMV93Args();
    }
}
