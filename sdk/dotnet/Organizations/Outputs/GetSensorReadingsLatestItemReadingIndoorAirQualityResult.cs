// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class GetSensorReadingsLatestItemReadingIndoorAirQualityResult
    {
        /// <summary>
        /// Indoor air quality score between 0 and 100.
        /// </summary>
        public readonly int Score;

        [OutputConstructor]
        private GetSensorReadingsLatestItemReadingIndoorAirQualityResult(int score)
        {
            Score = score;
        }
    }
}
