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
    public sealed class ApplianceUplinksSettingsInterfacesWan2Pppoe
    {
        /// <summary>
        /// Settings for PPPoE Authentication.
        /// </summary>
        public readonly Outputs.ApplianceUplinksSettingsInterfacesWan2PppoeAuthentication? Authentication;
        /// <summary>
        /// Whether PPPoE is enabled.
        /// </summary>
        public readonly bool? Enabled;

        [OutputConstructor]
        private ApplianceUplinksSettingsInterfacesWan2Pppoe(
            Outputs.ApplianceUplinksSettingsInterfacesWan2PppoeAuthentication? authentication,

            bool? enabled)
        {
            Authentication = authentication;
            Enabled = enabled;
        }
    }
}
