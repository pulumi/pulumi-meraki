// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FloorPlansBottomRightCornerGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Latitude
        /// </summary>
        [Input("lat")]
        public Input<double>? Lat { get; set; }

        /// <summary>
        /// Longitude
        /// </summary>
        [Input("lng")]
        public Input<double>? Lng { get; set; }

        public FloorPlansBottomRightCornerGetArgs()
        {
        }
        public static new FloorPlansBottomRightCornerGetArgs Empty => new FloorPlansBottomRightCornerGetArgs();
    }
}
