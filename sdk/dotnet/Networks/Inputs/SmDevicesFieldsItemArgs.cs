// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SmDevicesFieldsItemArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Meraki Id of the device record.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The name of the device.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Notes associated with the device.
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        /// <summary>
        /// The device serial.
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        /// <summary>
        /// The MAC of the device.
        /// </summary>
        [Input("wifiMac")]
        public Input<string>? WifiMac { get; set; }

        public SmDevicesFieldsItemArgs()
        {
        }
        public static new SmDevicesFieldsItemArgs Empty => new SmDevicesFieldsItemArgs();
    }
}
