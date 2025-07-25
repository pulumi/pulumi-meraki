// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Outputs
{

    [OutputType]
    public sealed class SwitchLinkAggregationsSwitchProfilePort
    {
        /// <summary>
        /// Port identifier of switch port. For modules, the identifier is "SlotNumber*ModuleType*PortNumber" (Ex: "1*8X10G*1"), otherwise it is just the port number (Ex: "8").
        /// </summary>
        public readonly string? PortId;
        /// <summary>
        /// Profile identifier.
        /// </summary>
        public readonly string? Profile;

        [OutputConstructor]
        private SwitchLinkAggregationsSwitchProfilePort(
            string? portId,

            string? profile)
        {
            PortId = portId;
            Profile = profile;
        }
    }
}
