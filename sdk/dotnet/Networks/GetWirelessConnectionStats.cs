// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetWirelessConnectionStats
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
        ///     var example = Meraki.Networks.GetWirelessConnectionStats.Invoke(new()
        ///     {
        ///         ApTag = "string",
        ///         Band = "string",
        ///         NetworkId = "string",
        ///         Ssid = 1,
        ///         T0 = "string",
        ///         T1 = "string",
        ///         Timespan = 1,
        ///         Vlan = 1,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksWirelessConnectionStatsExample"] = example.Apply(getWirelessConnectionStatsResult =&gt; getWirelessConnectionStatsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetWirelessConnectionStatsResult> InvokeAsync(GetWirelessConnectionStatsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetWirelessConnectionStatsResult>("meraki:networks/getWirelessConnectionStats:getWirelessConnectionStats", args ?? new GetWirelessConnectionStatsArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetWirelessConnectionStats.Invoke(new()
        ///     {
        ///         ApTag = "string",
        ///         Band = "string",
        ///         NetworkId = "string",
        ///         Ssid = 1,
        ///         T0 = "string",
        ///         T1 = "string",
        ///         Timespan = 1,
        ///         Vlan = 1,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksWirelessConnectionStatsExample"] = example.Apply(getWirelessConnectionStatsResult =&gt; getWirelessConnectionStatsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetWirelessConnectionStatsResult> Invoke(GetWirelessConnectionStatsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetWirelessConnectionStatsResult>("meraki:networks/getWirelessConnectionStats:getWirelessConnectionStats", args ?? new GetWirelessConnectionStatsInvokeArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetWirelessConnectionStats.Invoke(new()
        ///     {
        ///         ApTag = "string",
        ///         Band = "string",
        ///         NetworkId = "string",
        ///         Ssid = 1,
        ///         T0 = "string",
        ///         T1 = "string",
        ///         Timespan = 1,
        ///         Vlan = 1,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksWirelessConnectionStatsExample"] = example.Apply(getWirelessConnectionStatsResult =&gt; getWirelessConnectionStatsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetWirelessConnectionStatsResult> Invoke(GetWirelessConnectionStatsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetWirelessConnectionStatsResult>("meraki:networks/getWirelessConnectionStats:getWirelessConnectionStats", args ?? new GetWirelessConnectionStatsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetWirelessConnectionStatsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// apTag query parameter. Filter results by AP Tag
        /// </summary>
        [Input("apTag")]
        public string? ApTag { get; set; }

        /// <summary>
        /// band query parameter. Filter results by band (either '2.4', '5' or '6'). Note that data prior to February 2020 will not have band information.
        /// </summary>
        [Input("band")]
        public string? Band { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        /// <summary>
        /// ssid query parameter. Filter results by SSID
        /// </summary>
        [Input("ssid")]
        public int? Ssid { get; set; }

        /// <summary>
        /// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 180 days from today.
        /// </summary>
        [Input("t0")]
        public string? T0 { get; set; }

        /// <summary>
        /// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
        /// </summary>
        [Input("t1")]
        public string? T1 { get; set; }

        /// <summary>
        /// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days.
        /// </summary>
        [Input("timespan")]
        public double? Timespan { get; set; }

        /// <summary>
        /// vlan query parameter. Filter results by VLAN
        /// </summary>
        [Input("vlan")]
        public int? Vlan { get; set; }

        public GetWirelessConnectionStatsArgs()
        {
        }
        public static new GetWirelessConnectionStatsArgs Empty => new GetWirelessConnectionStatsArgs();
    }

    public sealed class GetWirelessConnectionStatsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// apTag query parameter. Filter results by AP Tag
        /// </summary>
        [Input("apTag")]
        public Input<string>? ApTag { get; set; }

        /// <summary>
        /// band query parameter. Filter results by band (either '2.4', '5' or '6'). Note that data prior to February 2020 will not have band information.
        /// </summary>
        [Input("band")]
        public Input<string>? Band { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        /// <summary>
        /// ssid query parameter. Filter results by SSID
        /// </summary>
        [Input("ssid")]
        public Input<int>? Ssid { get; set; }

        /// <summary>
        /// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 180 days from today.
        /// </summary>
        [Input("t0")]
        public Input<string>? T0 { get; set; }

        /// <summary>
        /// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
        /// </summary>
        [Input("t1")]
        public Input<string>? T1 { get; set; }

        /// <summary>
        /// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days.
        /// </summary>
        [Input("timespan")]
        public Input<double>? Timespan { get; set; }

        /// <summary>
        /// vlan query parameter. Filter results by VLAN
        /// </summary>
        [Input("vlan")]
        public Input<int>? Vlan { get; set; }

        public GetWirelessConnectionStatsInvokeArgs()
        {
        }
        public static new GetWirelessConnectionStatsInvokeArgs Empty => new GetWirelessConnectionStatsInvokeArgs();
    }


    [OutputType]
    public sealed class GetWirelessConnectionStatsResult
    {
        /// <summary>
        /// apTag query parameter. Filter results by AP Tag
        /// </summary>
        public readonly string? ApTag;
        /// <summary>
        /// band query parameter. Filter results by band (either '2.4', '5' or '6'). Note that data prior to February 2020 will not have band information.
        /// </summary>
        public readonly string? Band;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetWirelessConnectionStatsItemResult Item;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;
        /// <summary>
        /// ssid query parameter. Filter results by SSID
        /// </summary>
        public readonly int? Ssid;
        /// <summary>
        /// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 180 days from today.
        /// </summary>
        public readonly string? T0;
        /// <summary>
        /// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
        /// </summary>
        public readonly string? T1;
        /// <summary>
        /// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days.
        /// </summary>
        public readonly double? Timespan;
        /// <summary>
        /// vlan query parameter. Filter results by VLAN
        /// </summary>
        public readonly int? Vlan;

        [OutputConstructor]
        private GetWirelessConnectionStatsResult(
            string? apTag,

            string? band,

            string id,

            Outputs.GetWirelessConnectionStatsItemResult item,

            string networkId,

            int? ssid,

            string? t0,

            string? t1,

            double? timespan,

            int? vlan)
        {
            ApTag = apTag;
            Band = band;
            Id = id;
            Item = item;
            NetworkId = networkId;
            Ssid = ssid;
            T0 = t0;
            T1 = t1;
            Timespan = timespan;
            Vlan = vlan;
        }
    }
}
