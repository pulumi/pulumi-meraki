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
    /// </summary>
    [MerakiResourceType("meraki:organizations/networksCombine:NetworksCombine")]
    public partial class NetworksCombine : global::Pulumi.CustomResource
    {
        [Output("item")]
        public Output<Outputs.NetworksCombineItem> Item { get; private set; } = null!;

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        [Output("parameters")]
        public Output<Outputs.NetworksCombineParameters> Parameters { get; private set; } = null!;


        /// <summary>
        /// Create a NetworksCombine resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NetworksCombine(string name, NetworksCombineArgs args, CustomResourceOptions? options = null)
            : base("meraki:organizations/networksCombine:NetworksCombine", name, args ?? new NetworksCombineArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NetworksCombine(string name, Input<string> id, NetworksCombineState? state = null, CustomResourceOptions? options = null)
            : base("meraki:organizations/networksCombine:NetworksCombine", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NetworksCombine resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NetworksCombine Get(string name, Input<string> id, NetworksCombineState? state = null, CustomResourceOptions? options = null)
        {
            return new NetworksCombine(name, id, state, options);
        }
    }

    public sealed class NetworksCombineArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        [Input("parameters", required: true)]
        public Input<Inputs.NetworksCombineParametersArgs> Parameters { get; set; } = null!;

        public NetworksCombineArgs()
        {
        }
        public static new NetworksCombineArgs Empty => new NetworksCombineArgs();
    }

    public sealed class NetworksCombineState : global::Pulumi.ResourceArgs
    {
        [Input("item")]
        public Input<Inputs.NetworksCombineItemGetArgs>? Item { get; set; }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        [Input("parameters")]
        public Input<Inputs.NetworksCombineParametersGetArgs>? Parameters { get; set; }

        public NetworksCombineState()
        {
        }
        public static new NetworksCombineState Empty => new NetworksCombineState();
    }
}
