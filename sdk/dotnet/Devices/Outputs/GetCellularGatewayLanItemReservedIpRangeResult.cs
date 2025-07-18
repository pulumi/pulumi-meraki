// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class GetCellularGatewayLanItemReservedIpRangeResult
    {
        /// <summary>
        /// Comment explaining the reserved IP range
        /// </summary>
        public readonly string Comment;
        /// <summary>
        /// Ending IP included in the reserved range of IPs
        /// </summary>
        public readonly string End;
        /// <summary>
        /// Starting IP included in the reserved range of IPs
        /// </summary>
        public readonly string Start;

        [OutputConstructor]
        private GetCellularGatewayLanItemReservedIpRangeResult(
            string comment,

            string end,

            string start)
        {
            Comment = comment;
            End = end;
            Start = start;
        }
    }
}
