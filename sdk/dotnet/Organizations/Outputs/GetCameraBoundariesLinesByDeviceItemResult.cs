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
    public sealed class GetCameraBoundariesLinesByDeviceItemResult
    {
        /// <summary>
        /// Configured line boundaries of the camera
        /// </summary>
        public readonly Outputs.GetCameraBoundariesLinesByDeviceItemBoundariesResult Boundaries;
        /// <summary>
        /// The network id of the camera
        /// </summary>
        public readonly string NetworkId;
        /// <summary>
        /// The serial number of the camera
        /// </summary>
        public readonly string Serial;

        [OutputConstructor]
        private GetCameraBoundariesLinesByDeviceItemResult(
            Outputs.GetCameraBoundariesLinesByDeviceItemBoundariesResult boundaries,

            string networkId,

            string serial)
        {
            Boundaries = boundaries;
            NetworkId = networkId;
            Serial = serial;
        }
    }
}
