// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class GetWirelessConnectionStatsItemResult
    {
        /// <summary>
        /// The connection stats of the device
        /// </summary>
        public readonly Outputs.GetWirelessConnectionStatsItemConnectionStatsResult ConnectionStats;
        /// <summary>
        /// The serial number for the device
        /// </summary>
        public readonly string Serial;

        [OutputConstructor]
        private GetWirelessConnectionStatsItemResult(
            Outputs.GetWirelessConnectionStatsItemConnectionStatsResult connectionStats,

            string serial)
        {
            ConnectionStats = connectionStats;
            Serial = serial;
        }
    }
}