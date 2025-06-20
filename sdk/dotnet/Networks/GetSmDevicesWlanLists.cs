// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetSmDevicesWlanLists
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
        ///     var example = Meraki.Networks.GetSmDevicesWlanLists.Invoke(new()
        ///     {
        ///         DeviceId = "string",
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksSmDevicesWlanListsExample"] = example.Apply(getSmDevicesWlanListsResult =&gt; getSmDevicesWlanListsResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetSmDevicesWlanListsResult> InvokeAsync(GetSmDevicesWlanListsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSmDevicesWlanListsResult>("meraki:networks/getSmDevicesWlanLists:getSmDevicesWlanLists", args ?? new GetSmDevicesWlanListsArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetSmDevicesWlanLists.Invoke(new()
        ///     {
        ///         DeviceId = "string",
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksSmDevicesWlanListsExample"] = example.Apply(getSmDevicesWlanListsResult =&gt; getSmDevicesWlanListsResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetSmDevicesWlanListsResult> Invoke(GetSmDevicesWlanListsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSmDevicesWlanListsResult>("meraki:networks/getSmDevicesWlanLists:getSmDevicesWlanLists", args ?? new GetSmDevicesWlanListsInvokeArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetSmDevicesWlanLists.Invoke(new()
        ///     {
        ///         DeviceId = "string",
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksSmDevicesWlanListsExample"] = example.Apply(getSmDevicesWlanListsResult =&gt; getSmDevicesWlanListsResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetSmDevicesWlanListsResult> Invoke(GetSmDevicesWlanListsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSmDevicesWlanListsResult>("meraki:networks/getSmDevicesWlanLists:getSmDevicesWlanLists", args ?? new GetSmDevicesWlanListsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSmDevicesWlanListsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// deviceId path parameter. Device ID
        /// </summary>
        [Input("deviceId", required: true)]
        public string DeviceId { get; set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetSmDevicesWlanListsArgs()
        {
        }
        public static new GetSmDevicesWlanListsArgs Empty => new GetSmDevicesWlanListsArgs();
    }

    public sealed class GetSmDevicesWlanListsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// deviceId path parameter. Device ID
        /// </summary>
        [Input("deviceId", required: true)]
        public Input<string> DeviceId { get; set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetSmDevicesWlanListsInvokeArgs()
        {
        }
        public static new GetSmDevicesWlanListsInvokeArgs Empty => new GetSmDevicesWlanListsInvokeArgs();
    }


    [OutputType]
    public sealed class GetSmDevicesWlanListsResult
    {
        /// <summary>
        /// deviceId path parameter. Device ID
        /// </summary>
        public readonly string DeviceId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Array of ResponseSmGetNetworkSmDeviceWlanLists
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSmDevicesWlanListsItemResult> Items;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetSmDevicesWlanListsResult(
            string deviceId,

            string id,

            ImmutableArray<Outputs.GetSmDevicesWlanListsItemResult> items,

            string networkId)
        {
            DeviceId = deviceId;
            Id = id;
            Items = items;
            NetworkId = networkId;
        }
    }
}
