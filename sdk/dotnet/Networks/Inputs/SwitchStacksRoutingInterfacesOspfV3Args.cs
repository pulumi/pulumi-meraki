// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SwitchStacksRoutingInterfacesOspfV3Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Area id
        /// </summary>
        [Input("area")]
        public Input<string>? Area { get; set; }

        /// <summary>
        /// OSPF Cost
        /// </summary>
        [Input("cost")]
        public Input<int>? Cost { get; set; }

        /// <summary>
        /// Disable sending Hello packets on this interface's IPv6 area
        /// </summary>
        [Input("isPassiveEnabled")]
        public Input<bool>? IsPassiveEnabled { get; set; }

        public SwitchStacksRoutingInterfacesOspfV3Args()
        {
        }
        public static new SwitchStacksRoutingInterfacesOspfV3Args Empty => new SwitchStacksRoutingInterfacesOspfV3Args();
    }
}
