// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class GetWirelessDevicesPacketLossByClientItemUpstreamResult
    {
        /// <summary>
        /// Percentage of lost packets.
        /// </summary>
        public readonly double LossPercentage;
        /// <summary>
        /// Total packets sent by a client and did not reach the AP.
        /// </summary>
        public readonly int Lost;
        /// <summary>
        /// Total packets sent by a client to an AP.
        /// </summary>
        public readonly int Total;

        [OutputConstructor]
        private GetWirelessDevicesPacketLossByClientItemUpstreamResult(
            double lossPercentage,

            int lost,

            int total)
        {
            LossPercentage = lossPercentage;
            Lost = lost;
            Total = total;
        }
    }
}
