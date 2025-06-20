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
    ///     var example = new Meraki.Organizations.BrandingPoliciesPriorities("example", new()
    ///     {
    ///         BrandingPolicyIds = new[]
    ///         {
    ///             "123",
    ///             "456",
    ///             "789",
    ///         },
    ///         OrganizationId = "string",
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiOrganizationsBrandingPoliciesPrioritiesExample"] = example,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:organizations/brandingPoliciesPriorities:BrandingPoliciesPriorities example "organization_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:organizations/brandingPoliciesPriorities:BrandingPoliciesPriorities")]
    public partial class BrandingPoliciesPriorities : global::Pulumi.CustomResource
    {
        /// <summary>
        /// An ordered list of branding policy IDs that determines the priority order of how to apply the policies
        /// </summary>
        [Output("brandingPolicyIds")]
        public Output<ImmutableArray<string>> BrandingPolicyIds { get; private set; } = null!;

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;


        /// <summary>
        /// Create a BrandingPoliciesPriorities resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BrandingPoliciesPriorities(string name, BrandingPoliciesPrioritiesArgs args, CustomResourceOptions? options = null)
            : base("meraki:organizations/brandingPoliciesPriorities:BrandingPoliciesPriorities", name, args ?? new BrandingPoliciesPrioritiesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BrandingPoliciesPriorities(string name, Input<string> id, BrandingPoliciesPrioritiesState? state = null, CustomResourceOptions? options = null)
            : base("meraki:organizations/brandingPoliciesPriorities:BrandingPoliciesPriorities", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BrandingPoliciesPriorities resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BrandingPoliciesPriorities Get(string name, Input<string> id, BrandingPoliciesPrioritiesState? state = null, CustomResourceOptions? options = null)
        {
            return new BrandingPoliciesPriorities(name, id, state, options);
        }
    }

    public sealed class BrandingPoliciesPrioritiesArgs : global::Pulumi.ResourceArgs
    {
        [Input("brandingPolicyIds")]
        private InputList<string>? _brandingPolicyIds;

        /// <summary>
        /// An ordered list of branding policy IDs that determines the priority order of how to apply the policies
        /// </summary>
        public InputList<string> BrandingPolicyIds
        {
            get => _brandingPolicyIds ?? (_brandingPolicyIds = new InputList<string>());
            set => _brandingPolicyIds = value;
        }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        public BrandingPoliciesPrioritiesArgs()
        {
        }
        public static new BrandingPoliciesPrioritiesArgs Empty => new BrandingPoliciesPrioritiesArgs();
    }

    public sealed class BrandingPoliciesPrioritiesState : global::Pulumi.ResourceArgs
    {
        [Input("brandingPolicyIds")]
        private InputList<string>? _brandingPolicyIds;

        /// <summary>
        /// An ordered list of branding policy IDs that determines the priority order of how to apply the policies
        /// </summary>
        public InputList<string> BrandingPolicyIds
        {
            get => _brandingPolicyIds ?? (_brandingPolicyIds = new InputList<string>());
            set => _brandingPolicyIds = value;
        }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        public BrandingPoliciesPrioritiesState()
        {
        }
        public static new BrandingPoliciesPrioritiesState Empty => new BrandingPoliciesPrioritiesState();
    }
}
