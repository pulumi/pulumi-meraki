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
    ///     var example = new Meraki.Networks.WirelessBluetoothSettings("example", new()
    ///     {
    ///         AdvertisingEnabled = true,
    ///         Major = 1,
    ///         MajorMinorAssignmentMode = "Non-unique",
    ///         Minor = 1,
    ///         NetworkId = "string",
    ///         ScanningEnabled = true,
    ///         Uuid = "00000000-0000-0000-000-000000000000",
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiNetworksWirelessBluetoothSettingsExample"] = example,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:networks/wirelessBluetoothSettings:WirelessBluetoothSettings example "network_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/wirelessBluetoothSettings:WirelessBluetoothSettings")]
    public partial class WirelessBluetoothSettings : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether APs will advertise beacons.
        /// </summary>
        [Output("advertisingEnabled")]
        public Output<bool> AdvertisingEnabled { get; private set; } = null!;

        /// <summary>
        /// Whether ESL is enabled on this network.
        /// </summary>
        [Output("eslEnabled")]
        public Output<bool> EslEnabled { get; private set; } = null!;

        /// <summary>
        /// The major number to be used in the beacon identifier. Only valid in 'Non-unique' mode.
        /// </summary>
        [Output("major")]
        public Output<int> Major { get; private set; } = null!;

        /// <summary>
        /// The way major and minor number should be assigned to nodes in the network. ('Unique', 'Non-unique')
        /// </summary>
        [Output("majorMinorAssignmentMode")]
        public Output<string> MajorMinorAssignmentMode { get; private set; } = null!;

        /// <summary>
        /// The minor number to be used in the beacon identifier. Only valid in 'Non-unique' mode.
        /// </summary>
        [Output("minor")]
        public Output<int> Minor { get; private set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;

        /// <summary>
        /// Whether APs will scan for Bluetooth enabled clients.
        /// </summary>
        [Output("scanningEnabled")]
        public Output<bool> ScanningEnabled { get; private set; } = null!;

        /// <summary>
        /// The UUID to be used in the beacon identifier.
        /// </summary>
        [Output("uuid")]
        public Output<string> Uuid { get; private set; } = null!;


        /// <summary>
        /// Create a WirelessBluetoothSettings resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WirelessBluetoothSettings(string name, WirelessBluetoothSettingsArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/wirelessBluetoothSettings:WirelessBluetoothSettings", name, args ?? new WirelessBluetoothSettingsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WirelessBluetoothSettings(string name, Input<string> id, WirelessBluetoothSettingsState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/wirelessBluetoothSettings:WirelessBluetoothSettings", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WirelessBluetoothSettings resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WirelessBluetoothSettings Get(string name, Input<string> id, WirelessBluetoothSettingsState? state = null, CustomResourceOptions? options = null)
        {
            return new WirelessBluetoothSettings(name, id, state, options);
        }
    }

    public sealed class WirelessBluetoothSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether APs will advertise beacons.
        /// </summary>
        [Input("advertisingEnabled")]
        public Input<bool>? AdvertisingEnabled { get; set; }

        /// <summary>
        /// The major number to be used in the beacon identifier. Only valid in 'Non-unique' mode.
        /// </summary>
        [Input("major")]
        public Input<int>? Major { get; set; }

        /// <summary>
        /// The way major and minor number should be assigned to nodes in the network. ('Unique', 'Non-unique')
        /// </summary>
        [Input("majorMinorAssignmentMode")]
        public Input<string>? MajorMinorAssignmentMode { get; set; }

        /// <summary>
        /// The minor number to be used in the beacon identifier. Only valid in 'Non-unique' mode.
        /// </summary>
        [Input("minor")]
        public Input<int>? Minor { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        /// <summary>
        /// Whether APs will scan for Bluetooth enabled clients.
        /// </summary>
        [Input("scanningEnabled")]
        public Input<bool>? ScanningEnabled { get; set; }

        /// <summary>
        /// The UUID to be used in the beacon identifier.
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public WirelessBluetoothSettingsArgs()
        {
        }
        public static new WirelessBluetoothSettingsArgs Empty => new WirelessBluetoothSettingsArgs();
    }

    public sealed class WirelessBluetoothSettingsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether APs will advertise beacons.
        /// </summary>
        [Input("advertisingEnabled")]
        public Input<bool>? AdvertisingEnabled { get; set; }

        /// <summary>
        /// Whether ESL is enabled on this network.
        /// </summary>
        [Input("eslEnabled")]
        public Input<bool>? EslEnabled { get; set; }

        /// <summary>
        /// The major number to be used in the beacon identifier. Only valid in 'Non-unique' mode.
        /// </summary>
        [Input("major")]
        public Input<int>? Major { get; set; }

        /// <summary>
        /// The way major and minor number should be assigned to nodes in the network. ('Unique', 'Non-unique')
        /// </summary>
        [Input("majorMinorAssignmentMode")]
        public Input<string>? MajorMinorAssignmentMode { get; set; }

        /// <summary>
        /// The minor number to be used in the beacon identifier. Only valid in 'Non-unique' mode.
        /// </summary>
        [Input("minor")]
        public Input<int>? Minor { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// Whether APs will scan for Bluetooth enabled clients.
        /// </summary>
        [Input("scanningEnabled")]
        public Input<bool>? ScanningEnabled { get; set; }

        /// <summary>
        /// The UUID to be used in the beacon identifier.
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public WirelessBluetoothSettingsState()
        {
        }
        public static new WirelessBluetoothSettingsState Empty => new WirelessBluetoothSettingsState();
    }
}
