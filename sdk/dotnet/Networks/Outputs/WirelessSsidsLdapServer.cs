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
    public sealed class WirelessSsidsLdapServer
    {
        /// <summary>
        /// IP address (or FQDN) of your LDAP server.
        /// </summary>
        public readonly string? Host;
        /// <summary>
        /// UDP port the LDAP server listens on.
        /// </summary>
        public readonly int? Port;

        [OutputConstructor]
        private WirelessSsidsLdapServer(
            string? host,

            int? port)
        {
            Host = host;
            Port = port;
        }
    }
}
