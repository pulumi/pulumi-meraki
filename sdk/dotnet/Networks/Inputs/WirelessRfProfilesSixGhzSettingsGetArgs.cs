// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessRfProfilesSixGhzSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Sets channel width (MHz) for 6Ghz band. Can be one of '0', '20', '40', '80' or '160'. Defaults to auto.
        /// </summary>
        [Input("channelWidth")]
        public Input<string>? ChannelWidth { get; set; }

        /// <summary>
        /// Sets max power (dBm) of 6Ghz band. Can be integer between 2 and 30. Defaults to 30.
        /// </summary>
        [Input("maxPower")]
        public Input<int>? MaxPower { get; set; }

        /// <summary>
        /// Sets min bitrate (Mbps) of 6Ghz band. Can be one of '6', '9', '12', '18', '24', '36', '48' or '54'. Defaults to 12.
        /// </summary>
        [Input("minBitrate")]
        public Input<int>? MinBitrate { get; set; }

        /// <summary>
        /// Sets min power (dBm) of 6Ghz band. Can be integer between 2 and 30. Defaults to 8.
        /// </summary>
        [Input("minPower")]
        public Input<int>? MinPower { get; set; }

        /// <summary>
        /// The RX-SOP level controls the sensitivity of the radio. It is strongly recommended to use RX-SOP only after consulting a wireless expert. RX-SOP can be configured in the range of -65 to -95 (dBm). A value of null will reset this to the default.
        /// </summary>
        [Input("rxsop")]
        public Input<int>? Rxsop { get; set; }

        [Input("validAutoChannels")]
        private InputList<int>? _validAutoChannels;

        /// <summary>
        /// Sets valid auto channels for 6Ghz band. Can be one of '1', '5', '9', '13', '17', '21', '25', '29', '33', '37', '41', '45', '49', '53', '57', '61', '65', '69', '73', '77', '81', '85', '89', '93', '97', '101', '105', '109', '113', '117', '121', '125', '129', '133', '137', '141', '145', '149', '153', '157', '161', '165', '169', '173', '177', '181', '185', '189', '193', '197', '201', '205', '209', '213', '217', '221', '225', '229' or '233'. Defaults to auto.
        /// </summary>
        public InputList<int> ValidAutoChannels
        {
            get => _validAutoChannels ?? (_validAutoChannels = new InputList<int>());
            set => _validAutoChannels = value;
        }

        public WirelessRfProfilesSixGhzSettingsGetArgs()
        {
        }
        public static new WirelessRfProfilesSixGhzSettingsGetArgs Empty => new WirelessRfProfilesSixGhzSettingsGetArgs();
    }
}
