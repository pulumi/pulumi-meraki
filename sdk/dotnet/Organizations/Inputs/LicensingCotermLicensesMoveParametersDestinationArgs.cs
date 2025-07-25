// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class LicensingCotermLicensesMoveParametersDestinationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The claim mode of the moved license
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The organization to move the license to
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        public LicensingCotermLicensesMoveParametersDestinationArgs()
        {
        }
        public static new LicensingCotermLicensesMoveParametersDestinationArgs Empty => new LicensingCotermLicensesMoveParametersDestinationArgs();
    }
}
