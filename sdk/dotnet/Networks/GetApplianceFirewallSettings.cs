// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetApplianceFirewallSettings
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
        ///     var example = Meraki.Networks.GetApplianceFirewallSettings.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksApplianceFirewallSettingsExample"] = example.Apply(getApplianceFirewallSettingsResult =&gt; getApplianceFirewallSettingsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetApplianceFirewallSettingsResult> InvokeAsync(GetApplianceFirewallSettingsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetApplianceFirewallSettingsResult>("meraki:networks/getApplianceFirewallSettings:getApplianceFirewallSettings", args ?? new GetApplianceFirewallSettingsArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetApplianceFirewallSettings.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksApplianceFirewallSettingsExample"] = example.Apply(getApplianceFirewallSettingsResult =&gt; getApplianceFirewallSettingsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplianceFirewallSettingsResult> Invoke(GetApplianceFirewallSettingsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplianceFirewallSettingsResult>("meraki:networks/getApplianceFirewallSettings:getApplianceFirewallSettings", args ?? new GetApplianceFirewallSettingsInvokeArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetApplianceFirewallSettings.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksApplianceFirewallSettingsExample"] = example.Apply(getApplianceFirewallSettingsResult =&gt; getApplianceFirewallSettingsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplianceFirewallSettingsResult> Invoke(GetApplianceFirewallSettingsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplianceFirewallSettingsResult>("meraki:networks/getApplianceFirewallSettings:getApplianceFirewallSettings", args ?? new GetApplianceFirewallSettingsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetApplianceFirewallSettingsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetApplianceFirewallSettingsArgs()
        {
        }
        public static new GetApplianceFirewallSettingsArgs Empty => new GetApplianceFirewallSettingsArgs();
    }

    public sealed class GetApplianceFirewallSettingsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetApplianceFirewallSettingsInvokeArgs()
        {
        }
        public static new GetApplianceFirewallSettingsInvokeArgs Empty => new GetApplianceFirewallSettingsInvokeArgs();
    }


    [OutputType]
    public sealed class GetApplianceFirewallSettingsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetApplianceFirewallSettingsItemResult Item;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetApplianceFirewallSettingsResult(
            string id,

            Outputs.GetApplianceFirewallSettingsItemResult item,

            string networkId)
        {
            Id = id;
            Item = item;
            NetworkId = networkId;
        }
    }
}
