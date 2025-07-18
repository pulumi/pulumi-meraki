// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Outputs
{

    [OutputType]
    public sealed class GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilterValueDestinationResult
    {
        /// <summary>
        /// CIDR format address (e.g."192.168.10.1", which is the same as "192.168.10.1/32"), or "any". Cannot be used in combination with the "vlan" or "fqdn" property
        /// </summary>
        public readonly string Cidr;
        /// <summary>
        /// FQDN format address. Cannot be used in combination with the "cidr" or "fqdn" property and is currently only available in the "destination" object of the "vpnTrafficUplinkPreference" object. E.g.: "www.google.com"
        /// </summary>
        public readonly string Fqdn;
        /// <summary>
        /// Host ID in the VLAN. Should not exceed the VLAN subnet capacity. Must be used along with the "vlan" property and is currently only available under a template network.
        /// </summary>
        public readonly int Host;
        /// <summary>
        /// Meraki network ID. Currently only available under a template network, and the value should be ID of either same template network, or another template network currently. E.g.: "L_12345678".
        /// </summary>
        public readonly string Network;
        /// <summary>
        /// E.g.: "any", "0" (also means "any"), "8080", "1-1024"
        /// </summary>
        public readonly string Port;
        /// <summary>
        /// VLAN ID of the configured VLAN in the Meraki network. Cannot be used in combination with the "cidr" or "fqdn" property and is currently only available under a template network.
        /// </summary>
        public readonly int Vlan;

        [OutputConstructor]
        private GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilterValueDestinationResult(
            string cidr,

            string fqdn,

            int host,

            string network,

            string port,

            int vlan)
        {
            Cidr = cidr;
            Fqdn = fqdn;
            Host = host;
            Network = network;
            Port = port;
            Vlan = vlan;
        }
    }
}
