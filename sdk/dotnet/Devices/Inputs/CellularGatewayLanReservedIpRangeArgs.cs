// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Inputs
{

    public sealed class CellularGatewayLanReservedIpRangeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Comment explaining the reserved IP range
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Ending IP included in the reserved range of IPs
        /// </summary>
        [Input("end")]
        public Input<string>? End { get; set; }

        /// <summary>
        /// Starting IP included in the reserved range of IPs
        /// </summary>
        [Input("start")]
        public Input<string>? Start { get; set; }

        public CellularGatewayLanReservedIpRangeArgs()
        {
        }
        public static new CellularGatewayLanReservedIpRangeArgs Empty => new CellularGatewayLanReservedIpRangeArgs();
    }
}
