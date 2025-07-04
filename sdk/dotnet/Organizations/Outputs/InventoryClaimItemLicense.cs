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
    public sealed class InventoryClaimItemLicense
    {
        /// <summary>
        /// The key of the license
        /// </summary>
        public readonly string? Key;
        /// <summary>
        /// The mode of the license
        /// </summary>
        public readonly string? Mode;

        [OutputConstructor]
        private InventoryClaimItemLicense(
            string? key,

            string? mode)
        {
            Key = key;
            Mode = mode;
        }
    }
}
