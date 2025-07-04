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
    public sealed class GetSettingsItemLocalStatusPageAuthenticationResult
    {
        /// <summary>
        /// Enables / disables the authentication on Local Status page(s).
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// The username used for Local Status Page(s).
        /// </summary>
        public readonly string Username;

        [OutputConstructor]
        private GetSettingsItemLocalStatusPageAuthenticationResult(
            bool enabled,

            string username)
        {
            Enabled = enabled;
            Username = username;
        }
    }
}
