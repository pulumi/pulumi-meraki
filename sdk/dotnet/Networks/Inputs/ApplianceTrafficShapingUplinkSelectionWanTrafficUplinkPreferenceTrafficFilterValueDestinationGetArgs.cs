// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueDestinationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// CIDR format address (e.g."192.168.10.1", which is the same as "192.168.10.1/32"), or "any"
        /// </summary>
        [Input("cidr")]
        public Input<string>? Cidr { get; set; }

        /// <summary>
        /// E.g.: "any", "0" (also means "any"), "8080", "1-1024"
        /// </summary>
        [Input("port")]
        public Input<string>? Port { get; set; }

        public ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueDestinationGetArgs()
        {
        }
        public static new ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueDestinationGetArgs Empty => new ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueDestinationGetArgs();
    }
}