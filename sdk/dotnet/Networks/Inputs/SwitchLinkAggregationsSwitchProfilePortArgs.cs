// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SwitchLinkAggregationsSwitchProfilePortArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Port identifier of switch port. For modules, the identifier is "SlotNumber*ModuleType*PortNumber" (Ex: "1*8X10G*1"), otherwise it is just the port number (Ex: "8").
        /// </summary>
        [Input("portId")]
        public Input<string>? PortId { get; set; }

        /// <summary>
        /// Profile identifier.
        /// </summary>
        [Input("profile")]
        public Input<string>? Profile { get; set; }

        public SwitchLinkAggregationsSwitchProfilePortArgs()
        {
        }
        public static new SwitchLinkAggregationsSwitchProfilePortArgs Empty => new SwitchLinkAggregationsSwitchProfilePortArgs();
    }
}