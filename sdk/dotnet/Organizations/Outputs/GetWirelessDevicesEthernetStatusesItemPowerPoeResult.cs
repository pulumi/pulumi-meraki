// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class GetWirelessDevicesEthernetStatusesItemPowerPoeResult
    {
        /// <summary>
        /// PoE power connected
        /// </summary>
        public readonly bool IsConnected;

        [OutputConstructor]
        private GetWirelessDevicesEthernetStatusesItemPowerPoeResult(bool isConnected)
        {
            IsConnected = isConnected;
        }
    }
}
