// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Destination of 'custom' type traffic filter
        /// </summary>
        [Input("destination")]
        public Input<Inputs.ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueDestinationArgs>? Destination { get; set; }

        /// <summary>
        /// Protocol of 'custom' type traffic filter. Must be one of: 'tcp', 'udp', 'icmp6' or 'any'
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// Source of 'custom' type traffic filter
        /// </summary>
        [Input("source")]
        public Input<Inputs.ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueSourceArgs>? Source { get; set; }

        public ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueArgs()
        {
        }
        public static new ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueArgs Empty => new ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueArgs();
    }
}