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
    public sealed class GetGroupPoliciesItemFirewallAndTrafficShapingResult
    {
        /// <summary>
        /// An ordered array of the L3 firewall rules
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGroupPoliciesItemFirewallAndTrafficShapingL3FirewallRuleResult> L3FirewallRules;
        /// <summary>
        /// An ordered array of L7 firewall rules
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGroupPoliciesItemFirewallAndTrafficShapingL7FirewallRuleResult> L7FirewallRules;
        /// <summary>
        /// How firewall and traffic shaping rules are enforced. Can be 'network default', 'ignore' or 'custom'.
        /// </summary>
        public readonly string Settings;
        /// <summary>
        /// An array of traffic shaping rules. Rules are applied in the order that
        /// they are specified in. An empty list (or null) means no rules. Note that
        /// you are allowed a maximum of 8 rules.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGroupPoliciesItemFirewallAndTrafficShapingTrafficShapingRuleResult> TrafficShapingRules;

        [OutputConstructor]
        private GetGroupPoliciesItemFirewallAndTrafficShapingResult(
            ImmutableArray<Outputs.GetGroupPoliciesItemFirewallAndTrafficShapingL3FirewallRuleResult> l3FirewallRules,

            ImmutableArray<Outputs.GetGroupPoliciesItemFirewallAndTrafficShapingL7FirewallRuleResult> l7FirewallRules,

            string settings,

            ImmutableArray<Outputs.GetGroupPoliciesItemFirewallAndTrafficShapingTrafficShapingRuleResult> trafficShapingRules)
        {
            L3FirewallRules = l3FirewallRules;
            L7FirewallRules = l7FirewallRules;
            Settings = settings;
            TrafficShapingRules = trafficShapingRules;
        }
    }
}