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
    public sealed class GetSwitchRoutingInterfacesDhcpItemReservedIpRangeResult
    {
        /// <summary>
        /// The comment for the reserved IP range
        /// </summary>
        public readonly string Comment;
        /// <summary>
        /// The ending IP address of the reserved IP range
        /// </summary>
        public readonly string End;
        /// <summary>
        /// The starting IP address of the reserved IP range
        /// </summary>
        public readonly string Start;

        [OutputConstructor]
        private GetSwitchRoutingInterfacesDhcpItemReservedIpRangeResult(
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
