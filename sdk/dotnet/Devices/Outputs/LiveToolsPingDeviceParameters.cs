// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class LiveToolsPingDeviceParameters
    {
        /// <summary>
        /// Details for the callback. Please include either an httpServerId OR url and sharedSecret
        /// </summary>
        public readonly Outputs.LiveToolsPingDeviceParametersCallback? Callback;
        /// <summary>
        /// Count parameter to pass to ping. [1..5], default 5
        /// </summary>
        public readonly int? Count;

        [OutputConstructor]
        private LiveToolsPingDeviceParameters(
            Outputs.LiveToolsPingDeviceParametersCallback? callback,

            int? count)
        {
            Callback = callback;
            Count = count;
        }
    }
}
