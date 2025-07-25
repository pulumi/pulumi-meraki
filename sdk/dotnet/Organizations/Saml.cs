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
    ///     var example = new Meraki.Organizations.Saml("example", new()
    ///     {
    ///         Enabled = true,
    ///         OrganizationId = "string",
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiOrganizationsSamlExample"] = example,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:organizations/saml:Saml example "organization_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:organizations/saml:Saml")]
    public partial class Saml : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Toggle depicting if SAML SSO settings are enabled
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;


        /// <summary>
        /// Create a Saml resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Saml(string name, SamlArgs args, CustomResourceOptions? options = null)
            : base("meraki:organizations/saml:Saml", name, args ?? new SamlArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Saml(string name, Input<string> id, SamlState? state = null, CustomResourceOptions? options = null)
            : base("meraki:organizations/saml:Saml", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Saml resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Saml Get(string name, Input<string> id, SamlState? state = null, CustomResourceOptions? options = null)
        {
            return new Saml(name, id, state, options);
        }
    }

    public sealed class SamlArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Toggle depicting if SAML SSO settings are enabled
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        public SamlArgs()
        {
        }
        public static new SamlArgs Empty => new SamlArgs();
    }

    public sealed class SamlState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Toggle depicting if SAML SSO settings are enabled
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        public SamlState()
        {
        }
        public static new SamlState Empty => new SamlState();
    }
}
