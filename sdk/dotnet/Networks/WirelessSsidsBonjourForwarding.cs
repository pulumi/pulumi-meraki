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
    /// $ pulumi import meraki:networks/wirelessSsidsBonjourForwarding:WirelessSsidsBonjourForwarding example "network_id,number"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/wirelessSsidsBonjourForwarding:WirelessSsidsBonjourForwarding")]
    public partial class WirelessSsidsBonjourForwarding : global::Pulumi.CustomResource
    {
        /// <summary>
        /// If true, Bonjour forwarding is enabled on the SSID.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// Bonjour forwarding exception
        /// </summary>
        [Output("exception")]
        public Output<Outputs.WirelessSsidsBonjourForwardingException> Exception { get; private set; } = null!;

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
        /// Bonjour forwarding rules
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.WirelessSsidsBonjourForwardingRule>> Rules { get; private set; } = null!;


        /// <summary>
        /// Create a WirelessSsidsBonjourForwarding resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WirelessSsidsBonjourForwarding(string name, WirelessSsidsBonjourForwardingArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/wirelessSsidsBonjourForwarding:WirelessSsidsBonjourForwarding", name, args ?? new WirelessSsidsBonjourForwardingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WirelessSsidsBonjourForwarding(string name, Input<string> id, WirelessSsidsBonjourForwardingState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/wirelessSsidsBonjourForwarding:WirelessSsidsBonjourForwarding", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WirelessSsidsBonjourForwarding resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WirelessSsidsBonjourForwarding Get(string name, Input<string> id, WirelessSsidsBonjourForwardingState? state = null, CustomResourceOptions? options = null)
        {
            return new WirelessSsidsBonjourForwarding(name, id, state, options);
        }
    }

    public sealed class WirelessSsidsBonjourForwardingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, Bonjour forwarding is enabled on the SSID.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Bonjour forwarding exception
        /// </summary>
        [Input("exception")]
        public Input<Inputs.WirelessSsidsBonjourForwardingExceptionArgs>? Exception { get; set; }

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

        [Input("rules")]
        private InputList<Inputs.WirelessSsidsBonjourForwardingRuleArgs>? _rules;

        /// <summary>
        /// Bonjour forwarding rules
        /// </summary>
        public InputList<Inputs.WirelessSsidsBonjourForwardingRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.WirelessSsidsBonjourForwardingRuleArgs>());
            set => _rules = value;
        }

        public WirelessSsidsBonjourForwardingArgs()
        {
        }
        public static new WirelessSsidsBonjourForwardingArgs Empty => new WirelessSsidsBonjourForwardingArgs();
    }

    public sealed class WirelessSsidsBonjourForwardingState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, Bonjour forwarding is enabled on the SSID.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Bonjour forwarding exception
        /// </summary>
        [Input("exception")]
        public Input<Inputs.WirelessSsidsBonjourForwardingExceptionGetArgs>? Exception { get; set; }

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

        [Input("rules")]
        private InputList<Inputs.WirelessSsidsBonjourForwardingRuleGetArgs>? _rules;

        /// <summary>
        /// Bonjour forwarding rules
        /// </summary>
        public InputList<Inputs.WirelessSsidsBonjourForwardingRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.WirelessSsidsBonjourForwardingRuleGetArgs>());
            set => _rules = value;
        }

        public WirelessSsidsBonjourForwardingState()
        {
        }
        public static new WirelessSsidsBonjourForwardingState Empty => new WirelessSsidsBonjourForwardingState();
    }
}