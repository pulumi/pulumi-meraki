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
    public sealed class GetApiRequestsOverviewItemResult
    {
        /// <summary>
        /// object of all supported HTTP response code
        /// </summary>
        public readonly Outputs.GetApiRequestsOverviewItemResponseCodeCountsResult ResponseCodeCounts;

        [OutputConstructor]
        private GetApiRequestsOverviewItemResult(Outputs.GetApiRequestsOverviewItemResponseCodeCountsResult responseCodeCounts)
        {
            ResponseCodeCounts = responseCodeCounts;
        }
    }
}
