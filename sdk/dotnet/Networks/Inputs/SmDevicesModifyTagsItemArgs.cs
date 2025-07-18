// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SmDevicesModifyTagsItemArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Meraki Id of the device record.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The device serial.
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// An array of tags associated with the device.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The MAC of the device.
        /// </summary>
        [Input("wifiMac")]
        public Input<string>? WifiMac { get; set; }

        public SmDevicesModifyTagsItemArgs()
        {
        }
        public static new SmDevicesModifyTagsItemArgs Empty => new SmDevicesModifyTagsItemArgs();
    }
}
