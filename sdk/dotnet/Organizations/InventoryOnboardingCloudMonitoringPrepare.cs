// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations
{
    /// <summary>
    /// ~&gt;Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
    /// already existed previously.
    /// 
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
    ///     var example = new Meraki.Organizations.InventoryOnboardingCloudMonitoringPrepare("example", new()
    ///     {
    ///         OrganizationId = "string",
    ///         Parameters = new Meraki.Organizations.Inputs.InventoryOnboardingCloudMonitoringPrepareParametersArgs
    ///         {
    ///             Devices = new[]
    ///             {
    ///                 new Meraki.Organizations.Inputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceArgs
    ///                 {
    ///                     Sudi = @"          ""-----BEGIN CERTIFICATE-----
    ///         MIIDyTCCArGgAwIBAgIKBBNXOVCGU1YztjANBgkqhkiG9w0BAQsFADAnMQ4wDAYD
    ///         VQQKEwVDaXNjbzEVMBMGA1UEAxMMQUNUMiBTVURJIENBMB4XDTIxMDUzMTEzNTUx
    ///         NVoXDTI5MDUxNDIwMjU0MVowbTEpMCcGA1UEBRMgUElEOkM5MjAwTC0yNFAtNEcg
    ///         U046SkFFMjUyMjBSMksxDjAMBgNVBAoTBUNpc2NvMRgwFgYDVQQLEw9BQ1QtMiBM
    ///         aXRlIFNVREkxFjAUBgNVBAMTDUM5MjAwTC0yNFAtNEcwggEiMA0GCSqGSIb3DQEB
    ///         AQUAA4IBDwAwggEKAoIBAQDaUPxW76gT5MdoEAt+UrDFiYA9RYh2iHicDViBEyow
    ///         TR1TuP36bHh13X3vtGiDsCD88Ci2TZIqd/EDkkc7v9ipUUYVVH+YDrPt2Aukb1PH
    ///         D6K0R+KhgEzRo5x54TlU6oWvjUpwNZUwwdhMWIQaUVkMyZBYNy0jGPLO8jwZhyBg
    ///         1Fneybr9pwedGbLrAaz+gdEikB8B4a/fvPjVfL5Ngb4QRjFqWuE+X3nLc0kHedep
    ///         6nfgpUNXMlStVm5nIXKP6OjmzfCHPYh9L2Ehs1TrSk1ser9Ofx0ZMVL/jBZR2EIj
    ///         OZ8tH6KlX2/B2pbSPIO6kD5c4UA8Cf1SbDJCwJ/kI9ihAgMBAAGjgbAwga0wDgYD
    ///         VR0PAQH/BAQDAgXgMAwGA1UdEwEB/wQCMAAwHwYDVR0jBBgwFoAUSNjx8cJw1Vu7
    ///         fHMJk6+4uDAD+H8wTQYDVR0RBEYwRKBCBgkrBgEEAQkVAgOgNRMzQ2hpcElEPVVV
    ///         VUNNaElGcUVFMklFUUVBQWNBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUE9MB0GA1Ud
    ///         DgQWBBRdhMkFD/z5hokaQeLbaRsp4hkvbzANBgkqhkiG9w0BAQsFAAOCAQEAMtuh
    ///         YpBz4xEZ7YdJsLpw67Q0TTJGnTBRpzAeY1urYDoDz8TSx556XG7z3IRzuED5KVSp
    ///         OwmH/iZ+tDfYQ3W3ElWTW93871DkuW4WQIfbnoHg/F7bF0DKYVkD3rpZjyz3NhzH
    ///         d7cjTdJXQ85bTAOXDuxKH3qewrXxxOGXgh3I6NUq0UwMTWh84lND7Jl+ZAQkYNS2
    ///         iHanTZFQBk3ML0NUb7fKDYGRTZRqwQ/upIO4S6LV1cxH/6V0qbMy3sCSHZoMLrW3
    ///         0m3M6yKpe5+VZzHZwmWdUf3Ot+zKjhveK5/YNsMIASdvtvymxUizq2Hr1hvR/kPc
    ///         p1vuyWxipU8JfzOh/A==
    ///         -----END CERTIFICATE-----
    ///         ""
    /// ",
    ///                     Tunnel = new Meraki.Organizations.Inputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceTunnelArgs
    ///                     {
    ///                         CertificateName = "DeviceSUDI",
    ///                         LocalInterface = 1,
    ///                         LoopbackNumber = 1000,
    ///                         Name = "MERAKI",
    ///                     },
    ///                     User = new Meraki.Organizations.Inputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceUserArgs
    ///                     {
    ///                         Username = "Meraki",
    ///                     },
    ///                     Vty = new Meraki.Organizations.Inputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyArgs
    ///                     {
    ///                         AccessList = new Meraki.Organizations.Inputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListArgs
    ///                         {
    ///                             VtyIn = new Meraki.Organizations.Inputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyInArgs
    ///                             {
    ///                                 Name = "MERAKI_IN",
    ///                             },
    ///                             VtyOut = new Meraki.Organizations.Inputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyOutArgs
    ///                             {
    ///                                 Name = "MERAKI_OUT",
    ///                             },
    ///                         },
    ///                         Authentication = new Meraki.Organizations.Inputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationArgs
    ///                         {
    ///                             Group = new Meraki.Organizations.Inputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationGroupArgs
    ///                             {
    ///                                 Name = "",
    ///                             },
    ///                         },
    ///                         Authorization = new Meraki.Organizations.Inputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthorizationArgs
    ///                         {
    ///                             Group = new Meraki.Organizations.Inputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthorizationGroupArgs
    ///                             {
    ///                                 Name = "MERAKI",
    ///                             },
    ///                         },
    ///                         EndLineNumber = 17,
    ///                         RotaryNumber = 50,
    ///                         StartLineNumber = 16,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiOrganizationsInventoryOnboardingCloudMonitoringPrepareExample"] = example,
    ///     };
    /// });
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:organizations/inventoryOnboardingCloudMonitoringPrepare:InventoryOnboardingCloudMonitoringPrepare")]
    public partial class InventoryOnboardingCloudMonitoringPrepare : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Array of ResponseOrganizationsCreateOrganizationInventoryOnboardingCloudMonitoringPrepare
        /// </summary>
        [Output("items")]
        public Output<ImmutableArray<Outputs.InventoryOnboardingCloudMonitoringPrepareItem>> Items { get; private set; } = null!;

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        [Output("parameters")]
        public Output<Outputs.InventoryOnboardingCloudMonitoringPrepareParameters> Parameters { get; private set; } = null!;


        /// <summary>
        /// Create a InventoryOnboardingCloudMonitoringPrepare resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InventoryOnboardingCloudMonitoringPrepare(string name, InventoryOnboardingCloudMonitoringPrepareArgs args, CustomResourceOptions? options = null)
            : base("meraki:organizations/inventoryOnboardingCloudMonitoringPrepare:InventoryOnboardingCloudMonitoringPrepare", name, args ?? new InventoryOnboardingCloudMonitoringPrepareArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InventoryOnboardingCloudMonitoringPrepare(string name, Input<string> id, InventoryOnboardingCloudMonitoringPrepareState? state = null, CustomResourceOptions? options = null)
            : base("meraki:organizations/inventoryOnboardingCloudMonitoringPrepare:InventoryOnboardingCloudMonitoringPrepare", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing InventoryOnboardingCloudMonitoringPrepare resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InventoryOnboardingCloudMonitoringPrepare Get(string name, Input<string> id, InventoryOnboardingCloudMonitoringPrepareState? state = null, CustomResourceOptions? options = null)
        {
            return new InventoryOnboardingCloudMonitoringPrepare(name, id, state, options);
        }
    }

    public sealed class InventoryOnboardingCloudMonitoringPrepareArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        [Input("parameters", required: true)]
        public Input<Inputs.InventoryOnboardingCloudMonitoringPrepareParametersArgs> Parameters { get; set; } = null!;

        public InventoryOnboardingCloudMonitoringPrepareArgs()
        {
        }
        public static new InventoryOnboardingCloudMonitoringPrepareArgs Empty => new InventoryOnboardingCloudMonitoringPrepareArgs();
    }

    public sealed class InventoryOnboardingCloudMonitoringPrepareState : global::Pulumi.ResourceArgs
    {
        [Input("items")]
        private InputList<Inputs.InventoryOnboardingCloudMonitoringPrepareItemGetArgs>? _items;

        /// <summary>
        /// Array of ResponseOrganizationsCreateOrganizationInventoryOnboardingCloudMonitoringPrepare
        /// </summary>
        public InputList<Inputs.InventoryOnboardingCloudMonitoringPrepareItemGetArgs> Items
        {
            get => _items ?? (_items = new InputList<Inputs.InventoryOnboardingCloudMonitoringPrepareItemGetArgs>());
            set => _items = value;
        }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        [Input("parameters")]
        public Input<Inputs.InventoryOnboardingCloudMonitoringPrepareParametersGetArgs>? Parameters { get; set; }

        public InventoryOnboardingCloudMonitoringPrepareState()
        {
        }
        public static new InventoryOnboardingCloudMonitoringPrepareState Empty => new InventoryOnboardingCloudMonitoringPrepareState();
    }
}
