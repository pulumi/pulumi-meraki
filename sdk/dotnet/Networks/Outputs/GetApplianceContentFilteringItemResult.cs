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
    public sealed class GetApplianceContentFilteringItemResult
    {
        public readonly ImmutableArray<string> AllowedUrlPatterns;
        public readonly ImmutableArray<Outputs.GetApplianceContentFilteringItemBlockedUrlCategoryResult> BlockedUrlCategories;
        public readonly ImmutableArray<string> BlockedUrlPatterns;
        public readonly string UrlCategoryListSize;

        [OutputConstructor]
        private GetApplianceContentFilteringItemResult(
            ImmutableArray<string> allowedUrlPatterns,

            ImmutableArray<Outputs.GetApplianceContentFilteringItemBlockedUrlCategoryResult> blockedUrlCategories,

            ImmutableArray<string> blockedUrlPatterns,

            string urlCategoryListSize)
        {
            AllowedUrlPatterns = allowedUrlPatterns;
            BlockedUrlCategories = blockedUrlCategories;
            BlockedUrlPatterns = blockedUrlPatterns;
            UrlCategoryListSize = urlCategoryListSize;
        }
    }
}
