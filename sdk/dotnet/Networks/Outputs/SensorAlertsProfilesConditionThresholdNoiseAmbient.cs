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
    public sealed class SensorAlertsProfilesConditionThresholdNoiseAmbient
    {
        /// <summary>
        /// Alerting threshold as adjusted decibels.
        /// </summary>
        public readonly int? Level;
        /// <summary>
        /// Alerting threshold as a qualitative ambient noise level.
        /// </summary>
        public readonly string? Quality;

        [OutputConstructor]
        private SensorAlertsProfilesConditionThresholdNoiseAmbient(
            int? level,

            string? quality)
        {
            Level = level;
            Quality = quality;
        }
    }
}
