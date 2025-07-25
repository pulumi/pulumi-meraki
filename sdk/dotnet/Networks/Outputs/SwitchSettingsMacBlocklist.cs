// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Outputs
{

    [OutputType]
    public sealed class SwitchSettingsMacBlocklist
    {
        /// <summary>
        /// Enable MAC blocklist for switches in the network
        /// </summary>
        public readonly bool? Enabled;

        [OutputConstructor]
        private SwitchSettingsMacBlocklist(bool? enabled)
        {
            Enabled = enabled;
        }
    }
}
