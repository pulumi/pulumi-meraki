// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetFirmwareUpgradesStagedStages
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
        ///     var example = Meraki.Networks.GetFirmwareUpgradesStagedStages.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksFirmwareUpgradesStagedStagesExample"] = example.Apply(getFirmwareUpgradesStagedStagesResult =&gt; getFirmwareUpgradesStagedStagesResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetFirmwareUpgradesStagedStagesResult> InvokeAsync(GetFirmwareUpgradesStagedStagesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFirmwareUpgradesStagedStagesResult>("meraki:networks/getFirmwareUpgradesStagedStages:getFirmwareUpgradesStagedStages", args ?? new GetFirmwareUpgradesStagedStagesArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetFirmwareUpgradesStagedStages.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksFirmwareUpgradesStagedStagesExample"] = example.Apply(getFirmwareUpgradesStagedStagesResult =&gt; getFirmwareUpgradesStagedStagesResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetFirmwareUpgradesStagedStagesResult> Invoke(GetFirmwareUpgradesStagedStagesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFirmwareUpgradesStagedStagesResult>("meraki:networks/getFirmwareUpgradesStagedStages:getFirmwareUpgradesStagedStages", args ?? new GetFirmwareUpgradesStagedStagesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFirmwareUpgradesStagedStagesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetFirmwareUpgradesStagedStagesArgs()
        {
        }
        public static new GetFirmwareUpgradesStagedStagesArgs Empty => new GetFirmwareUpgradesStagedStagesArgs();
    }

    public sealed class GetFirmwareUpgradesStagedStagesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetFirmwareUpgradesStagedStagesInvokeArgs()
        {
        }
        public static new GetFirmwareUpgradesStagedStagesInvokeArgs Empty => new GetFirmwareUpgradesStagedStagesInvokeArgs();
    }


    [OutputType]
    public sealed class GetFirmwareUpgradesStagedStagesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Array of ResponseNetworksGetNetworkFirmwareUpgradesStagedStages
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFirmwareUpgradesStagedStagesItemResult> Items;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetFirmwareUpgradesStagedStagesResult(
            string id,

            ImmutableArray<Outputs.GetFirmwareUpgradesStagedStagesItemResult> items,

            string networkId)
        {
            Id = id;
            Items = items;
            NetworkId = networkId;
        }
    }
}