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
    public sealed class GetSmSentryPoliciesAssignmentsByNetworkItemMetaCountsItemsResult
    {
        /// <summary>
        /// The number of items in the dataset that are available on subsequent pages
        /// </summary>
        public readonly int Remaining;
        /// <summary>
        /// The total number of items in the dataset
        /// </summary>
        public readonly int Total;

        [OutputConstructor]
        private GetSmSentryPoliciesAssignmentsByNetworkItemMetaCountsItemsResult(
            int remaining,

            int total)
        {
            Remaining = remaining;
            Total = total;
        }
    }
}
