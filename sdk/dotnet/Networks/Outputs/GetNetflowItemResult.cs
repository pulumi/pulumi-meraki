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
    public sealed class GetNetflowItemResult
    {
        /// <summary>
        /// The IPv4 address of the NetFlow collector.
        /// </summary>
        public readonly string CollectorIp;
        /// <summary>
        /// The port that the NetFlow collector will be listening on.
        /// </summary>
        public readonly int CollectorPort;
        /// <summary>
        /// The port that the Encrypted Traffic Analytics collector will be listening on.
        /// </summary>
        public readonly int EtaDstPort;
        /// <summary>
        /// Boolean indicating whether Encrypted Traffic Analytics is enabled (true) or disabled (false).
        /// </summary>
        public readonly bool EtaEnabled;
        /// <summary>
        /// Boolean indicating whether NetFlow traffic reporting is enabled (true) or disabled (false).
        /// </summary>
        public readonly bool ReportingEnabled;

        [OutputConstructor]
        private GetNetflowItemResult(
            string collectorIp,

            int collectorPort,

            int etaDstPort,

            bool etaEnabled,

            bool reportingEnabled)
        {
            CollectorIp = collectorIp;
            CollectorPort = collectorPort;
            EtaDstPort = etaDstPort;
            EtaEnabled = etaEnabled;
            ReportingEnabled = reportingEnabled;
        }
    }
}