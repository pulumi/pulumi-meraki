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
    public sealed class GetAdaptivePolicyGroupsItemPolicyObjectResult
    {
        public readonly string Id;
        public readonly string Name;

        [OutputConstructor]
        private GetAdaptivePolicyGroupsItemPolicyObjectResult(
            string id,

            string name)
        {
            Id = id;
            Name = name;
        }
    }
}
