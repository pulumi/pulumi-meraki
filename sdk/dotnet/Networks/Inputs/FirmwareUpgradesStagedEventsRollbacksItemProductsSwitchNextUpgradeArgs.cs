// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesStagedEventsRollbacksItemProductsSwitchNextUpgradeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Details of the version the device will upgrade to
        /// </summary>
        [Input("toVersion")]
        public Input<Inputs.FirmwareUpgradesStagedEventsRollbacksItemProductsSwitchNextUpgradeToVersionArgs>? ToVersion { get; set; }

        public FirmwareUpgradesStagedEventsRollbacksItemProductsSwitchNextUpgradeArgs()
        {
        }
        public static new FirmwareUpgradesStagedEventsRollbacksItemProductsSwitchNextUpgradeArgs Empty => new FirmwareUpgradesStagedEventsRollbacksItemProductsSwitchNextUpgradeArgs();
    }
}
