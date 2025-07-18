// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetSmDevicesNetworkAdapters
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
        ///     var example = Meraki.Networks.GetSmDevicesNetworkAdapters.Invoke(new()
        ///     {
        ///         DeviceId = "string",
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksSmDevicesNetworkAdaptersExample"] = example.Apply(getSmDevicesNetworkAdaptersResult =&gt; getSmDevicesNetworkAdaptersResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetSmDevicesNetworkAdaptersResult> InvokeAsync(GetSmDevicesNetworkAdaptersArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSmDevicesNetworkAdaptersResult>("meraki:networks/getSmDevicesNetworkAdapters:getSmDevicesNetworkAdapters", args ?? new GetSmDevicesNetworkAdaptersArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetSmDevicesNetworkAdapters.Invoke(new()
        ///     {
        ///         DeviceId = "string",
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksSmDevicesNetworkAdaptersExample"] = example.Apply(getSmDevicesNetworkAdaptersResult =&gt; getSmDevicesNetworkAdaptersResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetSmDevicesNetworkAdaptersResult> Invoke(GetSmDevicesNetworkAdaptersInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSmDevicesNetworkAdaptersResult>("meraki:networks/getSmDevicesNetworkAdapters:getSmDevicesNetworkAdapters", args ?? new GetSmDevicesNetworkAdaptersInvokeArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetSmDevicesNetworkAdapters.Invoke(new()
        ///     {
        ///         DeviceId = "string",
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksSmDevicesNetworkAdaptersExample"] = example.Apply(getSmDevicesNetworkAdaptersResult =&gt; getSmDevicesNetworkAdaptersResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetSmDevicesNetworkAdaptersResult> Invoke(GetSmDevicesNetworkAdaptersInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSmDevicesNetworkAdaptersResult>("meraki:networks/getSmDevicesNetworkAdapters:getSmDevicesNetworkAdapters", args ?? new GetSmDevicesNetworkAdaptersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSmDevicesNetworkAdaptersArgs : global::Pulumi.InvokeArgs
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

        public GetSmDevicesNetworkAdaptersArgs()
        {
        }
        public static new GetSmDevicesNetworkAdaptersArgs Empty => new GetSmDevicesNetworkAdaptersArgs();
    }

    public sealed class GetSmDevicesNetworkAdaptersInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetSmDevicesNetworkAdaptersInvokeArgs()
        {
        }
        public static new GetSmDevicesNetworkAdaptersInvokeArgs Empty => new GetSmDevicesNetworkAdaptersInvokeArgs();
    }


    [OutputType]
    public sealed class GetSmDevicesNetworkAdaptersResult
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
        /// Array of ResponseSmGetNetworkSmDeviceNetworkAdapters
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSmDevicesNetworkAdaptersItemResult> Items;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetSmDevicesNetworkAdaptersResult(
            string deviceId,

            string id,

            ImmutableArray<Outputs.GetSmDevicesNetworkAdaptersItemResult> items,

            string networkId)
        {
            DeviceId = deviceId;
            Id = id;
            Items = items;
            NetworkId = networkId;
        }
    }
}
