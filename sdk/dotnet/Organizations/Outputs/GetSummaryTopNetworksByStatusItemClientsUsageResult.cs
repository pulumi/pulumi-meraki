// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class GetSummaryTopNetworksByStatusItemClientsUsageResult
    {
        /// <summary>
        /// Total downstream usage in network, in KB
        /// </summary>
        public readonly double Downstream;
        /// <summary>
        /// Total upstream usage in network, in KB
        /// </summary>
        public readonly double Upstream;

        [OutputConstructor]
        private GetSummaryTopNetworksByStatusItemClientsUsageResult(
            double downstream,

            double upstream)
        {
            Downstream = downstream;
            Upstream = upstream;
        }
    }
}