// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Administered.Outputs
{

    [OutputType]
    public sealed class GetIdentitiesMeItemAuthenticationSamlResult
    {
        /// <summary>
        /// If SAML authentication is enabled for this user
        /// </summary>
        public readonly bool Enabled;

        [OutputConstructor]
        private GetIdentitiesMeItemAuthenticationSamlResult(bool enabled)
        {
            Enabled = enabled;
        }
    }
}