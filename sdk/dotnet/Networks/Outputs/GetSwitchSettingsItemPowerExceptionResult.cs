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
    public sealed class GetSwitchSettingsItemPowerExceptionResult
    {
        /// <summary>
        /// Per switch exception (combined, redundant, useNetworkSetting)
        /// </summary>
        public readonly string PowerType;
        /// <summary>
        /// Serial number of the switch
        /// </summary>
        public readonly string Serial;

        [OutputConstructor]
        private GetSwitchSettingsItemPowerExceptionResult(
            string powerType,

            string serial)
        {
            PowerType = powerType;
            Serial = serial;
        }
    }
}
