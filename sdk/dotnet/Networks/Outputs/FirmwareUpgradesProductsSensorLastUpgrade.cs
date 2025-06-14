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
    public sealed class FirmwareUpgradesProductsSensorLastUpgrade
    {
        /// <summary>
        /// Details of the version the device upgraded from
        /// </summary>
        public readonly Outputs.FirmwareUpgradesProductsSensorLastUpgradeFromVersion? FromVersion;
        /// <summary>
        /// Timestamp of the last successful firmware upgrade
        /// </summary>
        public readonly string? Time;
        /// <summary>
        /// Details of the version the device upgraded to
        /// </summary>
        public readonly Outputs.FirmwareUpgradesProductsSensorLastUpgradeToVersion? ToVersion;

        [OutputConstructor]
        private FirmwareUpgradesProductsSensorLastUpgrade(
            Outputs.FirmwareUpgradesProductsSensorLastUpgradeFromVersion? fromVersion,

            string? time,

            Outputs.FirmwareUpgradesProductsSensorLastUpgradeToVersion? toVersion)
        {
            FromVersion = fromVersion;
            Time = time;
            ToVersion = toVersion;
        }
    }
}
