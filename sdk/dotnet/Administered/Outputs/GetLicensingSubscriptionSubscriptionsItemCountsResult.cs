// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Administered.Outputs
{

    [OutputType]
    public sealed class GetLicensingSubscriptionSubscriptionsItemCountsResult
    {
        /// <summary>
        /// Number of networks bound to this subscription
        /// </summary>
        public readonly int Networks;
        /// <summary>
        /// Seat distribution
        /// </summary>
        public readonly Outputs.GetLicensingSubscriptionSubscriptionsItemCountsSeatsResult Seats;

        [OutputConstructor]
        private GetLicensingSubscriptionSubscriptionsItemCountsResult(
            int networks,

            Outputs.GetLicensingSubscriptionSubscriptionsItemCountsSeatsResult seats)
        {
            Networks = networks;
            Seats = seats;
        }
    }
}
