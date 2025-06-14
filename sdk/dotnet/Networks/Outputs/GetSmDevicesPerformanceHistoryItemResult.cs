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
    public sealed class GetSmDevicesPerformanceHistoryItemResult
    {
        /// <summary>
        /// The percentage of CPU used as a decimal format.
        /// </summary>
        public readonly double CpuPercentUsed;
        /// <summary>
        /// An object containing disk usage details.
        /// </summary>
        public readonly Outputs.GetSmDevicesPerformanceHistoryItemDiskUsageResult DiskUsage;
        /// <summary>
        /// The active RAM on the device.
        /// </summary>
        public readonly int MemActive;
        /// <summary>
        /// Memory that is not yet in use by the system.
        /// </summary>
        public readonly int MemFree;
        /// <summary>
        /// The inactive RAM on the device.
        /// </summary>
        public readonly int MemInactive;
        /// <summary>
        /// Memory used for core OS functions on the device.
        /// </summary>
        public readonly int MemWired;
        /// <summary>
        /// Network bandwith received.
        /// </summary>
        public readonly int NetworkReceived;
        /// <summary>
        /// Network bandwith transmitted.
        /// </summary>
        public readonly int NetworkSent;
        /// <summary>
        /// The amount of space being used on the startup disk to swap unused files to and from RAM.
        /// </summary>
        public readonly int SwapUsed;
        /// <summary>
        /// The time at which the performance was measured.
        /// </summary>
        public readonly string Ts;

        [OutputConstructor]
        private GetSmDevicesPerformanceHistoryItemResult(
            double cpuPercentUsed,

            Outputs.GetSmDevicesPerformanceHistoryItemDiskUsageResult diskUsage,

            int memActive,

            int memFree,

            int memInactive,

            int memWired,

            int networkReceived,

            int networkSent,

            int swapUsed,

            string ts)
        {
            CpuPercentUsed = cpuPercentUsed;
            DiskUsage = diskUsage;
            MemActive = memActive;
            MemFree = memFree;
            MemInactive = memInactive;
            MemWired = memWired;
            NetworkReceived = networkReceived;
            NetworkSent = networkSent;
            SwapUsed = swapUsed;
            Ts = ts;
        }
    }
}
