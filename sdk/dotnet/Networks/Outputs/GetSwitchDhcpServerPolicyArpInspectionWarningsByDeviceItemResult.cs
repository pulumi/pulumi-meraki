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
    public sealed class GetSwitchDhcpServerPolicyArpInspectionWarningsByDeviceItemResult
    {
        /// <summary>
        /// Whether this switch has a trusted DAI port. Always false if supportsInspection is false.
        /// </summary>
        public readonly bool HasTrustedPort;
        /// <summary>
        /// Switch name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Switch serial.
        /// </summary>
        public readonly string Serial;
        /// <summary>
        /// Whether this switch supports Dynamic ARP Inspection.
        /// </summary>
        public readonly bool SupportsInspection;
        /// <summary>
        /// Url link to switch.
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private GetSwitchDhcpServerPolicyArpInspectionWarningsByDeviceItemResult(
            bool hasTrustedPort,

            string name,

            string serial,

            bool supportsInspection,

            string url)
        {
            HasTrustedPort = hasTrustedPort;
            Name = name;
            Serial = serial;
            SupportsInspection = supportsInspection;
            Url = url;
        }
    }
}