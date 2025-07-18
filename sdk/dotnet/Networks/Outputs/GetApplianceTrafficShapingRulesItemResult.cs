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
    public sealed class GetApplianceTrafficShapingRulesItemResult
    {
        public readonly bool DefaultRulesEnabled;
        public readonly ImmutableArray<Outputs.GetApplianceTrafficShapingRulesItemRuleResult> Rules;

        [OutputConstructor]
        private GetApplianceTrafficShapingRulesItemResult(
            bool defaultRulesEnabled,

            ImmutableArray<Outputs.GetApplianceTrafficShapingRulesItemRuleResult> rules)
        {
            DefaultRulesEnabled = defaultRulesEnabled;
            Rules = rules;
        }
    }
}
