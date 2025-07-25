// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class AdaptivePolicyGroupsPolicyObjectGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the policy object
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The name of the policy object
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public AdaptivePolicyGroupsPolicyObjectGetArgs()
        {
        }
        public static new AdaptivePolicyGroupsPolicyObjectGetArgs Empty => new AdaptivePolicyGroupsPolicyObjectGetArgs();
    }
}
