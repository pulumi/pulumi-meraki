// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations
{
    public static class GetSmVppAccounts
    {
        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Task<GetSmVppAccountsResult> InvokeAsync(GetSmVppAccountsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSmVppAccountsResult>("meraki:organizations/getSmVppAccounts:getSmVppAccounts", args ?? new GetSmVppAccountsArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Output<GetSmVppAccountsResult> Invoke(GetSmVppAccountsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSmVppAccountsResult>("meraki:organizations/getSmVppAccounts:getSmVppAccounts", args ?? new GetSmVppAccountsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Output<GetSmVppAccountsResult> Invoke(GetSmVppAccountsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSmVppAccountsResult>("meraki:organizations/getSmVppAccounts:getSmVppAccounts", args ?? new GetSmVppAccountsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSmVppAccountsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public string? OrganizationId { get; set; }

        /// <summary>
        /// vppAccountId path parameter. Vpp account ID
        /// </summary>
        [Input("vppAccountId")]
        public string? VppAccountId { get; set; }

        public GetSmVppAccountsArgs()
        {
        }
        public static new GetSmVppAccountsArgs Empty => new GetSmVppAccountsArgs();
    }

    public sealed class GetSmVppAccountsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// vppAccountId path parameter. Vpp account ID
        /// </summary>
        [Input("vppAccountId")]
        public Input<string>? VppAccountId { get; set; }

        public GetSmVppAccountsInvokeArgs()
        {
        }
        public static new GetSmVppAccountsInvokeArgs Empty => new GetSmVppAccountsInvokeArgs();
    }


    [OutputType]
    public sealed class GetSmVppAccountsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetSmVppAccountsItemResult Item;
        /// <summary>
        /// Array of ResponseSmGetOrganizationSmVppAccounts
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSmVppAccountsItemResult> Items;
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        public readonly string? OrganizationId;
        /// <summary>
        /// vppAccountId path parameter. Vpp account ID
        /// </summary>
        public readonly string? VppAccountId;

        [OutputConstructor]
        private GetSmVppAccountsResult(
            string id,

            Outputs.GetSmVppAccountsItemResult item,

            ImmutableArray<Outputs.GetSmVppAccountsItemResult> items,

            string? organizationId,

            string? vppAccountId)
        {
            Id = id;
            Item = item;
            Items = items;
            OrganizationId = organizationId;
            VppAccountId = vppAccountId;
        }
    }
}
