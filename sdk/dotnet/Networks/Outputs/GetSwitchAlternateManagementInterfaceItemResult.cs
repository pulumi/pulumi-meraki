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
    public sealed class GetSwitchAlternateManagementInterfaceItemResult
    {
        /// <summary>
        /// Boolean value to enable or disable AMI configuration. If enabled, VLAN and protocols must be set
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Can be one or more of the following values: 'radius', 'snmp' or 'syslog'
        /// </summary>
        public readonly ImmutableArray<string> Protocols;
        /// <summary>
        /// Array of switch serial number and IP assignment. If parameter is present, it cannot have empty body. Note: switches parameter is not applicable for template networks, in other words, do not put 'switches' in the body when updating template networks. Also, an empty 'switches' array will remove all previous assignments
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSwitchAlternateManagementInterfaceItemSwitchResult> Switches;
        /// <summary>
        /// Alternate management VLAN, must be between 1 and 4094
        /// </summary>
        public readonly int VlanId;

        [OutputConstructor]
        private GetSwitchAlternateManagementInterfaceItemResult(
            bool enabled,

            ImmutableArray<string> protocols,

            ImmutableArray<Outputs.GetSwitchAlternateManagementInterfaceItemSwitchResult> switches,

            int vlanId)
        {
            Enabled = enabled;
            Protocols = protocols;
            Switches = switches;
            VlanId = vlanId;
        }
    }
}