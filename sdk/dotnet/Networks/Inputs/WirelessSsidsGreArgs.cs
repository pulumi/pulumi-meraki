// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessSsidsGreArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The EoGRE concentrator's settings
        /// </summary>
        [Input("concentrator")]
        public Input<Inputs.WirelessSsidsGreConcentratorArgs>? Concentrator { get; set; }

        /// <summary>
        /// Optional numerical identifier that will add the GRE key field to the GRE header. Used to identify an individual traffic flow within a tunnel.
        /// </summary>
        [Input("key")]
        public Input<int>? Key { get; set; }

        public WirelessSsidsGreArgs()
        {
        }
        public static new WirelessSsidsGreArgs Empty => new WirelessSsidsGreArgs();
    }
}