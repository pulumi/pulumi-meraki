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
    public sealed class ApplianceFirewallL7FirewallRulesRulesResponse
    {
        /// <summary>
        /// 'Deny' traffic specified by this rule
        /// </summary>
        public readonly string? Policy;
        /// <summary>
        /// Type of the L7 rule. One of: 'application', 'applicationCategory', 'host', 'port', 'ipRange'
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// The 'value' of what you want to block. Format of 'value' varies depending on type of the rule. The application categories and application ids can be retrieved from the the 'MX L7 application categories' endpoint. The countries follow the two-letter ISO 3166-1 alpha-2 format.
        /// </summary>
        public readonly string? Value;
        /// <summary>
        /// The 'value_list' of what you want to block. Send a list in request
        /// </summary>
        public readonly ImmutableArray<string> ValueLists;
        /// <summary>
        /// The 'value_obj' of what you want to block. Send a dict in request
        /// </summary>
        public readonly Outputs.ApplianceFirewallL7FirewallRulesRulesResponseValueObj? ValueObj;

        [OutputConstructor]
        private ApplianceFirewallL7FirewallRulesRulesResponse(
            string? policy,

            string? type,

            string? value,

            ImmutableArray<string> valueLists,

            Outputs.ApplianceFirewallL7FirewallRulesRulesResponseValueObj? valueObj)
        {
            Policy = policy;
            Type = type;
            Value = value;
            ValueLists = valueLists;
            ValueObj = valueObj;
        }
    }
}