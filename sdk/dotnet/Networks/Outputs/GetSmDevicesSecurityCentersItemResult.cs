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
    public sealed class GetSmDevicesSecurityCentersItemResult
    {
        /// <summary>
        /// The Meraki managed application Id for this record on a particular device.
        /// </summary>
        public readonly string AppId;
        /// <summary>
        /// The size of the software bundle.
        /// </summary>
        public readonly int BundleSize;
        /// <summary>
        /// When the Meraki record for the software was created.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// The Meraki managed device Id.
        /// </summary>
        public readonly string DeviceId;
        /// <summary>
        /// The size of the data stored in the application.
        /// </summary>
        public readonly int DynamicSize;
        /// <summary>
        /// The Meraki software Id.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Software bundle identifier.
        /// </summary>
        public readonly string Identifier;
        /// <summary>
        /// When the Software was installed on the device.
        /// </summary>
        public readonly string InstalledAt;
        /// <summary>
        /// A boolean indicating whether or not an iOS redemption code was used.
        /// </summary>
        public readonly bool IosRedemptionCode;
        /// <summary>
        /// A boolean indicating whether or not the software is managed by Meraki.
        /// </summary>
        public readonly bool IsManaged;
        /// <summary>
        /// The itunes numerical identifier.
        /// </summary>
        public readonly string ItunesId;
        /// <summary>
        /// The license key associated with this software installation.
        /// </summary>
        public readonly string LicenseKey;
        /// <summary>
        /// The name of the software.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The path on the device where the software record is located.
        /// </summary>
        public readonly string Path;
        /// <summary>
        /// The redemption code used for this software.
        /// </summary>
        public readonly int RedemptionCode;
        /// <summary>
        /// Short version notation for the software.
        /// </summary>
        public readonly string ShortVersion;
        /// <summary>
        /// The management status of the software.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// A boolean indicating this software record should be installed on the associated device.
        /// </summary>
        public readonly bool ToInstall;
        /// <summary>
        /// A boolean indicating this software record should be uninstalled on the associated device.
        /// </summary>
        public readonly bool ToUninstall;
        /// <summary>
        /// When the record was uninstalled from the device.
        /// </summary>
        public readonly string UninstalledAt;
        /// <summary>
        /// When the record was last updated by Meraki.
        /// </summary>
        public readonly string UpdatedAt;
        /// <summary>
        /// The vendor of the software.
        /// </summary>
        public readonly string Vendor;
        /// <summary>
        /// Full version notation for the software.
        /// </summary>
        public readonly string Version;

        [OutputConstructor]
        private GetSmDevicesSecurityCentersItemResult(
            string appId,

            int bundleSize,

            string createdAt,

            string deviceId,

            int dynamicSize,

            string id,

            string identifier,

            string installedAt,

            bool iosRedemptionCode,

            bool isManaged,

            string itunesId,

            string licenseKey,

            string name,

            string path,

            int redemptionCode,

            string shortVersion,

            string status,

            bool toInstall,

            bool toUninstall,

            string uninstalledAt,

            string updatedAt,

            string vendor,

            string version)
        {
            AppId = appId;
            BundleSize = bundleSize;
            CreatedAt = createdAt;
            DeviceId = deviceId;
            DynamicSize = dynamicSize;
            Id = id;
            Identifier = identifier;
            InstalledAt = installedAt;
            IosRedemptionCode = iosRedemptionCode;
            IsManaged = isManaged;
            ItunesId = itunesId;
            LicenseKey = licenseKey;
            Name = name;
            Path = path;
            RedemptionCode = redemptionCode;
            ShortVersion = shortVersion;
            Status = status;
            ToInstall = toInstall;
            ToUninstall = toUninstall;
            UninstalledAt = uninstalledAt;
            UpdatedAt = updatedAt;
            Vendor = vendor;
            Version = version;
        }
    }
}
