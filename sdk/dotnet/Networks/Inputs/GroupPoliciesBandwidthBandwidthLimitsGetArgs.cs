// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class GroupPoliciesBandwidthBandwidthLimitsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The maximum download limit (integer, in Kbps). null indicates no limit
        /// </summary>
        [Input("limitDown")]
        public Input<int>? LimitDown { get; set; }

        /// <summary>
        /// The maximum upload limit (integer, in Kbps). null indicates no limit
        /// </summary>
        [Input("limitUp")]
        public Input<int>? LimitUp { get; set; }

        public GroupPoliciesBandwidthBandwidthLimitsGetArgs()
        {
        }
        public static new GroupPoliciesBandwidthBandwidthLimitsGetArgs Empty => new GroupPoliciesBandwidthBandwidthLimitsGetArgs();
    }
}