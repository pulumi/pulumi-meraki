// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetWirelessSsidsSplashSettings
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
        ///     var example = Meraki.Networks.GetWirelessSsidsSplashSettings.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///         Number = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksWirelessSsidsSplashSettingsExample"] = example.Apply(getWirelessSsidsSplashSettingsResult =&gt; getWirelessSsidsSplashSettingsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetWirelessSsidsSplashSettingsResult> InvokeAsync(GetWirelessSsidsSplashSettingsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetWirelessSsidsSplashSettingsResult>("meraki:networks/getWirelessSsidsSplashSettings:getWirelessSsidsSplashSettings", args ?? new GetWirelessSsidsSplashSettingsArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetWirelessSsidsSplashSettings.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///         Number = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksWirelessSsidsSplashSettingsExample"] = example.Apply(getWirelessSsidsSplashSettingsResult =&gt; getWirelessSsidsSplashSettingsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetWirelessSsidsSplashSettingsResult> Invoke(GetWirelessSsidsSplashSettingsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetWirelessSsidsSplashSettingsResult>("meraki:networks/getWirelessSsidsSplashSettings:getWirelessSsidsSplashSettings", args ?? new GetWirelessSsidsSplashSettingsInvokeArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetWirelessSsidsSplashSettings.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///         Number = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksWirelessSsidsSplashSettingsExample"] = example.Apply(getWirelessSsidsSplashSettingsResult =&gt; getWirelessSsidsSplashSettingsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetWirelessSsidsSplashSettingsResult> Invoke(GetWirelessSsidsSplashSettingsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetWirelessSsidsSplashSettingsResult>("meraki:networks/getWirelessSsidsSplashSettings:getWirelessSsidsSplashSettings", args ?? new GetWirelessSsidsSplashSettingsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetWirelessSsidsSplashSettingsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        /// <summary>
        /// number path parameter.
        /// </summary>
        [Input("number", required: true)]
        public string Number { get; set; } = null!;

        public GetWirelessSsidsSplashSettingsArgs()
        {
        }
        public static new GetWirelessSsidsSplashSettingsArgs Empty => new GetWirelessSsidsSplashSettingsArgs();
    }

    public sealed class GetWirelessSsidsSplashSettingsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        /// <summary>
        /// number path parameter.
        /// </summary>
        [Input("number", required: true)]
        public Input<string> Number { get; set; } = null!;

        public GetWirelessSsidsSplashSettingsInvokeArgs()
        {
        }
        public static new GetWirelessSsidsSplashSettingsInvokeArgs Empty => new GetWirelessSsidsSplashSettingsInvokeArgs();
    }


    [OutputType]
    public sealed class GetWirelessSsidsSplashSettingsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetWirelessSsidsSplashSettingsItemResult Item;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;
        /// <summary>
        /// number path parameter.
        /// </summary>
        public readonly string Number;

        [OutputConstructor]
        private GetWirelessSsidsSplashSettingsResult(
            string id,

            Outputs.GetWirelessSsidsSplashSettingsItemResult item,

            string networkId,

            string number)
        {
            Id = id;
            Item = item;
            NetworkId = networkId;
            Number = number;
        }
    }
}
