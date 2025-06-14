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
    ///     var example = new Meraki.Networks.SwitchDscpToCosMappings("example", new()
    ///     {
    ///         Mappings = new[]
    ///         {
    ///             new Meraki.Networks.Inputs.SwitchDscpToCosMappingsMappingArgs
    ///             {
    ///                 Cos = 1,
    ///                 Dscp = 1,
    ///                 Title = "Video",
    ///             },
    ///         },
    ///         NetworkId = "string",
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiNetworksSwitchDscpToCosMappingsExample"] = example,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:networks/switchDscpToCosMappings:SwitchDscpToCosMappings example "network_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/switchDscpToCosMappings:SwitchDscpToCosMappings")]
    public partial class SwitchDscpToCosMappings : global::Pulumi.CustomResource
    {
        /// <summary>
        /// An array of DSCP to CoS mappings. An empty array will reset the mappings to default.
        /// </summary>
        [Output("mappings")]
        public Output<ImmutableArray<Outputs.SwitchDscpToCosMappingsMapping>> Mappings { get; private set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;


        /// <summary>
        /// Create a SwitchDscpToCosMappings resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SwitchDscpToCosMappings(string name, SwitchDscpToCosMappingsArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/switchDscpToCosMappings:SwitchDscpToCosMappings", name, args ?? new SwitchDscpToCosMappingsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SwitchDscpToCosMappings(string name, Input<string> id, SwitchDscpToCosMappingsState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/switchDscpToCosMappings:SwitchDscpToCosMappings", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SwitchDscpToCosMappings resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SwitchDscpToCosMappings Get(string name, Input<string> id, SwitchDscpToCosMappingsState? state = null, CustomResourceOptions? options = null)
        {
            return new SwitchDscpToCosMappings(name, id, state, options);
        }
    }

    public sealed class SwitchDscpToCosMappingsArgs : global::Pulumi.ResourceArgs
    {
        [Input("mappings")]
        private InputList<Inputs.SwitchDscpToCosMappingsMappingArgs>? _mappings;

        /// <summary>
        /// An array of DSCP to CoS mappings. An empty array will reset the mappings to default.
        /// </summary>
        public InputList<Inputs.SwitchDscpToCosMappingsMappingArgs> Mappings
        {
            get => _mappings ?? (_mappings = new InputList<Inputs.SwitchDscpToCosMappingsMappingArgs>());
            set => _mappings = value;
        }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public SwitchDscpToCosMappingsArgs()
        {
        }
        public static new SwitchDscpToCosMappingsArgs Empty => new SwitchDscpToCosMappingsArgs();
    }

    public sealed class SwitchDscpToCosMappingsState : global::Pulumi.ResourceArgs
    {
        [Input("mappings")]
        private InputList<Inputs.SwitchDscpToCosMappingsMappingGetArgs>? _mappings;

        /// <summary>
        /// An array of DSCP to CoS mappings. An empty array will reset the mappings to default.
        /// </summary>
        public InputList<Inputs.SwitchDscpToCosMappingsMappingGetArgs> Mappings
        {
            get => _mappings ?? (_mappings = new InputList<Inputs.SwitchDscpToCosMappingsMappingGetArgs>());
            set => _mappings = value;
        }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        public SwitchDscpToCosMappingsState()
        {
        }
        public static new SwitchDscpToCosMappingsState Empty => new SwitchDscpToCosMappingsState();
    }
}
