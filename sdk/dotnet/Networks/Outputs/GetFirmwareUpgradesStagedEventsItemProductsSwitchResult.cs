// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Outputs
{

    [OutputType]
    public sealed class GetFirmwareUpgradesStagedEventsItemProductsSwitchResult
    {
        /// <summary>
        /// Details of the next firmware upgrade
        /// </summary>
        public readonly Outputs.GetFirmwareUpgradesStagedEventsItemProductsSwitchNextUpgradeResult NextUpgrade;

        [OutputConstructor]
        private GetFirmwareUpgradesStagedEventsItemProductsSwitchResult(Outputs.GetFirmwareUpgradesStagedEventsItemProductsSwitchNextUpgradeResult nextUpgrade)
        {
            NextUpgrade = nextUpgrade;
        }
    }
}
