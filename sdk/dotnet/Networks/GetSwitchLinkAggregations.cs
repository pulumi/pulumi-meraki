// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetSwitchLinkAggregations
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
        ///     var example = Meraki.Networks.GetSwitchLinkAggregations.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksSwitchLinkAggregationsExample"] = example.Apply(getSwitchLinkAggregationsResult =&gt; getSwitchLinkAggregationsResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetSwitchLinkAggregationsResult> InvokeAsync(GetSwitchLinkAggregationsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSwitchLinkAggregationsResult>("meraki:networks/getSwitchLinkAggregations:getSwitchLinkAggregations", args ?? new GetSwitchLinkAggregationsArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetSwitchLinkAggregations.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksSwitchLinkAggregationsExample"] = example.Apply(getSwitchLinkAggregationsResult =&gt; getSwitchLinkAggregationsResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetSwitchLinkAggregationsResult> Invoke(GetSwitchLinkAggregationsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSwitchLinkAggregationsResult>("meraki:networks/getSwitchLinkAggregations:getSwitchLinkAggregations", args ?? new GetSwitchLinkAggregationsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSwitchLinkAggregationsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetSwitchLinkAggregationsArgs()
        {
        }
        public static new GetSwitchLinkAggregationsArgs Empty => new GetSwitchLinkAggregationsArgs();
    }

    public sealed class GetSwitchLinkAggregationsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetSwitchLinkAggregationsInvokeArgs()
        {
        }
        public static new GetSwitchLinkAggregationsInvokeArgs Empty => new GetSwitchLinkAggregationsInvokeArgs();
    }


    [OutputType]
    public sealed class GetSwitchLinkAggregationsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Array of ResponseSwitchGetNetworkSwitchLinkAggregations
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSwitchLinkAggregationsItemResult> Items;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetSwitchLinkAggregationsResult(
            string id,

            ImmutableArray<Outputs.GetSwitchLinkAggregationsItemResult> items,

            string networkId)
        {
            Id = id;
            Items = items;
            NetworkId = networkId;
        }
    }
}