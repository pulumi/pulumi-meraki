// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetClients
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
        ///     var example = Meraki.Networks.GetClients.Invoke(new()
        ///     {
        ///         ClientId = "string",
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksClientsExample"] = example.Apply(getClientsResult =&gt; getClientsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetClientsResult> InvokeAsync(GetClientsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetClientsResult>("meraki:networks/getClients:getClients", args ?? new GetClientsArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetClients.Invoke(new()
        ///     {
        ///         ClientId = "string",
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksClientsExample"] = example.Apply(getClientsResult =&gt; getClientsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetClientsResult> Invoke(GetClientsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetClientsResult>("meraki:networks/getClients:getClients", args ?? new GetClientsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetClientsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// clientId path parameter. Client ID
        /// </summary>
        [Input("clientId", required: true)]
        public string ClientId { get; set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetClientsArgs()
        {
        }
        public static new GetClientsArgs Empty => new GetClientsArgs();
    }

    public sealed class GetClientsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// clientId path parameter. Client ID
        /// </summary>
        [Input("clientId", required: true)]
        public Input<string> ClientId { get; set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetClientsInvokeArgs()
        {
        }
        public static new GetClientsInvokeArgs Empty => new GetClientsInvokeArgs();
    }


    [OutputType]
    public sealed class GetClientsResult
    {
        /// <summary>
        /// clientId path parameter. Client ID
        /// </summary>
        public readonly string ClientId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetClientsItemResult Item;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetClientsResult(
            string clientId,

            string id,

            Outputs.GetClientsItemResult item,

            string networkId)
        {
            ClientId = clientId;
            Id = id;
            Item = item;
            NetworkId = networkId;
        }
    }
}