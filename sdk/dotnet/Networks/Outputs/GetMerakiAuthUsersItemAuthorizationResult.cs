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
    public sealed class GetMerakiAuthUsersItemAuthorizationResult
    {
        /// <summary>
        /// User is authorized by the account email address
        /// </summary>
        public readonly string AuthorizedByEmail;
        /// <summary>
        /// User is authorized by the account name
        /// </summary>
        public readonly string AuthorizedByName;
        /// <summary>
        /// Authorized zone of the user
        /// </summary>
        public readonly string AuthorizedZone;
        /// <summary>
        /// Authorization expiration time
        /// </summary>
        public readonly string ExpiresAt;
        /// <summary>
        /// SSID number
        /// </summary>
        public readonly int SsidNumber;

        [OutputConstructor]
        private GetMerakiAuthUsersItemAuthorizationResult(
            string authorizedByEmail,

            string authorizedByName,

            string authorizedZone,

            string expiresAt,

            int ssidNumber)
        {
            AuthorizedByEmail = authorizedByEmail;
            AuthorizedByName = authorizedByName;
            AuthorizedZone = authorizedZone;
            ExpiresAt = expiresAt;
            SsidNumber = ssidNumber;
        }
    }
}
