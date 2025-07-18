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
    public sealed class GetTrafficShapingApplicationCategoriesItemApplicationCategoryResult
    {
        public readonly ImmutableArray<Outputs.GetTrafficShapingApplicationCategoriesItemApplicationCategoryApplicationResult> Applications;
        public readonly string Id;
        public readonly string Name;

        [OutputConstructor]
        private GetTrafficShapingApplicationCategoriesItemApplicationCategoryResult(
            ImmutableArray<Outputs.GetTrafficShapingApplicationCategoriesItemApplicationCategoryApplicationResult> applications,

            string id,

            string name)
        {
            Applications = applications;
            Id = id;
            Name = name;
        }
    }
}
