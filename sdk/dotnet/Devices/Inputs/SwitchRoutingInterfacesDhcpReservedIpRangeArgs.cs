// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Inputs
{

    public sealed class SwitchRoutingInterfacesDhcpReservedIpRangeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The comment for the reserved IP range
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The ending IP address of the reserved IP range
        /// </summary>
        [Input("end")]
        public Input<string>? End { get; set; }

        /// <summary>
        /// The starting IP address of the reserved IP range
        /// </summary>
        [Input("start")]
        public Input<string>? Start { get; set; }

        public SwitchRoutingInterfacesDhcpReservedIpRangeArgs()
        {
        }
        public static new SwitchRoutingInterfacesDhcpReservedIpRangeArgs Empty => new SwitchRoutingInterfacesDhcpReservedIpRangeArgs();
    }
}