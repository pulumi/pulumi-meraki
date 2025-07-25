// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class LoginSecurityApiAuthenticationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Details for API-only IP restrictions.
        /// </summary>
        [Input("ipRestrictionsForKeys")]
        public Input<Inputs.LoginSecurityApiAuthenticationIpRestrictionsForKeysArgs>? IpRestrictionsForKeys { get; set; }

        public LoginSecurityApiAuthenticationArgs()
        {
        }
        public static new LoginSecurityApiAuthenticationArgs Empty => new LoginSecurityApiAuthenticationArgs();
    }
}
