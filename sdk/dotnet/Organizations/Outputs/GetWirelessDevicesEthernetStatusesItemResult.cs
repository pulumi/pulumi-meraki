// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class GetWirelessDevicesEthernetStatusesItemResult
    {
        /// <summary>
        /// Aggregation details object
        /// </summary>
        public readonly Outputs.GetWirelessDevicesEthernetStatusesItemAggregationResult Aggregation;
        /// <summary>
        /// The name of the AP
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Network details object
        /// </summary>
        public readonly Outputs.GetWirelessDevicesEthernetStatusesItemNetworkResult Network;
        /// <summary>
        /// List of port details
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWirelessDevicesEthernetStatusesItemPortResult> Ports;
        /// <summary>
        /// Power details object
        /// </summary>
        public readonly Outputs.GetWirelessDevicesEthernetStatusesItemPowerResult Power;
        /// <summary>
        /// The serial number of the AP
        /// </summary>
        public readonly string Serial;

        [OutputConstructor]
        private GetWirelessDevicesEthernetStatusesItemResult(
            Outputs.GetWirelessDevicesEthernetStatusesItemAggregationResult aggregation,

            string name,

            Outputs.GetWirelessDevicesEthernetStatusesItemNetworkResult network,

            ImmutableArray<Outputs.GetWirelessDevicesEthernetStatusesItemPortResult> ports,

            Outputs.GetWirelessDevicesEthernetStatusesItemPowerResult power,

            string serial)
        {
            Aggregation = aggregation;
            Name = name;
            Network = network;
            Ports = ports;
            Power = power;
            Serial = serial;
        }
    }
}