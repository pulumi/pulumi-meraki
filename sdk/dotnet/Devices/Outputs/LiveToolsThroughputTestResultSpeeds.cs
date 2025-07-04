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
    public sealed class LiveToolsThroughputTestResultSpeeds
    {
        /// <summary>
        /// Shows the download speed from shard (Mbps)
        /// </summary>
        public readonly int? Downstream;

        [OutputConstructor]
        private LiveToolsThroughputTestResultSpeeds(int? downstream)
        {
            Downstream = downstream;
        }
    }
}
