// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetAppliancePrefixesDelegatedStatics
    {
        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Task<GetAppliancePrefixesDelegatedStaticsResult> InvokeAsync(GetAppliancePrefixesDelegatedStaticsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAppliancePrefixesDelegatedStaticsResult>("meraki:networks/getAppliancePrefixesDelegatedStatics:getAppliancePrefixesDelegatedStatics", args ?? new GetAppliancePrefixesDelegatedStaticsArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Output<GetAppliancePrefixesDelegatedStaticsResult> Invoke(GetAppliancePrefixesDelegatedStaticsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAppliancePrefixesDelegatedStaticsResult>("meraki:networks/getAppliancePrefixesDelegatedStatics:getAppliancePrefixesDelegatedStatics", args ?? new GetAppliancePrefixesDelegatedStaticsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAppliancePrefixesDelegatedStaticsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public string? NetworkId { get; set; }

        /// <summary>
        /// staticDelegatedPrefixId path parameter. Static delegated prefix ID
        /// </summary>
        [Input("staticDelegatedPrefixId")]
        public string? StaticDelegatedPrefixId { get; set; }

        public GetAppliancePrefixesDelegatedStaticsArgs()
        {
        }
        public static new GetAppliancePrefixesDelegatedStaticsArgs Empty => new GetAppliancePrefixesDelegatedStaticsArgs();
    }

    public sealed class GetAppliancePrefixesDelegatedStaticsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// staticDelegatedPrefixId path parameter. Static delegated prefix ID
        /// </summary>
        [Input("staticDelegatedPrefixId")]
        public Input<string>? StaticDelegatedPrefixId { get; set; }

        public GetAppliancePrefixesDelegatedStaticsInvokeArgs()
        {
        }
        public static new GetAppliancePrefixesDelegatedStaticsInvokeArgs Empty => new GetAppliancePrefixesDelegatedStaticsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAppliancePrefixesDelegatedStaticsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetAppliancePrefixesDelegatedStaticsItemResult Item;
        /// <summary>
        /// Array of ResponseApplianceGetNetworkAppliancePrefixesDelegatedStatics
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAppliancePrefixesDelegatedStaticsItemResult> Items;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string? NetworkId;
        /// <summary>
        /// staticDelegatedPrefixId path parameter. Static delegated prefix ID
        /// </summary>
        public readonly string? StaticDelegatedPrefixId;

        [OutputConstructor]
        private GetAppliancePrefixesDelegatedStaticsResult(
            string id,

            Outputs.GetAppliancePrefixesDelegatedStaticsItemResult item,

            ImmutableArray<Outputs.GetAppliancePrefixesDelegatedStaticsItemResult> items,

            string? networkId,

            string? staticDelegatedPrefixId)
        {
            Id = id;
            Item = item;
            Items = items;
            NetworkId = networkId;
            StaticDelegatedPrefixId = staticDelegatedPrefixId;
        }
    }
}