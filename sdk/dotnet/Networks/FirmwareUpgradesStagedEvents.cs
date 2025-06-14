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
    /// $ pulumi import meraki:networks/firmwareUpgradesStagedEvents:FirmwareUpgradesStagedEvents example "network_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/firmwareUpgradesStagedEvents:FirmwareUpgradesStagedEvents")]
    public partial class FirmwareUpgradesStagedEvents : global::Pulumi.CustomResource
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;

        /// <summary>
        /// The network devices to be updated
        /// </summary>
        [Output("products")]
        public Output<Outputs.FirmwareUpgradesStagedEventsProducts> Products { get; private set; } = null!;

        /// <summary>
        /// Reasons for the rollback
        /// </summary>
        [Output("reasons")]
        public Output<ImmutableArray<Outputs.FirmwareUpgradesStagedEventsReason>> Reasons { get; private set; } = null!;

        /// <summary>
        /// The ordered stages in the network
        /// </summary>
        [Output("stages")]
        public Output<ImmutableArray<Outputs.FirmwareUpgradesStagedEventsStage>> Stages { get; private set; } = null!;


        /// <summary>
        /// Create a FirmwareUpgradesStagedEvents resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FirmwareUpgradesStagedEvents(string name, FirmwareUpgradesStagedEventsArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/firmwareUpgradesStagedEvents:FirmwareUpgradesStagedEvents", name, args ?? new FirmwareUpgradesStagedEventsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FirmwareUpgradesStagedEvents(string name, Input<string> id, FirmwareUpgradesStagedEventsState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/firmwareUpgradesStagedEvents:FirmwareUpgradesStagedEvents", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FirmwareUpgradesStagedEvents resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FirmwareUpgradesStagedEvents Get(string name, Input<string> id, FirmwareUpgradesStagedEventsState? state = null, CustomResourceOptions? options = null)
        {
            return new FirmwareUpgradesStagedEvents(name, id, state, options);
        }
    }

    public sealed class FirmwareUpgradesStagedEventsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        /// <summary>
        /// The network devices to be updated
        /// </summary>
        [Input("products")]
        public Input<Inputs.FirmwareUpgradesStagedEventsProductsArgs>? Products { get; set; }

        [Input("stages")]
        private InputList<Inputs.FirmwareUpgradesStagedEventsStageArgs>? _stages;

        /// <summary>
        /// The ordered stages in the network
        /// </summary>
        public InputList<Inputs.FirmwareUpgradesStagedEventsStageArgs> Stages
        {
            get => _stages ?? (_stages = new InputList<Inputs.FirmwareUpgradesStagedEventsStageArgs>());
            set => _stages = value;
        }

        public FirmwareUpgradesStagedEventsArgs()
        {
        }
        public static new FirmwareUpgradesStagedEventsArgs Empty => new FirmwareUpgradesStagedEventsArgs();
    }

    public sealed class FirmwareUpgradesStagedEventsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// The network devices to be updated
        /// </summary>
        [Input("products")]
        public Input<Inputs.FirmwareUpgradesStagedEventsProductsGetArgs>? Products { get; set; }

        [Input("reasons")]
        private InputList<Inputs.FirmwareUpgradesStagedEventsReasonGetArgs>? _reasons;

        /// <summary>
        /// Reasons for the rollback
        /// </summary>
        public InputList<Inputs.FirmwareUpgradesStagedEventsReasonGetArgs> Reasons
        {
            get => _reasons ?? (_reasons = new InputList<Inputs.FirmwareUpgradesStagedEventsReasonGetArgs>());
            set => _reasons = value;
        }

        [Input("stages")]
        private InputList<Inputs.FirmwareUpgradesStagedEventsStageGetArgs>? _stages;

        /// <summary>
        /// The ordered stages in the network
        /// </summary>
        public InputList<Inputs.FirmwareUpgradesStagedEventsStageGetArgs> Stages
        {
            get => _stages ?? (_stages = new InputList<Inputs.FirmwareUpgradesStagedEventsStageGetArgs>());
            set => _stages = value;
        }

        public FirmwareUpgradesStagedEventsState()
        {
        }
        public static new FirmwareUpgradesStagedEventsState Empty => new FirmwareUpgradesStagedEventsState();
    }
}
