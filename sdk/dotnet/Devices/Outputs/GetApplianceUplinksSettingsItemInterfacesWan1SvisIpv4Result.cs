// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class GetApplianceUplinksSettingsItemInterfacesWan1SvisIpv4Result
    {
        /// <summary>
        /// IP address and subnet mask when in static mode.
        /// </summary>
        public readonly string Address;
        /// <summary>
        /// The assignment mode for this SVI. Applies only when PPPoE is disabled.
        /// </summary>
        public readonly string AssignmentMode;
        /// <summary>
        /// Gateway IP address when in static mode.
        /// </summary>
        public readonly string Gateway;
        /// <summary>
        /// The nameserver settings for this SVI.
        /// </summary>
        public readonly Outputs.GetApplianceUplinksSettingsItemInterfacesWan1SvisIpv4NameserversResult Nameservers;

        [OutputConstructor]
        private GetApplianceUplinksSettingsItemInterfacesWan1SvisIpv4Result(
            string address,

            string assignmentMode,

            string gateway,

            Outputs.GetApplianceUplinksSettingsItemInterfacesWan1SvisIpv4NameserversResult nameservers)
        {
            Address = address;
            AssignmentMode = assignmentMode;
            Gateway = gateway;
            Nameservers = nameservers;
        }
    }
}
