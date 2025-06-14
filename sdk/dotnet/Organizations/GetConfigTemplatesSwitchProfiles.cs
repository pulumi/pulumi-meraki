// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations
{
    public static class GetConfigTemplatesSwitchProfiles
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
        ///     var example = Meraki.Organizations.GetConfigTemplatesSwitchProfiles.Invoke(new()
        ///     {
        ///         ConfigTemplateId = "string",
        ///         OrganizationId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiOrganizationsConfigTemplatesSwitchProfilesExample"] = example.Apply(getConfigTemplatesSwitchProfilesResult =&gt; getConfigTemplatesSwitchProfilesResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetConfigTemplatesSwitchProfilesResult> InvokeAsync(GetConfigTemplatesSwitchProfilesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetConfigTemplatesSwitchProfilesResult>("meraki:organizations/getConfigTemplatesSwitchProfiles:getConfigTemplatesSwitchProfiles", args ?? new GetConfigTemplatesSwitchProfilesArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Organizations.GetConfigTemplatesSwitchProfiles.Invoke(new()
        ///     {
        ///         ConfigTemplateId = "string",
        ///         OrganizationId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiOrganizationsConfigTemplatesSwitchProfilesExample"] = example.Apply(getConfigTemplatesSwitchProfilesResult =&gt; getConfigTemplatesSwitchProfilesResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetConfigTemplatesSwitchProfilesResult> Invoke(GetConfigTemplatesSwitchProfilesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetConfigTemplatesSwitchProfilesResult>("meraki:organizations/getConfigTemplatesSwitchProfiles:getConfigTemplatesSwitchProfiles", args ?? new GetConfigTemplatesSwitchProfilesInvokeArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Organizations.GetConfigTemplatesSwitchProfiles.Invoke(new()
        ///     {
        ///         ConfigTemplateId = "string",
        ///         OrganizationId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiOrganizationsConfigTemplatesSwitchProfilesExample"] = example.Apply(getConfigTemplatesSwitchProfilesResult =&gt; getConfigTemplatesSwitchProfilesResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetConfigTemplatesSwitchProfilesResult> Invoke(GetConfigTemplatesSwitchProfilesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetConfigTemplatesSwitchProfilesResult>("meraki:organizations/getConfigTemplatesSwitchProfiles:getConfigTemplatesSwitchProfiles", args ?? new GetConfigTemplatesSwitchProfilesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetConfigTemplatesSwitchProfilesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// configTemplateId path parameter. Config template ID
        /// </summary>
        [Input("configTemplateId", required: true)]
        public string ConfigTemplateId { get; set; } = null!;

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId", required: true)]
        public string OrganizationId { get; set; } = null!;

        public GetConfigTemplatesSwitchProfilesArgs()
        {
        }
        public static new GetConfigTemplatesSwitchProfilesArgs Empty => new GetConfigTemplatesSwitchProfilesArgs();
    }

    public sealed class GetConfigTemplatesSwitchProfilesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// configTemplateId path parameter. Config template ID
        /// </summary>
        [Input("configTemplateId", required: true)]
        public Input<string> ConfigTemplateId { get; set; } = null!;

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        public GetConfigTemplatesSwitchProfilesInvokeArgs()
        {
        }
        public static new GetConfigTemplatesSwitchProfilesInvokeArgs Empty => new GetConfigTemplatesSwitchProfilesInvokeArgs();
    }


    [OutputType]
    public sealed class GetConfigTemplatesSwitchProfilesResult
    {
        /// <summary>
        /// configTemplateId path parameter. Config template ID
        /// </summary>
        public readonly string ConfigTemplateId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Array of ResponseSwitchGetOrganizationConfigTemplateSwitchProfiles
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConfigTemplatesSwitchProfilesItemResult> Items;
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        public readonly string OrganizationId;

        [OutputConstructor]
        private GetConfigTemplatesSwitchProfilesResult(
            string configTemplateId,

            string id,

            ImmutableArray<Outputs.GetConfigTemplatesSwitchProfilesItemResult> items,

            string organizationId)
        {
            ConfigTemplateId = configTemplateId;
            Id = id;
            Items = items;
            OrganizationId = organizationId;
        }
    }
}
