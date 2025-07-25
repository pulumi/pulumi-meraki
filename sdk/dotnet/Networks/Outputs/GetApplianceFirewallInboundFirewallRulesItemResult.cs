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
    public sealed class GetApplianceFirewallInboundFirewallRulesItemResult
    {
        /// <summary>
        /// An ordered array of the firewall rules (not including the default rule)
        /// </summary>
        public readonly ImmutableArray<Outputs.GetApplianceFirewallInboundFirewallRulesItemRuleResult> Rules;
        /// <summary>
        /// Log the special default rule (boolean value - enable only if you've configured a syslog server) (optional)
        /// </summary>
        public readonly bool SyslogDefaultRule;

        [OutputConstructor]
        private GetApplianceFirewallInboundFirewallRulesItemResult(
            ImmutableArray<Outputs.GetApplianceFirewallInboundFirewallRulesItemRuleResult> rules,

            bool syslogDefaultRule)
        {
            Rules = rules;
            SyslogDefaultRule = syslogDefaultRule;
        }
    }
}
