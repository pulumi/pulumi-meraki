// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class AlertsSettingsAlertFiltersGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("period")]
        public Input<int>? Period { get; set; }

        [Input("threshold")]
        public Input<int>? Threshold { get; set; }

        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        public AlertsSettingsAlertFiltersGetArgs()
        {
        }
        public static new AlertsSettingsAlertFiltersGetArgs Empty => new AlertsSettingsAlertFiltersGetArgs();
    }
}
