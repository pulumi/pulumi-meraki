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
    public sealed class GetLiveToolsPingItemResultsResult
    {
        /// <summary>
        /// Packet latency stats
        /// </summary>
        public readonly Outputs.GetLiveToolsPingItemResultsLatenciesResult Latencies;
        /// <summary>
        /// Lost packets
        /// </summary>
        public readonly Outputs.GetLiveToolsPingItemResultsLossResult Loss;
        /// <summary>
        /// Number of packets received
        /// </summary>
        public readonly int Received;
        /// <summary>
        /// Received packets
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLiveToolsPingItemResultsReplyResult> Replies;
        /// <summary>
        /// Number of packets sent
        /// </summary>
        public readonly int Sent;

        [OutputConstructor]
        private GetLiveToolsPingItemResultsResult(
            Outputs.GetLiveToolsPingItemResultsLatenciesResult latencies,

            Outputs.GetLiveToolsPingItemResultsLossResult loss,

            int received,

            ImmutableArray<Outputs.GetLiveToolsPingItemResultsReplyResult> replies,

            int sent)
        {
            Latencies = latencies;
            Loss = loss;
            Received = received;
            Replies = replies;
            Sent = sent;
        }
    }
}
