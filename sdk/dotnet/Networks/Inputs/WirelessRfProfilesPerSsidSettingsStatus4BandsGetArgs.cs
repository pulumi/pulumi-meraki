// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessRfProfilesPerSsidSettingsStatus4BandsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("enableds")]
        private InputList<string>? _enableds;

        /// <summary>
        /// List of enabled bands. Can include ["2.4", "5", "6", "disabled"
        /// </summary>
        public InputList<string> Enableds
        {
            get => _enableds ?? (_enableds = new InputList<string>());
            set => _enableds = value;
        }

        public WirelessRfProfilesPerSsidSettingsStatus4BandsGetArgs()
        {
        }
        public static new WirelessRfProfilesPerSsidSettingsStatus4BandsGetArgs Empty => new WirelessRfProfilesPerSsidSettingsStatus4BandsGetArgs();
    }
}
