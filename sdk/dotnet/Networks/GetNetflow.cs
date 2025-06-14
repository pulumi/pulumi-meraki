// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetNetflow
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
        ///     var example = Meraki.Networks.GetNetflow.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksNetflowExample"] = example.Apply(getNetflowResult =&gt; getNetflowResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetNetflowResult> InvokeAsync(GetNetflowArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetflowResult>("meraki:networks/getNetflow:getNetflow", args ?? new GetNetflowArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetNetflow.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksNetflowExample"] = example.Apply(getNetflowResult =&gt; getNetflowResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetNetflowResult> Invoke(GetNetflowInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetflowResult>("meraki:networks/getNetflow:getNetflow", args ?? new GetNetflowInvokeArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetNetflow.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksNetflowExample"] = example.Apply(getNetflowResult =&gt; getNetflowResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetNetflowResult> Invoke(GetNetflowInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetflowResult>("meraki:networks/getNetflow:getNetflow", args ?? new GetNetflowInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetflowArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetNetflowArgs()
        {
        }
        public static new GetNetflowArgs Empty => new GetNetflowArgs();
    }

    public sealed class GetNetflowInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetNetflowInvokeArgs()
        {
        }
        public static new GetNetflowInvokeArgs Empty => new GetNetflowInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetflowResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetNetflowItemResult Item;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetNetflowResult(
            string id,

            Outputs.GetNetflowItemResult item,

            string networkId)
        {
            Id = id;
            Item = item;
            NetworkId = networkId;
        }
    }
}
