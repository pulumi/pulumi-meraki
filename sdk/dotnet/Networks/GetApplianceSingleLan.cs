// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetApplianceSingleLan
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
        ///     var example = Meraki.Networks.GetApplianceSingleLan.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksApplianceSingleLanExample"] = example.Apply(getApplianceSingleLanResult =&gt; getApplianceSingleLanResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetApplianceSingleLanResult> InvokeAsync(GetApplianceSingleLanArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetApplianceSingleLanResult>("meraki:networks/getApplianceSingleLan:getApplianceSingleLan", args ?? new GetApplianceSingleLanArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetApplianceSingleLan.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksApplianceSingleLanExample"] = example.Apply(getApplianceSingleLanResult =&gt; getApplianceSingleLanResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplianceSingleLanResult> Invoke(GetApplianceSingleLanInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplianceSingleLanResult>("meraki:networks/getApplianceSingleLan:getApplianceSingleLan", args ?? new GetApplianceSingleLanInvokeArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetApplianceSingleLan.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksApplianceSingleLanExample"] = example.Apply(getApplianceSingleLanResult =&gt; getApplianceSingleLanResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplianceSingleLanResult> Invoke(GetApplianceSingleLanInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplianceSingleLanResult>("meraki:networks/getApplianceSingleLan:getApplianceSingleLan", args ?? new GetApplianceSingleLanInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetApplianceSingleLanArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetApplianceSingleLanArgs()
        {
        }
        public static new GetApplianceSingleLanArgs Empty => new GetApplianceSingleLanArgs();
    }

    public sealed class GetApplianceSingleLanInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetApplianceSingleLanInvokeArgs()
        {
        }
        public static new GetApplianceSingleLanInvokeArgs Empty => new GetApplianceSingleLanInvokeArgs();
    }


    [OutputType]
    public sealed class GetApplianceSingleLanResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetApplianceSingleLanItemResult Item;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetApplianceSingleLanResult(
            string id,

            Outputs.GetApplianceSingleLanItemResult item,

            string networkId)
        {
            Id = id;
            Item = item;
            NetworkId = networkId;
        }
    }
}
