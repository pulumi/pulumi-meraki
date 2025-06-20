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
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Meraki = Pulumi.Meraki;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Meraki.Networks.WirelessSsidsIdentityPsks("example", new()
    ///     {
    ///         ExpiresAt = "2018-02-11T00:00:00.090210Z",
    ///         GroupPolicyId = "101",
    ///         Name = "Sample Identity PSK",
    ///         NetworkId = "string",
    ///         Number = "string",
    ///         Passphrase = "secret",
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiNetworksWirelessSsidsIdentityPsksExample"] = example,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:networks/wirelessSsidsIdentityPsks:WirelessSsidsIdentityPsks example "identity_psk_id,network_id,number"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/wirelessSsidsIdentityPsks:WirelessSsidsIdentityPsks")]
    public partial class WirelessSsidsIdentityPsks : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The email associated with the System's Manager User
        /// </summary>
        [Output("email")]
        public Output<string> Email { get; private set; } = null!;

        /// <summary>
        /// Timestamp for when the Identity PSK expires, or 'null' to never expire
        /// </summary>
        [Output("expiresAt")]
        public Output<string> ExpiresAt { get; private set; } = null!;

        /// <summary>
        /// The group policy to be applied to clients
        /// </summary>
        [Output("groupPolicyId")]
        public Output<string> GroupPolicyId { get; private set; } = null!;

        /// <summary>
        /// identityPskId path parameter. Identity psk ID
        /// </summary>
        [Output("identityPskId")]
        public Output<string> IdentityPskId { get; private set; } = null!;

        /// <summary>
        /// The name of the Identity PSK
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

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
        /// The passphrase for client authentication
        /// </summary>
        [Output("passphrase")]
        public Output<string> Passphrase { get; private set; } = null!;

        /// <summary>
        /// The WiFi Personal Network unique identifier
        /// </summary>
        [Output("wifiPersonalNetworkId")]
        public Output<string> WifiPersonalNetworkId { get; private set; } = null!;


        /// <summary>
        /// Create a WirelessSsidsIdentityPsks resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WirelessSsidsIdentityPsks(string name, WirelessSsidsIdentityPsksArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/wirelessSsidsIdentityPsks:WirelessSsidsIdentityPsks", name, args ?? new WirelessSsidsIdentityPsksArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WirelessSsidsIdentityPsks(string name, Input<string> id, WirelessSsidsIdentityPsksState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/wirelessSsidsIdentityPsks:WirelessSsidsIdentityPsks", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WirelessSsidsIdentityPsks resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WirelessSsidsIdentityPsks Get(string name, Input<string> id, WirelessSsidsIdentityPsksState? state = null, CustomResourceOptions? options = null)
        {
            return new WirelessSsidsIdentityPsks(name, id, state, options);
        }
    }

    public sealed class WirelessSsidsIdentityPsksArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Timestamp for when the Identity PSK expires, or 'null' to never expire
        /// </summary>
        [Input("expiresAt")]
        public Input<string>? ExpiresAt { get; set; }

        /// <summary>
        /// The group policy to be applied to clients
        /// </summary>
        [Input("groupPolicyId")]
        public Input<string>? GroupPolicyId { get; set; }

        /// <summary>
        /// identityPskId path parameter. Identity psk ID
        /// </summary>
        [Input("identityPskId")]
        public Input<string>? IdentityPskId { get; set; }

        /// <summary>
        /// The name of the Identity PSK
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

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
        /// The passphrase for client authentication
        /// </summary>
        [Input("passphrase")]
        public Input<string>? Passphrase { get; set; }

        public WirelessSsidsIdentityPsksArgs()
        {
        }
        public static new WirelessSsidsIdentityPsksArgs Empty => new WirelessSsidsIdentityPsksArgs();
    }

    public sealed class WirelessSsidsIdentityPsksState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The email associated with the System's Manager User
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// Timestamp for when the Identity PSK expires, or 'null' to never expire
        /// </summary>
        [Input("expiresAt")]
        public Input<string>? ExpiresAt { get; set; }

        /// <summary>
        /// The group policy to be applied to clients
        /// </summary>
        [Input("groupPolicyId")]
        public Input<string>? GroupPolicyId { get; set; }

        /// <summary>
        /// identityPskId path parameter. Identity psk ID
        /// </summary>
        [Input("identityPskId")]
        public Input<string>? IdentityPskId { get; set; }

        /// <summary>
        /// The name of the Identity PSK
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

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
        /// The passphrase for client authentication
        /// </summary>
        [Input("passphrase")]
        public Input<string>? Passphrase { get; set; }

        /// <summary>
        /// The WiFi Personal Network unique identifier
        /// </summary>
        [Input("wifiPersonalNetworkId")]
        public Input<string>? WifiPersonalNetworkId { get; set; }

        public WirelessSsidsIdentityPsksState()
        {
        }
        public static new WirelessSsidsIdentityPsksState Empty => new WirelessSsidsIdentityPsksState();
    }
}
