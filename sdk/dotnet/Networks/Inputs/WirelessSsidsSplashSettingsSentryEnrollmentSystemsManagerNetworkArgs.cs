// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessSsidsSplashSettingsSentryEnrollmentSystemsManagerNetworkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The network ID of the Systems Manager network.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public WirelessSsidsSplashSettingsSentryEnrollmentSystemsManagerNetworkArgs()
        {
        }
        public static new WirelessSsidsSplashSettingsSentryEnrollmentSystemsManagerNetworkArgs Empty => new WirelessSsidsSplashSettingsSentryEnrollmentSystemsManagerNetworkArgs();
    }
}
