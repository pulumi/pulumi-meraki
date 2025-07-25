// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueSourceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// CIDR format address (e.g."192.168.10.1", which is the same as "192.168.10.1/32"), or "any". Cannot be used in combination with the "vlan" property
        /// </summary>
        [Input("cidr")]
        public Input<string>? Cidr { get; set; }

        /// <summary>
        /// Host ID in the VLAN. Should not exceed the VLAN subnet capacity. Must be used along with the "vlan" property and is currently only available under a template network.
        /// </summary>
        [Input("host")]
        public Input<int>? Host { get; set; }

        /// <summary>
        /// Meraki network ID. Currently only available under a template network, and the value should be ID of either same template network, or another template network currently. E.g.: "L_12345678".
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        /// <summary>
        /// E.g.: "any", "0" (also means "any"), "8080", "1-1024"
        /// </summary>
        [Input("port")]
        public Input<string>? Port { get; set; }

        /// <summary>
        /// VLAN ID of the configured VLAN in the Meraki network. Cannot be used in combination with the "cidr" property and is currently only available under a template network.
        /// </summary>
        [Input("vlan")]
        public Input<int>? Vlan { get; set; }

        public ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueSourceGetArgs()
        {
        }
        public static new ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueSourceGetArgs Empty => new ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueSourceGetArgs();
    }
}
