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
    ///     var example = new Meraki.Networks.Settings("example", new()
    ///     {
    ///         LocalStatusPage = new Meraki.Networks.Inputs.SettingsLocalStatusPageArgs
    ///         {
    ///             Authentication = new Meraki.Networks.Inputs.SettingsLocalStatusPageAuthenticationArgs
    ///             {
    ///                 Enabled = false,
    ///                 Password = "miles123",
    ///             },
    ///         },
    ///         LocalStatusPageEnabled = true,
    ///         NamedVlans = new Meraki.Networks.Inputs.SettingsNamedVlansArgs
    ///         {
    ///             Enabled = true,
    ///         },
    ///         NetworkId = "string",
    ///         RemoteStatusPageEnabled = true,
    ///         SecurePort = new Meraki.Networks.Inputs.SettingsSecurePortArgs
    ///         {
    ///             Enabled = false,
    ///         },
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiNetworksSettingsExample"] = example,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:networks/settings:Settings example "network_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/settings:Settings")]
    public partial class Settings : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A hash of FIPS options applied to the Network
        /// </summary>
        [Output("fips")]
        public Output<Outputs.SettingsFips> Fips { get; private set; } = null!;

        /// <summary>
        /// A hash of Local Status page(s)' authentication options applied to the Network.
        /// </summary>
        [Output("localStatusPage")]
        public Output<Outputs.SettingsLocalStatusPage> LocalStatusPage { get; private set; } = null!;

        /// <summary>
        /// Enables / disables the local device status pages (\n\nmy.meraki.com, \n\n\n\nap.meraki.com, \n\n\n\nswitch.meraki.com, \n\n\n\nwired.meraki.com\n\n). Optional (defaults to false)
        /// </summary>
        [Output("localStatusPageEnabled")]
        public Output<bool> LocalStatusPageEnabled { get; private set; } = null!;

        /// <summary>
        /// A hash of Named VLANs options applied to the Network.
        /// </summary>
        [Output("namedVlans")]
        public Output<Outputs.SettingsNamedVlans> NamedVlans { get; private set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;

        /// <summary>
        /// Enables / disables access to the device status page (\n\nhttp://[device's LAN IP])\n\n. Optional. Can only be set if localStatusPageEnabled is set to true
        /// </summary>
        [Output("remoteStatusPageEnabled")]
        public Output<bool> RemoteStatusPageEnabled { get; private set; } = null!;

        /// <summary>
        /// A hash of SecureConnect options applied to the Network.
        /// </summary>
        [Output("securePort")]
        public Output<Outputs.SettingsSecurePort> SecurePort { get; private set; } = null!;


        /// <summary>
        /// Create a Settings resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Settings(string name, SettingsArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/settings:Settings", name, args ?? new SettingsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Settings(string name, Input<string> id, SettingsState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/settings:Settings", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Settings resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Settings Get(string name, Input<string> id, SettingsState? state = null, CustomResourceOptions? options = null)
        {
            return new Settings(name, id, state, options);
        }
    }

    public sealed class SettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A hash of Local Status page(s)' authentication options applied to the Network.
        /// </summary>
        [Input("localStatusPage")]
        public Input<Inputs.SettingsLocalStatusPageArgs>? LocalStatusPage { get; set; }

        /// <summary>
        /// Enables / disables the local device status pages (\n\nmy.meraki.com, \n\n\n\nap.meraki.com, \n\n\n\nswitch.meraki.com, \n\n\n\nwired.meraki.com\n\n). Optional (defaults to false)
        /// </summary>
        [Input("localStatusPageEnabled")]
        public Input<bool>? LocalStatusPageEnabled { get; set; }

        /// <summary>
        /// A hash of Named VLANs options applied to the Network.
        /// </summary>
        [Input("namedVlans")]
        public Input<Inputs.SettingsNamedVlansArgs>? NamedVlans { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        /// <summary>
        /// Enables / disables access to the device status page (\n\nhttp://[device's LAN IP])\n\n. Optional. Can only be set if localStatusPageEnabled is set to true
        /// </summary>
        [Input("remoteStatusPageEnabled")]
        public Input<bool>? RemoteStatusPageEnabled { get; set; }

        /// <summary>
        /// A hash of SecureConnect options applied to the Network.
        /// </summary>
        [Input("securePort")]
        public Input<Inputs.SettingsSecurePortArgs>? SecurePort { get; set; }

        public SettingsArgs()
        {
        }
        public static new SettingsArgs Empty => new SettingsArgs();
    }

    public sealed class SettingsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A hash of FIPS options applied to the Network
        /// </summary>
        [Input("fips")]
        public Input<Inputs.SettingsFipsGetArgs>? Fips { get; set; }

        /// <summary>
        /// A hash of Local Status page(s)' authentication options applied to the Network.
        /// </summary>
        [Input("localStatusPage")]
        public Input<Inputs.SettingsLocalStatusPageGetArgs>? LocalStatusPage { get; set; }

        /// <summary>
        /// Enables / disables the local device status pages (\n\nmy.meraki.com, \n\n\n\nap.meraki.com, \n\n\n\nswitch.meraki.com, \n\n\n\nwired.meraki.com\n\n). Optional (defaults to false)
        /// </summary>
        [Input("localStatusPageEnabled")]
        public Input<bool>? LocalStatusPageEnabled { get; set; }

        /// <summary>
        /// A hash of Named VLANs options applied to the Network.
        /// </summary>
        [Input("namedVlans")]
        public Input<Inputs.SettingsNamedVlansGetArgs>? NamedVlans { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// Enables / disables access to the device status page (\n\nhttp://[device's LAN IP])\n\n. Optional. Can only be set if localStatusPageEnabled is set to true
        /// </summary>
        [Input("remoteStatusPageEnabled")]
        public Input<bool>? RemoteStatusPageEnabled { get; set; }

        /// <summary>
        /// A hash of SecureConnect options applied to the Network.
        /// </summary>
        [Input("securePort")]
        public Input<Inputs.SettingsSecurePortGetArgs>? SecurePort { get; set; }

        public SettingsState()
        {
        }
        public static new SettingsState Empty => new SettingsState();
    }
}
