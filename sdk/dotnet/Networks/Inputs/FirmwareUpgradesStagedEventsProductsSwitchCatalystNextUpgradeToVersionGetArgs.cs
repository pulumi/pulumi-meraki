// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeToVersionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The version ID
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeToVersionGetArgs()
        {
        }
        public static new FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeToVersionGetArgs Empty => new FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeToVersionGetArgs();
    }
}
