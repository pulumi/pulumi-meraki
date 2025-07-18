// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class InventoryOnboardingCloudMonitoringPrepareItemConfigParamsTunnelGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// SSH tunnel URL used to connect to the device
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The name of the tunnel we are attempting to connect to
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The port used for the ssh tunnel.
        /// </summary>
        [Input("port")]
        public Input<string>? Port { get; set; }

        /// <summary>
        /// Root certificate information
        /// </summary>
        [Input("rootCertificate")]
        public Input<Inputs.InventoryOnboardingCloudMonitoringPrepareItemConfigParamsTunnelRootCertificateGetArgs>? RootCertificate { get; set; }

        public InventoryOnboardingCloudMonitoringPrepareItemConfigParamsTunnelGetArgs()
        {
        }
        public static new InventoryOnboardingCloudMonitoringPrepareItemConfigParamsTunnelGetArgs Empty => new InventoryOnboardingCloudMonitoringPrepareItemConfigParamsTunnelGetArgs();
    }
}
