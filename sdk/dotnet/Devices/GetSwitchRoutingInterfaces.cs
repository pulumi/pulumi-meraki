// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices
{
    public static class GetSwitchRoutingInterfaces
    {
        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Task<GetSwitchRoutingInterfacesResult> InvokeAsync(GetSwitchRoutingInterfacesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSwitchRoutingInterfacesResult>("meraki:devices/getSwitchRoutingInterfaces:getSwitchRoutingInterfaces", args ?? new GetSwitchRoutingInterfacesArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Output<GetSwitchRoutingInterfacesResult> Invoke(GetSwitchRoutingInterfacesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSwitchRoutingInterfacesResult>("meraki:devices/getSwitchRoutingInterfaces:getSwitchRoutingInterfaces", args ?? new GetSwitchRoutingInterfacesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSwitchRoutingInterfacesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// interfaceId path parameter. Interface ID
        /// </summary>
        [Input("interfaceId")]
        public string? InterfaceId { get; set; }

        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial")]
        public string? Serial { get; set; }

        public GetSwitchRoutingInterfacesArgs()
        {
        }
        public static new GetSwitchRoutingInterfacesArgs Empty => new GetSwitchRoutingInterfacesArgs();
    }

    public sealed class GetSwitchRoutingInterfacesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// interfaceId path parameter. Interface ID
        /// </summary>
        [Input("interfaceId")]
        public Input<string>? InterfaceId { get; set; }

        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        public GetSwitchRoutingInterfacesInvokeArgs()
        {
        }
        public static new GetSwitchRoutingInterfacesInvokeArgs Empty => new GetSwitchRoutingInterfacesInvokeArgs();
    }


    [OutputType]
    public sealed class GetSwitchRoutingInterfacesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// interfaceId path parameter. Interface ID
        /// </summary>
        public readonly string? InterfaceId;
        public readonly Outputs.GetSwitchRoutingInterfacesItemResult Item;
        /// <summary>
        /// Array of ResponseSwitchGetDeviceSwitchRoutingInterfaces
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSwitchRoutingInterfacesItemResult> Items;
        /// <summary>
        /// serial path parameter.
        /// </summary>
        public readonly string? Serial;

        [OutputConstructor]
        private GetSwitchRoutingInterfacesResult(
            string id,

            string? interfaceId,

            Outputs.GetSwitchRoutingInterfacesItemResult item,

            ImmutableArray<Outputs.GetSwitchRoutingInterfacesItemResult> items,

            string? serial)
        {
            Id = id;
            InterfaceId = interfaceId;
            Item = item;
            Items = items;
            Serial = serial;
        }
    }
}