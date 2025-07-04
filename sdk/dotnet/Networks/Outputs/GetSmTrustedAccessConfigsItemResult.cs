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
    public sealed class GetSmTrustedAccessConfigsItemResult
    {
        /// <summary>
        /// time that access ends
        /// </summary>
        public readonly string AccessEndAt;
        /// <summary>
        /// time that access starts
        /// </summary>
        public readonly string AccessStartAt;
        /// <summary>
        /// Optional email text
        /// </summary>
        public readonly string AdditionalEmailText;
        /// <summary>
        /// device ID
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// device name
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Time before access expiration reminder email sends
        /// </summary>
        public readonly int NotifyTimeBeforeAccessEnds;
        /// <summary>
        /// scope
        /// </summary>
        public readonly string Scope;
        /// <summary>
        /// Send Email Notifications
        /// </summary>
        public readonly bool SendExpirationEmails;
        /// <summary>
        /// SSID name
        /// </summary>
        public readonly string SsidName;
        /// <summary>
        /// device tags
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// type of access period, either a static range or a dynamic period
        /// </summary>
        public readonly string TimeboundType;

        [OutputConstructor]
        private GetSmTrustedAccessConfigsItemResult(
            string accessEndAt,

            string accessStartAt,

            string additionalEmailText,

            string id,

            string name,

            int notifyTimeBeforeAccessEnds,

            string scope,

            bool sendExpirationEmails,

            string ssidName,

            ImmutableArray<string> tags,

            string timeboundType)
        {
            AccessEndAt = accessEndAt;
            AccessStartAt = accessStartAt;
            AdditionalEmailText = additionalEmailText;
            Id = id;
            Name = name;
            NotifyTimeBeforeAccessEnds = notifyTimeBeforeAccessEnds;
            Scope = scope;
            SendExpirationEmails = sendExpirationEmails;
            SsidName = ssidName;
            Tags = tags;
            TimeboundType = timeboundType;
        }
    }
}
