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
    public sealed class CellularSimsSimFailover
    {
        /// <summary>
        /// Failover to secondary SIM (optional)
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Failover timeout in seconds (optional)
        /// </summary>
        public readonly int? Timeout;

        [OutputConstructor]
        private CellularSimsSimFailover(
            bool? enabled,

            int? timeout)
        {
            Enabled = enabled;
            Timeout = timeout;
        }
    }
}