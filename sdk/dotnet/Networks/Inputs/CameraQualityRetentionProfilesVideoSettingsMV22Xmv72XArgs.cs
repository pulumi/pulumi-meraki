// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class CameraQualityRetentionProfilesVideoSettingsMV22Xmv72XArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Quality of the camera. Can be one of 'Standard', 'Enhanced' or 'High'.
        /// </summary>
        [Input("quality")]
        public Input<string>? Quality { get; set; }

        /// <summary>
        /// Resolution of the camera. Can be one of '1280x720', '1920x1080' or '2688x1512'.
        /// </summary>
        [Input("resolution")]
        public Input<string>? Resolution { get; set; }

        public CameraQualityRetentionProfilesVideoSettingsMV22Xmv72XArgs()
        {
        }
        public static new CameraQualityRetentionProfilesVideoSettingsMV22Xmv72XArgs Empty => new CameraQualityRetentionProfilesVideoSettingsMV22Xmv72XArgs();
    }
}