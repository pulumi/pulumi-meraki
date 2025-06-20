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
    public sealed class GetApplianceSecurityIntrusionItemResult
    {
        /// <summary>
        /// Intrusion detection ruleset
        /// </summary>
        public readonly string IdsRulesets;
        /// <summary>
        /// Intrusion detection mode
        /// </summary>
        public readonly string Mode;
        /// <summary>
        /// Networks included in and excluded from the detection engine
        /// </summary>
        public readonly Outputs.GetApplianceSecurityIntrusionItemProtectedNetworksResult ProtectedNetworks;

        [OutputConstructor]
        private GetApplianceSecurityIntrusionItemResult(
            string idsRulesets,

            string mode,

            Outputs.GetApplianceSecurityIntrusionItemProtectedNetworksResult protectedNetworks)
        {
            IdsRulesets = idsRulesets;
            Mode = mode;
            ProtectedNetworks = protectedNetworks;
        }
    }
}
