// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SensorAlertsProfilesScheduleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the sensor schedule to use with the alert profile. If not defined, the alert profile will be active at all times.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Name of the sensor schedule to use with the alert profile.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public SensorAlertsProfilesScheduleGetArgs()
        {
        }
        public static new SensorAlertsProfilesScheduleGetArgs Empty => new SensorAlertsProfilesScheduleGetArgs();
    }
}
