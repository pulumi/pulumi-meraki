// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices
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
    ///     var example = new Meraki.Devices.ApplianceUplinksSettings("example", new()
    ///     {
    ///         Interfaces = new Meraki.Devices.Inputs.ApplianceUplinksSettingsInterfacesArgs
    ///         {
    ///             Wan1 = new Meraki.Devices.Inputs.ApplianceUplinksSettingsInterfacesWan1Args
    ///             {
    ///                 Enabled = true,
    ///                 Pppoe = new Meraki.Devices.Inputs.ApplianceUplinksSettingsInterfacesWan1PppoeArgs
    ///                 {
    ///                     Authentication = new Meraki.Devices.Inputs.ApplianceUplinksSettingsInterfacesWan1PppoeAuthenticationArgs
    ///                     {
    ///                         Enabled = true,
    ///                         Password = "password",
    ///                         Username = "username",
    ///                     },
    ///                     Enabled = true,
    ///                 },
    ///                 Svis = new Meraki.Devices.Inputs.ApplianceUplinksSettingsInterfacesWan1SvisArgs
    ///                 {
    ///                     Ipv4 = new Meraki.Devices.Inputs.ApplianceUplinksSettingsInterfacesWan1SvisIpv4Args
    ///                     {
    ///                         Address = "9.10.11.10/16",
    ///                         AssignmentMode = "static",
    ///                         Gateway = "13.14.15.16",
    ///                         Nameservers = new Meraki.Devices.Inputs.ApplianceUplinksSettingsInterfacesWan1SvisIpv4NameserversArgs
    ///                         {
    ///                             Addresses = new[]
    ///                             {
    ///                                 "1.2.3.4",
    ///                             },
    ///                         },
    ///                     },
    ///                     Ipv6 = new Meraki.Devices.Inputs.ApplianceUplinksSettingsInterfacesWan1SvisIpv6Args
    ///                     {
    ///                         Address = "1:2:3::4",
    ///                         AssignmentMode = "static",
    ///                         Gateway = "1:2:3::5",
    ///                         Nameservers = new Meraki.Devices.Inputs.ApplianceUplinksSettingsInterfacesWan1SvisIpv6NameserversArgs
    ///                         {
    ///                             Addresses = new[]
    ///                             {
    ///                                 "1001:4860:4860::8888",
    ///                                 "1001:4860:4860::8844",
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///                 VlanTagging = new Meraki.Devices.Inputs.ApplianceUplinksSettingsInterfacesWan1VlanTaggingArgs
    ///                 {
    ///                     Enabled = true,
    ///                     VlanId = 1,
    ///                 },
    ///             },
    ///             Wan2 = new Meraki.Devices.Inputs.ApplianceUplinksSettingsInterfacesWan2Args
    ///             {
    ///                 Enabled = true,
    ///                 Pppoe = new Meraki.Devices.Inputs.ApplianceUplinksSettingsInterfacesWan2PppoeArgs
    ///                 {
    ///                     Authentication = new Meraki.Devices.Inputs.ApplianceUplinksSettingsInterfacesWan2PppoeAuthenticationArgs
    ///                     {
    ///                         Enabled = true,
    ///                         Password = "password",
    ///                         Username = "username",
    ///                     },
    ///                     Enabled = true,
    ///                 },
    ///                 Svis = new Meraki.Devices.Inputs.ApplianceUplinksSettingsInterfacesWan2SvisArgs
    ///                 {
    ///                     Ipv4 = new Meraki.Devices.Inputs.ApplianceUplinksSettingsInterfacesWan2SvisIpv4Args
    ///                     {
    ///                         Address = "9.10.11.10/16",
    ///                         AssignmentMode = "static",
    ///                         Gateway = "13.14.15.16",
    ///                         Nameservers = new Meraki.Devices.Inputs.ApplianceUplinksSettingsInterfacesWan2SvisIpv4NameserversArgs
    ///                         {
    ///                             Addresses = new[]
    ///                             {
    ///                                 "1.2.3.4",
    ///                             },
    ///                         },
    ///                     },
    ///                     Ipv6 = new Meraki.Devices.Inputs.ApplianceUplinksSettingsInterfacesWan2SvisIpv6Args
    ///                     {
    ///                         Address = "1:2:3::4",
    ///                         AssignmentMode = "static",
    ///                         Gateway = "1:2:3::5",
    ///                         Nameservers = new Meraki.Devices.Inputs.ApplianceUplinksSettingsInterfacesWan2SvisIpv6NameserversArgs
    ///                         {
    ///                             Addresses = new[]
    ///                             {
    ///                                 "1001:4860:4860::8888",
    ///                                 "1001:4860:4860::8844",
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///                 VlanTagging = new Meraki.Devices.Inputs.ApplianceUplinksSettingsInterfacesWan2VlanTaggingArgs
    ///                 {
    ///                     Enabled = true,
    ///                     VlanId = 1,
    ///                 },
    ///             },
    ///         },
    ///         Serial = "string",
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiDevicesApplianceUplinksSettingsExample"] = example,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:devices/applianceUplinksSettings:ApplianceUplinksSettings example "serial"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:devices/applianceUplinksSettings:ApplianceUplinksSettings")]
    public partial class ApplianceUplinksSettings : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Interface settings.
        /// </summary>
        [Output("interfaces")]
        public Output<Outputs.ApplianceUplinksSettingsInterfaces> Interfaces { get; private set; } = null!;

        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Output("serial")]
        public Output<string> Serial { get; private set; } = null!;


        /// <summary>
        /// Create a ApplianceUplinksSettings resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApplianceUplinksSettings(string name, ApplianceUplinksSettingsArgs args, CustomResourceOptions? options = null)
            : base("meraki:devices/applianceUplinksSettings:ApplianceUplinksSettings", name, args ?? new ApplianceUplinksSettingsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApplianceUplinksSettings(string name, Input<string> id, ApplianceUplinksSettingsState? state = null, CustomResourceOptions? options = null)
            : base("meraki:devices/applianceUplinksSettings:ApplianceUplinksSettings", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ApplianceUplinksSettings resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApplianceUplinksSettings Get(string name, Input<string> id, ApplianceUplinksSettingsState? state = null, CustomResourceOptions? options = null)
        {
            return new ApplianceUplinksSettings(name, id, state, options);
        }
    }

    public sealed class ApplianceUplinksSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Interface settings.
        /// </summary>
        [Input("interfaces")]
        public Input<Inputs.ApplianceUplinksSettingsInterfacesArgs>? Interfaces { get; set; }

        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial", required: true)]
        public Input<string> Serial { get; set; } = null!;

        public ApplianceUplinksSettingsArgs()
        {
        }
        public static new ApplianceUplinksSettingsArgs Empty => new ApplianceUplinksSettingsArgs();
    }

    public sealed class ApplianceUplinksSettingsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Interface settings.
        /// </summary>
        [Input("interfaces")]
        public Input<Inputs.ApplianceUplinksSettingsInterfacesGetArgs>? Interfaces { get; set; }

        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        public ApplianceUplinksSettingsState()
        {
        }
        public static new ApplianceUplinksSettingsState Empty => new ApplianceUplinksSettingsState();
    }
}
