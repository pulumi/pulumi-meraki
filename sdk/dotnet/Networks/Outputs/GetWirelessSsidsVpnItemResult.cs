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
    public sealed class GetWirelessSsidsVpnItemResult
    {
        public readonly Outputs.GetWirelessSsidsVpnItemConcentratorResult Concentrator;
        public readonly Outputs.GetWirelessSsidsVpnItemFailoverResult Failover;
        public readonly Outputs.GetWirelessSsidsVpnItemSplitTunnelResult SplitTunnel;

        [OutputConstructor]
        private GetWirelessSsidsVpnItemResult(
            Outputs.GetWirelessSsidsVpnItemConcentratorResult concentrator,

            Outputs.GetWirelessSsidsVpnItemFailoverResult failover,

            Outputs.GetWirelessSsidsVpnItemSplitTunnelResult splitTunnel)
        {
            Concentrator = concentrator;
            Failover = failover;
            SplitTunnel = splitTunnel;
        }
    }
}
