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
    /// $ pulumi import meraki:networks/alertsSettings:AlertsSettings example "network_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/alertsSettings:AlertsSettings")]
    public partial class AlertsSettings : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
        /// </summary>
        [Output("alerts")]
        public Output<ImmutableArray<Outputs.AlertsSettingsAlert>> Alerts { get; private set; } = null!;

        /// <summary>
        /// Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
        /// </summary>
        [Output("alertsResponses")]
        public Output<ImmutableArray<Outputs.AlertsSettingsAlertsResponse>> AlertsResponses { get; private set; } = null!;

        /// <summary>
        /// The network-wide destinations for all alerts on the network.
        /// </summary>
        [Output("defaultDestinations")]
        public Output<Outputs.AlertsSettingsDefaultDestinations> DefaultDestinations { get; private set; } = null!;

        /// <summary>
        /// muting
        /// </summary>
        [Output("muting")]
        public Output<Outputs.AlertsSettingsMuting> Muting { get; private set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;


        /// <summary>
        /// Create a AlertsSettings resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AlertsSettings(string name, AlertsSettingsArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/alertsSettings:AlertsSettings", name, args ?? new AlertsSettingsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AlertsSettings(string name, Input<string> id, AlertsSettingsState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/alertsSettings:AlertsSettings", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AlertsSettings resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AlertsSettings Get(string name, Input<string> id, AlertsSettingsState? state = null, CustomResourceOptions? options = null)
        {
            return new AlertsSettings(name, id, state, options);
        }
    }

    public sealed class AlertsSettingsArgs : global::Pulumi.ResourceArgs
    {
        [Input("alerts")]
        private InputList<Inputs.AlertsSettingsAlertArgs>? _alerts;

        /// <summary>
        /// Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
        /// </summary>
        public InputList<Inputs.AlertsSettingsAlertArgs> Alerts
        {
            get => _alerts ?? (_alerts = new InputList<Inputs.AlertsSettingsAlertArgs>());
            set => _alerts = value;
        }

        /// <summary>
        /// The network-wide destinations for all alerts on the network.
        /// </summary>
        [Input("defaultDestinations")]
        public Input<Inputs.AlertsSettingsDefaultDestinationsArgs>? DefaultDestinations { get; set; }

        /// <summary>
        /// muting
        /// </summary>
        [Input("muting")]
        public Input<Inputs.AlertsSettingsMutingArgs>? Muting { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public AlertsSettingsArgs()
        {
        }
        public static new AlertsSettingsArgs Empty => new AlertsSettingsArgs();
    }

    public sealed class AlertsSettingsState : global::Pulumi.ResourceArgs
    {
        [Input("alerts")]
        private InputList<Inputs.AlertsSettingsAlertGetArgs>? _alerts;

        /// <summary>
        /// Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
        /// </summary>
        public InputList<Inputs.AlertsSettingsAlertGetArgs> Alerts
        {
            get => _alerts ?? (_alerts = new InputList<Inputs.AlertsSettingsAlertGetArgs>());
            set => _alerts = value;
        }

        [Input("alertsResponses")]
        private InputList<Inputs.AlertsSettingsAlertsResponseGetArgs>? _alertsResponses;

        /// <summary>
        /// Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
        /// </summary>
        public InputList<Inputs.AlertsSettingsAlertsResponseGetArgs> AlertsResponses
        {
            get => _alertsResponses ?? (_alertsResponses = new InputList<Inputs.AlertsSettingsAlertsResponseGetArgs>());
            set => _alertsResponses = value;
        }

        /// <summary>
        /// The network-wide destinations for all alerts on the network.
        /// </summary>
        [Input("defaultDestinations")]
        public Input<Inputs.AlertsSettingsDefaultDestinationsGetArgs>? DefaultDestinations { get; set; }

        /// <summary>
        /// muting
        /// </summary>
        [Input("muting")]
        public Input<Inputs.AlertsSettingsMutingGetArgs>? Muting { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        public AlertsSettingsState()
        {
        }
        public static new AlertsSettingsState Empty => new AlertsSettingsState();
    }
}
