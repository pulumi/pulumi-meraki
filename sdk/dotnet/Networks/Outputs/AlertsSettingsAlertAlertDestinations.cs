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
    public sealed class AlertsSettingsAlertAlertDestinations
    {
        /// <summary>
        /// If true, then all network admins will receive emails for this alert
        /// </summary>
        public readonly bool? AllAdmins;
        /// <summary>
        /// A list of emails that will receive information about the alert
        /// </summary>
        public readonly ImmutableArray<string> Emails;
        /// <summary>
        /// A list of HTTP server IDs to send a Webhook to for this alert
        /// </summary>
        public readonly ImmutableArray<string> HttpServerIds;
        /// <summary>
        /// If true, then an SNMP trap will be sent for this alert if there is an SNMP trap server configured for this network
        /// </summary>
        public readonly bool? Snmp;

        [OutputConstructor]
        private AlertsSettingsAlertAlertDestinations(
            bool? allAdmins,

            ImmutableArray<string> emails,

            ImmutableArray<string> httpServerIds,

            bool? snmp)
        {
            AllAdmins = allAdmins;
            Emails = emails;
            HttpServerIds = httpServerIds;
            Snmp = snmp;
        }
    }
}
