// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessSsidsHotspot20NaiRealmGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The format for the realm ('1' or '0')
        /// </summary>
        [Input("format")]
        public Input<string>? Format { get; set; }

        [Input("methods")]
        private InputList<Inputs.WirelessSsidsHotspot20NaiRealmMethodGetArgs>? _methods;

        /// <summary>
        /// An array of EAP methods for the realm.
        /// </summary>
        public InputList<Inputs.WirelessSsidsHotspot20NaiRealmMethodGetArgs> Methods
        {
            get => _methods ?? (_methods = new InputList<Inputs.WirelessSsidsHotspot20NaiRealmMethodGetArgs>());
            set => _methods = value;
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the realm
        /// </summary>
        [Input("realm")]
        public Input<string>? Realm { get; set; }

        public WirelessSsidsHotspot20NaiRealmGetArgs()
        {
        }
        public static new WirelessSsidsHotspot20NaiRealmGetArgs Empty => new WirelessSsidsHotspot20NaiRealmGetArgs();
    }
}