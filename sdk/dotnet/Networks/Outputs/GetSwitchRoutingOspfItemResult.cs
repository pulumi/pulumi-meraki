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
    public sealed class GetSwitchRoutingOspfItemResult
    {
        public readonly ImmutableArray<Outputs.GetSwitchRoutingOspfItemAreaResult> Areas;
        public readonly int DeadTimerInSeconds;
        public readonly bool Enabled;
        public readonly int HelloTimerInSeconds;
        public readonly bool Md5AuthenticationEnabled;
        public readonly Outputs.GetSwitchRoutingOspfItemMd5AuthenticationKeyResult Md5AuthenticationKey;
        public readonly Outputs.GetSwitchRoutingOspfItemV3Result V3;

        [OutputConstructor]
        private GetSwitchRoutingOspfItemResult(
            ImmutableArray<Outputs.GetSwitchRoutingOspfItemAreaResult> areas,

            int deadTimerInSeconds,

            bool enabled,

            int helloTimerInSeconds,

            bool md5AuthenticationEnabled,

            Outputs.GetSwitchRoutingOspfItemMd5AuthenticationKeyResult md5AuthenticationKey,

            Outputs.GetSwitchRoutingOspfItemV3Result v3)
        {
            Areas = areas;
            DeadTimerInSeconds = deadTimerInSeconds;
            Enabled = enabled;
            HelloTimerInSeconds = helloTimerInSeconds;
            Md5AuthenticationEnabled = md5AuthenticationEnabled;
            Md5AuthenticationKey = md5AuthenticationKey;
            V3 = v3;
        }
    }
}
