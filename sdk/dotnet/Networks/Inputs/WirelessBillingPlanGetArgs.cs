// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessBillingPlanGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The uplink bandwidth settings for the pricing plan.
        /// </summary>
        [Input("bandwidthLimits")]
        public Input<Inputs.WirelessBillingPlanBandwidthLimitsGetArgs>? BandwidthLimits { get; set; }

        /// <summary>
        /// The id of the pricing plan to update.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The price of the billing plan.
        /// </summary>
        [Input("price")]
        public Input<double>? Price { get; set; }

        /// <summary>
        /// The time limit of the pricing plan in minutes.
        /// </summary>
        [Input("timeLimit")]
        public Input<string>? TimeLimit { get; set; }

        public WirelessBillingPlanGetArgs()
        {
        }
        public static new WirelessBillingPlanGetArgs Empty => new WirelessBillingPlanGetArgs();
    }
}
