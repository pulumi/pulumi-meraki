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
    public sealed class GetSwitchDhcpV4ServersSeenItemLastPacketFieldsResult
    {
        /// <summary>
        /// Client hardware address of the packet.
        /// </summary>
        public readonly string Chaddr;
        /// <summary>
        /// Client IP address of the packet.
        /// </summary>
        public readonly string Ciaddr;
        /// <summary>
        /// Packet flags.
        /// </summary>
        public readonly string Flags;
        /// <summary>
        /// Gateway IP address of the packet.
        /// </summary>
        public readonly string Giaddr;
        /// <summary>
        /// Hardware length of the packet.
        /// </summary>
        public readonly int Hlen;
        /// <summary>
        /// Number of hops the packet took.
        /// </summary>
        public readonly int Hops;
        /// <summary>
        /// Hardware type code of the packet.
        /// </summary>
        public readonly int Htype;
        /// <summary>
        /// Magic cookie of the packet.
        /// </summary>
        public readonly string MagicCookie;
        /// <summary>
        /// Operation code of the packet.
        /// </summary>
        public readonly int Op;
        /// <summary>
        /// Additional DHCP options of the packet.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSwitchDhcpV4ServersSeenItemLastPacketFieldsOptionResult> Options;
        /// <summary>
        /// Number of seconds since receiving the packet.
        /// </summary>
        public readonly int Secs;
        /// <summary>
        /// Server IP address of the packet.
        /// </summary>
        public readonly string Siaddr;
        /// <summary>
        /// Server identifier address of the packet.
        /// </summary>
        public readonly string Sname;
        /// <summary>
        /// Transaction id of the packet.
        /// </summary>
        public readonly string Xid;
        /// <summary>
        /// Assigned IP address of the packet.
        /// </summary>
        public readonly string Yiaddr;

        [OutputConstructor]
        private GetSwitchDhcpV4ServersSeenItemLastPacketFieldsResult(
            string chaddr,

            string ciaddr,

            string flags,

            string giaddr,

            int hlen,

            int hops,

            int htype,

            string magicCookie,

            int op,

            ImmutableArray<Outputs.GetSwitchDhcpV4ServersSeenItemLastPacketFieldsOptionResult> options,

            int secs,

            string siaddr,

            string sname,

            string xid,

            string yiaddr)
        {
            Chaddr = chaddr;
            Ciaddr = ciaddr;
            Flags = flags;
            Giaddr = giaddr;
            Hlen = hlen;
            Hops = hops;
            Htype = htype;
            MagicCookie = magicCookie;
            Op = op;
            Options = options;
            Secs = secs;
            Siaddr = siaddr;
            Sname = sname;
            Xid = xid;
            Yiaddr = yiaddr;
        }
    }
}