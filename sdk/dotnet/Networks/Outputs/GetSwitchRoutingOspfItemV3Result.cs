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
    public sealed class GetSwitchRoutingOspfItemV3Result
    {
        public readonly ImmutableArray<Outputs.GetSwitchRoutingOspfItemV3AreaResult> Areas;
        public readonly int DeadTimerInSeconds;
        public readonly bool Enabled;
        public readonly int HelloTimerInSeconds;

        [OutputConstructor]
        private GetSwitchRoutingOspfItemV3Result(
            ImmutableArray<Outputs.GetSwitchRoutingOspfItemV3AreaResult> areas,

            int deadTimerInSeconds,

            bool enabled,

            int helloTimerInSeconds)
        {
            Areas = areas;
            DeadTimerInSeconds = deadTimerInSeconds;
            Enabled = enabled;
            HelloTimerInSeconds = helloTimerInSeconds;
        }
    }
}