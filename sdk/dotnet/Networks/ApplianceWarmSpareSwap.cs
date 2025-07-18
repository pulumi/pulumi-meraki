// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
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
    ///     var example = new Meraki.Networks.ApplianceWarmSpareSwap("example", new()
    ///     {
    ///         NetworkId = "string",
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiNetworksApplianceWarmSpareSwapExample"] = example,
    ///     };
    /// });
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/applianceWarmSpareSwap:ApplianceWarmSpareSwap")]
    public partial class ApplianceWarmSpareSwap : global::Pulumi.CustomResource
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;


        /// <summary>
        /// Create a ApplianceWarmSpareSwap resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApplianceWarmSpareSwap(string name, ApplianceWarmSpareSwapArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/applianceWarmSpareSwap:ApplianceWarmSpareSwap", name, args ?? new ApplianceWarmSpareSwapArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApplianceWarmSpareSwap(string name, Input<string> id, ApplianceWarmSpareSwapState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/applianceWarmSpareSwap:ApplianceWarmSpareSwap", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ApplianceWarmSpareSwap resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApplianceWarmSpareSwap Get(string name, Input<string> id, ApplianceWarmSpareSwapState? state = null, CustomResourceOptions? options = null)
        {
            return new ApplianceWarmSpareSwap(name, id, state, options);
        }
    }

    public sealed class ApplianceWarmSpareSwapArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public ApplianceWarmSpareSwapArgs()
        {
        }
        public static new ApplianceWarmSpareSwapArgs Empty => new ApplianceWarmSpareSwapArgs();
    }

    public sealed class ApplianceWarmSpareSwapState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        public ApplianceWarmSpareSwapState()
        {
        }
        public static new ApplianceWarmSpareSwapState Empty => new ApplianceWarmSpareSwapState();
    }
}
