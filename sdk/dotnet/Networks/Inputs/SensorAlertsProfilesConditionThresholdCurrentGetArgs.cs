// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SensorAlertsProfilesConditionThresholdCurrentGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alerting threshold in amps. Must be between 0 and 15.
        /// </summary>
        [Input("draw")]
        public Input<double>? Draw { get; set; }

        public SensorAlertsProfilesConditionThresholdCurrentGetArgs()
        {
        }
        public static new SensorAlertsProfilesConditionThresholdCurrentGetArgs Empty => new SensorAlertsProfilesConditionThresholdCurrentGetArgs();
    }
}
