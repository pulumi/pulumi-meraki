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
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Meraki = Pulumi.Meraki;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Meraki.Networks.SwitchDhcpServerPolicyArpInspectionTrustedServers("example", new()
    ///     {
    ///         Ipv4 = new Meraki.Networks.Inputs.SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4Args
    ///         {
    ///             Address = "1.2.3.4",
    ///         },
    ///         Mac = "00:11:22:33:44:55",
    ///         NetworkId = "string",
    ///         Vlan = 100,
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiNetworksSwitchDhcpServerPolicyArpInspectionTrustedServersExample"] = example,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:networks/switchDhcpServerPolicyArpInspectionTrustedServers:SwitchDhcpServerPolicyArpInspectionTrustedServers example "network_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/switchDhcpServerPolicyArpInspectionTrustedServers:SwitchDhcpServerPolicyArpInspectionTrustedServers")]
    public partial class SwitchDhcpServerPolicyArpInspectionTrustedServers : global::Pulumi.CustomResource
    {
        /// <summary>
        /// IPv4 attributes of the trusted server.
        /// </summary>
        [Output("ipv4")]
        public Output<Outputs.SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4> Ipv4 { get; private set; } = null!;

        /// <summary>
        /// Mac address of the trusted server.
        /// </summary>
        [Output("mac")]
        public Output<string> Mac { get; private set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;

        /// <summary>
        /// ID of the trusted server.
        /// </summary>
        [Output("trustedServerId")]
        public Output<string> TrustedServerId { get; private set; } = null!;

        /// <summary>
        /// Vlan ID of the trusted server.
        /// </summary>
        [Output("vlan")]
        public Output<int> Vlan { get; private set; } = null!;


        /// <summary>
        /// Create a SwitchDhcpServerPolicyArpInspectionTrustedServers resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SwitchDhcpServerPolicyArpInspectionTrustedServers(string name, SwitchDhcpServerPolicyArpInspectionTrustedServersArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/switchDhcpServerPolicyArpInspectionTrustedServers:SwitchDhcpServerPolicyArpInspectionTrustedServers", name, args ?? new SwitchDhcpServerPolicyArpInspectionTrustedServersArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SwitchDhcpServerPolicyArpInspectionTrustedServers(string name, Input<string> id, SwitchDhcpServerPolicyArpInspectionTrustedServersState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/switchDhcpServerPolicyArpInspectionTrustedServers:SwitchDhcpServerPolicyArpInspectionTrustedServers", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SwitchDhcpServerPolicyArpInspectionTrustedServers resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SwitchDhcpServerPolicyArpInspectionTrustedServers Get(string name, Input<string> id, SwitchDhcpServerPolicyArpInspectionTrustedServersState? state = null, CustomResourceOptions? options = null)
        {
            return new SwitchDhcpServerPolicyArpInspectionTrustedServers(name, id, state, options);
        }
    }

    public sealed class SwitchDhcpServerPolicyArpInspectionTrustedServersArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IPv4 attributes of the trusted server.
        /// </summary>
        [Input("ipv4")]
        public Input<Inputs.SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4Args>? Ipv4 { get; set; }

        /// <summary>
        /// Mac address of the trusted server.
        /// </summary>
        [Input("mac")]
        public Input<string>? Mac { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        /// <summary>
        /// ID of the trusted server.
        /// </summary>
        [Input("trustedServerId")]
        public Input<string>? TrustedServerId { get; set; }

        /// <summary>
        /// Vlan ID of the trusted server.
        /// </summary>
        [Input("vlan")]
        public Input<int>? Vlan { get; set; }

        public SwitchDhcpServerPolicyArpInspectionTrustedServersArgs()
        {
        }
        public static new SwitchDhcpServerPolicyArpInspectionTrustedServersArgs Empty => new SwitchDhcpServerPolicyArpInspectionTrustedServersArgs();
    }

    public sealed class SwitchDhcpServerPolicyArpInspectionTrustedServersState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IPv4 attributes of the trusted server.
        /// </summary>
        [Input("ipv4")]
        public Input<Inputs.SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4GetArgs>? Ipv4 { get; set; }

        /// <summary>
        /// Mac address of the trusted server.
        /// </summary>
        [Input("mac")]
        public Input<string>? Mac { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// ID of the trusted server.
        /// </summary>
        [Input("trustedServerId")]
        public Input<string>? TrustedServerId { get; set; }

        /// <summary>
        /// Vlan ID of the trusted server.
        /// </summary>
        [Input("vlan")]
        public Input<int>? Vlan { get; set; }

        public SwitchDhcpServerPolicyArpInspectionTrustedServersState()
        {
        }
        public static new SwitchDhcpServerPolicyArpInspectionTrustedServersState Empty => new SwitchDhcpServerPolicyArpInspectionTrustedServersState();
    }
}