// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Inputs
{

    public sealed class CameraGenerateSnapshotParametersArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// [optional] If set to "true" the snapshot will be taken at full sensor resolution. This will error if used with timestamp.
        /// </summary>
        [Input("fullframe")]
        public Input<bool>? Fullframe { get; set; }

        /// <summary>
        /// [optional] The snapshot will be taken from this time on the camera. The timestamp is expected to be in ISO 8601 format. If no timestamp is specified, we will assume current time.
        /// </summary>
        [Input("timestamp")]
        public Input<string>? Timestamp { get; set; }

        public CameraGenerateSnapshotParametersArgs()
        {
        }
        public static new CameraGenerateSnapshotParametersArgs Empty => new CameraGenerateSnapshotParametersArgs();
    }
}