// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SensorAlertsProfilesConditionsResponseThresholdPowerFactorGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alerting threshold as the ratio of active power to apparent power. Must be between 0 and 100.
        /// </summary>
        [Input("percentage")]
        public Input<int>? Percentage { get; set; }

        public SensorAlertsProfilesConditionsResponseThresholdPowerFactorGetArgs()
        {
        }
        public static new SensorAlertsProfilesConditionsResponseThresholdPowerFactorGetArgs Empty => new SensorAlertsProfilesConditionsResponseThresholdPowerFactorGetArgs();
    }
}