// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessSsidsFirewallL7FirewallRulesRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// 'Deny' traffic specified by this rule
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// Type of the L7 firewall rule. One of: 'application', 'applicationCategory', 'host', 'port', 'ipRange'
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The value of what needs to get blocked. Format of the value varies depending on type of the firewall rule selected.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        [Input("valueLists")]
        private InputList<string>? _valueLists;

        /// <summary>
        /// The 'value_list' of what you want to block. Send a list in request
        /// </summary>
        public InputList<string> ValueLists
        {
            get => _valueLists ?? (_valueLists = new InputList<string>());
            set => _valueLists = value;
        }

        /// <summary>
        /// The 'value_obj' of what you want to block. Send a dict in request
        /// </summary>
        [Input("valueObj")]
        public Input<Inputs.WirelessSsidsFirewallL7FirewallRulesRuleValueObjArgs>? ValueObj { get; set; }

        public WirelessSsidsFirewallL7FirewallRulesRuleArgs()
        {
        }
        public static new WirelessSsidsFirewallL7FirewallRulesRuleArgs Empty => new WirelessSsidsFirewallL7FirewallRulesRuleArgs();
    }
}
