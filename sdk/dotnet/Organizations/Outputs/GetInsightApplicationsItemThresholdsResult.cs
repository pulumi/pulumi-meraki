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
    public sealed class GetInsightApplicationsItemThresholdsResult
    {
        /// <summary>
        /// Threshold for each network
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInsightApplicationsItemThresholdsByNetworkResult> ByNetworks;
        /// <summary>
        /// Threshold type (static or smart)
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetInsightApplicationsItemThresholdsResult(
            ImmutableArray<Outputs.GetInsightApplicationsItemThresholdsByNetworkResult> byNetworks,

            string type)
        {
            ByNetworks = byNetworks;
            Type = type;
        }
    }
}
