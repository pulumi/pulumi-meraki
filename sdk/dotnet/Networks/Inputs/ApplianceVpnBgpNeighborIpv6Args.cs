// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceVpnBgpNeighborIpv6Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IPv6 address of the neighbor.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        public ApplianceVpnBgpNeighborIpv6Args()
        {
        }
        public static new ApplianceVpnBgpNeighborIpv6Args Empty => new ApplianceVpnBgpNeighborIpv6Args();
    }
}
