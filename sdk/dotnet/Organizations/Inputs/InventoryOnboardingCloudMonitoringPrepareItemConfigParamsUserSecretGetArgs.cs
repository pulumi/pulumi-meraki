// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserSecretGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The hashed secret
        /// </summary>
        [Input("hash")]
        public Input<string>? Hash { get; set; }

        public InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserSecretGetArgs()
        {
        }
        public static new InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserSecretGetArgs Empty => new InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserSecretGetArgs();
    }
}
