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
    public sealed class GetSwitchDhcpV4ServersSeenItemLastPacketResult
    {
        /// <summary>
        /// Destination of the packet.
        /// </summary>
        public readonly Outputs.GetSwitchDhcpV4ServersSeenItemLastPacketDestinationResult Destination;
        /// <summary>
        /// Additional ethernet attributes of the packet.
        /// </summary>
        public readonly Outputs.GetSwitchDhcpV4ServersSeenItemLastPacketEthernetResult Ethernet;
        /// <summary>
        /// DHCP-specific fields of the packet.
        /// </summary>
        public readonly Outputs.GetSwitchDhcpV4ServersSeenItemLastPacketFieldsResult Fields;
        /// <summary>
        /// Additional IP attributes of the packet.
        /// </summary>
        public readonly Outputs.GetSwitchDhcpV4ServersSeenItemLastPacketIpResult Ip;
        /// <summary>
        /// Source of the packet.
        /// </summary>
        public readonly Outputs.GetSwitchDhcpV4ServersSeenItemLastPacketSourceResult Source;
        /// <summary>
        /// Packet type.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// UDP attributes of the packet.
        /// </summary>
        public readonly Outputs.GetSwitchDhcpV4ServersSeenItemLastPacketUdpResult Udp;

        [OutputConstructor]
        private GetSwitchDhcpV4ServersSeenItemLastPacketResult(
            Outputs.GetSwitchDhcpV4ServersSeenItemLastPacketDestinationResult destination,

            Outputs.GetSwitchDhcpV4ServersSeenItemLastPacketEthernetResult ethernet,

            Outputs.GetSwitchDhcpV4ServersSeenItemLastPacketFieldsResult fields,

            Outputs.GetSwitchDhcpV4ServersSeenItemLastPacketIpResult ip,

            Outputs.GetSwitchDhcpV4ServersSeenItemLastPacketSourceResult source,

            string type,

            Outputs.GetSwitchDhcpV4ServersSeenItemLastPacketUdpResult udp)
        {
            Destination = destination;
            Ethernet = ethernet;
            Fields = fields;
            Ip = ip;
            Source = source;
            Type = type;
            Udp = udp;
        }
    }
}