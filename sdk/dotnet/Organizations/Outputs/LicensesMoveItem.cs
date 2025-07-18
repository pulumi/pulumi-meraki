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
    public sealed class LicensesMoveItem
    {
        /// <summary>
        /// The ID of the organization to move the licenses to
        /// </summary>
        public readonly string? DestOrganizationId;
        /// <summary>
        /// A list of IDs of licenses to move to the new organization
        /// </summary>
        public readonly ImmutableArray<string> LicenseIds;

        [OutputConstructor]
        private LicensesMoveItem(
            string? destOrganizationId,

            ImmutableArray<string> licenseIds)
        {
            DestOrganizationId = destOrganizationId;
            LicenseIds = licenseIds;
        }
    }
}
