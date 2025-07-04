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
    public sealed class GetEarlyAccessFeaturesOptInsItemResult
    {
        /// <summary>
        /// Time when Early Access Feature was created
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// ID of Early Access Feature
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Networks assigned to the Early Access Feature
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEarlyAccessFeaturesOptInsItemLimitScopeToNetworkResult> LimitScopeToNetworks;
        /// <summary>
        /// Name of Early Access Feature
        /// </summary>
        public readonly string ShortName;

        [OutputConstructor]
        private GetEarlyAccessFeaturesOptInsItemResult(
            string createdAt,

            string id,

            ImmutableArray<Outputs.GetEarlyAccessFeaturesOptInsItemLimitScopeToNetworkResult> limitScopeToNetworks,

            string shortName)
        {
            CreatedAt = createdAt;
            Id = id;
            LimitScopeToNetworks = limitScopeToNetworks;
            ShortName = shortName;
        }
    }
}
