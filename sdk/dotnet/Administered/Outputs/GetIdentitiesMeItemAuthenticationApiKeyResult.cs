// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Administered.Outputs
{

    [OutputType]
    public sealed class GetIdentitiesMeItemAuthenticationApiKeyResult
    {
        /// <summary>
        /// If API key is created for this user
        /// </summary>
        public readonly bool Created;

        [OutputConstructor]
        private GetIdentitiesMeItemAuthenticationApiKeyResult(bool created)
        {
            Created = created;
        }
    }
}
