// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Outputs
{

    [OutputType]
    public sealed class GetSmBypassActivationLockAttemptsItemDataResult
    {
        public readonly Outputs.GetSmBypassActivationLockAttemptsItemDataStatus2090938209Result Status2090938209;
        public readonly Outputs.GetSmBypassActivationLockAttemptsItemDataStatus38290139892Result Status38290139892;

        [OutputConstructor]
        private GetSmBypassActivationLockAttemptsItemDataResult(
            Outputs.GetSmBypassActivationLockAttemptsItemDataStatus2090938209Result status2090938209,

            Outputs.GetSmBypassActivationLockAttemptsItemDataStatus38290139892Result status38290139892)
        {
            Status2090938209 = status2090938209;
            Status38290139892 = status38290139892;
        }
    }
}
