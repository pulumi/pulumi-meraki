// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations
{
    public static class GetSamlRoles
    {
        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Task<GetSamlRolesResult> InvokeAsync(GetSamlRolesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSamlRolesResult>("meraki:organizations/getSamlRoles:getSamlRoles", args ?? new GetSamlRolesArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Output<GetSamlRolesResult> Invoke(GetSamlRolesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSamlRolesResult>("meraki:organizations/getSamlRoles:getSamlRoles", args ?? new GetSamlRolesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSamlRolesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public string? OrganizationId { get; set; }

        /// <summary>
        /// samlRoleId path parameter. Saml role ID
        /// </summary>
        [Input("samlRoleId")]
        public string? SamlRoleId { get; set; }

        public GetSamlRolesArgs()
        {
        }
        public static new GetSamlRolesArgs Empty => new GetSamlRolesArgs();
    }

    public sealed class GetSamlRolesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// samlRoleId path parameter. Saml role ID
        /// </summary>
        [Input("samlRoleId")]
        public Input<string>? SamlRoleId { get; set; }

        public GetSamlRolesInvokeArgs()
        {
        }
        public static new GetSamlRolesInvokeArgs Empty => new GetSamlRolesInvokeArgs();
    }


    [OutputType]
    public sealed class GetSamlRolesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetSamlRolesItemResult Item;
        /// <summary>
        /// Array of ResponseOrganizationsGetOrganizationSamlRoles
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSamlRolesItemResult> Items;
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        public readonly string? OrganizationId;
        /// <summary>
        /// samlRoleId path parameter. Saml role ID
        /// </summary>
        public readonly string? SamlRoleId;

        [OutputConstructor]
        private GetSamlRolesResult(
            string id,

            Outputs.GetSamlRolesItemResult item,

            ImmutableArray<Outputs.GetSamlRolesItemResult> items,

            string? organizationId,

            string? samlRoleId)
        {
            Id = id;
            Item = item;
            Items = items;
            OrganizationId = organizationId;
            SamlRoleId = samlRoleId;
        }
    }
}