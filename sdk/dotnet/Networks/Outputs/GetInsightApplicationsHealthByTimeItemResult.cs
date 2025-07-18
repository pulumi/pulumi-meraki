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
    public sealed class GetInsightApplicationsHealthByTimeItemResult
    {
        /// <summary>
        /// The end time of the query range
        /// </summary>
        public readonly string EndTs;
        /// <summary>
        /// LAN goodput (Number of useful information bits delivered over a LAN per unit of time)
        /// </summary>
        public readonly int LanGoodput;
        /// <summary>
        /// LAN latency in milliseconds
        /// </summary>
        public readonly double LanLatencyMs;
        /// <summary>
        /// LAN loss percentage
        /// </summary>
        public readonly double LanLossPercent;
        /// <summary>
        /// Number of clients
        /// </summary>
        public readonly int NumClients;
        /// <summary>
        /// Received kilobytes-per-second
        /// </summary>
        public readonly int Recv;
        /// <summary>
        /// Duration of the response, in milliseconds
        /// </summary>
        public readonly int ResponseDuration;
        /// <summary>
        /// Sent kilobytes-per-second
        /// </summary>
        public readonly int Sent;
        /// <summary>
        /// The start time of the query range
        /// </summary>
        public readonly string StartTs;
        /// <summary>
        /// WAN goodput (Number of useful information bits delivered over a WAN per unit of time)
        /// </summary>
        public readonly int WanGoodput;
        /// <summary>
        /// WAN latency in milliseconds
        /// </summary>
        public readonly double WanLatencyMs;
        /// <summary>
        /// WAN loss percentage
        /// </summary>
        public readonly double WanLossPercent;

        [OutputConstructor]
        private GetInsightApplicationsHealthByTimeItemResult(
            string endTs,

            int lanGoodput,

            double lanLatencyMs,

            double lanLossPercent,

            int numClients,

            int recv,

            int responseDuration,

            int sent,

            string startTs,

            int wanGoodput,

            double wanLatencyMs,

            double wanLossPercent)
        {
            EndTs = endTs;
            LanGoodput = lanGoodput;
            LanLatencyMs = lanLatencyMs;
            LanLossPercent = lanLossPercent;
            NumClients = numClients;
            Recv = recv;
            ResponseDuration = responseDuration;
            Sent = sent;
            StartTs = startTs;
            WanGoodput = wanGoodput;
            WanLatencyMs = wanLatencyMs;
            WanLossPercent = wanLossPercent;
        }
    }
}
