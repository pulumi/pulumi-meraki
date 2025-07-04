// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetCellularGatewayDhcp
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
        ///     var example = Meraki.Networks.GetCellularGatewayDhcp.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksCellularGatewayDhcpExample"] = example.Apply(getCellularGatewayDhcpResult =&gt; getCellularGatewayDhcpResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetCellularGatewayDhcpResult> InvokeAsync(GetCellularGatewayDhcpArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCellularGatewayDhcpResult>("meraki:networks/getCellularGatewayDhcp:getCellularGatewayDhcp", args ?? new GetCellularGatewayDhcpArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetCellularGatewayDhcp.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksCellularGatewayDhcpExample"] = example.Apply(getCellularGatewayDhcpResult =&gt; getCellularGatewayDhcpResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetCellularGatewayDhcpResult> Invoke(GetCellularGatewayDhcpInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCellularGatewayDhcpResult>("meraki:networks/getCellularGatewayDhcp:getCellularGatewayDhcp", args ?? new GetCellularGatewayDhcpInvokeArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetCellularGatewayDhcp.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksCellularGatewayDhcpExample"] = example.Apply(getCellularGatewayDhcpResult =&gt; getCellularGatewayDhcpResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetCellularGatewayDhcpResult> Invoke(GetCellularGatewayDhcpInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCellularGatewayDhcpResult>("meraki:networks/getCellularGatewayDhcp:getCellularGatewayDhcp", args ?? new GetCellularGatewayDhcpInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCellularGatewayDhcpArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetCellularGatewayDhcpArgs()
        {
        }
        public static new GetCellularGatewayDhcpArgs Empty => new GetCellularGatewayDhcpArgs();
    }

    public sealed class GetCellularGatewayDhcpInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetCellularGatewayDhcpInvokeArgs()
        {
        }
        public static new GetCellularGatewayDhcpInvokeArgs Empty => new GetCellularGatewayDhcpInvokeArgs();
    }


    [OutputType]
    public sealed class GetCellularGatewayDhcpResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetCellularGatewayDhcpItemResult Item;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetCellularGatewayDhcpResult(
            string id,

            Outputs.GetCellularGatewayDhcpItemResult item,

            string networkId)
        {
            Id = id;
            Item = item;
            NetworkId = networkId;
        }
    }
}
