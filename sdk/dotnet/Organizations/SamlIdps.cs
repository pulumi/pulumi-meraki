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
    ///     var example = new Meraki.Organizations.SamlIdps("example", new()
    ///     {
    ///         OrganizationId = "string",
    ///         SloLogoutUrl = "https://somewhere.com",
    ///         X509certSha1Fingerprint = "00:11:22:33:44:55:66:77:88:99:00:11:22:33:44:55:66:77:88:99",
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiOrganizationsSamlIdpsExample"] = example,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:organizations/samlIdps:SamlIdps example "idp_id,organization_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:organizations/samlIdps:SamlIdps")]
    public partial class SamlIdps : global::Pulumi.CustomResource
    {
        /// <summary>
        /// URL that is consuming SAML Identity Provider (IdP)
        /// </summary>
        [Output("consumerUrl")]
        public Output<string> ConsumerUrl { get; private set; } = null!;

        /// <summary>
        /// ID associated with the SAML Identity Provider (IdP)
        /// </summary>
        [Output("idpId")]
        public Output<string> IdpId { get; private set; } = null!;

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        /// <summary>
        /// Dashboard will redirect users to this URL when they sign out.
        /// </summary>
        [Output("sloLogoutUrl")]
        public Output<string> SloLogoutUrl { get; private set; } = null!;

        /// <summary>
        /// Fingerprint (SHA1) of the SAML certificate provided by your Identity Provider (IdP). This will be used for encryption / validation.
        /// </summary>
        [Output("x509certSha1Fingerprint")]
        public Output<string> X509certSha1Fingerprint { get; private set; } = null!;


        /// <summary>
        /// Create a SamlIdps resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SamlIdps(string name, SamlIdpsArgs args, CustomResourceOptions? options = null)
            : base("meraki:organizations/samlIdps:SamlIdps", name, args ?? new SamlIdpsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SamlIdps(string name, Input<string> id, SamlIdpsState? state = null, CustomResourceOptions? options = null)
            : base("meraki:organizations/samlIdps:SamlIdps", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SamlIdps resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SamlIdps Get(string name, Input<string> id, SamlIdpsState? state = null, CustomResourceOptions? options = null)
        {
            return new SamlIdps(name, id, state, options);
        }
    }

    public sealed class SamlIdpsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID associated with the SAML Identity Provider (IdP)
        /// </summary>
        [Input("idpId")]
        public Input<string>? IdpId { get; set; }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        /// <summary>
        /// Dashboard will redirect users to this URL when they sign out.
        /// </summary>
        [Input("sloLogoutUrl")]
        public Input<string>? SloLogoutUrl { get; set; }

        /// <summary>
        /// Fingerprint (SHA1) of the SAML certificate provided by your Identity Provider (IdP). This will be used for encryption / validation.
        /// </summary>
        [Input("x509certSha1Fingerprint")]
        public Input<string>? X509certSha1Fingerprint { get; set; }

        public SamlIdpsArgs()
        {
        }
        public static new SamlIdpsArgs Empty => new SamlIdpsArgs();
    }

    public sealed class SamlIdpsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// URL that is consuming SAML Identity Provider (IdP)
        /// </summary>
        [Input("consumerUrl")]
        public Input<string>? ConsumerUrl { get; set; }

        /// <summary>
        /// ID associated with the SAML Identity Provider (IdP)
        /// </summary>
        [Input("idpId")]
        public Input<string>? IdpId { get; set; }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// Dashboard will redirect users to this URL when they sign out.
        /// </summary>
        [Input("sloLogoutUrl")]
        public Input<string>? SloLogoutUrl { get; set; }

        /// <summary>
        /// Fingerprint (SHA1) of the SAML certificate provided by your Identity Provider (IdP). This will be used for encryption / validation.
        /// </summary>
        [Input("x509certSha1Fingerprint")]
        public Input<string>? X509certSha1Fingerprint { get; set; }

        public SamlIdpsState()
        {
        }
        public static new SamlIdpsState Empty => new SamlIdpsState();
    }
}
