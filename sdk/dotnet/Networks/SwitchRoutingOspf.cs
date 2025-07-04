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
    /// $ pulumi import meraki:networks/switchRoutingOspf:SwitchRoutingOspf example "network_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/switchRoutingOspf:SwitchRoutingOspf")]
    public partial class SwitchRoutingOspf : global::Pulumi.CustomResource
    {
        /// <summary>
        /// OSPF areas
        /// </summary>
        [Output("areas")]
        public Output<ImmutableArray<Outputs.SwitchRoutingOspfArea>> Areas { get; private set; } = null!;

        /// <summary>
        /// Time interval to determine when the peer will be declared inactive/dead. Value must be between 1 and 65535
        /// </summary>
        [Output("deadTimerInSeconds")]
        public Output<int> DeadTimerInSeconds { get; private set; } = null!;

        /// <summary>
        /// Boolean value to enable or disable OSPF routing. OSPF routing is disabled by default.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// Time interval in seconds at which hello packet will be sent to OSPF neighbors to maintain connectivity. Value must be between 1 and 255. Default is 10 seconds.
        /// </summary>
        [Output("helloTimerInSeconds")]
        public Output<int> HelloTimerInSeconds { get; private set; } = null!;

        /// <summary>
        /// Boolean value to enable or disable MD5 authentication. MD5 authentication is disabled by default.
        /// </summary>
        [Output("md5AuthenticationEnabled")]
        public Output<bool> Md5AuthenticationEnabled { get; private set; } = null!;

        /// <summary>
        /// MD5 authentication credentials. This param is only relevant if md5AuthenticationEnabled is true
        /// </summary>
        [Output("md5AuthenticationKey")]
        public Output<Outputs.SwitchRoutingOspfMd5AuthenticationKey> Md5AuthenticationKey { get; private set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;

        /// <summary>
        /// OSPF v3 configuration
        /// </summary>
        [Output("v3")]
        public Output<Outputs.SwitchRoutingOspfV3> V3 { get; private set; } = null!;


        /// <summary>
        /// Create a SwitchRoutingOspf resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SwitchRoutingOspf(string name, SwitchRoutingOspfArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/switchRoutingOspf:SwitchRoutingOspf", name, args ?? new SwitchRoutingOspfArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SwitchRoutingOspf(string name, Input<string> id, SwitchRoutingOspfState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/switchRoutingOspf:SwitchRoutingOspf", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SwitchRoutingOspf resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SwitchRoutingOspf Get(string name, Input<string> id, SwitchRoutingOspfState? state = null, CustomResourceOptions? options = null)
        {
            return new SwitchRoutingOspf(name, id, state, options);
        }
    }

    public sealed class SwitchRoutingOspfArgs : global::Pulumi.ResourceArgs
    {
        [Input("areas")]
        private InputList<Inputs.SwitchRoutingOspfAreaArgs>? _areas;

        /// <summary>
        /// OSPF areas
        /// </summary>
        public InputList<Inputs.SwitchRoutingOspfAreaArgs> Areas
        {
            get => _areas ?? (_areas = new InputList<Inputs.SwitchRoutingOspfAreaArgs>());
            set => _areas = value;
        }

        /// <summary>
        /// Time interval to determine when the peer will be declared inactive/dead. Value must be between 1 and 65535
        /// </summary>
        [Input("deadTimerInSeconds")]
        public Input<int>? DeadTimerInSeconds { get; set; }

        /// <summary>
        /// Boolean value to enable or disable OSPF routing. OSPF routing is disabled by default.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Time interval in seconds at which hello packet will be sent to OSPF neighbors to maintain connectivity. Value must be between 1 and 255. Default is 10 seconds.
        /// </summary>
        [Input("helloTimerInSeconds")]
        public Input<int>? HelloTimerInSeconds { get; set; }

        /// <summary>
        /// Boolean value to enable or disable MD5 authentication. MD5 authentication is disabled by default.
        /// </summary>
        [Input("md5AuthenticationEnabled")]
        public Input<bool>? Md5AuthenticationEnabled { get; set; }

        /// <summary>
        /// MD5 authentication credentials. This param is only relevant if md5AuthenticationEnabled is true
        /// </summary>
        [Input("md5AuthenticationKey")]
        public Input<Inputs.SwitchRoutingOspfMd5AuthenticationKeyArgs>? Md5AuthenticationKey { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        /// <summary>
        /// OSPF v3 configuration
        /// </summary>
        [Input("v3")]
        public Input<Inputs.SwitchRoutingOspfV3Args>? V3 { get; set; }

        public SwitchRoutingOspfArgs()
        {
        }
        public static new SwitchRoutingOspfArgs Empty => new SwitchRoutingOspfArgs();
    }

    public sealed class SwitchRoutingOspfState : global::Pulumi.ResourceArgs
    {
        [Input("areas")]
        private InputList<Inputs.SwitchRoutingOspfAreaGetArgs>? _areas;

        /// <summary>
        /// OSPF areas
        /// </summary>
        public InputList<Inputs.SwitchRoutingOspfAreaGetArgs> Areas
        {
            get => _areas ?? (_areas = new InputList<Inputs.SwitchRoutingOspfAreaGetArgs>());
            set => _areas = value;
        }

        /// <summary>
        /// Time interval to determine when the peer will be declared inactive/dead. Value must be between 1 and 65535
        /// </summary>
        [Input("deadTimerInSeconds")]
        public Input<int>? DeadTimerInSeconds { get; set; }

        /// <summary>
        /// Boolean value to enable or disable OSPF routing. OSPF routing is disabled by default.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Time interval in seconds at which hello packet will be sent to OSPF neighbors to maintain connectivity. Value must be between 1 and 255. Default is 10 seconds.
        /// </summary>
        [Input("helloTimerInSeconds")]
        public Input<int>? HelloTimerInSeconds { get; set; }

        /// <summary>
        /// Boolean value to enable or disable MD5 authentication. MD5 authentication is disabled by default.
        /// </summary>
        [Input("md5AuthenticationEnabled")]
        public Input<bool>? Md5AuthenticationEnabled { get; set; }

        /// <summary>
        /// MD5 authentication credentials. This param is only relevant if md5AuthenticationEnabled is true
        /// </summary>
        [Input("md5AuthenticationKey")]
        public Input<Inputs.SwitchRoutingOspfMd5AuthenticationKeyGetArgs>? Md5AuthenticationKey { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// OSPF v3 configuration
        /// </summary>
        [Input("v3")]
        public Input<Inputs.SwitchRoutingOspfV3GetArgs>? V3 { get; set; }

        public SwitchRoutingOspfState()
        {
        }
        public static new SwitchRoutingOspfState Empty => new SwitchRoutingOspfState();
    }
}
