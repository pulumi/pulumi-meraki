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
    public sealed class WirelessSsidsDot11w
    {
        /// <summary>
        /// Whether 802.11w is enabled or not.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// (Optional) Whether 802.11w is required or not.
        /// </summary>
        public readonly bool? Required;

        [OutputConstructor]
        private WirelessSsidsDot11w(
            bool? enabled,

            bool? required)
        {
            Enabled = enabled;
            Required = required;
        }
    }
}