// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Outputs
{

    [OutputType]
    public sealed class ApplianceTrafficShapingCustomPerformanceClassesParameters
    {
        /// <summary>
        /// Maximum jitter in milliseconds
        /// </summary>
        public readonly int? MaxJitter;
        /// <summary>
        /// Maximum latency in milliseconds
        /// </summary>
        public readonly int? MaxLatency;
        /// <summary>
        /// Maximum percentage of packet loss
        /// </summary>
        public readonly int? MaxLossPercentage;
        /// <summary>
        /// Name of the custom performance class
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private ApplianceTrafficShapingCustomPerformanceClassesParameters(
            int? maxJitter,

            int? maxLatency,

            int? maxLossPercentage,

            string? name)
        {
            MaxJitter = maxJitter;
            MaxLatency = maxLatency;
            MaxLossPercentage = maxLossPercentage;
            Name = name;
        }
    }
}