// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Administered.Inputs
{

    public sealed class LicensingSubscriptionSubscriptionsClaimItemCountsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Number of networks bound to this subscription
        /// </summary>
        [Input("networks")]
        public Input<int>? Networks { get; set; }

        /// <summary>
        /// Seat distribution
        /// </summary>
        [Input("seats")]
        public Input<Inputs.LicensingSubscriptionSubscriptionsClaimItemCountsSeatsArgs>? Seats { get; set; }

        public LicensingSubscriptionSubscriptionsClaimItemCountsArgs()
        {
        }
        public static new LicensingSubscriptionSubscriptionsClaimItemCountsArgs Empty => new LicensingSubscriptionSubscriptionsClaimItemCountsArgs();
    }
}
