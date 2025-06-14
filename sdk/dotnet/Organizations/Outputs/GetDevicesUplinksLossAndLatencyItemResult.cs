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
    public sealed class GetDevicesUplinksLossAndLatencyItemResult
    {
        /// <summary>
        /// IP address of uplink
        /// </summary>
        public readonly string Ip;
        /// <summary>
        /// Network ID
        /// </summary>
        public readonly string NetworkId;
        /// <summary>
        /// Serial of MX device
        /// </summary>
        public readonly string Serial;
        /// <summary>
        /// Loss and latency timeseries data
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDevicesUplinksLossAndLatencyItemTimeSeriesResult> TimeSeries;
        /// <summary>
        /// Uplink interface (wan1, wan2, or cellular)
        /// </summary>
        public readonly string Uplink;

        [OutputConstructor]
        private GetDevicesUplinksLossAndLatencyItemResult(
            string ip,

            string networkId,

            string serial,

            ImmutableArray<Outputs.GetDevicesUplinksLossAndLatencyItemTimeSeriesResult> timeSeries,

            string uplink)
        {
            Ip = ip;
            NetworkId = networkId;
            Serial = serial;
            TimeSeries = timeSeries;
            Uplink = uplink;
        }
    }
}
