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
    public sealed class GetLiveToolsPingDeviceItemResultsReplyResult
    {
        /// <summary>
        /// Latency of the packet in milliseconds
        /// </summary>
        public readonly double Latency;
        /// <summary>
        /// Sequence ID of the packet
        /// </summary>
        public readonly int SequenceId;
        /// <summary>
        /// Size of the packet in bytes
        /// </summary>
        public readonly int Size;

        [OutputConstructor]
        private GetLiveToolsPingDeviceItemResultsReplyResult(
            double latency,

            int sequenceId,

            int size)
        {
            Latency = latency;
            SequenceId = sequenceId;
            Size = size;
        }
    }
}