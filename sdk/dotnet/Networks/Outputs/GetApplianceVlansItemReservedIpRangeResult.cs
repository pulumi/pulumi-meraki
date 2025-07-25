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
    public sealed class GetApplianceVlansItemReservedIpRangeResult
    {
        /// <summary>
        /// A text comment for the reserved range
        /// </summary>
        public readonly string Comment;
        /// <summary>
        /// The last IP in the reserved range
        /// </summary>
        public readonly string End;
        /// <summary>
        /// The first IP in the reserved range
        /// </summary>
        public readonly string Start;

        [OutputConstructor]
        private GetApplianceVlansItemReservedIpRangeResult(
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
