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
    ///     var example = new Meraki.Networks.ApplianceSsids("example", new()
    ///     {
    ///         AuthMode = "8021x-radius",
    ///         DefaultVlanId = 1,
    ///         DhcpEnforcedDeauthentication = new Meraki.Networks.Inputs.ApplianceSsidsDhcpEnforcedDeauthenticationArgs
    ///         {
    ///             Enabled = true,
    ///         },
    ///         Dot11w = new Meraki.Networks.Inputs.ApplianceSsidsDot11wArgs
    ///         {
    ///             Enabled = true,
    ///             Required = true,
    ///         },
    ///         Enabled = true,
    ///         EncryptionMode = "wpa",
    ///         Name = "My SSID",
    ///         NetworkId = "string",
    ///         Number = "string",
    ///         Psk = "psk",
    ///         RadiusServers = new[]
    ///         {
    ///             new Meraki.Networks.Inputs.ApplianceSsidsRadiusServerArgs
    ///             {
    ///                 Host = "0.0.0.0",
    ///                 Port = 1000,
    ///                 Secret = "secret",
    ///             },
    ///         },
    ///         Visible = true,
    ///         WpaEncryptionMode = "WPA2 only",
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiNetworksApplianceSsidsExample"] = example,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:networks/applianceSsids:ApplianceSsids example "network_id,number"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/applianceSsids:ApplianceSsids")]
    public partial class ApplianceSsids : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The association control method for the SSID.
        /// </summary>
        [Output("authMode")]
        public Output<string> AuthMode { get; private set; } = null!;

        /// <summary>
        /// The VLAN ID of the VLAN associated to this SSID.
        /// </summary>
        [Output("defaultVlanId")]
        public Output<int> DefaultVlanId { get; private set; } = null!;

        /// <summary>
        /// DHCP Enforced Deauthentication enables the disassociation of wireless clients in addition to Mandatory DHCP. This param is only valid on firmware versions &gt;= MX 17.0 where the associated LAN has Mandatory DHCP Enabled
        /// </summary>
        [Output("dhcpEnforcedDeauthentication")]
        public Output<Outputs.ApplianceSsidsDhcpEnforcedDeauthentication> DhcpEnforcedDeauthentication { get; private set; } = null!;

        /// <summary>
        /// The current setting for Protected Management Frames (802.11w).
        /// </summary>
        [Output("dot11w")]
        public Output<Outputs.ApplianceSsidsDot11w> Dot11w { get; private set; } = null!;

        /// <summary>
        /// Whether or not the SSID is enabled.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// The psk encryption mode for the SSID.
        /// </summary>
        [Output("encryptionMode")]
        public Output<string> EncryptionMode { get; private set; } = null!;

        /// <summary>
        /// The name of the SSID.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;

        /// <summary>
        /// The number of the SSID.
        /// </summary>
        [Output("number")]
        public Output<int> Number { get; private set; } = null!;

        /// <summary>
        /// The passkey for the SSID. This param is only valid if the authMode is 'psk'.
        /// </summary>
        [Output("psk")]
        public Output<string> Psk { get; private set; } = null!;

        /// <summary>
        /// The RADIUS 802.1x servers to be used for authentication.
        /// </summary>
        [Output("radiusServers")]
        public Output<ImmutableArray<Outputs.ApplianceSsidsRadiusServer>> RadiusServers { get; private set; } = null!;

        /// <summary>
        /// The RADIUS 802.1x servers to be used for authentication.
        /// </summary>
        [Output("radiusServersResponses")]
        public Output<ImmutableArray<Outputs.ApplianceSsidsRadiusServersResponse>> RadiusServersResponses { get; private set; } = null!;

        /// <summary>
        /// Boolean indicating whether the MX should advertise or hide this SSID.
        /// </summary>
        [Output("visible")]
        public Output<bool> Visible { get; private set; } = null!;

        /// <summary>
        /// WPA encryption mode for the SSID.
        /// </summary>
        [Output("wpaEncryptionMode")]
        public Output<string> WpaEncryptionMode { get; private set; } = null!;


        /// <summary>
        /// Create a ApplianceSsids resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApplianceSsids(string name, ApplianceSsidsArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/applianceSsids:ApplianceSsids", name, args ?? new ApplianceSsidsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApplianceSsids(string name, Input<string> id, ApplianceSsidsState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/applianceSsids:ApplianceSsids", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ApplianceSsids resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApplianceSsids Get(string name, Input<string> id, ApplianceSsidsState? state = null, CustomResourceOptions? options = null)
        {
            return new ApplianceSsids(name, id, state, options);
        }
    }

    public sealed class ApplianceSsidsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The association control method for the SSID.
        /// </summary>
        [Input("authMode")]
        public Input<string>? AuthMode { get; set; }

        /// <summary>
        /// The VLAN ID of the VLAN associated to this SSID.
        /// </summary>
        [Input("defaultVlanId")]
        public Input<int>? DefaultVlanId { get; set; }

        /// <summary>
        /// DHCP Enforced Deauthentication enables the disassociation of wireless clients in addition to Mandatory DHCP. This param is only valid on firmware versions &gt;= MX 17.0 where the associated LAN has Mandatory DHCP Enabled
        /// </summary>
        [Input("dhcpEnforcedDeauthentication")]
        public Input<Inputs.ApplianceSsidsDhcpEnforcedDeauthenticationArgs>? DhcpEnforcedDeauthentication { get; set; }

        /// <summary>
        /// The current setting for Protected Management Frames (802.11w).
        /// </summary>
        [Input("dot11w")]
        public Input<Inputs.ApplianceSsidsDot11wArgs>? Dot11w { get; set; }

        /// <summary>
        /// Whether or not the SSID is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The psk encryption mode for the SSID.
        /// </summary>
        [Input("encryptionMode")]
        public Input<string>? EncryptionMode { get; set; }

        /// <summary>
        /// The name of the SSID.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        /// <summary>
        /// The number of the SSID.
        /// </summary>
        [Input("number", required: true)]
        public Input<int> Number { get; set; } = null!;

        /// <summary>
        /// The passkey for the SSID. This param is only valid if the authMode is 'psk'.
        /// </summary>
        [Input("psk")]
        public Input<string>? Psk { get; set; }

        [Input("radiusServers")]
        private InputList<Inputs.ApplianceSsidsRadiusServerArgs>? _radiusServers;

        /// <summary>
        /// The RADIUS 802.1x servers to be used for authentication.
        /// </summary>
        public InputList<Inputs.ApplianceSsidsRadiusServerArgs> RadiusServers
        {
            get => _radiusServers ?? (_radiusServers = new InputList<Inputs.ApplianceSsidsRadiusServerArgs>());
            set => _radiusServers = value;
        }

        /// <summary>
        /// Boolean indicating whether the MX should advertise or hide this SSID.
        /// </summary>
        [Input("visible")]
        public Input<bool>? Visible { get; set; }

        /// <summary>
        /// WPA encryption mode for the SSID.
        /// </summary>
        [Input("wpaEncryptionMode")]
        public Input<string>? WpaEncryptionMode { get; set; }

        public ApplianceSsidsArgs()
        {
        }
        public static new ApplianceSsidsArgs Empty => new ApplianceSsidsArgs();
    }

    public sealed class ApplianceSsidsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The association control method for the SSID.
        /// </summary>
        [Input("authMode")]
        public Input<string>? AuthMode { get; set; }

        /// <summary>
        /// The VLAN ID of the VLAN associated to this SSID.
        /// </summary>
        [Input("defaultVlanId")]
        public Input<int>? DefaultVlanId { get; set; }

        /// <summary>
        /// DHCP Enforced Deauthentication enables the disassociation of wireless clients in addition to Mandatory DHCP. This param is only valid on firmware versions &gt;= MX 17.0 where the associated LAN has Mandatory DHCP Enabled
        /// </summary>
        [Input("dhcpEnforcedDeauthentication")]
        public Input<Inputs.ApplianceSsidsDhcpEnforcedDeauthenticationGetArgs>? DhcpEnforcedDeauthentication { get; set; }

        /// <summary>
        /// The current setting for Protected Management Frames (802.11w).
        /// </summary>
        [Input("dot11w")]
        public Input<Inputs.ApplianceSsidsDot11wGetArgs>? Dot11w { get; set; }

        /// <summary>
        /// Whether or not the SSID is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The psk encryption mode for the SSID.
        /// </summary>
        [Input("encryptionMode")]
        public Input<string>? EncryptionMode { get; set; }

        /// <summary>
        /// The name of the SSID.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// The number of the SSID.
        /// </summary>
        [Input("number")]
        public Input<int>? Number { get; set; }

        /// <summary>
        /// The passkey for the SSID. This param is only valid if the authMode is 'psk'.
        /// </summary>
        [Input("psk")]
        public Input<string>? Psk { get; set; }

        [Input("radiusServers")]
        private InputList<Inputs.ApplianceSsidsRadiusServerGetArgs>? _radiusServers;

        /// <summary>
        /// The RADIUS 802.1x servers to be used for authentication.
        /// </summary>
        public InputList<Inputs.ApplianceSsidsRadiusServerGetArgs> RadiusServers
        {
            get => _radiusServers ?? (_radiusServers = new InputList<Inputs.ApplianceSsidsRadiusServerGetArgs>());
            set => _radiusServers = value;
        }

        [Input("radiusServersResponses")]
        private InputList<Inputs.ApplianceSsidsRadiusServersResponseGetArgs>? _radiusServersResponses;

        /// <summary>
        /// The RADIUS 802.1x servers to be used for authentication.
        /// </summary>
        public InputList<Inputs.ApplianceSsidsRadiusServersResponseGetArgs> RadiusServersResponses
        {
            get => _radiusServersResponses ?? (_radiusServersResponses = new InputList<Inputs.ApplianceSsidsRadiusServersResponseGetArgs>());
            set => _radiusServersResponses = value;
        }

        /// <summary>
        /// Boolean indicating whether the MX should advertise or hide this SSID.
        /// </summary>
        [Input("visible")]
        public Input<bool>? Visible { get; set; }

        /// <summary>
        /// WPA encryption mode for the SSID.
        /// </summary>
        [Input("wpaEncryptionMode")]
        public Input<string>? WpaEncryptionMode { get; set; }

        public ApplianceSsidsState()
        {
        }
        public static new ApplianceSsidsState Empty => new ApplianceSsidsState();
    }
}
