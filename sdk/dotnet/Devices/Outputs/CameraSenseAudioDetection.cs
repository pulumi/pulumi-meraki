// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class CameraSenseAudioDetection
    {
        /// <summary>
        /// Boolean indicating if audio detection is enabled(true) or disabled(false) on the camera
        /// </summary>
        public readonly bool? Enabled;

        [OutputConstructor]
        private CameraSenseAudioDetection(bool? enabled)
        {
            Enabled = enabled;
        }
    }
}