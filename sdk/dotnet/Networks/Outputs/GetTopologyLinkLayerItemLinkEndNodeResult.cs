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
    public sealed class GetTopologyLinkLayerItemLinkEndNodeResult
    {
        public readonly string DerivedId;
        public readonly string Type;

        [OutputConstructor]
        private GetTopologyLinkLayerItemLinkEndNodeResult(
            string derivedId,

            string type)
        {
            DerivedId = derivedId;
            Type = type;
        }
    }
}
