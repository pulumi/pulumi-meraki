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
    public sealed class GetAppliancePortsItemResult
    {
        /// <summary>
        /// The name of the policy. Only applicable to Access ports.
        /// </summary>
        public readonly string AccessPolicy;
        /// <summary>
        /// Comma-delimited list of the VLAN ID's allowed on the port, or 'all' to permit all VLAN's on the port.
        /// </summary>
        public readonly string AllowedVlans;
        /// <summary>
        /// Whether the trunk port can drop all untagged traffic.
        /// </summary>
        public readonly bool DropUntaggedTraffic;
        /// <summary>
        /// The status of the port
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Number of the port
        /// </summary>
        public readonly int Number;
        /// <summary>
        /// The type of the port: 'access' or 'trunk'.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Native VLAN when the port is in Trunk mode. Access VLAN when the port is in Access mode.
        /// </summary>
        public readonly int Vlan;

        [OutputConstructor]
        private GetAppliancePortsItemResult(
            string accessPolicy,

            string allowedVlans,

            bool dropUntaggedTraffic,

            bool enabled,

            int number,

            string type,

            int vlan)
        {
            AccessPolicy = accessPolicy;
            AllowedVlans = allowedVlans;
            DropUntaggedTraffic = dropUntaggedTraffic;
            Enabled = enabled;
            Number = number;
            Type = type;
            Vlan = vlan;
        }
    }
}