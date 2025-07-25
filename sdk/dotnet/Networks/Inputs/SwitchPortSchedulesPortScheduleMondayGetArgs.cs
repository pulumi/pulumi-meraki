// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SwitchPortSchedulesPortScheduleMondayGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the schedule is active (true) or inactive (false) during the time specified between 'from' and 'to'. Defaults to true.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// The time, from '00:00' to '24:00'. Must be less than the time specified in 'to'. Defaults to '00:00'. Only 30 minute increments are allowed.
        /// </summary>
        [Input("from")]
        public Input<string>? From { get; set; }

        /// <summary>
        /// The time, from '00:00' to '24:00'. Must be greater than the time specified in 'from'. Defaults to '24:00'. Only 30 minute increments are allowed.
        /// </summary>
        [Input("to")]
        public Input<string>? To { get; set; }

        public SwitchPortSchedulesPortScheduleMondayGetArgs()
        {
        }
        public static new SwitchPortSchedulesPortScheduleMondayGetArgs Empty => new SwitchPortSchedulesPortScheduleMondayGetArgs();
    }
}
