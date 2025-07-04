// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class GetSummaryTopDevicesModelsByUsageItemUsageResult
    {
        /// <summary>
        /// Average usage in megabytes
        /// </summary>
        public readonly double Average;
        /// <summary>
        /// Total usage in megabytes
        /// </summary>
        public readonly double Total;

        [OutputConstructor]
        private GetSummaryTopDevicesModelsByUsageItemUsageResult(
            double average,

            double total)
        {
            Average = average;
            Total = total;
        }
    }
}
