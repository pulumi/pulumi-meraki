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
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:organizations/adaptivePolicyAcls:AdaptivePolicyAcls example "acl_id,organization_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:organizations/adaptivePolicyAcls:AdaptivePolicyAcls")]
    public partial class AdaptivePolicyAcls : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ID of the adaptive policy ACL
        /// </summary>
        [Output("aclId")]
        public Output<string> AclId { get; private set; } = null!;

        /// <summary>
        /// When the adaptive policy ACL was created
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// Description of the adaptive policy ACL
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// IP version of adpative policy ACL
        /// </summary>
        [Output("ipVersion")]
        public Output<string> IpVersion { get; private set; } = null!;

        /// <summary>
        /// Name of the adaptive policy ACL
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        /// <summary>
        /// An ordered array of the adaptive policy ACL rules
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.AdaptivePolicyAclsRule>> Rules { get; private set; } = null!;

        /// <summary>
        /// When the adaptive policy ACL was last updated
        /// </summary>
        [Output("updatedAt")]
        public Output<string> UpdatedAt { get; private set; } = null!;


        /// <summary>
        /// Create a AdaptivePolicyAcls resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AdaptivePolicyAcls(string name, AdaptivePolicyAclsArgs args, CustomResourceOptions? options = null)
            : base("meraki:organizations/adaptivePolicyAcls:AdaptivePolicyAcls", name, args ?? new AdaptivePolicyAclsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AdaptivePolicyAcls(string name, Input<string> id, AdaptivePolicyAclsState? state = null, CustomResourceOptions? options = null)
            : base("meraki:organizations/adaptivePolicyAcls:AdaptivePolicyAcls", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AdaptivePolicyAcls resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AdaptivePolicyAcls Get(string name, Input<string> id, AdaptivePolicyAclsState? state = null, CustomResourceOptions? options = null)
        {
            return new AdaptivePolicyAcls(name, id, state, options);
        }
    }

    public sealed class AdaptivePolicyAclsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the adaptive policy ACL
        /// </summary>
        [Input("aclId")]
        public Input<string>? AclId { get; set; }

        /// <summary>
        /// Description of the adaptive policy ACL
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// IP version of adpative policy ACL
        /// </summary>
        [Input("ipVersion")]
        public Input<string>? IpVersion { get; set; }

        /// <summary>
        /// Name of the adaptive policy ACL
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        [Input("rules")]
        private InputList<Inputs.AdaptivePolicyAclsRuleArgs>? _rules;

        /// <summary>
        /// An ordered array of the adaptive policy ACL rules
        /// </summary>
        public InputList<Inputs.AdaptivePolicyAclsRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.AdaptivePolicyAclsRuleArgs>());
            set => _rules = value;
        }

        public AdaptivePolicyAclsArgs()
        {
        }
        public static new AdaptivePolicyAclsArgs Empty => new AdaptivePolicyAclsArgs();
    }

    public sealed class AdaptivePolicyAclsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the adaptive policy ACL
        /// </summary>
        [Input("aclId")]
        public Input<string>? AclId { get; set; }

        /// <summary>
        /// When the adaptive policy ACL was created
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Description of the adaptive policy ACL
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// IP version of adpative policy ACL
        /// </summary>
        [Input("ipVersion")]
        public Input<string>? IpVersion { get; set; }

        /// <summary>
        /// Name of the adaptive policy ACL
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        [Input("rules")]
        private InputList<Inputs.AdaptivePolicyAclsRuleGetArgs>? _rules;

        /// <summary>
        /// An ordered array of the adaptive policy ACL rules
        /// </summary>
        public InputList<Inputs.AdaptivePolicyAclsRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.AdaptivePolicyAclsRuleGetArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// When the adaptive policy ACL was last updated
        /// </summary>
        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        public AdaptivePolicyAclsState()
        {
        }
        public static new AdaptivePolicyAclsState Empty => new AdaptivePolicyAclsState();
    }
}
