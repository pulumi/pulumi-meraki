// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Outputs
{

    [OutputType]
    public sealed class GetFirmwareUpgradesStagedGroupsItemAssignedDevicesResult
    {
        /// <summary>
        /// Data Array of Devices containing the name and serial
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFirmwareUpgradesStagedGroupsItemAssignedDevicesDeviceResult> Devices;
        /// <summary>
        /// Data Array of Switch Stacks containing the name and id
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFirmwareUpgradesStagedGroupsItemAssignedDevicesSwitchStackResult> SwitchStacks;

        [OutputConstructor]
        private GetFirmwareUpgradesStagedGroupsItemAssignedDevicesResult(
            ImmutableArray<Outputs.GetFirmwareUpgradesStagedGroupsItemAssignedDevicesDeviceResult> devices,

            ImmutableArray<Outputs.GetFirmwareUpgradesStagedGroupsItemAssignedDevicesSwitchStackResult> switchStacks)
        {
            Devices = devices;
            SwitchStacks = switchStacks;
        }
    }
}