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
    public sealed class SmBypassActivationLockAttemptsData
    {
        public readonly Outputs.SmBypassActivationLockAttemptsDataStatus2090938209? Status2090938209;
        public readonly Outputs.SmBypassActivationLockAttemptsDataStatus38290139892? Status38290139892;

        [OutputConstructor]
        private SmBypassActivationLockAttemptsData(
            Outputs.SmBypassActivationLockAttemptsDataStatus2090938209? status2090938209,

            Outputs.SmBypassActivationLockAttemptsDataStatus38290139892? status38290139892)
        {
            Status2090938209 = status2090938209;
            Status38290139892 = status38290139892;
        }
    }
}