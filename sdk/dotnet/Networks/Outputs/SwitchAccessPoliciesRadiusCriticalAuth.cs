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
    public sealed class SwitchAccessPoliciesRadiusCriticalAuth
    {
        /// <summary>
        /// VLAN that clients who use data will be placed on when RADIUS authentication fails. Will be null if hostMode is Multi-Auth
        /// </summary>
        public readonly int? DataVlanId;
        /// <summary>
        /// Enable to suspend port bounce when RADIUS servers are unreachable
        /// </summary>
        public readonly bool? SuspendPortBounce;
        /// <summary>
        /// VLAN that clients who use voice will be placed on when RADIUS authentication fails. Will be null if hostMode is Multi-Auth
        /// </summary>
        public readonly int? VoiceVlanId;

        [OutputConstructor]
        private SwitchAccessPoliciesRadiusCriticalAuth(
            int? dataVlanId,

            bool? suspendPortBounce,

            int? voiceVlanId)
        {
            DataVlanId = dataVlanId;
            SuspendPortBounce = suspendPortBounce;
            VoiceVlanId = voiceVlanId;
        }
    }
}