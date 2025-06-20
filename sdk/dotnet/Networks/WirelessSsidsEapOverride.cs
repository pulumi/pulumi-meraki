// *** WARNING: this file was generated by pulumi-language-dotnet. ***
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
    /// $ pulumi import meraki:networks/wirelessSsidsEapOverride:WirelessSsidsEapOverride example "network_id,number"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/wirelessSsidsEapOverride:WirelessSsidsEapOverride")]
    public partial class WirelessSsidsEapOverride : global::Pulumi.CustomResource
    {
        /// <summary>
        /// EAPOL Key settings.
        /// </summary>
        [Output("eapolKey")]
        public Output<Outputs.WirelessSsidsEapOverrideEapolKey> EapolKey { get; private set; } = null!;

        /// <summary>
        /// EAP settings for identity requests.
        /// </summary>
        [Output("identity")]
        public Output<Outputs.WirelessSsidsEapOverrideIdentity> Identity { get; private set; } = null!;

        /// <summary>
        /// Maximum number of general EAP retries.
        /// </summary>
        [Output("maxRetries")]
        public Output<int> MaxRetries { get; private set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;

        /// <summary>
        /// number path parameter.
        /// </summary>
        [Output("number")]
        public Output<string> Number { get; private set; } = null!;

        /// <summary>
        /// General EAP timeout in seconds.
        /// </summary>
        [Output("timeout")]
        public Output<int> Timeout { get; private set; } = null!;


        /// <summary>
        /// Create a WirelessSsidsEapOverride resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WirelessSsidsEapOverride(string name, WirelessSsidsEapOverrideArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/wirelessSsidsEapOverride:WirelessSsidsEapOverride", name, args ?? new WirelessSsidsEapOverrideArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WirelessSsidsEapOverride(string name, Input<string> id, WirelessSsidsEapOverrideState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/wirelessSsidsEapOverride:WirelessSsidsEapOverride", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WirelessSsidsEapOverride resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WirelessSsidsEapOverride Get(string name, Input<string> id, WirelessSsidsEapOverrideState? state = null, CustomResourceOptions? options = null)
        {
            return new WirelessSsidsEapOverride(name, id, state, options);
        }
    }

    public sealed class WirelessSsidsEapOverrideArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// EAPOL Key settings.
        /// </summary>
        [Input("eapolKey")]
        public Input<Inputs.WirelessSsidsEapOverrideEapolKeyArgs>? EapolKey { get; set; }

        /// <summary>
        /// EAP settings for identity requests.
        /// </summary>
        [Input("identity")]
        public Input<Inputs.WirelessSsidsEapOverrideIdentityArgs>? Identity { get; set; }

        /// <summary>
        /// Maximum number of general EAP retries.
        /// </summary>
        [Input("maxRetries")]
        public Input<int>? MaxRetries { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        /// <summary>
        /// number path parameter.
        /// </summary>
        [Input("number", required: true)]
        public Input<string> Number { get; set; } = null!;

        /// <summary>
        /// General EAP timeout in seconds.
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        public WirelessSsidsEapOverrideArgs()
        {
        }
        public static new WirelessSsidsEapOverrideArgs Empty => new WirelessSsidsEapOverrideArgs();
    }

    public sealed class WirelessSsidsEapOverrideState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// EAPOL Key settings.
        /// </summary>
        [Input("eapolKey")]
        public Input<Inputs.WirelessSsidsEapOverrideEapolKeyGetArgs>? EapolKey { get; set; }

        /// <summary>
        /// EAP settings for identity requests.
        /// </summary>
        [Input("identity")]
        public Input<Inputs.WirelessSsidsEapOverrideIdentityGetArgs>? Identity { get; set; }

        /// <summary>
        /// Maximum number of general EAP retries.
        /// </summary>
        [Input("maxRetries")]
        public Input<int>? MaxRetries { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// number path parameter.
        /// </summary>
        [Input("number")]
        public Input<string>? Number { get; set; }

        /// <summary>
        /// General EAP timeout in seconds.
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        public WirelessSsidsEapOverrideState()
        {
        }
        public static new WirelessSsidsEapOverrideState Empty => new WirelessSsidsEapOverrideState();
    }
}
