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
    /// $ pulumi import meraki:networks/applianceTrafficShapingUplinkSelection:ApplianceTrafficShapingUplinkSelection example "network_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/applianceTrafficShapingUplinkSelection:ApplianceTrafficShapingUplinkSelection")]
    public partial class ApplianceTrafficShapingUplinkSelection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether active-active AutoVPN is enabled
        /// </summary>
        [Output("activeActiveAutoVpnEnabled")]
        public Output<bool> ActiveActiveAutoVpnEnabled { get; private set; } = null!;

        /// <summary>
        /// The default uplink. Must be one of: 'wan1' or 'wan2'
        /// </summary>
        [Output("defaultUplink")]
        public Output<string> DefaultUplink { get; private set; } = null!;

        /// <summary>
        /// WAN failover and failback
        /// </summary>
        [Output("failoverAndFailback")]
        public Output<Outputs.ApplianceTrafficShapingUplinkSelectionFailoverAndFailback> FailoverAndFailback { get; private set; } = null!;

        /// <summary>
        /// Whether load balancing is enabled
        /// </summary>
        [Output("loadBalancingEnabled")]
        public Output<bool> LoadBalancingEnabled { get; private set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;

        /// <summary>
        /// Uplink preference rules for VPN traffic
        /// </summary>
        [Output("vpnTrafficUplinkPreferences")]
        public Output<ImmutableArray<Outputs.ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreference>> VpnTrafficUplinkPreferences { get; private set; } = null!;

        /// <summary>
        /// Uplink preference rules for WAN traffic
        /// </summary>
        [Output("wanTrafficUplinkPreferences")]
        public Output<ImmutableArray<Outputs.ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreference>> WanTrafficUplinkPreferences { get; private set; } = null!;


        /// <summary>
        /// Create a ApplianceTrafficShapingUplinkSelection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApplianceTrafficShapingUplinkSelection(string name, ApplianceTrafficShapingUplinkSelectionArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/applianceTrafficShapingUplinkSelection:ApplianceTrafficShapingUplinkSelection", name, args ?? new ApplianceTrafficShapingUplinkSelectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApplianceTrafficShapingUplinkSelection(string name, Input<string> id, ApplianceTrafficShapingUplinkSelectionState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/applianceTrafficShapingUplinkSelection:ApplianceTrafficShapingUplinkSelection", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ApplianceTrafficShapingUplinkSelection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApplianceTrafficShapingUplinkSelection Get(string name, Input<string> id, ApplianceTrafficShapingUplinkSelectionState? state = null, CustomResourceOptions? options = null)
        {
            return new ApplianceTrafficShapingUplinkSelection(name, id, state, options);
        }
    }

    public sealed class ApplianceTrafficShapingUplinkSelectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether active-active AutoVPN is enabled
        /// </summary>
        [Input("activeActiveAutoVpnEnabled")]
        public Input<bool>? ActiveActiveAutoVpnEnabled { get; set; }

        /// <summary>
        /// The default uplink. Must be one of: 'wan1' or 'wan2'
        /// </summary>
        [Input("defaultUplink")]
        public Input<string>? DefaultUplink { get; set; }

        /// <summary>
        /// WAN failover and failback
        /// </summary>
        [Input("failoverAndFailback")]
        public Input<Inputs.ApplianceTrafficShapingUplinkSelectionFailoverAndFailbackArgs>? FailoverAndFailback { get; set; }

        /// <summary>
        /// Whether load balancing is enabled
        /// </summary>
        [Input("loadBalancingEnabled")]
        public Input<bool>? LoadBalancingEnabled { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        [Input("vpnTrafficUplinkPreferences")]
        private InputList<Inputs.ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceArgs>? _vpnTrafficUplinkPreferences;

        /// <summary>
        /// Uplink preference rules for VPN traffic
        /// </summary>
        public InputList<Inputs.ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceArgs> VpnTrafficUplinkPreferences
        {
            get => _vpnTrafficUplinkPreferences ?? (_vpnTrafficUplinkPreferences = new InputList<Inputs.ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceArgs>());
            set => _vpnTrafficUplinkPreferences = value;
        }

        [Input("wanTrafficUplinkPreferences")]
        private InputList<Inputs.ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceArgs>? _wanTrafficUplinkPreferences;

        /// <summary>
        /// Uplink preference rules for WAN traffic
        /// </summary>
        public InputList<Inputs.ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceArgs> WanTrafficUplinkPreferences
        {
            get => _wanTrafficUplinkPreferences ?? (_wanTrafficUplinkPreferences = new InputList<Inputs.ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceArgs>());
            set => _wanTrafficUplinkPreferences = value;
        }

        public ApplianceTrafficShapingUplinkSelectionArgs()
        {
        }
        public static new ApplianceTrafficShapingUplinkSelectionArgs Empty => new ApplianceTrafficShapingUplinkSelectionArgs();
    }

    public sealed class ApplianceTrafficShapingUplinkSelectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether active-active AutoVPN is enabled
        /// </summary>
        [Input("activeActiveAutoVpnEnabled")]
        public Input<bool>? ActiveActiveAutoVpnEnabled { get; set; }

        /// <summary>
        /// The default uplink. Must be one of: 'wan1' or 'wan2'
        /// </summary>
        [Input("defaultUplink")]
        public Input<string>? DefaultUplink { get; set; }

        /// <summary>
        /// WAN failover and failback
        /// </summary>
        [Input("failoverAndFailback")]
        public Input<Inputs.ApplianceTrafficShapingUplinkSelectionFailoverAndFailbackGetArgs>? FailoverAndFailback { get; set; }

        /// <summary>
        /// Whether load balancing is enabled
        /// </summary>
        [Input("loadBalancingEnabled")]
        public Input<bool>? LoadBalancingEnabled { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        [Input("vpnTrafficUplinkPreferences")]
        private InputList<Inputs.ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceGetArgs>? _vpnTrafficUplinkPreferences;

        /// <summary>
        /// Uplink preference rules for VPN traffic
        /// </summary>
        public InputList<Inputs.ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceGetArgs> VpnTrafficUplinkPreferences
        {
            get => _vpnTrafficUplinkPreferences ?? (_vpnTrafficUplinkPreferences = new InputList<Inputs.ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceGetArgs>());
            set => _vpnTrafficUplinkPreferences = value;
        }

        [Input("wanTrafficUplinkPreferences")]
        private InputList<Inputs.ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceGetArgs>? _wanTrafficUplinkPreferences;

        /// <summary>
        /// Uplink preference rules for WAN traffic
        /// </summary>
        public InputList<Inputs.ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceGetArgs> WanTrafficUplinkPreferences
        {
            get => _wanTrafficUplinkPreferences ?? (_wanTrafficUplinkPreferences = new InputList<Inputs.ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceGetArgs>());
            set => _wanTrafficUplinkPreferences = value;
        }

        public ApplianceTrafficShapingUplinkSelectionState()
        {
        }
        public static new ApplianceTrafficShapingUplinkSelectionState Empty => new ApplianceTrafficShapingUplinkSelectionState();
    }
}
