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
    public sealed class GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBandWifiResult
    {
        /// <summary>
        /// Percentage of wifi channel utiliation for the given band.
        /// </summary>
        public readonly double Percentage;

        [OutputConstructor]
        private GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBandWifiResult(double percentage)
        {
            Percentage = percentage;
        }
    }
}
