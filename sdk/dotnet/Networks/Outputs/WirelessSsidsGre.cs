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
    public sealed class WirelessSsidsGre
    {
        /// <summary>
        /// The EoGRE concentrator's settings
        /// </summary>
        public readonly Outputs.WirelessSsidsGreConcentrator? Concentrator;
        /// <summary>
        /// Optional numerical identifier that will add the GRE key field to the GRE header. Used to identify an individual traffic flow within a tunnel.
        /// </summary>
        public readonly int? Key;

        [OutputConstructor]
        private WirelessSsidsGre(
            Outputs.WirelessSsidsGreConcentrator? concentrator,

            int? key)
        {
            Concentrator = concentrator;
            Key = key;
        }
    }
}
