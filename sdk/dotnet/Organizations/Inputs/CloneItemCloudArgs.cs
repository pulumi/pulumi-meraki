// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class CloneItemCloudArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Region info
        /// </summary>
        [Input("region")]
        public Input<Inputs.CloneItemCloudRegionArgs>? Region { get; set; }

        public CloneItemCloudArgs()
        {
        }
        public static new CloneItemCloudArgs Empty => new CloneItemCloudArgs();
    }
}
