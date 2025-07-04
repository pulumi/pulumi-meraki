// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The public key for the registered user
        /// </summary>
        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        /// <summary>
        /// Stores the user secret hash
        /// </summary>
        [Input("secret")]
        public Input<Inputs.InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserSecretGetArgs>? Secret { get; set; }

        /// <summary>
        /// The username added to Catalyst device
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserGetArgs()
        {
        }
        public static new InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserGetArgs Empty => new InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserGetArgs();
    }
}
