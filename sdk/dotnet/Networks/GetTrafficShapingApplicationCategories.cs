// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetTrafficShapingApplicationCategories
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
        ///     var example = Meraki.Networks.GetTrafficShapingApplicationCategories.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksTrafficShapingApplicationCategoriesExample"] = example.Apply(getTrafficShapingApplicationCategoriesResult =&gt; getTrafficShapingApplicationCategoriesResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetTrafficShapingApplicationCategoriesResult> InvokeAsync(GetTrafficShapingApplicationCategoriesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTrafficShapingApplicationCategoriesResult>("meraki:networks/getTrafficShapingApplicationCategories:getTrafficShapingApplicationCategories", args ?? new GetTrafficShapingApplicationCategoriesArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetTrafficShapingApplicationCategories.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksTrafficShapingApplicationCategoriesExample"] = example.Apply(getTrafficShapingApplicationCategoriesResult =&gt; getTrafficShapingApplicationCategoriesResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetTrafficShapingApplicationCategoriesResult> Invoke(GetTrafficShapingApplicationCategoriesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTrafficShapingApplicationCategoriesResult>("meraki:networks/getTrafficShapingApplicationCategories:getTrafficShapingApplicationCategories", args ?? new GetTrafficShapingApplicationCategoriesInvokeArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetTrafficShapingApplicationCategories.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksTrafficShapingApplicationCategoriesExample"] = example.Apply(getTrafficShapingApplicationCategoriesResult =&gt; getTrafficShapingApplicationCategoriesResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetTrafficShapingApplicationCategoriesResult> Invoke(GetTrafficShapingApplicationCategoriesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetTrafficShapingApplicationCategoriesResult>("meraki:networks/getTrafficShapingApplicationCategories:getTrafficShapingApplicationCategories", args ?? new GetTrafficShapingApplicationCategoriesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTrafficShapingApplicationCategoriesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetTrafficShapingApplicationCategoriesArgs()
        {
        }
        public static new GetTrafficShapingApplicationCategoriesArgs Empty => new GetTrafficShapingApplicationCategoriesArgs();
    }

    public sealed class GetTrafficShapingApplicationCategoriesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetTrafficShapingApplicationCategoriesInvokeArgs()
        {
        }
        public static new GetTrafficShapingApplicationCategoriesInvokeArgs Empty => new GetTrafficShapingApplicationCategoriesInvokeArgs();
    }


    [OutputType]
    public sealed class GetTrafficShapingApplicationCategoriesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetTrafficShapingApplicationCategoriesItemResult Item;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetTrafficShapingApplicationCategoriesResult(
            string id,

            Outputs.GetTrafficShapingApplicationCategoriesItemResult item,

            string networkId)
        {
            Id = id;
            Item = item;
            NetworkId = networkId;
        }
    }
}
