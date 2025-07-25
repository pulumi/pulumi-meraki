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
    public sealed class ApplianceVmxAuthenticationTokenItem
    {
        /// <summary>
        /// The expiration time for the token, in ISO 8601 format
        /// </summary>
        public readonly string? ExpiresAt;
        /// <summary>
        /// The newly generated authentication token for the vMX instance
        /// </summary>
        public readonly string? Token;

        [OutputConstructor]
        private ApplianceVmxAuthenticationTokenItem(
            string? expiresAt,

            string? token)
        {
            ExpiresAt = expiresAt;
            Token = token;
        }
    }
}
