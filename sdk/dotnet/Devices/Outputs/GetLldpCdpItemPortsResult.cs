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
    public sealed class GetLldpCdpItemPortsResult
    {
        public readonly Outputs.GetLldpCdpItemPortsStatus12Result Status12;
        public readonly Outputs.GetLldpCdpItemPortsStatus8Result Status8;

        [OutputConstructor]
        private GetLldpCdpItemPortsResult(
            Outputs.GetLldpCdpItemPortsStatus12Result status12,

            Outputs.GetLldpCdpItemPortsStatus8Result status8)
        {
            Status12 = status12;
            Status8 = status8;
        }
    }
}