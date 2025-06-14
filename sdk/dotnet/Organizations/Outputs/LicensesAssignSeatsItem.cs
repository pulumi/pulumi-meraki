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
    public sealed class LicensesAssignSeatsItem
    {
        /// <summary>
        /// Resulting licenses from the move
        /// </summary>
        public readonly ImmutableArray<Outputs.LicensesAssignSeatsItemResultingLicense> ResultingLicenses;

        [OutputConstructor]
        private LicensesAssignSeatsItem(ImmutableArray<Outputs.LicensesAssignSeatsItemResultingLicense> resultingLicenses)
        {
            ResultingLicenses = resultingLicenses;
        }
    }
}
