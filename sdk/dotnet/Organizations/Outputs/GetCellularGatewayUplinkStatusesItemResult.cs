// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class GetCellularGatewayUplinkStatusesItemResult
    {
        /// <summary>
        /// Last reported time for the device
        /// </summary>
        public readonly string LastReportedAt;
        /// <summary>
        /// Device model
        /// </summary>
        public readonly string Model;
        /// <summary>
        /// Network Id
        /// </summary>
        public readonly string NetworkId;
        /// <summary>
        /// Serial number of the device
        /// </summary>
        public readonly string Serial;
        /// <summary>
        /// Uplinks info
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCellularGatewayUplinkStatusesItemUplinkResult> Uplinks;

        [OutputConstructor]
        private GetCellularGatewayUplinkStatusesItemResult(
            string lastReportedAt,

            string model,

            string networkId,

            string serial,

            ImmutableArray<Outputs.GetCellularGatewayUplinkStatusesItemUplinkResult> uplinks)
        {
            LastReportedAt = lastReportedAt;
            Model = model;
            NetworkId = networkId;
            Serial = serial;
            Uplinks = uplinks;
        }
    }
}