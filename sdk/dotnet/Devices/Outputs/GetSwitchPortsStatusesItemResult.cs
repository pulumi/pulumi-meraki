// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class GetSwitchPortsStatusesItemResult
    {
        /// <summary>
        /// The Cisco Discovery Protocol (CDP) information of the connected device.
        /// </summary>
        public readonly Outputs.GetSwitchPortsStatusesItemCdpResult Cdp;
        /// <summary>
        /// The number of clients connected through this port.
        /// </summary>
        public readonly int ClientCount;
        /// <summary>
        /// The current duplex of a connected port.
        /// </summary>
        public readonly string Duplex;
        /// <summary>
        /// Whether the port is configured to be enabled.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// All errors present on the port.
        /// </summary>
        public readonly ImmutableArray<string> Errors;
        /// <summary>
        /// Whether the port is the switch's uplink.
        /// </summary>
        public readonly bool IsUplink;
        /// <summary>
        /// The Link Layer Discovery Protocol (LLDP) information of the connected device.
        /// </summary>
        public readonly Outputs.GetSwitchPortsStatusesItemLldpResult Lldp;
        /// <summary>
        /// The string identifier of this port on the switch. This is commonly just the port number but may contain additional identifying information such as the slot and module-type if the port is located on a port module.
        /// </summary>
        public readonly string PortId;
        /// <summary>
        /// How much power (in watt-hours) has been delivered by this port during the timespan.
        /// </summary>
        public readonly double PowerUsageInWh;
        /// <summary>
        /// The Secure Port status of the port.
        /// </summary>
        public readonly Outputs.GetSwitchPortsStatusesItemSecurePortResult SecurePort;
        /// <summary>
        /// The Spanning Tree Protocol (STP) information of the connected device.
        /// </summary>
        public readonly Outputs.GetSwitchPortsStatusesItemSpanningTreeResult SpanningTree;
        /// <summary>
        /// The current data transfer rate which the port is operating at.
        /// </summary>
        public readonly string Speed;
        /// <summary>
        /// The current connection status of the port.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// A breakdown of the average speed of data that has passed through this port during the timespan.
        /// </summary>
        public readonly Outputs.GetSwitchPortsStatusesItemTrafficInKbpsResult TrafficInKbps;
        /// <summary>
        /// A breakdown of how many kilobytes have passed through this port during the timespan.
        /// </summary>
        public readonly Outputs.GetSwitchPortsStatusesItemUsageInKbResult UsageInKb;
        /// <summary>
        /// All warnings present on the port.
        /// </summary>
        public readonly ImmutableArray<string> Warnings;

        [OutputConstructor]
        private GetSwitchPortsStatusesItemResult(
            Outputs.GetSwitchPortsStatusesItemCdpResult cdp,

            int clientCount,

            string duplex,

            bool enabled,

            ImmutableArray<string> errors,

            bool isUplink,

            Outputs.GetSwitchPortsStatusesItemLldpResult lldp,

            string portId,

            double powerUsageInWh,

            Outputs.GetSwitchPortsStatusesItemSecurePortResult securePort,

            Outputs.GetSwitchPortsStatusesItemSpanningTreeResult spanningTree,

            string speed,

            string status,

            Outputs.GetSwitchPortsStatusesItemTrafficInKbpsResult trafficInKbps,

            Outputs.GetSwitchPortsStatusesItemUsageInKbResult usageInKb,

            ImmutableArray<string> warnings)
        {
            Cdp = cdp;
            ClientCount = clientCount;
            Duplex = duplex;
            Enabled = enabled;
            Errors = errors;
            IsUplink = isUplink;
            Lldp = lldp;
            PortId = portId;
            PowerUsageInWh = powerUsageInWh;
            SecurePort = securePort;
            SpanningTree = spanningTree;
            Speed = speed;
            Status = status;
            TrafficInKbps = trafficInKbps;
            UsageInKb = usageInKb;
            Warnings = warnings;
        }
    }
}
