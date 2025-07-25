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
    public sealed class GetSwitchPortsBySwitchItemResult
    {
        /// <summary>
        /// The MAC address of the switch.
        /// </summary>
        public readonly string Mac;
        /// <summary>
        /// The model of the switch.
        /// </summary>
        public readonly string Model;
        /// <summary>
        /// The name of the switch.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Identifying information of the switch's network.
        /// </summary>
        public readonly Outputs.GetSwitchPortsBySwitchItemNetworkResult Network;
        /// <summary>
        /// Ports belonging to the switch
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSwitchPortsBySwitchItemPortResult> Ports;
        /// <summary>
        /// The serial number of the switch.
        /// </summary>
        public readonly string Serial;

        [OutputConstructor]
        private GetSwitchPortsBySwitchItemResult(
            string mac,

            string model,

            string name,

            Outputs.GetSwitchPortsBySwitchItemNetworkResult network,

            ImmutableArray<Outputs.GetSwitchPortsBySwitchItemPortResult> ports,

            string serial)
        {
            Mac = mac;
            Model = model;
            Name = name;
            Network = network;
            Ports = ports;
            Serial = serial;
        }
    }
}
