// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WebhooksPayloadTemplatesSharingByNetworkGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether network admins may modify this template
        /// </summary>
        [Input("adminsCanModify")]
        public Input<bool>? AdminsCanModify { get; set; }

        public WebhooksPayloadTemplatesSharingByNetworkGetArgs()
        {
        }
        public static new WebhooksPayloadTemplatesSharingByNetworkGetArgs Empty => new WebhooksPayloadTemplatesSharingByNetworkGetArgs();
    }
}