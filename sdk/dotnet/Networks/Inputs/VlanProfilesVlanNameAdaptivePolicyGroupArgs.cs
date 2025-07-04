// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class VlanProfilesVlanNameAdaptivePolicyGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Adaptive Policy Group ID
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Adaptive Policy Group name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public VlanProfilesVlanNameAdaptivePolicyGroupArgs()
        {
        }
        public static new VlanProfilesVlanNameAdaptivePolicyGroupArgs Empty => new VlanProfilesVlanNameAdaptivePolicyGroupArgs();
    }
}
