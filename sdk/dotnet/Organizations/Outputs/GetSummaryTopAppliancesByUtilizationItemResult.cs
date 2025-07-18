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
    public sealed class GetSummaryTopAppliancesByUtilizationItemResult
    {
        /// <summary>
        /// Mac address of the appliance
        /// </summary>
        public readonly string Mac;
        /// <summary>
        /// Model of the appliance
        /// </summary>
        public readonly string Model;
        /// <summary>
        /// Name of the appliance
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Network info
        /// </summary>
        public readonly Outputs.GetSummaryTopAppliancesByUtilizationItemNetworkResult Network;
        /// <summary>
        /// Serial number of the appliance
        /// </summary>
        public readonly string Serial;
        /// <summary>
        /// Utilization of the appliance
        /// </summary>
        public readonly Outputs.GetSummaryTopAppliancesByUtilizationItemUtilizationResult Utilization;

        [OutputConstructor]
        private GetSummaryTopAppliancesByUtilizationItemResult(
            string mac,

            string model,

            string name,

            Outputs.GetSummaryTopAppliancesByUtilizationItemNetworkResult network,

            string serial,

            Outputs.GetSummaryTopAppliancesByUtilizationItemUtilizationResult utilization)
        {
            Mac = mac;
            Model = model;
            Name = name;
            Network = network;
            Serial = serial;
            Utilization = utilization;
        }
    }
}
