// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Administered.Inputs
{

    public sealed class LicensingSubscriptionSubscriptionsBindItemNetworkGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Network ID
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Network name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public LicensingSubscriptionSubscriptionsBindItemNetworkGetArgs()
        {
        }
        public static new LicensingSubscriptionSubscriptionsBindItemNetworkGetArgs Empty => new LicensingSubscriptionSubscriptionsBindItemNetworkGetArgs();
    }
}
