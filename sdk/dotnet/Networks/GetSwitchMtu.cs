// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetSwitchMtu
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
        ///     var example = Meraki.Networks.GetSwitchMtu.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksSwitchMtuExample"] = example.Apply(getSwitchMtuResult =&gt; getSwitchMtuResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetSwitchMtuResult> InvokeAsync(GetSwitchMtuArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSwitchMtuResult>("meraki:networks/getSwitchMtu:getSwitchMtu", args ?? new GetSwitchMtuArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetSwitchMtu.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksSwitchMtuExample"] = example.Apply(getSwitchMtuResult =&gt; getSwitchMtuResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetSwitchMtuResult> Invoke(GetSwitchMtuInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSwitchMtuResult>("meraki:networks/getSwitchMtu:getSwitchMtu", args ?? new GetSwitchMtuInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSwitchMtuArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetSwitchMtuArgs()
        {
        }
        public static new GetSwitchMtuArgs Empty => new GetSwitchMtuArgs();
    }

    public sealed class GetSwitchMtuInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetSwitchMtuInvokeArgs()
        {
        }
        public static new GetSwitchMtuInvokeArgs Empty => new GetSwitchMtuInvokeArgs();
    }


    [OutputType]
    public sealed class GetSwitchMtuResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetSwitchMtuItemResult Item;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetSwitchMtuResult(
            string id,

            Outputs.GetSwitchMtuItemResult item,

            string networkId)
        {
            Id = id;
            Item = item;
            NetworkId = networkId;
        }
    }
}