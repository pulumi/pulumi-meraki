// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class GetCameraAnalyticsLiveItemZonesResult
    {
        public readonly Outputs.GetCameraAnalyticsLiveItemZonesStatus0Result Status0;

        [OutputConstructor]
        private GetCameraAnalyticsLiveItemZonesResult(Outputs.GetCameraAnalyticsLiveItemZonesStatus0Result status0)
        {
            Status0 = status0;
        }
    }
}
