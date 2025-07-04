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
    public sealed class FirmwareUpgradesProductsSwitch
    {
        /// <summary>
        /// Firmware versions available for upgrade
        /// </summary>
        public readonly ImmutableArray<Outputs.FirmwareUpgradesProductsSwitchAvailableVersion> AvailableVersions;
        /// <summary>
        /// Details of the current version on the device
        /// </summary>
        public readonly Outputs.FirmwareUpgradesProductsSwitchCurrentVersion? CurrentVersion;
        /// <summary>
        /// Details of the last firmware upgrade on the device
        /// </summary>
        public readonly Outputs.FirmwareUpgradesProductsSwitchLastUpgrade? LastUpgrade;
        /// <summary>
        /// Details of the next firmware upgrade on the device
        /// </summary>
        public readonly Outputs.FirmwareUpgradesProductsSwitchNextUpgrade? NextUpgrade;
        /// <summary>
        /// Whether or not the network wants beta firmware
        /// </summary>
        public readonly bool? ParticipateInNextBetaRelease;

        [OutputConstructor]
        private FirmwareUpgradesProductsSwitch(
            ImmutableArray<Outputs.FirmwareUpgradesProductsSwitchAvailableVersion> availableVersions,

            Outputs.FirmwareUpgradesProductsSwitchCurrentVersion? currentVersion,

            Outputs.FirmwareUpgradesProductsSwitchLastUpgrade? lastUpgrade,

            Outputs.FirmwareUpgradesProductsSwitchNextUpgrade? nextUpgrade,

            bool? participateInNextBetaRelease)
        {
            AvailableVersions = availableVersions;
            CurrentVersion = currentVersion;
            LastUpgrade = lastUpgrade;
            NextUpgrade = nextUpgrade;
            ParticipateInNextBetaRelease = participateInNextBetaRelease;
        }
    }
}
