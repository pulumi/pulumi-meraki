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
    public sealed class GetSwitchDhcpV4ServersSeenItemLastPacketEthernetResult
    {
        /// <summary>
        /// Ethernet type of the packet.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetSwitchDhcpV4ServersSeenItemLastPacketEthernetResult(string type)
        {
            Type = type;
        }
    }
}