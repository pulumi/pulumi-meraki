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
    public sealed class GetWirelessSsidsSplashSettingsItemSentryEnrollmentResult
    {
        /// <summary>
        /// The system types that the Sentry enforces.
        /// </summary>
        public readonly ImmutableArray<string> EnforcedSystems;
        /// <summary>
        /// The strength of the enforcement of selected system types.
        /// </summary>
        public readonly string Strength;
        /// <summary>
        /// Systems Manager network targeted for sentry enrollment.
        /// </summary>
        public readonly Outputs.GetWirelessSsidsSplashSettingsItemSentryEnrollmentSystemsManagerNetworkResult SystemsManagerNetwork;

        [OutputConstructor]
        private GetWirelessSsidsSplashSettingsItemSentryEnrollmentResult(
            ImmutableArray<string> enforcedSystems,

            string strength,

            Outputs.GetWirelessSsidsSplashSettingsItemSentryEnrollmentSystemsManagerNetworkResult systemsManagerNetwork)
        {
            EnforcedSystems = enforcedSystems;
            Strength = strength;
            SystemsManagerNetwork = systemsManagerNetwork;
        }
    }
}
