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
    public sealed class GetFirmwareUpgradesByDeviceItemUpgradeFromVersionResult
    {
        /// <summary>
        /// ID of the initial firmware version
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Release date of the firmware version
        /// </summary>
        public readonly string ReleaseDate;
        /// <summary>
        /// Release type of the firmware version
        /// </summary>
        public readonly string ReleaseType;
        /// <summary>
        /// Firmware version short name
        /// </summary>
        public readonly string ShortName;

        [OutputConstructor]
        private GetFirmwareUpgradesByDeviceItemUpgradeFromVersionResult(
            string id,

            string releaseDate,

            string releaseType,

            string shortName)
        {
            Id = id;
            ReleaseDate = releaseDate;
            ReleaseType = releaseType;
            ShortName = shortName;
        }
    }
}
