// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessSsidsLdapServerGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IP address (or FQDN) of your LDAP server.
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// UDP port the LDAP server listens on.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        public WirelessSsidsLdapServerGetArgs()
        {
        }
        public static new WirelessSsidsLdapServerGetArgs Empty => new WirelessSsidsLdapServerGetArgs();
    }
}
