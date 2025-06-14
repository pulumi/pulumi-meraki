// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetBluetoothClients
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
        ///     var example = Meraki.Networks.GetBluetoothClients.Invoke(new()
        ///     {
        ///         BluetoothClientId = "string",
        ///         ConnectivityHistoryTimespan = 1,
        ///         IncludeConnectivityHistory = false,
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksBluetoothClientsExample"] = example.Apply(getBluetoothClientsResult =&gt; getBluetoothClientsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetBluetoothClientsResult> InvokeAsync(GetBluetoothClientsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetBluetoothClientsResult>("meraki:networks/getBluetoothClients:getBluetoothClients", args ?? new GetBluetoothClientsArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetBluetoothClients.Invoke(new()
        ///     {
        ///         BluetoothClientId = "string",
        ///         ConnectivityHistoryTimespan = 1,
        ///         IncludeConnectivityHistory = false,
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksBluetoothClientsExample"] = example.Apply(getBluetoothClientsResult =&gt; getBluetoothClientsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetBluetoothClientsResult> Invoke(GetBluetoothClientsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetBluetoothClientsResult>("meraki:networks/getBluetoothClients:getBluetoothClients", args ?? new GetBluetoothClientsInvokeArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetBluetoothClients.Invoke(new()
        ///     {
        ///         BluetoothClientId = "string",
        ///         ConnectivityHistoryTimespan = 1,
        ///         IncludeConnectivityHistory = false,
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksBluetoothClientsExample"] = example.Apply(getBluetoothClientsResult =&gt; getBluetoothClientsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetBluetoothClientsResult> Invoke(GetBluetoothClientsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetBluetoothClientsResult>("meraki:networks/getBluetoothClients:getBluetoothClients", args ?? new GetBluetoothClientsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBluetoothClientsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// bluetoothClientId path parameter. Bluetooth client ID
        /// </summary>
        [Input("bluetoothClientId", required: true)]
        public string BluetoothClientId { get; set; } = null!;

        /// <summary>
        /// connectivityHistoryTimespan query parameter. The timespan, in seconds, for the connectivityHistory data. By default 1 day, 86400, will be used.
        /// </summary>
        [Input("connectivityHistoryTimespan")]
        public int? ConnectivityHistoryTimespan { get; set; }

        /// <summary>
        /// includeConnectivityHistory query parameter. Include the connectivity history for this client
        /// </summary>
        [Input("includeConnectivityHistory")]
        public bool? IncludeConnectivityHistory { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetBluetoothClientsArgs()
        {
        }
        public static new GetBluetoothClientsArgs Empty => new GetBluetoothClientsArgs();
    }

    public sealed class GetBluetoothClientsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// bluetoothClientId path parameter. Bluetooth client ID
        /// </summary>
        [Input("bluetoothClientId", required: true)]
        public Input<string> BluetoothClientId { get; set; } = null!;

        /// <summary>
        /// connectivityHistoryTimespan query parameter. The timespan, in seconds, for the connectivityHistory data. By default 1 day, 86400, will be used.
        /// </summary>
        [Input("connectivityHistoryTimespan")]
        public Input<int>? ConnectivityHistoryTimespan { get; set; }

        /// <summary>
        /// includeConnectivityHistory query parameter. Include the connectivity history for this client
        /// </summary>
        [Input("includeConnectivityHistory")]
        public Input<bool>? IncludeConnectivityHistory { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetBluetoothClientsInvokeArgs()
        {
        }
        public static new GetBluetoothClientsInvokeArgs Empty => new GetBluetoothClientsInvokeArgs();
    }


    [OutputType]
    public sealed class GetBluetoothClientsResult
    {
        /// <summary>
        /// bluetoothClientId path parameter. Bluetooth client ID
        /// </summary>
        public readonly string BluetoothClientId;
        /// <summary>
        /// connectivityHistoryTimespan query parameter. The timespan, in seconds, for the connectivityHistory data. By default 1 day, 86400, will be used.
        /// </summary>
        public readonly int? ConnectivityHistoryTimespan;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// includeConnectivityHistory query parameter. Include the connectivity history for this client
        /// </summary>
        public readonly bool? IncludeConnectivityHistory;
        public readonly Outputs.GetBluetoothClientsItemResult Item;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetBluetoothClientsResult(
            string bluetoothClientId,

            int? connectivityHistoryTimespan,

            string id,

            bool? includeConnectivityHistory,

            Outputs.GetBluetoothClientsItemResult item,

            string networkId)
        {
            BluetoothClientId = bluetoothClientId;
            ConnectivityHistoryTimespan = connectivityHistoryTimespan;
            Id = id;
            IncludeConnectivityHistory = includeConnectivityHistory;
            Item = item;
            NetworkId = networkId;
        }
    }
}
