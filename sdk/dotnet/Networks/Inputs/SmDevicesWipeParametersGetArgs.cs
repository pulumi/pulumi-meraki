// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SmDevicesWipeParametersGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the device to be wiped.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The pin number (a six digit value) for wiping a macOS device. Required only for macOS devices.
        /// </summary>
        [Input("pin")]
        public Input<int>? Pin { get; set; }

        /// <summary>
        /// The serial of the device to be wiped.
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        /// <summary>
        /// The wifiMac of the device to be wiped.
        /// </summary>
        [Input("wifiMac")]
        public Input<string>? WifiMac { get; set; }

        public SmDevicesWipeParametersGetArgs()
        {
        }
        public static new SmDevicesWipeParametersGetArgs Empty => new SmDevicesWipeParametersGetArgs();
    }
}
