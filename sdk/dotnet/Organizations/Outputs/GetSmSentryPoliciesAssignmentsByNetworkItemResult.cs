// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class GetSmSentryPoliciesAssignmentsByNetworkItemResult
    {
        /// <summary>
        /// Sentry Group Policies for the Organization keyed by the Network or Locale Id the Policy belongs to
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSmSentryPoliciesAssignmentsByNetworkItemItemResult> Items;
        /// <summary>
        /// Metadata relevant to the paginated dataset
        /// </summary>
        public readonly Outputs.GetSmSentryPoliciesAssignmentsByNetworkItemMetaResult Meta;

        [OutputConstructor]
        private GetSmSentryPoliciesAssignmentsByNetworkItemResult(
            ImmutableArray<Outputs.GetSmSentryPoliciesAssignmentsByNetworkItemItemResult> items,

            Outputs.GetSmSentryPoliciesAssignmentsByNetworkItemMetaResult meta)
        {
            Items = items;
            Meta = meta;
        }
    }
}