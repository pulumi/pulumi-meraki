// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class GetManagementInterfaceItemDdnsHostnamesResult
    {
        /// <summary>
        /// Active dynamic DNS hostname.
        /// </summary>
        public readonly string ActiveDdnsHostname;
        /// <summary>
        /// WAN 1 dynamic DNS hostname.
        /// </summary>
        public readonly string DdnsHostnameWan1;
        /// <summary>
        /// WAN 2 dynamic DNS hostname.
        /// </summary>
        public readonly string DdnsHostnameWan2;

        [OutputConstructor]
        private GetManagementInterfaceItemDdnsHostnamesResult(
            string activeDdnsHostname,

            string ddnsHostnameWan1,

            string ddnsHostnameWan2)
        {
            ActiveDdnsHostname = activeDdnsHostname;
            DdnsHostnameWan1 = ddnsHostnameWan1;
            DdnsHostnameWan2 = ddnsHostnameWan2;
        }
    }
}