// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:networks/webhooksHttpServers:WebhooksHttpServers example "http_server_id,network_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/webhooksHttpServers:WebhooksHttpServers")]
    public partial class WebhooksHttpServers : global::Pulumi.CustomResource
    {
        /// <summary>
        /// httpServerId path parameter. Http server ID
        /// </summary>
        [Output("httpServerId")]
        public Output<string> HttpServerId { get; private set; } = null!;

        /// <summary>
        /// A name for easy reference to the HTTP server
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A Meraki network ID.
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;

        /// <summary>
        /// The payload template to use when posting data to the HTTP server.
        /// </summary>
        [Output("payloadTemplate")]
        public Output<Outputs.WebhooksHttpServersPayloadTemplate> PayloadTemplate { get; private set; } = null!;

        /// <summary>
        /// A shared secret that will be included in POSTs sent to the HTTP server. This secret can be used to verify that the request was sent by Meraki.
        /// </summary>
        [Output("sharedSecret")]
        public Output<string> SharedSecret { get; private set; } = null!;

        /// <summary>
        /// The URL of the HTTP server.
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;


        /// <summary>
        /// Create a WebhooksHttpServers resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WebhooksHttpServers(string name, WebhooksHttpServersArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/webhooksHttpServers:WebhooksHttpServers", name, args ?? new WebhooksHttpServersArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WebhooksHttpServers(string name, Input<string> id, WebhooksHttpServersState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/webhooksHttpServers:WebhooksHttpServers", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi/pulumi-meraki",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing WebhooksHttpServers resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WebhooksHttpServers Get(string name, Input<string> id, WebhooksHttpServersState? state = null, CustomResourceOptions? options = null)
        {
            return new WebhooksHttpServers(name, id, state, options);
        }
    }

    public sealed class WebhooksHttpServersArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// httpServerId path parameter. Http server ID
        /// </summary>
        [Input("httpServerId")]
        public Input<string>? HttpServerId { get; set; }

        /// <summary>
        /// A name for easy reference to the HTTP server
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A Meraki network ID.
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        /// <summary>
        /// The payload template to use when posting data to the HTTP server.
        /// </summary>
        [Input("payloadTemplate")]
        public Input<Inputs.WebhooksHttpServersPayloadTemplateArgs>? PayloadTemplate { get; set; }

        /// <summary>
        /// A shared secret that will be included in POSTs sent to the HTTP server. This secret can be used to verify that the request was sent by Meraki.
        /// </summary>
        [Input("sharedSecret")]
        public Input<string>? SharedSecret { get; set; }

        /// <summary>
        /// The URL of the HTTP server.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public WebhooksHttpServersArgs()
        {
        }
        public static new WebhooksHttpServersArgs Empty => new WebhooksHttpServersArgs();
    }

    public sealed class WebhooksHttpServersState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// httpServerId path parameter. Http server ID
        /// </summary>
        [Input("httpServerId")]
        public Input<string>? HttpServerId { get; set; }

        /// <summary>
        /// A name for easy reference to the HTTP server
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A Meraki network ID.
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// The payload template to use when posting data to the HTTP server.
        /// </summary>
        [Input("payloadTemplate")]
        public Input<Inputs.WebhooksHttpServersPayloadTemplateGetArgs>? PayloadTemplate { get; set; }

        /// <summary>
        /// A shared secret that will be included in POSTs sent to the HTTP server. This secret can be used to verify that the request was sent by Meraki.
        /// </summary>
        [Input("sharedSecret")]
        public Input<string>? SharedSecret { get; set; }

        /// <summary>
        /// The URL of the HTTP server.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public WebhooksHttpServersState()
        {
        }
        public static new WebhooksHttpServersState Empty => new WebhooksHttpServersState();
    }
}