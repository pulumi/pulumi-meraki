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
    public sealed class GetDevicesBootsHistoryItemResult
    {
        /// <summary>
        /// Device network
        /// </summary>
        public readonly Outputs.GetDevicesBootsHistoryItemNetworkResult Network;
        /// <summary>
        /// Device serial number
        /// </summary>
        public readonly string Serial;
        /// <summary>
        /// Device power up
        /// </summary>
        public readonly Outputs.GetDevicesBootsHistoryItemStartResult Start;

        [OutputConstructor]
        private GetDevicesBootsHistoryItemResult(
            Outputs.GetDevicesBootsHistoryItemNetworkResult network,

            string serial,

            Outputs.GetDevicesBootsHistoryItemStartResult start)
        {
            Network = network;
            Serial = serial;
            Start = start;
        }
    }
}
