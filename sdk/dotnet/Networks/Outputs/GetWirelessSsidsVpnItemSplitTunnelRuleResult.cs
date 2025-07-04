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
    public sealed class GetWirelessSsidsVpnItemSplitTunnelRuleResult
    {
        public readonly string Comment;
        public readonly string DestCidr;
        public readonly string DestPort;
        public readonly string Policy;
        public readonly string Protocol;

        [OutputConstructor]
        private GetWirelessSsidsVpnItemSplitTunnelRuleResult(
            string comment,

            string destCidr,

            string destPort,

            string policy,

            string protocol)
        {
            Comment = comment;
            DestCidr = destCidr;
            DestPort = destPort;
            Policy = policy;
            Protocol = protocol;
        }
    }
}
