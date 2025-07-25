// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SwitchDscpToCosMappingsMappingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The actual layer-2 CoS queue the DSCP value is mapped to. These are not bits set on outgoing frames. Value can be in the range of 0 to 5 inclusive.
        /// </summary>
        [Input("cos")]
        public Input<int>? Cos { get; set; }

        /// <summary>
        /// The Differentiated Services Code Point (DSCP) tag in the IP header that will be mapped to a particular Class-of-Service (CoS) queue. Value can be in the range of 0 to 63 inclusive.
        /// </summary>
        [Input("dscp")]
        public Input<int>? Dscp { get; set; }

        /// <summary>
        /// Label for the mapping (optional).
        /// </summary>
        [Input("title")]
        public Input<string>? Title { get; set; }

        public SwitchDscpToCosMappingsMappingGetArgs()
        {
        }
        public static new SwitchDscpToCosMappingsMappingGetArgs Empty => new SwitchDscpToCosMappingsMappingGetArgs();
    }
}
