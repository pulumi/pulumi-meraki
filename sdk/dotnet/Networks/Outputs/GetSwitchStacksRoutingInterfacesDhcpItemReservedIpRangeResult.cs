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
    public sealed class GetSwitchStacksRoutingInterfacesDhcpItemReservedIpRangeResult
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
        private GetSwitchStacksRoutingInterfacesDhcpItemReservedIpRangeResult(
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