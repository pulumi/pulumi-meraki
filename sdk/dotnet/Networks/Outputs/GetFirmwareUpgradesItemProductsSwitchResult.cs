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
    public sealed class GetFirmwareUpgradesItemProductsSwitchResult
    {
        /// <summary>
        /// Firmware versions available for upgrade
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFirmwareUpgradesItemProductsSwitchAvailableVersionResult> AvailableVersions;
        /// <summary>
        /// Details of the current version on the device
        /// </summary>
        public readonly Outputs.GetFirmwareUpgradesItemProductsSwitchCurrentVersionResult CurrentVersion;
        /// <summary>
        /// Details of the last firmware upgrade on the device
        /// </summary>
        public readonly Outputs.GetFirmwareUpgradesItemProductsSwitchLastUpgradeResult LastUpgrade;
        /// <summary>
        /// Details of the next firmware upgrade on the device
        /// </summary>
        public readonly Outputs.GetFirmwareUpgradesItemProductsSwitchNextUpgradeResult NextUpgrade;
        /// <summary>
        /// Whether or not the network wants beta firmware
        /// </summary>
        public readonly bool ParticipateInNextBetaRelease;

        [OutputConstructor]
        private GetFirmwareUpgradesItemProductsSwitchResult(
            ImmutableArray<Outputs.GetFirmwareUpgradesItemProductsSwitchAvailableVersionResult> availableVersions,

            Outputs.GetFirmwareUpgradesItemProductsSwitchCurrentVersionResult currentVersion,

            Outputs.GetFirmwareUpgradesItemProductsSwitchLastUpgradeResult lastUpgrade,

            Outputs.GetFirmwareUpgradesItemProductsSwitchNextUpgradeResult nextUpgrade,

            bool participateInNextBetaRelease)
        {
            AvailableVersions = availableVersions;
            CurrentVersion = currentVersion;
            LastUpgrade = lastUpgrade;
            NextUpgrade = nextUpgrade;
            ParticipateInNextBetaRelease = participateInNextBetaRelease;
        }
    }
}
