// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetWirelessBluetoothSettings
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
        ///     var example = Meraki.Networks.GetWirelessBluetoothSettings.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksWirelessBluetoothSettingsExample"] = example.Apply(getWirelessBluetoothSettingsResult =&gt; getWirelessBluetoothSettingsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetWirelessBluetoothSettingsResult> InvokeAsync(GetWirelessBluetoothSettingsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetWirelessBluetoothSettingsResult>("meraki:networks/getWirelessBluetoothSettings:getWirelessBluetoothSettings", args ?? new GetWirelessBluetoothSettingsArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetWirelessBluetoothSettings.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksWirelessBluetoothSettingsExample"] = example.Apply(getWirelessBluetoothSettingsResult =&gt; getWirelessBluetoothSettingsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetWirelessBluetoothSettingsResult> Invoke(GetWirelessBluetoothSettingsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetWirelessBluetoothSettingsResult>("meraki:networks/getWirelessBluetoothSettings:getWirelessBluetoothSettings", args ?? new GetWirelessBluetoothSettingsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetWirelessBluetoothSettingsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetWirelessBluetoothSettingsArgs()
        {
        }
        public static new GetWirelessBluetoothSettingsArgs Empty => new GetWirelessBluetoothSettingsArgs();
    }

    public sealed class GetWirelessBluetoothSettingsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetWirelessBluetoothSettingsInvokeArgs()
        {
        }
        public static new GetWirelessBluetoothSettingsInvokeArgs Empty => new GetWirelessBluetoothSettingsInvokeArgs();
    }


    [OutputType]
    public sealed class GetWirelessBluetoothSettingsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetWirelessBluetoothSettingsItemResult Item;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetWirelessBluetoothSettingsResult(
            string id,

            Outputs.GetWirelessBluetoothSettingsItemResult item,

            string networkId)
        {
            Id = id;
            Item = item;
            NetworkId = networkId;
        }
    }
}