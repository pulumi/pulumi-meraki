// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WebhooksHttpServersPayloadTemplateGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the payload template.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the payload template.
        /// </summary>
        [Input("payloadTemplateId")]
        public Input<string>? PayloadTemplateId { get; set; }

        public WebhooksHttpServersPayloadTemplateGetArgs()
        {
        }
        public static new WebhooksHttpServersPayloadTemplateGetArgs Empty => new WebhooksHttpServersPayloadTemplateGetArgs();
    }
}