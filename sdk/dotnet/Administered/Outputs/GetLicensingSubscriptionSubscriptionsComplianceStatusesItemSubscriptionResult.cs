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
    public sealed class GetLicensingSubscriptionSubscriptionsComplianceStatusesItemSubscriptionResult
    {
        /// <summary>
        /// Subscription's ID
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Friendly name to identify the subscription
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// One of the following: "inactive" | "active" | "out*of*compliance" | "expired" | "canceled"
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetLicensingSubscriptionSubscriptionsComplianceStatusesItemSubscriptionResult(
            string id,

            string name,

            string status)
        {
            Id = id;
            Name = name;
            Status = status;
        }
    }
}
