// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesStagedEventsRollbacksParametersStageGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Staged Upgrade Group containing the name and ID
        /// </summary>
        [Input("group")]
        public Input<Inputs.FirmwareUpgradesStagedEventsRollbacksParametersStageGroupGetArgs>? Group { get; set; }

        /// <summary>
        /// The Staged Upgrade Milestones for the specific stage
        /// </summary>
        [Input("milestones")]
        public Input<Inputs.FirmwareUpgradesStagedEventsRollbacksParametersStageMilestonesGetArgs>? Milestones { get; set; }

        public FirmwareUpgradesStagedEventsRollbacksParametersStageGetArgs()
        {
        }
        public static new FirmwareUpgradesStagedEventsRollbacksParametersStageGetArgs Empty => new FirmwareUpgradesStagedEventsRollbacksParametersStageGetArgs();
    }
}