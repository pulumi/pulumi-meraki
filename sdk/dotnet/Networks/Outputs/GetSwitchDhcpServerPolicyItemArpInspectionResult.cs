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
    public sealed class GetSwitchDhcpServerPolicyItemArpInspectionResult
    {
        /// <summary>
        /// Enable or disable Dynamic ARP Inspection on the network. Default value is false.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// List of switch models that does not support dynamic ARP inspection
        /// </summary>
        public readonly ImmutableArray<string> UnsupportedModels;

        [OutputConstructor]
        private GetSwitchDhcpServerPolicyItemArpInspectionResult(
            bool enabled,

            ImmutableArray<string> unsupportedModels)
        {
            Enabled = enabled;
            UnsupportedModels = unsupportedModels;
        }
    }
}