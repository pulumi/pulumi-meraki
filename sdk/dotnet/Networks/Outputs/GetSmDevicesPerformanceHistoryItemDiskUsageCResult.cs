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
    public sealed class GetSmDevicesPerformanceHistoryItemDiskUsageCResult
    {
        /// <summary>
        /// The available disk space.
        /// </summary>
        public readonly int Space;
        /// <summary>
        /// The used disk space.
        /// </summary>
        public readonly int Used;

        [OutputConstructor]
        private GetSmDevicesPerformanceHistoryItemDiskUsageCResult(
            int space,

            int used)
        {
            Space = space;
            Used = used;
        }
    }
}