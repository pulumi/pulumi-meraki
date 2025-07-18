// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceRfProfilesPerSsidSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Settings for SSID 1.
        /// </summary>
        [Input("status1")]
        public Input<Inputs.ApplianceRfProfilesPerSsidSettingsStatus1GetArgs>? Status1 { get; set; }

        /// <summary>
        /// Settings for SSID 2.
        /// </summary>
        [Input("status2")]
        public Input<Inputs.ApplianceRfProfilesPerSsidSettingsStatus2GetArgs>? Status2 { get; set; }

        /// <summary>
        /// Settings for SSID 3.
        /// </summary>
        [Input("status3")]
        public Input<Inputs.ApplianceRfProfilesPerSsidSettingsStatus3GetArgs>? Status3 { get; set; }

        /// <summary>
        /// Settings for SSID 4.
        /// </summary>
        [Input("status4")]
        public Input<Inputs.ApplianceRfProfilesPerSsidSettingsStatus4GetArgs>? Status4 { get; set; }

        public ApplianceRfProfilesPerSsidSettingsGetArgs()
        {
        }
        public static new ApplianceRfProfilesPerSsidSettingsGetArgs Empty => new ApplianceRfProfilesPerSsidSettingsGetArgs();
    }
}
