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
    public sealed class GetApplianceUplinksStatusesOverviewItemCountsByStatusResult
    {
        /// <summary>
        /// number of uplinks that are active and working
        /// </summary>
        public readonly int Active;
        /// <summary>
        /// number of uplinks currently connecting
        /// </summary>
        public readonly int Connecting;
        /// <summary>
        /// number of uplinks that were working but have failed
        /// </summary>
        public readonly int Failed;
        /// <summary>
        /// number of uplinks currently where nothing is plugged in
        /// </summary>
        public readonly int NotConnected;
        /// <summary>
        /// number of uplinks that are working but on standby
        /// </summary>
        public readonly int Ready;

        [OutputConstructor]
        private GetApplianceUplinksStatusesOverviewItemCountsByStatusResult(
            int active,

            int connecting,

            int failed,

            int notConnected,

            int ready)
        {
            Active = active;
            Connecting = connecting;
            Failed = failed;
            NotConnected = notConnected;
            Ready = ready;
        }
    }
}
