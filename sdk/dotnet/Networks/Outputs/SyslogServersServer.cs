// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Outputs
{

    [OutputType]
    public sealed class SyslogServersServer
    {
        /// <summary>
        /// The IP address of the syslog server
        /// </summary>
        public readonly string? Host;
        /// <summary>
        /// The port of the syslog server
        /// </summary>
        public readonly int? Port;
        /// <summary>
        /// A list of roles for the syslog server. Options (case-insensitive): 'Wireless event log', 'Appliance event log', 'Switch event log', 'Air Marshal events', 'Flows', 'URLs', 'IDS alerts', 'Security events'
        /// </summary>
        public readonly ImmutableArray<string> Roles;

        [OutputConstructor]
        private SyslogServersServer(
            string? host,

            int? port,

            ImmutableArray<string> roles)
        {
            Host = host;
            Port = port;
            Roles = roles;
        }
    }
}