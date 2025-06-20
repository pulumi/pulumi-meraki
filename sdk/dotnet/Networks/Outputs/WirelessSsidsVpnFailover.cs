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
    public sealed class WirelessSsidsVpnFailover
    {
        /// <summary>
        /// Idle timer interval in seconds.
        /// </summary>
        public readonly int? HeartbeatInterval;
        /// <summary>
        /// Idle timer timeout in seconds.
        /// </summary>
        public readonly int? IdleTimeout;
        /// <summary>
        /// IP addressed reserved on DHCP server where SSID will terminate.
        /// </summary>
        public readonly string? RequestIp;

        [OutputConstructor]
        private WirelessSsidsVpnFailover(
            int? heartbeatInterval,

            int? idleTimeout,

            string? requestIp)
        {
            HeartbeatInterval = heartbeatInterval;
            IdleTimeout = idleTimeout;
            RequestIp = requestIp;
        }
    }
}
