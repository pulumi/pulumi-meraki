// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesStagedEventsRollbacksItemStageGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The staged upgrade group
        /// </summary>
        [Input("group")]
        public Input<Inputs.FirmwareUpgradesStagedEventsRollbacksItemStageGroupGetArgs>? Group { get; set; }

        /// <summary>
        /// The Staged Upgrade Milestones for the stage
        /// </summary>
        [Input("milestones")]
        public Input<Inputs.FirmwareUpgradesStagedEventsRollbacksItemStageMilestonesGetArgs>? Milestones { get; set; }

        /// <summary>
        /// Current upgrade status of the group
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public FirmwareUpgradesStagedEventsRollbacksItemStageGetArgs()
        {
        }
        public static new FirmwareUpgradesStagedEventsRollbacksItemStageGetArgs Empty => new FirmwareUpgradesStagedEventsRollbacksItemStageGetArgs();
    }
}
