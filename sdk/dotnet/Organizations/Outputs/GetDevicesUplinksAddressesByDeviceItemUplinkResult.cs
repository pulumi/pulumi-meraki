// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class GetDevicesUplinksAddressesByDeviceItemUplinkResult
    {
        /// <summary>
        /// Available addresses for the interface.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDevicesUplinksAddressesByDeviceItemUplinkAddressResult> Addresses;
        /// <summary>
        /// Interface for the device uplink. Available options are: cellular, man1, man2, wan1, wan2
        /// </summary>
        public readonly string Interface;

        [OutputConstructor]
        private GetDevicesUplinksAddressesByDeviceItemUplinkResult(
            ImmutableArray<Outputs.GetDevicesUplinksAddressesByDeviceItemUplinkAddressResult> addresses,

            string @interface)
        {
            Addresses = addresses;
            Interface = @interface;
        }
    }
}
