// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class CloneItemCloudGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Region info
        /// </summary>
        [Input("region")]
        public Input<Inputs.CloneItemCloudRegionGetArgs>? Region { get; set; }

        public CloneItemCloudGetArgs()
        {
        }
        public static new CloneItemCloudGetArgs Empty => new CloneItemCloudGetArgs();
    }
}