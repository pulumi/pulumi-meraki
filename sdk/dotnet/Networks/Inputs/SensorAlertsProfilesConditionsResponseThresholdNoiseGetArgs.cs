// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SensorAlertsProfilesConditionsResponseThresholdNoiseGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Ambient noise threshold. One of 'level' or 'quality' must be provided.
        /// </summary>
        [Input("ambient")]
        public Input<Inputs.SensorAlertsProfilesConditionsResponseThresholdNoiseAmbientGetArgs>? Ambient { get; set; }

        public SensorAlertsProfilesConditionsResponseThresholdNoiseGetArgs()
        {
        }
        public static new SensorAlertsProfilesConditionsResponseThresholdNoiseGetArgs Empty => new SensorAlertsProfilesConditionsResponseThresholdNoiseGetArgs();
    }
}