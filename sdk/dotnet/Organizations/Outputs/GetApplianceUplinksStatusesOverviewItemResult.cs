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
    public sealed class GetApplianceUplinksStatusesOverviewItemResult
    {
        /// <summary>
        /// counts
        /// </summary>
        public readonly Outputs.GetApplianceUplinksStatusesOverviewItemCountsResult Counts;

        [OutputConstructor]
        private GetApplianceUplinksStatusesOverviewItemResult(Outputs.GetApplianceUplinksStatusesOverviewItemCountsResult counts)
        {
            Counts = counts;
        }
    }
}
