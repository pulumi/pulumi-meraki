// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Fail over criterion for uplink preference rule. Must be one of: 'poorPerformance' or 'uplinkDown'
        /// </summary>
        [Input("failOverCriterion")]
        public Input<string>? FailOverCriterion { get; set; }

        /// <summary>
        /// Performance class setting for uplink preference rule
        /// </summary>
        [Input("performanceClass")]
        public Input<Inputs.ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferencePerformanceClassArgs>? PerformanceClass { get; set; }

        /// <summary>
        /// Preferred uplink for uplink preference rule. Must be one of: 'wan1', 'wan2', 'bestForVoIP', 'loadBalancing' or 'defaultUplink'
        /// </summary>
        [Input("preferredUplink")]
        public Input<string>? PreferredUplink { get; set; }

        [Input("trafficFilters")]
        private InputList<Inputs.ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterArgs>? _trafficFilters;

        /// <summary>
        /// Traffic filters
        /// </summary>
        public InputList<Inputs.ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterArgs> TrafficFilters
        {
            get => _trafficFilters ?? (_trafficFilters = new InputList<Inputs.ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterArgs>());
            set => _trafficFilters = value;
        }

        public ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceArgs()
        {
        }
        public static new ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceArgs Empty => new ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceArgs();
    }
}
