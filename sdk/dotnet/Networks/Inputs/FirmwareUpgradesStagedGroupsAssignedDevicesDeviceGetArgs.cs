// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesStagedGroupsAssignedDevicesDeviceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the device
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Serial of the device
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        public FirmwareUpgradesStagedGroupsAssignedDevicesDeviceGetArgs()
        {
        }
        public static new FirmwareUpgradesStagedGroupsAssignedDevicesDeviceGetArgs Empty => new FirmwareUpgradesStagedGroupsAssignedDevicesDeviceGetArgs();
    }
}
