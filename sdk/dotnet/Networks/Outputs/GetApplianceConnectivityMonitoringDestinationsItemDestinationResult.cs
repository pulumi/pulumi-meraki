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
    public sealed class GetApplianceConnectivityMonitoringDestinationsItemDestinationResult
    {
        public readonly bool Default;
        public readonly string Description;
        public readonly string Ip;

        [OutputConstructor]
        private GetApplianceConnectivityMonitoringDestinationsItemDestinationResult(
            bool @default,

            string description,

            string ip)
        {
            Default = @default;
            Description = description;
            Ip = ip;
        }
    }
}
