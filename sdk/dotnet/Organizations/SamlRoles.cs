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
    ///     var example = new Meraki.Organizations.SamlRoles("example", new()
    ///     {
    ///         Networks = new[]
    ///         {
    ///             new Meraki.Organizations.Inputs.SamlRolesNetworkArgs
    ///             {
    ///                 Access = "full",
    ///                 Id = "N_24329156",
    ///             },
    ///         },
    ///         OrgAccess = "none",
    ///         OrganizationId = "string",
    ///         Role = "myrole",
    ///         Tags = new[]
    ///         {
    ///             new Meraki.Organizations.Inputs.SamlRolesTagArgs
    ///             {
    ///                 Access = "read-only",
    ///                 Tag = "west",
    ///             },
    ///         },
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiOrganizationsSamlRolesExample"] = example,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:organizations/samlRoles:SamlRoles example "organization_id,saml_role_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:organizations/samlRoles:SamlRoles")]
    public partial class SamlRoles : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The list of camera access privileges for SAML administrator
        /// </summary>
        [Output("cameras")]
        public Output<ImmutableArray<Outputs.SamlRolesCamera>> Cameras { get; private set; } = null!;

        /// <summary>
        /// The list of networks that the SAML administrator has privileges on
        /// </summary>
        [Output("networks")]
        public Output<ImmutableArray<Outputs.SamlRolesNetwork>> Networks { get; private set; } = null!;

        /// <summary>
        /// The privilege of the SAML administrator on the organization
        /// </summary>
        [Output("orgAccess")]
        public Output<string> OrgAccess { get; private set; } = null!;

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        /// <summary>
        /// The role of the SAML administrator
        /// </summary>
        [Output("role")]
        public Output<string> Role { get; private set; } = null!;

        /// <summary>
        /// samlRoleId path parameter. Saml role ID
        /// </summary>
        [Output("samlRoleId")]
        public Output<string?> SamlRoleId { get; private set; } = null!;

        /// <summary>
        /// The list of tags that the SAML administrator has privleges on
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.SamlRolesTag>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a SamlRoles resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SamlRoles(string name, SamlRolesArgs args, CustomResourceOptions? options = null)
            : base("meraki:organizations/samlRoles:SamlRoles", name, args ?? new SamlRolesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SamlRoles(string name, Input<string> id, SamlRolesState? state = null, CustomResourceOptions? options = null)
            : base("meraki:organizations/samlRoles:SamlRoles", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SamlRoles resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SamlRoles Get(string name, Input<string> id, SamlRolesState? state = null, CustomResourceOptions? options = null)
        {
            return new SamlRoles(name, id, state, options);
        }
    }

    public sealed class SamlRolesArgs : global::Pulumi.ResourceArgs
    {
        [Input("networks")]
        private InputList<Inputs.SamlRolesNetworkArgs>? _networks;

        /// <summary>
        /// The list of networks that the SAML administrator has privileges on
        /// </summary>
        public InputList<Inputs.SamlRolesNetworkArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.SamlRolesNetworkArgs>());
            set => _networks = value;
        }

        /// <summary>
        /// The privilege of the SAML administrator on the organization
        /// </summary>
        [Input("orgAccess")]
        public Input<string>? OrgAccess { get; set; }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        /// <summary>
        /// The role of the SAML administrator
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// samlRoleId path parameter. Saml role ID
        /// </summary>
        [Input("samlRoleId")]
        public Input<string>? SamlRoleId { get; set; }

        [Input("tags")]
        private InputList<Inputs.SamlRolesTagArgs>? _tags;

        /// <summary>
        /// The list of tags that the SAML administrator has privleges on
        /// </summary>
        public InputList<Inputs.SamlRolesTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.SamlRolesTagArgs>());
            set => _tags = value;
        }

        public SamlRolesArgs()
        {
        }
        public static new SamlRolesArgs Empty => new SamlRolesArgs();
    }

    public sealed class SamlRolesState : global::Pulumi.ResourceArgs
    {
        [Input("cameras")]
        private InputList<Inputs.SamlRolesCameraGetArgs>? _cameras;

        /// <summary>
        /// The list of camera access privileges for SAML administrator
        /// </summary>
        public InputList<Inputs.SamlRolesCameraGetArgs> Cameras
        {
            get => _cameras ?? (_cameras = new InputList<Inputs.SamlRolesCameraGetArgs>());
            set => _cameras = value;
        }

        [Input("networks")]
        private InputList<Inputs.SamlRolesNetworkGetArgs>? _networks;

        /// <summary>
        /// The list of networks that the SAML administrator has privileges on
        /// </summary>
        public InputList<Inputs.SamlRolesNetworkGetArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.SamlRolesNetworkGetArgs>());
            set => _networks = value;
        }

        /// <summary>
        /// The privilege of the SAML administrator on the organization
        /// </summary>
        [Input("orgAccess")]
        public Input<string>? OrgAccess { get; set; }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// The role of the SAML administrator
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// samlRoleId path parameter. Saml role ID
        /// </summary>
        [Input("samlRoleId")]
        public Input<string>? SamlRoleId { get; set; }

        [Input("tags")]
        private InputList<Inputs.SamlRolesTagGetArgs>? _tags;

        /// <summary>
        /// The list of tags that the SAML administrator has privleges on
        /// </summary>
        public InputList<Inputs.SamlRolesTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.SamlRolesTagGetArgs>());
            set => _tags = value;
        }

        public SamlRolesState()
        {
        }
        public static new SamlRolesState Empty => new SamlRolesState();
    }
}
