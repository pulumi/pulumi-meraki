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
    public sealed class GetCameraBoundariesAreasByDeviceItemResult
    {
        /// <summary>
        /// Configured area boundaries of the camera
        /// </summary>
        public readonly Outputs.GetCameraBoundariesAreasByDeviceItemBoundariesResult Boundaries;
        /// <summary>
        /// The network id of the camera
        /// </summary>
        public readonly string NetworkId;
        /// <summary>
        /// The serial number of the camera
        /// </summary>
        public readonly string Serial;

        [OutputConstructor]
        private GetCameraBoundariesAreasByDeviceItemResult(
            Outputs.GetCameraBoundariesAreasByDeviceItemBoundariesResult boundaries,

            string networkId,

            string serial)
        {
            Boundaries = boundaries;
            NetworkId = networkId;
            Serial = serial;
        }
    }
}
