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
    public sealed class FirmwareUpgradesStagedEventsRollbacksItemStage
    {
        /// <summary>
        /// The staged upgrade group
        /// </summary>
        public readonly Outputs.FirmwareUpgradesStagedEventsRollbacksItemStageGroup? Group;
        /// <summary>
        /// The Staged Upgrade Milestones for the stage
        /// </summary>
        public readonly Outputs.FirmwareUpgradesStagedEventsRollbacksItemStageMilestones? Milestones;
        /// <summary>
        /// Current upgrade status of the group
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private FirmwareUpgradesStagedEventsRollbacksItemStage(
            Outputs.FirmwareUpgradesStagedEventsRollbacksItemStageGroup? group,

            Outputs.FirmwareUpgradesStagedEventsRollbacksItemStageMilestones? milestones,

            string? status)
        {
            Group = group;
            Milestones = milestones;
            Status = status;
        }
    }
}
