// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
    /// $ pulumi import meraki:organizations/actionBatches:ActionBatches example "action_batch_id,organization_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:organizations/actionBatches:ActionBatches")]
    public partial class ActionBatches : global::Pulumi.CustomResource
    {
        /// <summary>
        /// actionBatchId path parameter. Action batch ID
        /// </summary>
        [Output("actionBatchId")]
        public Output<string> ActionBatchId { get; private set; } = null!;

        /// <summary>
        /// A set of changes made as part of this action (\n\nmore details\n\n)
        /// </summary>
        [Output("actions")]
        public Output<ImmutableArray<Outputs.ActionBatchesAction>> Actions { get; private set; } = null!;

        /// <summary>
        /// Information for callback used to send back results
        /// </summary>
        [Output("callback")]
        public Output<Outputs.ActionBatchesCallback> Callback { get; private set; } = null!;

        /// <summary>
        /// Flag describing whether the action should be previewed before executing or not
        /// </summary>
        [Output("confirmed")]
        public Output<bool> Confirmed { get; private set; } = null!;

        /// <summary>
        /// ID of the organization this action batch belongs to
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        /// <summary>
        /// Status of action batch
        /// </summary>
        [Output("status")]
        public Output<Outputs.ActionBatchesStatus> Status { get; private set; } = null!;

        /// <summary>
        /// Flag describing whether actions should run synchronously or asynchronously
        /// </summary>
        [Output("synchronous")]
        public Output<bool> Synchronous { get; private set; } = null!;


        /// <summary>
        /// Create a ActionBatches resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ActionBatches(string name, ActionBatchesArgs args, CustomResourceOptions? options = null)
            : base("meraki:organizations/actionBatches:ActionBatches", name, args ?? new ActionBatchesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ActionBatches(string name, Input<string> id, ActionBatchesState? state = null, CustomResourceOptions? options = null)
            : base("meraki:organizations/actionBatches:ActionBatches", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ActionBatches resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ActionBatches Get(string name, Input<string> id, ActionBatchesState? state = null, CustomResourceOptions? options = null)
        {
            return new ActionBatches(name, id, state, options);
        }
    }

    public sealed class ActionBatchesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// actionBatchId path parameter. Action batch ID
        /// </summary>
        [Input("actionBatchId")]
        public Input<string>? ActionBatchId { get; set; }

        [Input("actions")]
        private InputList<Inputs.ActionBatchesActionArgs>? _actions;

        /// <summary>
        /// A set of changes made as part of this action (\n\nmore details\n\n)
        /// </summary>
        public InputList<Inputs.ActionBatchesActionArgs> Actions
        {
            get => _actions ?? (_actions = new InputList<Inputs.ActionBatchesActionArgs>());
            set => _actions = value;
        }

        /// <summary>
        /// Information for callback used to send back results
        /// </summary>
        [Input("callback")]
        public Input<Inputs.ActionBatchesCallbackArgs>? Callback { get; set; }

        /// <summary>
        /// Flag describing whether the action should be previewed before executing or not
        /// </summary>
        [Input("confirmed")]
        public Input<bool>? Confirmed { get; set; }

        /// <summary>
        /// ID of the organization this action batch belongs to
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        /// <summary>
        /// Flag describing whether actions should run synchronously or asynchronously
        /// </summary>
        [Input("synchronous")]
        public Input<bool>? Synchronous { get; set; }

        public ActionBatchesArgs()
        {
        }
        public static new ActionBatchesArgs Empty => new ActionBatchesArgs();
    }

    public sealed class ActionBatchesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// actionBatchId path parameter. Action batch ID
        /// </summary>
        [Input("actionBatchId")]
        public Input<string>? ActionBatchId { get; set; }

        [Input("actions")]
        private InputList<Inputs.ActionBatchesActionGetArgs>? _actions;

        /// <summary>
        /// A set of changes made as part of this action (\n\nmore details\n\n)
        /// </summary>
        public InputList<Inputs.ActionBatchesActionGetArgs> Actions
        {
            get => _actions ?? (_actions = new InputList<Inputs.ActionBatchesActionGetArgs>());
            set => _actions = value;
        }

        /// <summary>
        /// Information for callback used to send back results
        /// </summary>
        [Input("callback")]
        public Input<Inputs.ActionBatchesCallbackGetArgs>? Callback { get; set; }

        /// <summary>
        /// Flag describing whether the action should be previewed before executing or not
        /// </summary>
        [Input("confirmed")]
        public Input<bool>? Confirmed { get; set; }

        /// <summary>
        /// ID of the organization this action batch belongs to
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// Status of action batch
        /// </summary>
        [Input("status")]
        public Input<Inputs.ActionBatchesStatusGetArgs>? Status { get; set; }

        /// <summary>
        /// Flag describing whether actions should run synchronously or asynchronously
        /// </summary>
        [Input("synchronous")]
        public Input<bool>? Synchronous { get; set; }

        public ActionBatchesState()
        {
        }
        public static new ActionBatchesState Empty => new ActionBatchesState();
    }
}