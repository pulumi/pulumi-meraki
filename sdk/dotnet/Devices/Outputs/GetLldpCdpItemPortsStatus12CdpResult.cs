// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class GetLldpCdpItemPortsStatus12CdpResult
    {
        public readonly string Address;
        public readonly string DeviceId;
        public readonly string PortId;
        public readonly string SourcePort;

        [OutputConstructor]
        private GetLldpCdpItemPortsStatus12CdpResult(
            string address,

            string deviceId,

            string portId,

            string sourcePort)
        {
            Address = address;
            DeviceId = deviceId;
            PortId = portId;
            SourcePort = sourcePort;
        }
    }
}