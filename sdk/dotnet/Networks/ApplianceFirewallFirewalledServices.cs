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
    ///     var example = new Meraki.Networks.ApplianceFirewallFirewalledServices("example", new()
    ///     {
    ///         Access = "restricted",
    ///         AllowedIps = new[]
    ///         {
    ///             "123.123.123.1",
    ///         },
    ///         NetworkId = "string",
    ///         Service = "string",
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiNetworksApplianceFirewallFirewalledServicesExample"] = example,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:networks/applianceFirewallFirewalledServices:ApplianceFirewallFirewalledServices example "network_id,service"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/applianceFirewallFirewalledServices:ApplianceFirewallFirewalledServices")]
    public partial class ApplianceFirewallFirewalledServices : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A string indicating the rule for which IPs are allowed to use the specified service
        /// </summary>
        [Output("access")]
        public Output<string> Access { get; private set; } = null!;

        /// <summary>
        /// An array of allowed IPs that can access the service
        /// </summary>
        [Output("allowedIps")]
        public Output<ImmutableArray<string>> AllowedIps { get; private set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;

        /// <summary>
        /// Appliance service name
        /// </summary>
        [Output("service")]
        public Output<string> Service { get; private set; } = null!;


        /// <summary>
        /// Create a ApplianceFirewallFirewalledServices resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApplianceFirewallFirewalledServices(string name, ApplianceFirewallFirewalledServicesArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/applianceFirewallFirewalledServices:ApplianceFirewallFirewalledServices", name, args ?? new ApplianceFirewallFirewalledServicesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApplianceFirewallFirewalledServices(string name, Input<string> id, ApplianceFirewallFirewalledServicesState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/applianceFirewallFirewalledServices:ApplianceFirewallFirewalledServices", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ApplianceFirewallFirewalledServices resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApplianceFirewallFirewalledServices Get(string name, Input<string> id, ApplianceFirewallFirewalledServicesState? state = null, CustomResourceOptions? options = null)
        {
            return new ApplianceFirewallFirewalledServices(name, id, state, options);
        }
    }

    public sealed class ApplianceFirewallFirewalledServicesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A string indicating the rule for which IPs are allowed to use the specified service
        /// </summary>
        [Input("access")]
        public Input<string>? Access { get; set; }

        [Input("allowedIps")]
        private InputList<string>? _allowedIps;

        /// <summary>
        /// An array of allowed IPs that can access the service
        /// </summary>
        public InputList<string> AllowedIps
        {
            get => _allowedIps ?? (_allowedIps = new InputList<string>());
            set => _allowedIps = value;
        }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        /// <summary>
        /// Appliance service name
        /// </summary>
        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        public ApplianceFirewallFirewalledServicesArgs()
        {
        }
        public static new ApplianceFirewallFirewalledServicesArgs Empty => new ApplianceFirewallFirewalledServicesArgs();
    }

    public sealed class ApplianceFirewallFirewalledServicesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A string indicating the rule for which IPs are allowed to use the specified service
        /// </summary>
        [Input("access")]
        public Input<string>? Access { get; set; }

        [Input("allowedIps")]
        private InputList<string>? _allowedIps;

        /// <summary>
        /// An array of allowed IPs that can access the service
        /// </summary>
        public InputList<string> AllowedIps
        {
            get => _allowedIps ?? (_allowedIps = new InputList<string>());
            set => _allowedIps = value;
        }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// Appliance service name
        /// </summary>
        [Input("service")]
        public Input<string>? Service { get; set; }

        public ApplianceFirewallFirewalledServicesState()
        {
        }
        public static new ApplianceFirewallFirewalledServicesState Empty => new ApplianceFirewallFirewalledServicesState();
    }
}