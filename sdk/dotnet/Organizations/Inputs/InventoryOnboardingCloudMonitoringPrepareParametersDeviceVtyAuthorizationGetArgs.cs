// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthorizationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Group Details
        /// </summary>
        [Input("group")]
        public Input<Inputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthorizationGroupGetArgs>? Group { get; set; }

        public InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthorizationGetArgs()
        {
        }
        public static new InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthorizationGetArgs Empty => new InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthorizationGetArgs();
    }
}
