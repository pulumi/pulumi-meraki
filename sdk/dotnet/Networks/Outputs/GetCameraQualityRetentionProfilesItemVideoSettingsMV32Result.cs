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
    public sealed class GetCameraQualityRetentionProfilesItemVideoSettingsMV32Result
    {
        public readonly string Quality;
        public readonly string Resolution;

        [OutputConstructor]
        private GetCameraQualityRetentionProfilesItemVideoSettingsMV32Result(
            string quality,

            string resolution)
        {
            Quality = quality;
            Resolution = resolution;
        }
    }
}
