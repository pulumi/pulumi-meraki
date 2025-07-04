// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WebhooksPayloadTemplatesSharingByNetworkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether network admins may modify this template
        /// </summary>
        [Input("adminsCanModify")]
        public Input<bool>? AdminsCanModify { get; set; }

        public WebhooksPayloadTemplatesSharingByNetworkArgs()
        {
        }
        public static new WebhooksPayloadTemplatesSharingByNetworkArgs Empty => new WebhooksPayloadTemplatesSharingByNetworkArgs();
    }
}
