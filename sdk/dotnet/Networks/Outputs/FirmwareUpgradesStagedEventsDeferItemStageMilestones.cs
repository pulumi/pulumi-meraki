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
    public sealed class FirmwareUpgradesStagedEventsDeferItemStageMilestones
    {
        /// <summary>
        /// Time that the group was canceled
        /// </summary>
        public readonly string? CanceledAt;
        /// <summary>
        /// Finish time for the group
        /// </summary>
        public readonly string? CompletedAt;
        /// <summary>
        /// Scheduled start time for the group
        /// </summary>
        public readonly string? ScheduledFor;
        /// <summary>
        /// Start time for the group
        /// </summary>
        public readonly string? StartedAt;

        [OutputConstructor]
        private FirmwareUpgradesStagedEventsDeferItemStageMilestones(
            string? canceledAt,

            string? completedAt,

            string? scheduledFor,

            string? startedAt)
        {
            CanceledAt = canceledAt;
            CompletedAt = completedAt;
            ScheduledFor = scheduledFor;
            StartedAt = startedAt;
        }
    }
}
