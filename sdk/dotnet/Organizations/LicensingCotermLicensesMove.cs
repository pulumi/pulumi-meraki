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
    ///     var example = new Meraki.Organizations.LicensingCotermLicensesMove("example", new()
    ///     {
    ///         OrganizationId = "string",
    ///         Parameters = new Meraki.Organizations.Inputs.LicensingCotermLicensesMoveParametersArgs
    ///         {
    ///             Destination = new Meraki.Organizations.Inputs.LicensingCotermLicensesMoveParametersDestinationArgs
    ///             {
    ///                 Mode = "addDevices",
    ///                 OrganizationId = "123",
    ///             },
    ///             Licenses = new[]
    ///             {
    ///                 new Meraki.Organizations.Inputs.LicensingCotermLicensesMoveParametersLicenseArgs
    ///                 {
    ///                     Counts = new[]
    ///                     {
    ///                         new Meraki.Organizations.Inputs.LicensingCotermLicensesMoveParametersLicenseCountArgs
    ///                         {
    ///                             Count = 5,
    ///                             Model = "MR Enterprise",
    ///                         },
    ///                     },
    ///                     Key = "Z2AA-BBBB-CCCC",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiOrganizationsLicensingCotermLicensesMoveExample"] = example,
    ///     };
    /// });
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:organizations/licensingCotermLicensesMove:LicensingCotermLicensesMove")]
    public partial class LicensingCotermLicensesMove : global::Pulumi.CustomResource
    {
        [Output("item")]
        public Output<Outputs.LicensingCotermLicensesMoveItem> Item { get; private set; } = null!;

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        [Output("parameters")]
        public Output<Outputs.LicensingCotermLicensesMoveParameters> Parameters { get; private set; } = null!;


        /// <summary>
        /// Create a LicensingCotermLicensesMove resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LicensingCotermLicensesMove(string name, LicensingCotermLicensesMoveArgs args, CustomResourceOptions? options = null)
            : base("meraki:organizations/licensingCotermLicensesMove:LicensingCotermLicensesMove", name, args ?? new LicensingCotermLicensesMoveArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LicensingCotermLicensesMove(string name, Input<string> id, LicensingCotermLicensesMoveState? state = null, CustomResourceOptions? options = null)
            : base("meraki:organizations/licensingCotermLicensesMove:LicensingCotermLicensesMove", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LicensingCotermLicensesMove resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LicensingCotermLicensesMove Get(string name, Input<string> id, LicensingCotermLicensesMoveState? state = null, CustomResourceOptions? options = null)
        {
            return new LicensingCotermLicensesMove(name, id, state, options);
        }
    }

    public sealed class LicensingCotermLicensesMoveArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        [Input("parameters", required: true)]
        public Input<Inputs.LicensingCotermLicensesMoveParametersArgs> Parameters { get; set; } = null!;

        public LicensingCotermLicensesMoveArgs()
        {
        }
        public static new LicensingCotermLicensesMoveArgs Empty => new LicensingCotermLicensesMoveArgs();
    }

    public sealed class LicensingCotermLicensesMoveState : global::Pulumi.ResourceArgs
    {
        [Input("item")]
        public Input<Inputs.LicensingCotermLicensesMoveItemGetArgs>? Item { get; set; }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        [Input("parameters")]
        public Input<Inputs.LicensingCotermLicensesMoveParametersGetArgs>? Parameters { get; set; }

        public LicensingCotermLicensesMoveState()
        {
        }
        public static new LicensingCotermLicensesMoveState Empty => new LicensingCotermLicensesMoveState();
    }
}
