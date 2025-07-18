// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetApplianceSettings
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
        ///     var example = Meraki.Networks.GetApplianceSettings.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksApplianceSettingsExample"] = example.Apply(getApplianceSettingsResult =&gt; getApplianceSettingsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetApplianceSettingsResult> InvokeAsync(GetApplianceSettingsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetApplianceSettingsResult>("meraki:networks/getApplianceSettings:getApplianceSettings", args ?? new GetApplianceSettingsArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetApplianceSettings.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksApplianceSettingsExample"] = example.Apply(getApplianceSettingsResult =&gt; getApplianceSettingsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplianceSettingsResult> Invoke(GetApplianceSettingsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplianceSettingsResult>("meraki:networks/getApplianceSettings:getApplianceSettings", args ?? new GetApplianceSettingsInvokeArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetApplianceSettings.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksApplianceSettingsExample"] = example.Apply(getApplianceSettingsResult =&gt; getApplianceSettingsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplianceSettingsResult> Invoke(GetApplianceSettingsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplianceSettingsResult>("meraki:networks/getApplianceSettings:getApplianceSettings", args ?? new GetApplianceSettingsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetApplianceSettingsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetApplianceSettingsArgs()
        {
        }
        public static new GetApplianceSettingsArgs Empty => new GetApplianceSettingsArgs();
    }

    public sealed class GetApplianceSettingsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetApplianceSettingsInvokeArgs()
        {
        }
        public static new GetApplianceSettingsInvokeArgs Empty => new GetApplianceSettingsInvokeArgs();
    }


    [OutputType]
    public sealed class GetApplianceSettingsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetApplianceSettingsItemResult Item;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetApplianceSettingsResult(
            string id,

            Outputs.GetApplianceSettingsItemResult item,

            string networkId)
        {
            Id = id;
            Item = item;
            NetworkId = networkId;
        }
    }
}
