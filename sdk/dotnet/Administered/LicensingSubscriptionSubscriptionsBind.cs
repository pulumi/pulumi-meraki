// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Administered
{
    /// <summary>
    /// ~&gt;Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
    /// already existed previously.
    /// </summary>
    [MerakiResourceType("meraki:administered/licensingSubscriptionSubscriptionsBind:LicensingSubscriptionSubscriptionsBind")]
    public partial class LicensingSubscriptionSubscriptionsBind : global::Pulumi.CustomResource
    {
        [Output("item")]
        public Output<Outputs.LicensingSubscriptionSubscriptionsBindItem> Item { get; private set; } = null!;

        [Output("parameters")]
        public Output<Outputs.LicensingSubscriptionSubscriptionsBindParameters> Parameters { get; private set; } = null!;

        /// <summary>
        /// subscriptionId path parameter. Subscription ID
        /// </summary>
        [Output("subscriptionId")]
        public Output<string> SubscriptionId { get; private set; } = null!;

        /// <summary>
        /// validate query parameter. Check if the provided networks can be bound to the subscription. Returns any licensing problems and does not commit the results.
        /// </summary>
        [Output("validate")]
        public Output<bool?> Validate { get; private set; } = null!;


        /// <summary>
        /// Create a LicensingSubscriptionSubscriptionsBind resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LicensingSubscriptionSubscriptionsBind(string name, LicensingSubscriptionSubscriptionsBindArgs args, CustomResourceOptions? options = null)
            : base("meraki:administered/licensingSubscriptionSubscriptionsBind:LicensingSubscriptionSubscriptionsBind", name, args ?? new LicensingSubscriptionSubscriptionsBindArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LicensingSubscriptionSubscriptionsBind(string name, Input<string> id, LicensingSubscriptionSubscriptionsBindState? state = null, CustomResourceOptions? options = null)
            : base("meraki:administered/licensingSubscriptionSubscriptionsBind:LicensingSubscriptionSubscriptionsBind", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LicensingSubscriptionSubscriptionsBind resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LicensingSubscriptionSubscriptionsBind Get(string name, Input<string> id, LicensingSubscriptionSubscriptionsBindState? state = null, CustomResourceOptions? options = null)
        {
            return new LicensingSubscriptionSubscriptionsBind(name, id, state, options);
        }
    }

    public sealed class LicensingSubscriptionSubscriptionsBindArgs : global::Pulumi.ResourceArgs
    {
        [Input("parameters", required: true)]
        public Input<Inputs.LicensingSubscriptionSubscriptionsBindParametersArgs> Parameters { get; set; } = null!;

        /// <summary>
        /// subscriptionId path parameter. Subscription ID
        /// </summary>
        [Input("subscriptionId", required: true)]
        public Input<string> SubscriptionId { get; set; } = null!;

        /// <summary>
        /// validate query parameter. Check if the provided networks can be bound to the subscription. Returns any licensing problems and does not commit the results.
        /// </summary>
        [Input("validate")]
        public Input<bool>? Validate { get; set; }

        public LicensingSubscriptionSubscriptionsBindArgs()
        {
        }
        public static new LicensingSubscriptionSubscriptionsBindArgs Empty => new LicensingSubscriptionSubscriptionsBindArgs();
    }

    public sealed class LicensingSubscriptionSubscriptionsBindState : global::Pulumi.ResourceArgs
    {
        [Input("item")]
        public Input<Inputs.LicensingSubscriptionSubscriptionsBindItemGetArgs>? Item { get; set; }

        [Input("parameters")]
        public Input<Inputs.LicensingSubscriptionSubscriptionsBindParametersGetArgs>? Parameters { get; set; }

        /// <summary>
        /// subscriptionId path parameter. Subscription ID
        /// </summary>
        [Input("subscriptionId")]
        public Input<string>? SubscriptionId { get; set; }

        /// <summary>
        /// validate query parameter. Check if the provided networks can be bound to the subscription. Returns any licensing problems and does not commit the results.
        /// </summary>
        [Input("validate")]
        public Input<bool>? Validate { get; set; }

        public LicensingSubscriptionSubscriptionsBindState()
        {
        }
        public static new LicensingSubscriptionSubscriptionsBindState Empty => new LicensingSubscriptionSubscriptionsBindState();
    }
}