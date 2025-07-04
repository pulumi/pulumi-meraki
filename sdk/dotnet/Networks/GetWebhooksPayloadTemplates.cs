// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetWebhooksPayloadTemplates
    {
        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Task<GetWebhooksPayloadTemplatesResult> InvokeAsync(GetWebhooksPayloadTemplatesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetWebhooksPayloadTemplatesResult>("meraki:networks/getWebhooksPayloadTemplates:getWebhooksPayloadTemplates", args ?? new GetWebhooksPayloadTemplatesArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Output<GetWebhooksPayloadTemplatesResult> Invoke(GetWebhooksPayloadTemplatesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetWebhooksPayloadTemplatesResult>("meraki:networks/getWebhooksPayloadTemplates:getWebhooksPayloadTemplates", args ?? new GetWebhooksPayloadTemplatesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Output<GetWebhooksPayloadTemplatesResult> Invoke(GetWebhooksPayloadTemplatesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetWebhooksPayloadTemplatesResult>("meraki:networks/getWebhooksPayloadTemplates:getWebhooksPayloadTemplates", args ?? new GetWebhooksPayloadTemplatesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetWebhooksPayloadTemplatesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public string? NetworkId { get; set; }

        /// <summary>
        /// payloadTemplateId path parameter. Payload template ID
        /// </summary>
        [Input("payloadTemplateId")]
        public string? PayloadTemplateId { get; set; }

        public GetWebhooksPayloadTemplatesArgs()
        {
        }
        public static new GetWebhooksPayloadTemplatesArgs Empty => new GetWebhooksPayloadTemplatesArgs();
    }

    public sealed class GetWebhooksPayloadTemplatesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// payloadTemplateId path parameter. Payload template ID
        /// </summary>
        [Input("payloadTemplateId")]
        public Input<string>? PayloadTemplateId { get; set; }

        public GetWebhooksPayloadTemplatesInvokeArgs()
        {
        }
        public static new GetWebhooksPayloadTemplatesInvokeArgs Empty => new GetWebhooksPayloadTemplatesInvokeArgs();
    }


    [OutputType]
    public sealed class GetWebhooksPayloadTemplatesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetWebhooksPayloadTemplatesItemResult Item;
        /// <summary>
        /// Array of ResponseNetworksGetNetworkWebhooksPayloadTemplates
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWebhooksPayloadTemplatesItemResult> Items;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string? NetworkId;
        /// <summary>
        /// payloadTemplateId path parameter. Payload template ID
        /// </summary>
        public readonly string? PayloadTemplateId;

        [OutputConstructor]
        private GetWebhooksPayloadTemplatesResult(
            string id,

            Outputs.GetWebhooksPayloadTemplatesItemResult item,

            ImmutableArray<Outputs.GetWebhooksPayloadTemplatesItemResult> items,

            string? networkId,

            string? payloadTemplateId)
        {
            Id = id;
            Item = item;
            Items = items;
            NetworkId = networkId;
            PayloadTemplateId = payloadTemplateId;
        }
    }
}
