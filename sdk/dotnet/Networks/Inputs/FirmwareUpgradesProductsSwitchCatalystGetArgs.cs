// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesProductsSwitchCatalystGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The pending firmware upgrade if it exists
        /// </summary>
        [Input("nextUpgrade")]
        public Input<Inputs.FirmwareUpgradesProductsSwitchCatalystNextUpgradeGetArgs>? NextUpgrade { get; set; }

        /// <summary>
        /// Whether or not the network wants beta firmware
        /// </summary>
        [Input("participateInNextBetaRelease")]
        public Input<bool>? ParticipateInNextBetaRelease { get; set; }

        public FirmwareUpgradesProductsSwitchCatalystGetArgs()
        {
        }
        public static new FirmwareUpgradesProductsSwitchCatalystGetArgs Empty => new FirmwareUpgradesProductsSwitchCatalystGetArgs();
    }
}
