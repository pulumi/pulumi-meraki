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
    public sealed class WirelessSsidsRadiusAccountingServer
    {
        /// <summary>
        /// Certificate used for authorization for the RADSEC Server
        /// </summary>
        public readonly string? CaCertificate;
        /// <summary>
        /// IP address (or FQDN) to which the APs will send RADIUS accounting messages
        /// </summary>
        public readonly string? Host;
        /// <summary>
        /// The ID of the Openroaming Certificate attached to radius server
        /// </summary>
        public readonly int? OpenRoamingCertificateId;
        /// <summary>
        /// Port on the RADIUS server that is listening for accounting messages
        /// </summary>
        public readonly int? Port;
        /// <summary>
        /// Use RADSEC (TLS over TCP) to connect to this RADIUS accounting server. Requires radiusProxyEnabled.
        /// </summary>
        public readonly bool? RadsecEnabled;
        /// <summary>
        /// Shared key used to authenticate messages between the APs and RADIUS server
        /// </summary>
        public readonly string? Secret;

        [OutputConstructor]
        private WirelessSsidsRadiusAccountingServer(
            string? caCertificate,

            string? host,

            int? openRoamingCertificateId,

            int? port,

            bool? radsecEnabled,

            string? secret)
        {
            CaCertificate = caCertificate;
            Host = host;
            OpenRoamingCertificateId = openRoamingCertificateId;
            Port = port;
            RadsecEnabled = radsecEnabled;
            Secret = secret;
        }
    }
}
