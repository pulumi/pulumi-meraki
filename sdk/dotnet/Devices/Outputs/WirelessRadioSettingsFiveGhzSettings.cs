// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class WirelessRadioSettingsFiveGhzSettings
    {
        /// <summary>
        /// Sets a manual channel for 5 GHz. Can be '36', '40', '44', '48', '52', '56', '60', '64', '100', '104', '108', '112', '116', '120', '124', '128', '132', '136', '140', '144', '149', '153', '157', '161', '165', '169', '173' or '177' or null for using auto channel.
        /// </summary>
        public readonly int? Channel;
        /// <summary>
        /// Sets a manual channel for 5 GHz. Can be '0', '20', '40', '80' or '160' or null for using auto channel width.
        /// </summary>
        public readonly string? ChannelWidth;
        /// <summary>
        /// Set a manual target power for 5 GHz. Can be between '8' or '30' or null for using auto power range.
        /// </summary>
        public readonly int? TargetPower;

        [OutputConstructor]
        private WirelessRadioSettingsFiveGhzSettings(
            int? channel,

            string? channelWidth,

            int? targetPower)
        {
            Channel = channel;
            ChannelWidth = channelWidth;
            TargetPower = targetPower;
        }
    }
}
