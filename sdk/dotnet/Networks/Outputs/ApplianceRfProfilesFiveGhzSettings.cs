// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Outputs
{

    [OutputType]
    public sealed class ApplianceRfProfilesFiveGhzSettings
    {
        /// <summary>
        /// Whether ax radio on 5Ghz band is on or off.
        /// </summary>
        public readonly bool? AxEnabled;
        /// <summary>
        /// Min bitrate (Mbps) of 2.4Ghz band.
        /// </summary>
        public readonly int? MinBitrate;

        [OutputConstructor]
        private ApplianceRfProfilesFiveGhzSettings(
            bool? axEnabled,

            int? minBitrate)
        {
            AxEnabled = axEnabled;
            MinBitrate = minBitrate;
        }
    }
}
