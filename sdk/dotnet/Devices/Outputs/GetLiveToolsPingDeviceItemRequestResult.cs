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
    public sealed class GetLiveToolsPingDeviceItemRequestResult
    {
        /// <summary>
        /// Number of pings to send
        /// </summary>
        public readonly int CountR;
        /// <summary>
        /// Device serial number
        /// </summary>
        public readonly string Serial;
        /// <summary>
        /// IP address or FQDN to ping
        /// </summary>
        public readonly string Target;

        [OutputConstructor]
        private GetLiveToolsPingDeviceItemRequestResult(
            int countR,

            string serial,

            string target)
        {
            CountR = countR;
            Serial = serial;
            Target = target;
        }
    }
}