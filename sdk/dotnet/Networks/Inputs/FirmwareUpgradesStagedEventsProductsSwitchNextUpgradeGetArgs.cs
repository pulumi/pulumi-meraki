// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesStagedEventsProductsSwitchNextUpgradeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Details of the version the device will upgrade to
        /// </summary>
        [Input("toVersion")]
        public Input<Inputs.FirmwareUpgradesStagedEventsProductsSwitchNextUpgradeToVersionGetArgs>? ToVersion { get; set; }

        public FirmwareUpgradesStagedEventsProductsSwitchNextUpgradeGetArgs()
        {
        }
        public static new FirmwareUpgradesStagedEventsProductsSwitchNextUpgradeGetArgs Empty => new FirmwareUpgradesStagedEventsProductsSwitchNextUpgradeGetArgs();
    }
}