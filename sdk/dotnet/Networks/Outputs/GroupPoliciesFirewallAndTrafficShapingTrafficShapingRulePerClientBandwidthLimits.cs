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
    public sealed class GroupPoliciesFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimits
    {
        /// <summary>
        /// The bandwidth limits object, specifying the upload ('limitUp') and download ('limitDown') speed in Kbps. These are only enforced if 'settings' is set to 'custom'.
        /// </summary>
        public readonly Outputs.GroupPoliciesFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimitsBandwidthLimits? BandwidthLimits;
        /// <summary>
        /// How bandwidth limits are applied by your rule. Can be one of 'network default', 'ignore' or 'custom'.
        /// </summary>
        public readonly string? Settings;

        [OutputConstructor]
        private GroupPoliciesFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimits(
            Outputs.GroupPoliciesFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimitsBandwidthLimits? bandwidthLimits,

            string? settings)
        {
            BandwidthLimits = bandwidthLimits;
            Settings = settings;
        }
    }
}
