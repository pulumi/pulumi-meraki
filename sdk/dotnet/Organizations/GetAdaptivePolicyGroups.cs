// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations
{
    public static class GetAdaptivePolicyGroups
    {
        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Task<GetAdaptivePolicyGroupsResult> InvokeAsync(GetAdaptivePolicyGroupsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAdaptivePolicyGroupsResult>("meraki:organizations/getAdaptivePolicyGroups:getAdaptivePolicyGroups", args ?? new GetAdaptivePolicyGroupsArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Output<GetAdaptivePolicyGroupsResult> Invoke(GetAdaptivePolicyGroupsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAdaptivePolicyGroupsResult>("meraki:organizations/getAdaptivePolicyGroups:getAdaptivePolicyGroups", args ?? new GetAdaptivePolicyGroupsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Output<GetAdaptivePolicyGroupsResult> Invoke(GetAdaptivePolicyGroupsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAdaptivePolicyGroupsResult>("meraki:organizations/getAdaptivePolicyGroups:getAdaptivePolicyGroups", args ?? new GetAdaptivePolicyGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAdaptivePolicyGroupsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// id path parameter.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public string? OrganizationId { get; set; }

        public GetAdaptivePolicyGroupsArgs()
        {
        }
        public static new GetAdaptivePolicyGroupsArgs Empty => new GetAdaptivePolicyGroupsArgs();
    }

    public sealed class GetAdaptivePolicyGroupsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// id path parameter.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        public GetAdaptivePolicyGroupsInvokeArgs()
        {
        }
        public static new GetAdaptivePolicyGroupsInvokeArgs Empty => new GetAdaptivePolicyGroupsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAdaptivePolicyGroupsResult
    {
        /// <summary>
        /// id path parameter.
        /// </summary>
        public readonly string? Id;
        public readonly Outputs.GetAdaptivePolicyGroupsItemResult Item;
        /// <summary>
        /// Array of ResponseOrganizationsGetOrganizationAdaptivePolicyGroups
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAdaptivePolicyGroupsItemResult> Items;
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        public readonly string? OrganizationId;

        [OutputConstructor]
        private GetAdaptivePolicyGroupsResult(
            string? id,

            Outputs.GetAdaptivePolicyGroupsItemResult item,

            ImmutableArray<Outputs.GetAdaptivePolicyGroupsItemResult> items,

            string? organizationId)
        {
            Id = id;
            Item = item;
            Items = items;
            OrganizationId = organizationId;
        }
    }
}
