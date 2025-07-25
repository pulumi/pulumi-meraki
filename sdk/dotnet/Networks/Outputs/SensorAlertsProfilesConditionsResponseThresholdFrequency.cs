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
    public sealed class SensorAlertsProfilesConditionsResponseThresholdFrequency
    {
        /// <summary>
        /// Alerting threshold in hertz. Must be between 0 and 60.
        /// </summary>
        public readonly double? Level;

        [OutputConstructor]
        private SensorAlertsProfilesConditionsResponseThresholdFrequency(double? level)
        {
            Level = level;
        }
    }
}
