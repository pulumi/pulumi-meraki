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
    public sealed class ActionBatchesCallback
    {
        /// <summary>
        /// The webhook receiver used for the callback webhook.
        /// </summary>
        public readonly Outputs.ActionBatchesCallbackHttpServer? HttpServer;
        /// <summary>
        /// The ID of the callback. To check the status of the callback, use this ID in a request to /webhooks/callbacks/statuses/{id}
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The payload template of the webhook used for the callback
        /// </summary>
        public readonly Outputs.ActionBatchesCallbackPayloadTemplate? PayloadTemplate;
        /// <summary>
        /// A shared secret that will be included in the requests sent to the callback URL. It can be used to verify that the request was sent by Meraki. If using this field, please also specify an url.
        /// </summary>
        public readonly string? SharedSecret;
        /// <summary>
        /// The status of the callback
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// The callback URL for the webhook target. This was either provided in the original request or comes from a configured webhook receiver
        /// </summary>
        public readonly string? Url;

        [OutputConstructor]
        private ActionBatchesCallback(
            Outputs.ActionBatchesCallbackHttpServer? httpServer,

            string? id,

            Outputs.ActionBatchesCallbackPayloadTemplate? payloadTemplate,

            string? sharedSecret,

            string? status,

            string? url)
        {
            HttpServer = httpServer;
            Id = id;
            PayloadTemplate = payloadTemplate;
            SharedSecret = sharedSecret;
            Status = status;
            Url = url;
        }
    }
}