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
    public sealed class GetCellularGatewayPortForwardingRulesItemResult
    {
        public readonly ImmutableArray<Outputs.GetCellularGatewayPortForwardingRulesItemRuleResult> Rules;

        [OutputConstructor]
        private GetCellularGatewayPortForwardingRulesItemResult(ImmutableArray<Outputs.GetCellularGatewayPortForwardingRulesItemRuleResult> rules)
        {
            Rules = rules;
        }
    }
}
