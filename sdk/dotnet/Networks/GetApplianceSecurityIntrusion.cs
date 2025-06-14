// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetApplianceSecurityIntrusion
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
        ///     var example = Meraki.Networks.GetApplianceSecurityIntrusion.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksApplianceSecurityIntrusionExample"] = example.Apply(getApplianceSecurityIntrusionResult =&gt; getApplianceSecurityIntrusionResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetApplianceSecurityIntrusionResult> InvokeAsync(GetApplianceSecurityIntrusionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetApplianceSecurityIntrusionResult>("meraki:networks/getApplianceSecurityIntrusion:getApplianceSecurityIntrusion", args ?? new GetApplianceSecurityIntrusionArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetApplianceSecurityIntrusion.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksApplianceSecurityIntrusionExample"] = example.Apply(getApplianceSecurityIntrusionResult =&gt; getApplianceSecurityIntrusionResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplianceSecurityIntrusionResult> Invoke(GetApplianceSecurityIntrusionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplianceSecurityIntrusionResult>("meraki:networks/getApplianceSecurityIntrusion:getApplianceSecurityIntrusion", args ?? new GetApplianceSecurityIntrusionInvokeArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetApplianceSecurityIntrusion.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksApplianceSecurityIntrusionExample"] = example.Apply(getApplianceSecurityIntrusionResult =&gt; getApplianceSecurityIntrusionResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplianceSecurityIntrusionResult> Invoke(GetApplianceSecurityIntrusionInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplianceSecurityIntrusionResult>("meraki:networks/getApplianceSecurityIntrusion:getApplianceSecurityIntrusion", args ?? new GetApplianceSecurityIntrusionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetApplianceSecurityIntrusionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetApplianceSecurityIntrusionArgs()
        {
        }
        public static new GetApplianceSecurityIntrusionArgs Empty => new GetApplianceSecurityIntrusionArgs();
    }

    public sealed class GetApplianceSecurityIntrusionInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetApplianceSecurityIntrusionInvokeArgs()
        {
        }
        public static new GetApplianceSecurityIntrusionInvokeArgs Empty => new GetApplianceSecurityIntrusionInvokeArgs();
    }


    [OutputType]
    public sealed class GetApplianceSecurityIntrusionResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetApplianceSecurityIntrusionItemResult Item;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetApplianceSecurityIntrusionResult(
            string id,

            Outputs.GetApplianceSecurityIntrusionItemResult item,

            string networkId)
        {
            Id = id;
            Item = item;
            NetworkId = networkId;
        }
    }
}
