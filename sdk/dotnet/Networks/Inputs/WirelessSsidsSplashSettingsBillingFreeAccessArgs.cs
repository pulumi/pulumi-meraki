// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessSsidsSplashSettingsBillingFreeAccessArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// How long a device can use a network for free.
        /// </summary>
        [Input("durationInMinutes")]
        public Input<int>? DurationInMinutes { get; set; }

        /// <summary>
        /// Whether or not free access is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public WirelessSsidsSplashSettingsBillingFreeAccessArgs()
        {
        }
        public static new WirelessSsidsSplashSettingsBillingFreeAccessArgs Empty => new WirelessSsidsSplashSettingsBillingFreeAccessArgs();
    }
}
