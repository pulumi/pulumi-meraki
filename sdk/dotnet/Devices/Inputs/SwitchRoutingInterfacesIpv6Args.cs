// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Inputs
{

    public sealed class SwitchRoutingInterfacesIpv6Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IPv6 address
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// Assignment mode
        /// </summary>
        [Input("assignmentMode")]
        public Input<string>? AssignmentMode { get; set; }

        /// <summary>
        /// IPv6 gateway
        /// </summary>
        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        /// <summary>
        /// IPv6 subnet
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        public SwitchRoutingInterfacesIpv6Args()
        {
        }
        public static new SwitchRoutingInterfacesIpv6Args Empty => new SwitchRoutingInterfacesIpv6Args();
    }
}
