// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Traffic filter type. Must be "custom"
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Value of traffic filter
        /// </summary>
        [Input("value")]
        public Input<Inputs.ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueGetArgs>? Value { get; set; }

        public ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterGetArgs()
        {
        }
        public static new ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterGetArgs Empty => new ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterGetArgs();
    }
}