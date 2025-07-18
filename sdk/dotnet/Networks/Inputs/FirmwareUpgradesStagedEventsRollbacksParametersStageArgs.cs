// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesStagedEventsRollbacksParametersStageArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Staged Upgrade Group containing the name and ID
        /// </summary>
        [Input("group")]
        public Input<Inputs.FirmwareUpgradesStagedEventsRollbacksParametersStageGroupArgs>? Group { get; set; }

        /// <summary>
        /// The Staged Upgrade Milestones for the specific stage
        /// </summary>
        [Input("milestones")]
        public Input<Inputs.FirmwareUpgradesStagedEventsRollbacksParametersStageMilestonesArgs>? Milestones { get; set; }

        public FirmwareUpgradesStagedEventsRollbacksParametersStageArgs()
        {
        }
        public static new FirmwareUpgradesStagedEventsRollbacksParametersStageArgs Empty => new FirmwareUpgradesStagedEventsRollbacksParametersStageArgs();
    }
}
