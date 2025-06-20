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
    public sealed class GetApplianceUplinksSettingsItemInterfacesWan1Result
    {
        /// <summary>
        /// Enable or disable the interface.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Configuration options for PPPoE.
        /// </summary>
        public readonly Outputs.GetApplianceUplinksSettingsItemInterfacesWan1PppoeResult Pppoe;
        /// <summary>
        /// SVI settings by protocol.
        /// </summary>
        public readonly Outputs.GetApplianceUplinksSettingsItemInterfacesWan1SvisResult Svis;
        /// <summary>
        /// VLAN tagging settings.
        /// </summary>
        public readonly Outputs.GetApplianceUplinksSettingsItemInterfacesWan1VlanTaggingResult VlanTagging;

        [OutputConstructor]
        private GetApplianceUplinksSettingsItemInterfacesWan1Result(
            bool enabled,

            Outputs.GetApplianceUplinksSettingsItemInterfacesWan1PppoeResult pppoe,

            Outputs.GetApplianceUplinksSettingsItemInterfacesWan1SvisResult svis,

            Outputs.GetApplianceUplinksSettingsItemInterfacesWan1VlanTaggingResult vlanTagging)
        {
            Enabled = enabled;
            Pppoe = pppoe;
            Svis = svis;
            VlanTagging = vlanTagging;
        }
    }
}
