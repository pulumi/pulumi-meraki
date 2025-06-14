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
    public sealed class GetDevicesStatusesItemResult
    {
        /// <summary>
        /// Components
        /// </summary>
        public readonly Outputs.GetDevicesStatusesItemComponentsResult Components;
        /// <summary>
        /// IP Gateway
        /// </summary>
        public readonly string Gateway;
        /// <summary>
        /// IP Type
        /// </summary>
        public readonly string IpType;
        /// <summary>
        /// LAN IP Address
        /// </summary>
        public readonly string LanIp;
        /// <summary>
        /// Device Last Reported Location
        /// </summary>
        public readonly string LastReportedAt;
        /// <summary>
        /// MAC Address
        /// </summary>
        public readonly string Mac;
        /// <summary>
        /// Model
        /// </summary>
        public readonly string Model;
        /// <summary>
        /// Device Name
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Network ID
        /// </summary>
        public readonly string NetworkId;
        /// <summary>
        /// Primary DNS
        /// </summary>
        public readonly string PrimaryDns;
        /// <summary>
        /// Product Type
        /// </summary>
        public readonly string ProductType;
        /// <summary>
        /// Public IP Address
        /// </summary>
        public readonly string PublicIp;
        /// <summary>
        /// Secondary DNS
        /// </summary>
        public readonly string SecondaryDns;
        /// <summary>
        /// Device Serial Number
        /// </summary>
        public readonly string Serial;
        /// <summary>
        /// Device Status
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Tags
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetDevicesStatusesItemResult(
            Outputs.GetDevicesStatusesItemComponentsResult components,

            string gateway,

            string ipType,

            string lanIp,

            string lastReportedAt,

            string mac,

            string model,

            string name,

            string networkId,

            string primaryDns,

            string productType,

            string publicIp,

            string secondaryDns,

            string serial,

            string status,

            ImmutableArray<string> tags)
        {
            Components = components;
            Gateway = gateway;
            IpType = ipType;
            LanIp = lanIp;
            LastReportedAt = lastReportedAt;
            Mac = mac;
            Model = model;
            Name = name;
            NetworkId = networkId;
            PrimaryDns = primaryDns;
            ProductType = productType;
            PublicIp = publicIp;
            SecondaryDns = secondaryDns;
            Serial = serial;
            Status = status;
            Tags = tags;
        }
    }
}
