// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SensorAlertsProfilesConditionThresholdRealPowerGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alerting threshold in watts. Must be between 0 and 3750.
        /// </summary>
        [Input("draw")]
        public Input<double>? Draw { get; set; }

        public SensorAlertsProfilesConditionThresholdRealPowerGetArgs()
        {
        }
        public static new SensorAlertsProfilesConditionThresholdRealPowerGetArgs Empty => new SensorAlertsProfilesConditionThresholdRealPowerGetArgs();
    }
}