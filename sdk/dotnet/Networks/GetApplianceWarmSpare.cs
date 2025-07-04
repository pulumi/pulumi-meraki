// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetApplianceWarmSpare
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
        ///     var example = Meraki.Networks.GetApplianceWarmSpare.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksApplianceWarmSpareExample"] = example.Apply(getApplianceWarmSpareResult =&gt; getApplianceWarmSpareResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetApplianceWarmSpareResult> InvokeAsync(GetApplianceWarmSpareArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetApplianceWarmSpareResult>("meraki:networks/getApplianceWarmSpare:getApplianceWarmSpare", args ?? new GetApplianceWarmSpareArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetApplianceWarmSpare.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksApplianceWarmSpareExample"] = example.Apply(getApplianceWarmSpareResult =&gt; getApplianceWarmSpareResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplianceWarmSpareResult> Invoke(GetApplianceWarmSpareInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplianceWarmSpareResult>("meraki:networks/getApplianceWarmSpare:getApplianceWarmSpare", args ?? new GetApplianceWarmSpareInvokeArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetApplianceWarmSpare.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksApplianceWarmSpareExample"] = example.Apply(getApplianceWarmSpareResult =&gt; getApplianceWarmSpareResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplianceWarmSpareResult> Invoke(GetApplianceWarmSpareInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplianceWarmSpareResult>("meraki:networks/getApplianceWarmSpare:getApplianceWarmSpare", args ?? new GetApplianceWarmSpareInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetApplianceWarmSpareArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetApplianceWarmSpareArgs()
        {
        }
        public static new GetApplianceWarmSpareArgs Empty => new GetApplianceWarmSpareArgs();
    }

    public sealed class GetApplianceWarmSpareInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetApplianceWarmSpareInvokeArgs()
        {
        }
        public static new GetApplianceWarmSpareInvokeArgs Empty => new GetApplianceWarmSpareInvokeArgs();
    }


    [OutputType]
    public sealed class GetApplianceWarmSpareResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetApplianceWarmSpareItemResult Item;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetApplianceWarmSpareResult(
            string id,

            Outputs.GetApplianceWarmSpareItemResult item,

            string networkId)
        {
            Id = id;
            Item = item;
            NetworkId = networkId;
        }
    }
}
