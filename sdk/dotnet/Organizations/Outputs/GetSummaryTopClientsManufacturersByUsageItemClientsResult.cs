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
    public sealed class GetSummaryTopClientsManufacturersByUsageItemClientsResult
    {
        /// <summary>
        /// Counts of clients
        /// </summary>
        public readonly Outputs.GetSummaryTopClientsManufacturersByUsageItemClientsCountsResult Counts;

        [OutputConstructor]
        private GetSummaryTopClientsManufacturersByUsageItemClientsResult(Outputs.GetSummaryTopClientsManufacturersByUsageItemClientsCountsResult counts)
        {
            Counts = counts;
        }
    }
}
