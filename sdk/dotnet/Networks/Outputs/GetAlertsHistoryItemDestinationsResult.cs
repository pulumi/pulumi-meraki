// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Outputs
{

    [OutputType]
    public sealed class GetAlertsHistoryItemDestinationsResult
    {
        /// <summary>
        /// email destinations for this alert
        /// </summary>
        public readonly Outputs.GetAlertsHistoryItemDestinationsEmailResult Email;
        /// <summary>
        /// push destinations for this alert
        /// </summary>
        public readonly Outputs.GetAlertsHistoryItemDestinationsPushResult Push;
        /// <summary>
        /// sms destinations for this alert
        /// </summary>
        public readonly Outputs.GetAlertsHistoryItemDestinationsSmsResult Sms;
        /// <summary>
        /// webhook destinations for this alert
        /// </summary>
        public readonly Outputs.GetAlertsHistoryItemDestinationsWebhookResult Webhook;

        [OutputConstructor]
        private GetAlertsHistoryItemDestinationsResult(
            Outputs.GetAlertsHistoryItemDestinationsEmailResult email,

            Outputs.GetAlertsHistoryItemDestinationsPushResult push,

            Outputs.GetAlertsHistoryItemDestinationsSmsResult sms,

            Outputs.GetAlertsHistoryItemDestinationsWebhookResult webhook)
        {
            Email = email;
            Push = push;
            Sms = sms;
            Webhook = webhook;
        }
    }
}