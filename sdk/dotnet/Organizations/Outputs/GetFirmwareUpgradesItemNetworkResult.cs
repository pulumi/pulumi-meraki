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
    public sealed class GetFirmwareUpgradesItemNetworkResult
    {
        /// <summary>
        /// ID of network
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The network
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetFirmwareUpgradesItemNetworkResult(
            string id,

            string name)
        {
            Id = id;
            Name = name;
        }
    }
}