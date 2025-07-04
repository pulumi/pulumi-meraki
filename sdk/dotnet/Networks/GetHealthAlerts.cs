// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetHealthAlerts
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
        ///     var example = Meraki.Networks.GetHealthAlerts.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksHealthAlertsExample"] = example.Apply(getHealthAlertsResult =&gt; getHealthAlertsResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetHealthAlertsResult> InvokeAsync(GetHealthAlertsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetHealthAlertsResult>("meraki:networks/getHealthAlerts:getHealthAlerts", args ?? new GetHealthAlertsArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetHealthAlerts.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksHealthAlertsExample"] = example.Apply(getHealthAlertsResult =&gt; getHealthAlertsResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetHealthAlertsResult> Invoke(GetHealthAlertsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetHealthAlertsResult>("meraki:networks/getHealthAlerts:getHealthAlerts", args ?? new GetHealthAlertsInvokeArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetHealthAlerts.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksHealthAlertsExample"] = example.Apply(getHealthAlertsResult =&gt; getHealthAlertsResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetHealthAlertsResult> Invoke(GetHealthAlertsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetHealthAlertsResult>("meraki:networks/getHealthAlerts:getHealthAlerts", args ?? new GetHealthAlertsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetHealthAlertsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetHealthAlertsArgs()
        {
        }
        public static new GetHealthAlertsArgs Empty => new GetHealthAlertsArgs();
    }

    public sealed class GetHealthAlertsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetHealthAlertsInvokeArgs()
        {
        }
        public static new GetHealthAlertsInvokeArgs Empty => new GetHealthAlertsInvokeArgs();
    }


    [OutputType]
    public sealed class GetHealthAlertsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Array of ResponseNetworksGetNetworkHealthAlerts
        /// </summary>
        public readonly ImmutableArray<Outputs.GetHealthAlertsItemResult> Items;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetHealthAlertsResult(
            string id,

            ImmutableArray<Outputs.GetHealthAlertsItemResult> items,

            string networkId)
        {
            Id = id;
            Items = items;
            NetworkId = networkId;
        }
    }
}
