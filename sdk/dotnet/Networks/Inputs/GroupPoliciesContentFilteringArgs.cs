// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class GroupPoliciesContentFilteringArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Settings for allowed URL patterns
        /// </summary>
        [Input("allowedUrlPatterns")]
        public Input<Inputs.GroupPoliciesContentFilteringAllowedUrlPatternsArgs>? AllowedUrlPatterns { get; set; }

        /// <summary>
        /// Settings for blocked URL categories
        /// </summary>
        [Input("blockedUrlCategories")]
        public Input<Inputs.GroupPoliciesContentFilteringBlockedUrlCategoriesArgs>? BlockedUrlCategories { get; set; }

        /// <summary>
        /// Settings for blocked URL patterns
        /// </summary>
        [Input("blockedUrlPatterns")]
        public Input<Inputs.GroupPoliciesContentFilteringBlockedUrlPatternsArgs>? BlockedUrlPatterns { get; set; }

        public GroupPoliciesContentFilteringArgs()
        {
        }
        public static new GroupPoliciesContentFilteringArgs Empty => new GroupPoliciesContentFilteringArgs();
    }
}
