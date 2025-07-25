// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IPv4 address of the trusted server.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        public SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4Args()
        {
        }
        public static new SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4Args Empty => new SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4Args();
    }
}
