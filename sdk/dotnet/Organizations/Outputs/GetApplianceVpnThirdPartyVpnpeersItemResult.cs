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
    public sealed class GetApplianceVpnThirdPartyVpnpeersItemResult
    {
        /// <summary>
        /// The list of VPN peers
        /// </summary>
        public readonly ImmutableArray<Outputs.GetApplianceVpnThirdPartyVpnpeersItemPeerResult> Peers;

        [OutputConstructor]
        private GetApplianceVpnThirdPartyVpnpeersItemResult(ImmutableArray<Outputs.GetApplianceVpnThirdPartyVpnpeersItemPeerResult> peers)
        {
            Peers = peers;
        }
    }
}