// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetTrafficShapingDscpTaggingOptions
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
        ///     var example = Meraki.Networks.GetTrafficShapingDscpTaggingOptions.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksTrafficShapingDscpTaggingOptionsExample"] = example.Apply(getTrafficShapingDscpTaggingOptionsResult =&gt; getTrafficShapingDscpTaggingOptionsResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetTrafficShapingDscpTaggingOptionsResult> InvokeAsync(GetTrafficShapingDscpTaggingOptionsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTrafficShapingDscpTaggingOptionsResult>("meraki:networks/getTrafficShapingDscpTaggingOptions:getTrafficShapingDscpTaggingOptions", args ?? new GetTrafficShapingDscpTaggingOptionsArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetTrafficShapingDscpTaggingOptions.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksTrafficShapingDscpTaggingOptionsExample"] = example.Apply(getTrafficShapingDscpTaggingOptionsResult =&gt; getTrafficShapingDscpTaggingOptionsResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetTrafficShapingDscpTaggingOptionsResult> Invoke(GetTrafficShapingDscpTaggingOptionsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTrafficShapingDscpTaggingOptionsResult>("meraki:networks/getTrafficShapingDscpTaggingOptions:getTrafficShapingDscpTaggingOptions", args ?? new GetTrafficShapingDscpTaggingOptionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTrafficShapingDscpTaggingOptionsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetTrafficShapingDscpTaggingOptionsArgs()
        {
        }
        public static new GetTrafficShapingDscpTaggingOptionsArgs Empty => new GetTrafficShapingDscpTaggingOptionsArgs();
    }

    public sealed class GetTrafficShapingDscpTaggingOptionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetTrafficShapingDscpTaggingOptionsInvokeArgs()
        {
        }
        public static new GetTrafficShapingDscpTaggingOptionsInvokeArgs Empty => new GetTrafficShapingDscpTaggingOptionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetTrafficShapingDscpTaggingOptionsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Array of ResponseNetworksGetNetworkTrafficShapingDscpTaggingOptions
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTrafficShapingDscpTaggingOptionsItemResult> Items;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetTrafficShapingDscpTaggingOptionsResult(
            string id,

            ImmutableArray<Outputs.GetTrafficShapingDscpTaggingOptionsItemResult> items,

            string networkId)
        {
            Id = id;
            Items = items;
            NetworkId = networkId;
        }
    }
}