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
    public sealed class GetApplianceUplinksSettingsItemInterfacesWan2PppoeResult
    {
        /// <summary>
        /// Settings for PPPoE Authentication.
        /// </summary>
        public readonly Outputs.GetApplianceUplinksSettingsItemInterfacesWan2PppoeAuthenticationResult Authentication;
        /// <summary>
        /// Whether PPPoE is enabled.
        /// </summary>
        public readonly bool Enabled;

        [OutputConstructor]
        private GetApplianceUplinksSettingsItemInterfacesWan2PppoeResult(
            Outputs.GetApplianceUplinksSettingsItemInterfacesWan2PppoeAuthenticationResult authentication,

            bool enabled)
        {
            Authentication = authentication;
            Enabled = enabled;
        }
    }
}
