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
    /// $ pulumi import meraki:networks/switchStacksRoutingInterfaces:SwitchStacksRoutingInterfaces example "interface_id,network_id,switch_stack_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/switchStacksRoutingInterfaces:SwitchStacksRoutingInterfaces")]
    public partial class SwitchStacksRoutingInterfaces : global::Pulumi.CustomResource
    {
        /// <summary>
        /// IPv4 default gateway
        /// </summary>
        [Output("defaultGateway")]
        public Output<string> DefaultGateway { get; private set; } = null!;

        /// <summary>
        /// IPv4 default gateway
        /// </summary>
        [Output("defaultGatewayResponse")]
        public Output<string> DefaultGatewayResponse { get; private set; } = null!;

        /// <summary>
        /// The id
        /// </summary>
        [Output("interfaceId")]
        public Output<string> InterfaceId { get; private set; } = null!;

        /// <summary>
        /// IPv4 address
        /// </summary>
        [Output("interfaceIp")]
        public Output<string> InterfaceIp { get; private set; } = null!;

        /// <summary>
        /// IPv6 addressing
        /// </summary>
        [Output("ipv6")]
        public Output<Outputs.SwitchStacksRoutingInterfacesIpv6> Ipv6 { get; private set; } = null!;

        /// <summary>
        /// Multicast routing status
        /// </summary>
        [Output("multicastRouting")]
        public Output<string> MulticastRouting { get; private set; } = null!;

        /// <summary>
        /// The name
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;

        /// <summary>
        /// IPv4 OSPF Settings
        /// </summary>
        [Output("ospfSettings")]
        public Output<Outputs.SwitchStacksRoutingInterfacesOspfSettings> OspfSettings { get; private set; } = null!;

        /// <summary>
        /// IPv6 OSPF Settings
        /// </summary>
        [Output("ospfV3")]
        public Output<Outputs.SwitchStacksRoutingInterfacesOspfV3> OspfV3 { get; private set; } = null!;

        /// <summary>
        /// IPv4 subnet
        /// </summary>
        [Output("subnet")]
        public Output<string> Subnet { get; private set; } = null!;

        /// <summary>
        /// switchStackId path parameter. Switch stack ID
        /// </summary>
        [Output("switchStackId")]
        public Output<string> SwitchStackId { get; private set; } = null!;

        /// <summary>
        /// VLAN id
        /// </summary>
        [Output("vlanId")]
        public Output<int> VlanId { get; private set; } = null!;


        /// <summary>
        /// Create a SwitchStacksRoutingInterfaces resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SwitchStacksRoutingInterfaces(string name, SwitchStacksRoutingInterfacesArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/switchStacksRoutingInterfaces:SwitchStacksRoutingInterfaces", name, args ?? new SwitchStacksRoutingInterfacesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SwitchStacksRoutingInterfaces(string name, Input<string> id, SwitchStacksRoutingInterfacesState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/switchStacksRoutingInterfaces:SwitchStacksRoutingInterfaces", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SwitchStacksRoutingInterfaces resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SwitchStacksRoutingInterfaces Get(string name, Input<string> id, SwitchStacksRoutingInterfacesState? state = null, CustomResourceOptions? options = null)
        {
            return new SwitchStacksRoutingInterfaces(name, id, state, options);
        }
    }

    public sealed class SwitchStacksRoutingInterfacesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IPv4 default gateway
        /// </summary>
        [Input("defaultGateway")]
        public Input<string>? DefaultGateway { get; set; }

        /// <summary>
        /// The id
        /// </summary>
        [Input("interfaceId")]
        public Input<string>? InterfaceId { get; set; }

        /// <summary>
        /// IPv4 address
        /// </summary>
        [Input("interfaceIp")]
        public Input<string>? InterfaceIp { get; set; }

        /// <summary>
        /// IPv6 addressing
        /// </summary>
        [Input("ipv6")]
        public Input<Inputs.SwitchStacksRoutingInterfacesIpv6Args>? Ipv6 { get; set; }

        /// <summary>
        /// Multicast routing status
        /// </summary>
        [Input("multicastRouting")]
        public Input<string>? MulticastRouting { get; set; }

        /// <summary>
        /// The name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        /// <summary>
        /// IPv4 OSPF Settings
        /// </summary>
        [Input("ospfSettings")]
        public Input<Inputs.SwitchStacksRoutingInterfacesOspfSettingsArgs>? OspfSettings { get; set; }

        /// <summary>
        /// IPv4 subnet
        /// </summary>
        [Input("subnet")]
        public Input<string>? Subnet { get; set; }

        /// <summary>
        /// switchStackId path parameter. Switch stack ID
        /// </summary>
        [Input("switchStackId", required: true)]
        public Input<string> SwitchStackId { get; set; } = null!;

        /// <summary>
        /// VLAN id
        /// </summary>
        [Input("vlanId")]
        public Input<int>? VlanId { get; set; }

        public SwitchStacksRoutingInterfacesArgs()
        {
        }
        public static new SwitchStacksRoutingInterfacesArgs Empty => new SwitchStacksRoutingInterfacesArgs();
    }

    public sealed class SwitchStacksRoutingInterfacesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IPv4 default gateway
        /// </summary>
        [Input("defaultGateway")]
        public Input<string>? DefaultGateway { get; set; }

        /// <summary>
        /// IPv4 default gateway
        /// </summary>
        [Input("defaultGatewayResponse")]
        public Input<string>? DefaultGatewayResponse { get; set; }

        /// <summary>
        /// The id
        /// </summary>
        [Input("interfaceId")]
        public Input<string>? InterfaceId { get; set; }

        /// <summary>
        /// IPv4 address
        /// </summary>
        [Input("interfaceIp")]
        public Input<string>? InterfaceIp { get; set; }

        /// <summary>
        /// IPv6 addressing
        /// </summary>
        [Input("ipv6")]
        public Input<Inputs.SwitchStacksRoutingInterfacesIpv6GetArgs>? Ipv6 { get; set; }

        /// <summary>
        /// Multicast routing status
        /// </summary>
        [Input("multicastRouting")]
        public Input<string>? MulticastRouting { get; set; }

        /// <summary>
        /// The name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// IPv4 OSPF Settings
        /// </summary>
        [Input("ospfSettings")]
        public Input<Inputs.SwitchStacksRoutingInterfacesOspfSettingsGetArgs>? OspfSettings { get; set; }

        /// <summary>
        /// IPv6 OSPF Settings
        /// </summary>
        [Input("ospfV3")]
        public Input<Inputs.SwitchStacksRoutingInterfacesOspfV3GetArgs>? OspfV3 { get; set; }

        /// <summary>
        /// IPv4 subnet
        /// </summary>
        [Input("subnet")]
        public Input<string>? Subnet { get; set; }

        /// <summary>
        /// switchStackId path parameter. Switch stack ID
        /// </summary>
        [Input("switchStackId")]
        public Input<string>? SwitchStackId { get; set; }

        /// <summary>
        /// VLAN id
        /// </summary>
        [Input("vlanId")]
        public Input<int>? VlanId { get; set; }

        public SwitchStacksRoutingInterfacesState()
        {
        }
        public static new SwitchStacksRoutingInterfacesState Empty => new SwitchStacksRoutingInterfacesState();
    }
}
