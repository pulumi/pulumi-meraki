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
    public sealed class LicensingCotermLicensesMoveParametersDestination
    {
        /// <summary>
        /// The claim mode of the moved license
        /// </summary>
        public readonly string? Mode;
        /// <summary>
        /// The organization to move the license to
        /// </summary>
        public readonly string? OrganizationId;

        [OutputConstructor]
        private LicensingCotermLicensesMoveParametersDestination(
            string? mode,

            string? organizationId)
        {
            Mode = mode;
            OrganizationId = organizationId;
        }
    }
}
