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
    public sealed class GetLicensesOverviewItemStatesResult
    {
        /// <summary>
        /// Data for active licenses
        /// </summary>
        public readonly Outputs.GetLicensesOverviewItemStatesActiveResult Active;
        /// <summary>
        /// Data for expired licenses
        /// </summary>
        public readonly Outputs.GetLicensesOverviewItemStatesExpiredResult Expired;
        /// <summary>
        /// Data for expiring licenses
        /// </summary>
        public readonly Outputs.GetLicensesOverviewItemStatesExpiringResult Expiring;
        /// <summary>
        /// Data for recently queued licenses
        /// </summary>
        public readonly Outputs.GetLicensesOverviewItemStatesRecentlyQueuedResult RecentlyQueued;
        /// <summary>
        /// Data for unused licenses
        /// </summary>
        public readonly Outputs.GetLicensesOverviewItemStatesUnusedResult Unused;
        /// <summary>
        /// Data for unused, active licenses
        /// </summary>
        public readonly Outputs.GetLicensesOverviewItemStatesUnusedActiveResult UnusedActive;

        [OutputConstructor]
        private GetLicensesOverviewItemStatesResult(
            Outputs.GetLicensesOverviewItemStatesActiveResult active,

            Outputs.GetLicensesOverviewItemStatesExpiredResult expired,

            Outputs.GetLicensesOverviewItemStatesExpiringResult expiring,

            Outputs.GetLicensesOverviewItemStatesRecentlyQueuedResult recentlyQueued,

            Outputs.GetLicensesOverviewItemStatesUnusedResult unused,

            Outputs.GetLicensesOverviewItemStatesUnusedActiveResult unusedActive)
        {
            Active = active;
            Expired = expired;
            Expiring = expiring;
            RecentlyQueued = recentlyQueued;
            Unused = unused;
            UnusedActive = unusedActive;
        }
    }
}