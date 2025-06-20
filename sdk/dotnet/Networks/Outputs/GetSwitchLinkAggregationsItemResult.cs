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
    public sealed class GetSwitchLinkAggregationsItemResult
    {
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetSwitchLinkAggregationsItemSwitchPortResult> SwitchPorts;

        [OutputConstructor]
        private GetSwitchLinkAggregationsItemResult(
            string id,

            ImmutableArray<Outputs.GetSwitchLinkAggregationsItemSwitchPortResult> switchPorts)
        {
            Id = id;
            SwitchPorts = switchPorts;
        }
    }
}
