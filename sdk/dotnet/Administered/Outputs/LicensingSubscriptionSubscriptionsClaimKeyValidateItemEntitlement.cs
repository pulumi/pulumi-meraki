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
    public sealed class LicensingSubscriptionSubscriptionsClaimKeyValidateItemEntitlement
    {
        /// <summary>
        /// Seat distribution
        /// </summary>
        public readonly Outputs.LicensingSubscriptionSubscriptionsClaimKeyValidateItemEntitlementSeats? Seats;
        /// <summary>
        /// SKU of the required product
        /// </summary>
        public readonly string? Sku;

        [OutputConstructor]
        private LicensingSubscriptionSubscriptionsClaimKeyValidateItemEntitlement(
            Outputs.LicensingSubscriptionSubscriptionsClaimKeyValidateItemEntitlementSeats? seats,

            string? sku)
        {
            Seats = seats;
            Sku = sku;
        }
    }
}
