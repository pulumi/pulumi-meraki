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
    public sealed class ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValue
    {
        /// <summary>
        /// Destination of 'custom' type traffic filter
        /// </summary>
        public readonly Outputs.ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueDestination? Destination;
        /// <summary>
        /// Protocol of 'custom' type traffic filter. Must be one of: 'tcp', 'udp', 'icmp6' or 'any'
        /// </summary>
        public readonly string? Protocol;
        /// <summary>
        /// Source of 'custom' type traffic filter
        /// </summary>
        public readonly Outputs.ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueSource? Source;

        [OutputConstructor]
        private ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValue(
            Outputs.ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueDestination? destination,

            string? protocol,

            Outputs.ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueSource? source)
        {
            Destination = destination;
            Protocol = protocol;
            Source = source;
        }
    }
}