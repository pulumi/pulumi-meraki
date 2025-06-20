// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class InventoryOnboardingCloudMonitoringPrepareParameters
    {
        /// <summary>
        /// A set of devices to import (or update)
        /// </summary>
        public readonly ImmutableArray<Outputs.InventoryOnboardingCloudMonitoringPrepareParametersDevice> Devices;

        [OutputConstructor]
        private InventoryOnboardingCloudMonitoringPrepareParameters(ImmutableArray<Outputs.InventoryOnboardingCloudMonitoringPrepareParametersDevice> devices)
        {
            Devices = devices;
        }
    }
}
