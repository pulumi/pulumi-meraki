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
    public sealed class GetClientsOverviewItemUsageOverallResult
    {
        /// <summary>
        /// Downstream data usage (in kb) of all clients across organization
        /// </summary>
        public readonly double Downstream;
        /// <summary>
        /// Total data usage (in kb) of all clients across organization
        /// </summary>
        public readonly double Total;
        /// <summary>
        /// Upstream data usage (in kb) of all clients across organization
        /// </summary>
        public readonly double Upstream;

        [OutputConstructor]
        private GetClientsOverviewItemUsageOverallResult(
            double downstream,

            double total,

            double upstream)
        {
            Downstream = downstream;
            Total = total;
            Upstream = upstream;
        }
    }
}
