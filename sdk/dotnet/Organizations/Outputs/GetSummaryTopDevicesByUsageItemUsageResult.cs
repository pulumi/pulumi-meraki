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
    public sealed class GetSummaryTopDevicesByUsageItemUsageResult
    {
        /// <summary>
        /// Data usage of the device by percentage
        /// </summary>
        public readonly double Percentage;
        /// <summary>
        /// Total data usage of the device
        /// </summary>
        public readonly double Total;

        [OutputConstructor]
        private GetSummaryTopDevicesByUsageItemUsageResult(
            double percentage,

            double total)
        {
            Percentage = percentage;
            Total = total;
        }
    }
}
