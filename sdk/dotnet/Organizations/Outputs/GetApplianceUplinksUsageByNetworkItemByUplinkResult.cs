// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class GetApplianceUplinksUsageByNetworkItemByUplinkResult
    {
        /// <summary>
        /// Uplink name
        /// </summary>
        public readonly string Interface;
        /// <summary>
        /// Bytes received
        /// </summary>
        public readonly int Received;
        /// <summary>
        /// Bytes sent
        /// </summary>
        public readonly int Sent;
        /// <summary>
        /// Uplink serial
        /// </summary>
        public readonly string Serial;

        [OutputConstructor]
        private GetApplianceUplinksUsageByNetworkItemByUplinkResult(
            string @interface,

            int received,

            int sent,

            string serial)
        {
            Interface = @interface;
            Received = received;
            Sent = sent;
            Serial = serial;
        }
    }
}
