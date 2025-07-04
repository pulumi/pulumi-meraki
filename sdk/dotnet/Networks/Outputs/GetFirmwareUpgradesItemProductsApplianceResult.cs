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
    public sealed class GetFirmwareUpgradesItemProductsApplianceResult
    {
        /// <summary>
        /// Firmware versions available for upgrade
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFirmwareUpgradesItemProductsApplianceAvailableVersionResult> AvailableVersions;
        /// <summary>
        /// Details of the current version on the device
        /// </summary>
        public readonly Outputs.GetFirmwareUpgradesItemProductsApplianceCurrentVersionResult CurrentVersion;
        /// <summary>
        /// Details of the last firmware upgrade on the device
        /// </summary>
        public readonly Outputs.GetFirmwareUpgradesItemProductsApplianceLastUpgradeResult LastUpgrade;
        /// <summary>
        /// Details of the next firmware upgrade on the device
        /// </summary>
        public readonly Outputs.GetFirmwareUpgradesItemProductsApplianceNextUpgradeResult NextUpgrade;
        /// <summary>
        /// Whether or not the network wants beta firmware
        /// </summary>
        public readonly bool ParticipateInNextBetaRelease;

        [OutputConstructor]
        private GetFirmwareUpgradesItemProductsApplianceResult(
            ImmutableArray<Outputs.GetFirmwareUpgradesItemProductsApplianceAvailableVersionResult> availableVersions,

            Outputs.GetFirmwareUpgradesItemProductsApplianceCurrentVersionResult currentVersion,

            Outputs.GetFirmwareUpgradesItemProductsApplianceLastUpgradeResult lastUpgrade,

            Outputs.GetFirmwareUpgradesItemProductsApplianceNextUpgradeResult nextUpgrade,

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
