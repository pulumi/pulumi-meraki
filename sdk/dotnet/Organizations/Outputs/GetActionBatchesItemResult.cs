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
    public sealed class GetActionBatchesItemResult
    {
        /// <summary>
        /// A set of changes made as part of this action (\n\nmore details\n\n)
        /// </summary>
        public readonly ImmutableArray<Outputs.GetActionBatchesItemActionResult> Actions;
        /// <summary>
        /// Flag describing whether the action should be previewed before executing or not
        /// </summary>
        public readonly bool Confirmed;
        /// <summary>
        /// ID of the action batch. Can be used to check the status of the action batch at /organizations/{organizationId}/actionBatches/{actionBatchId}
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// ID of the organization this action batch belongs to
        /// </summary>
        public readonly string OrganizationId;
        /// <summary>
        /// Status of action batch
        /// </summary>
        public readonly Outputs.GetActionBatchesItemStatusResult Status;
        /// <summary>
        /// Flag describing whether actions should run synchronously or asynchronously
        /// </summary>
        public readonly bool Synchronous;

        [OutputConstructor]
        private GetActionBatchesItemResult(
            ImmutableArray<Outputs.GetActionBatchesItemActionResult> actions,

            bool confirmed,

            string id,

            string organizationId,

            Outputs.GetActionBatchesItemStatusResult status,

            bool synchronous)
        {
            Actions = actions;
            Confirmed = confirmed;
            Id = id;
            OrganizationId = organizationId;
            Status = status;
            Synchronous = synchronous;
        }
    }
}
