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
    public sealed class GetFirmwareUpgradesItemProductsCellularGatewayLastUpgradeResult
    {
        /// <summary>
        /// Details of the version the device upgraded from
        /// </summary>
        public readonly Outputs.GetFirmwareUpgradesItemProductsCellularGatewayLastUpgradeFromVersionResult FromVersion;
        /// <summary>
        /// Timestamp of the last successful firmware upgrade
        /// </summary>
        public readonly string Time;
        /// <summary>
        /// Details of the version the device upgraded to
        /// </summary>
        public readonly Outputs.GetFirmwareUpgradesItemProductsCellularGatewayLastUpgradeToVersionResult ToVersion;

        [OutputConstructor]
        private GetFirmwareUpgradesItemProductsCellularGatewayLastUpgradeResult(
            Outputs.GetFirmwareUpgradesItemProductsCellularGatewayLastUpgradeFromVersionResult fromVersion,

            string time,

            Outputs.GetFirmwareUpgradesItemProductsCellularGatewayLastUpgradeToVersionResult toVersion)
        {
            FromVersion = fromVersion;
            Time = time;
            ToVersion = toVersion;
        }
    }
}