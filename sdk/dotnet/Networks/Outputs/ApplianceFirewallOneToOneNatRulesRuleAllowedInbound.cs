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
    public sealed class ApplianceFirewallOneToOneNatRulesRuleAllowedInbound
    {
        /// <summary>
        /// An array of ranges of WAN IP addresses that are allowed to make inbound connections on the specified ports or port ranges, or 'any'
        /// </summary>
        public readonly ImmutableArray<string> AllowedIps;
        /// <summary>
        /// An array of ports or port ranges that will be forwarded to the host on the LAN
        /// </summary>
        public readonly ImmutableArray<string> DestinationPorts;
        /// <summary>
        /// Either of the following: 'tcp', 'udp', 'icmp-ping' or 'any'
        /// </summary>
        public readonly string? Protocol;

        [OutputConstructor]
        private ApplianceFirewallOneToOneNatRulesRuleAllowedInbound(
            ImmutableArray<string> allowedIps,

            ImmutableArray<string> destinationPorts,

            string? protocol)
        {
            AllowedIps = allowedIps;
            DestinationPorts = destinationPorts;
            Protocol = protocol;
        }
    }
}
