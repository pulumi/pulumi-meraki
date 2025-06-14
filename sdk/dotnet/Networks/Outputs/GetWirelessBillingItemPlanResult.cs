// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Outputs
{

    [OutputType]
    public sealed class GetWirelessBillingItemPlanResult
    {
        /// <summary>
        /// The uplink bandwidth settings for the pricing plan.
        /// </summary>
        public readonly Outputs.GetWirelessBillingItemPlanBandwidthLimitsResult BandwidthLimits;
        /// <summary>
        /// The id of the pricing plan to update.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The price of the billing plan.
        /// </summary>
        public readonly double Price;
        /// <summary>
        /// The time limit of the pricing plan in minutes.
        /// </summary>
        public readonly string TimeLimit;

        [OutputConstructor]
        private GetWirelessBillingItemPlanResult(
            Outputs.GetWirelessBillingItemPlanBandwidthLimitsResult bandwidthLimits,

            string id,

            double price,

            string timeLimit)
        {
            BandwidthLimits = bandwidthLimits;
            Id = id;
            Price = price;
            TimeLimit = timeLimit;
        }
    }
}
