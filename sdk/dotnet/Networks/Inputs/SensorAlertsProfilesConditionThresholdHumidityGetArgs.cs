// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SensorAlertsProfilesConditionThresholdHumidityGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alerting threshold as a qualitative humidity level.
        /// </summary>
        [Input("quality")]
        public Input<string>? Quality { get; set; }

        /// <summary>
        /// Alerting threshold in %RH.
        /// </summary>
        [Input("relativePercentage")]
        public Input<int>? RelativePercentage { get; set; }

        public SensorAlertsProfilesConditionThresholdHumidityGetArgs()
        {
        }
        public static new SensorAlertsProfilesConditionThresholdHumidityGetArgs Empty => new SensorAlertsProfilesConditionThresholdHumidityGetArgs();
    }
}
