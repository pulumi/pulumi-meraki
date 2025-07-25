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
    public sealed class GetWirelessSsidsVpnItemSplitTunnelResult
    {
        public readonly bool Enabled;
        public readonly ImmutableArray<Outputs.GetWirelessSsidsVpnItemSplitTunnelRuleResult> Rules;

        [OutputConstructor]
        private GetWirelessSsidsVpnItemSplitTunnelResult(
            bool enabled,

            ImmutableArray<Outputs.GetWirelessSsidsVpnItemSplitTunnelRuleResult> rules)
        {
            Enabled = enabled;
            Rules = rules;
        }
    }
}
