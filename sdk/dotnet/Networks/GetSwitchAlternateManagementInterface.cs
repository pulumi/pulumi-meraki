// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetSwitchAlternateManagementInterface
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
        ///     var example = Meraki.Networks.GetSwitchAlternateManagementInterface.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksSwitchAlternateManagementInterfaceExample"] = example.Apply(getSwitchAlternateManagementInterfaceResult =&gt; getSwitchAlternateManagementInterfaceResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetSwitchAlternateManagementInterfaceResult> InvokeAsync(GetSwitchAlternateManagementInterfaceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSwitchAlternateManagementInterfaceResult>("meraki:networks/getSwitchAlternateManagementInterface:getSwitchAlternateManagementInterface", args ?? new GetSwitchAlternateManagementInterfaceArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetSwitchAlternateManagementInterface.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksSwitchAlternateManagementInterfaceExample"] = example.Apply(getSwitchAlternateManagementInterfaceResult =&gt; getSwitchAlternateManagementInterfaceResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetSwitchAlternateManagementInterfaceResult> Invoke(GetSwitchAlternateManagementInterfaceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSwitchAlternateManagementInterfaceResult>("meraki:networks/getSwitchAlternateManagementInterface:getSwitchAlternateManagementInterface", args ?? new GetSwitchAlternateManagementInterfaceInvokeArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetSwitchAlternateManagementInterface.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksSwitchAlternateManagementInterfaceExample"] = example.Apply(getSwitchAlternateManagementInterfaceResult =&gt; getSwitchAlternateManagementInterfaceResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetSwitchAlternateManagementInterfaceResult> Invoke(GetSwitchAlternateManagementInterfaceInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSwitchAlternateManagementInterfaceResult>("meraki:networks/getSwitchAlternateManagementInterface:getSwitchAlternateManagementInterface", args ?? new GetSwitchAlternateManagementInterfaceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSwitchAlternateManagementInterfaceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetSwitchAlternateManagementInterfaceArgs()
        {
        }
        public static new GetSwitchAlternateManagementInterfaceArgs Empty => new GetSwitchAlternateManagementInterfaceArgs();
    }

    public sealed class GetSwitchAlternateManagementInterfaceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetSwitchAlternateManagementInterfaceInvokeArgs()
        {
        }
        public static new GetSwitchAlternateManagementInterfaceInvokeArgs Empty => new GetSwitchAlternateManagementInterfaceInvokeArgs();
    }


    [OutputType]
    public sealed class GetSwitchAlternateManagementInterfaceResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetSwitchAlternateManagementInterfaceItemResult Item;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetSwitchAlternateManagementInterfaceResult(
            string id,

            Outputs.GetSwitchAlternateManagementInterfaceItemResult item,

            string networkId)
        {
            Id = id;
            Item = item;
            NetworkId = networkId;
        }
    }
}
