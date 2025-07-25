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
    public sealed class FirmwareUpgradesStagedEventsDeferItemProductsSwitch
    {
        /// <summary>
        /// Details of the next firmware upgrade
        /// </summary>
        public readonly Outputs.FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgrade? NextUpgrade;

        [OutputConstructor]
        private FirmwareUpgradesStagedEventsDeferItemProductsSwitch(Outputs.FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgrade? nextUpgrade)
        {
            NextUpgrade = nextUpgrade;
        }
    }
}
