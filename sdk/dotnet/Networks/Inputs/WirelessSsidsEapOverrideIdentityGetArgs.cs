// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessSsidsEapOverrideIdentityGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Maximum number of EAP retries.
        /// </summary>
        [Input("retries")]
        public Input<int>? Retries { get; set; }

        /// <summary>
        /// EAP timeout in seconds.
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        public WirelessSsidsEapOverrideIdentityGetArgs()
        {
        }
        public static new WirelessSsidsEapOverrideIdentityGetArgs Empty => new WirelessSsidsEapOverrideIdentityGetArgs();
    }
}
