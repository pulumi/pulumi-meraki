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
    public sealed class WirelessSsidsLocalRadiusPasswordAuthentication
    {
        /// <summary>
        /// Whether or not to use EAP-TTLS/PAP or PEAP-GTC password-based authentication via LDAP lookup.
        /// </summary>
        public readonly bool? Enabled;

        [OutputConstructor]
        private WirelessSsidsLocalRadiusPasswordAuthentication(bool? enabled)
        {
            Enabled = enabled;
        }
    }
}
