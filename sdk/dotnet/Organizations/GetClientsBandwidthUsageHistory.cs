// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations
{
    public static class GetClientsBandwidthUsageHistory
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
        ///     var example = Meraki.Organizations.GetClientsBandwidthUsageHistory.Invoke(new()
        ///     {
        ///         OrganizationId = "string",
        ///         T0 = "string",
        ///         T1 = "string",
        ///         Timespan = 1,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiOrganizationsClientsBandwidthUsageHistoryExample"] = example.Apply(getClientsBandwidthUsageHistoryResult =&gt; getClientsBandwidthUsageHistoryResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetClientsBandwidthUsageHistoryResult> InvokeAsync(GetClientsBandwidthUsageHistoryArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetClientsBandwidthUsageHistoryResult>("meraki:organizations/getClientsBandwidthUsageHistory:getClientsBandwidthUsageHistory", args ?? new GetClientsBandwidthUsageHistoryArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Organizations.GetClientsBandwidthUsageHistory.Invoke(new()
        ///     {
        ///         OrganizationId = "string",
        ///         T0 = "string",
        ///         T1 = "string",
        ///         Timespan = 1,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiOrganizationsClientsBandwidthUsageHistoryExample"] = example.Apply(getClientsBandwidthUsageHistoryResult =&gt; getClientsBandwidthUsageHistoryResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetClientsBandwidthUsageHistoryResult> Invoke(GetClientsBandwidthUsageHistoryInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetClientsBandwidthUsageHistoryResult>("meraki:organizations/getClientsBandwidthUsageHistory:getClientsBandwidthUsageHistory", args ?? new GetClientsBandwidthUsageHistoryInvokeArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Organizations.GetClientsBandwidthUsageHistory.Invoke(new()
        ///     {
        ///         OrganizationId = "string",
        ///         T0 = "string",
        ///         T1 = "string",
        ///         Timespan = 1,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiOrganizationsClientsBandwidthUsageHistoryExample"] = example.Apply(getClientsBandwidthUsageHistoryResult =&gt; getClientsBandwidthUsageHistoryResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetClientsBandwidthUsageHistoryResult> Invoke(GetClientsBandwidthUsageHistoryInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetClientsBandwidthUsageHistoryResult>("meraki:organizations/getClientsBandwidthUsageHistory:getClientsBandwidthUsageHistory", args ?? new GetClientsBandwidthUsageHistoryInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetClientsBandwidthUsageHistoryArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId", required: true)]
        public string OrganizationId { get; set; } = null!;

        /// <summary>
        /// t0 query parameter. The beginning of the timespan for the data.
        /// </summary>
        [Input("t0")]
        public string? T0 { get; set; }

        /// <summary>
        /// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
        /// </summary>
        [Input("t1")]
        public string? T1 { get; set; }

        /// <summary>
        /// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
        /// </summary>
        [Input("timespan")]
        public double? Timespan { get; set; }

        public GetClientsBandwidthUsageHistoryArgs()
        {
        }
        public static new GetClientsBandwidthUsageHistoryArgs Empty => new GetClientsBandwidthUsageHistoryArgs();
    }

    public sealed class GetClientsBandwidthUsageHistoryInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        /// <summary>
        /// t0 query parameter. The beginning of the timespan for the data.
        /// </summary>
        [Input("t0")]
        public Input<string>? T0 { get; set; }

        /// <summary>
        /// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
        /// </summary>
        [Input("t1")]
        public Input<string>? T1 { get; set; }

        /// <summary>
        /// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
        /// </summary>
        [Input("timespan")]
        public Input<double>? Timespan { get; set; }

        public GetClientsBandwidthUsageHistoryInvokeArgs()
        {
        }
        public static new GetClientsBandwidthUsageHistoryInvokeArgs Empty => new GetClientsBandwidthUsageHistoryInvokeArgs();
    }


    [OutputType]
    public sealed class GetClientsBandwidthUsageHistoryResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Array of ResponseOrganizationsGetOrganizationClientsBandwidthUsageHistory
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClientsBandwidthUsageHistoryItemResult> Items;
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        public readonly string OrganizationId;
        /// <summary>
        /// t0 query parameter. The beginning of the timespan for the data.
        /// </summary>
        public readonly string? T0;
        /// <summary>
        /// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
        /// </summary>
        public readonly string? T1;
        /// <summary>
        /// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
        /// </summary>
        public readonly double? Timespan;

        [OutputConstructor]
        private GetClientsBandwidthUsageHistoryResult(
            string id,

            ImmutableArray<Outputs.GetClientsBandwidthUsageHistoryItemResult> items,

            string organizationId,

            string? t0,

            string? t1,

            double? timespan)
        {
            Id = id;
            Items = items;
            OrganizationId = organizationId;
            T0 = t0;
            T1 = t1;
            Timespan = timespan;
        }
    }
}
