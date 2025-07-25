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
    public sealed class GetWirelessDevicesChannelUtilizationByNetworkItemResult
    {
        /// <summary>
        /// Channel utilization broken down by band.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWirelessDevicesChannelUtilizationByNetworkItemByBandResult> ByBands;
        /// <summary>
        /// Network for the given utilization metrics.
        /// </summary>
        public readonly Outputs.GetWirelessDevicesChannelUtilizationByNetworkItemNetworkResult Network;

        [OutputConstructor]
        private GetWirelessDevicesChannelUtilizationByNetworkItemResult(
            ImmutableArray<Outputs.GetWirelessDevicesChannelUtilizationByNetworkItemByBandResult> byBands,

            Outputs.GetWirelessDevicesChannelUtilizationByNetworkItemNetworkResult network)
        {
            ByBands = byBands;
            Network = network;
        }
    }
}
