// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetWirelessSsidsSchedules
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
        ///     var example = Meraki.Networks.GetWirelessSsidsSchedules.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///         Number = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksWirelessSsidsSchedulesExample"] = example.Apply(getWirelessSsidsSchedulesResult =&gt; getWirelessSsidsSchedulesResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetWirelessSsidsSchedulesResult> InvokeAsync(GetWirelessSsidsSchedulesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetWirelessSsidsSchedulesResult>("meraki:networks/getWirelessSsidsSchedules:getWirelessSsidsSchedules", args ?? new GetWirelessSsidsSchedulesArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetWirelessSsidsSchedules.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///         Number = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksWirelessSsidsSchedulesExample"] = example.Apply(getWirelessSsidsSchedulesResult =&gt; getWirelessSsidsSchedulesResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetWirelessSsidsSchedulesResult> Invoke(GetWirelessSsidsSchedulesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetWirelessSsidsSchedulesResult>("meraki:networks/getWirelessSsidsSchedules:getWirelessSsidsSchedules", args ?? new GetWirelessSsidsSchedulesInvokeArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetWirelessSsidsSchedules.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///         Number = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksWirelessSsidsSchedulesExample"] = example.Apply(getWirelessSsidsSchedulesResult =&gt; getWirelessSsidsSchedulesResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetWirelessSsidsSchedulesResult> Invoke(GetWirelessSsidsSchedulesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetWirelessSsidsSchedulesResult>("meraki:networks/getWirelessSsidsSchedules:getWirelessSsidsSchedules", args ?? new GetWirelessSsidsSchedulesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetWirelessSsidsSchedulesArgs : global::Pulumi.InvokeArgs
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

        public GetWirelessSsidsSchedulesArgs()
        {
        }
        public static new GetWirelessSsidsSchedulesArgs Empty => new GetWirelessSsidsSchedulesArgs();
    }

    public sealed class GetWirelessSsidsSchedulesInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetWirelessSsidsSchedulesInvokeArgs()
        {
        }
        public static new GetWirelessSsidsSchedulesInvokeArgs Empty => new GetWirelessSsidsSchedulesInvokeArgs();
    }


    [OutputType]
    public sealed class GetWirelessSsidsSchedulesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetWirelessSsidsSchedulesItemResult Item;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;
        /// <summary>
        /// number path parameter.
        /// </summary>
        public readonly string Number;

        [OutputConstructor]
        private GetWirelessSsidsSchedulesResult(
            string id,

            Outputs.GetWirelessSsidsSchedulesItemResult item,

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
