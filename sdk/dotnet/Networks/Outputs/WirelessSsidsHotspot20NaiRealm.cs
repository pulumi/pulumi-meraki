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
    public sealed class WirelessSsidsHotspot20NaiRealm
    {
        /// <summary>
        /// The format for the realm ('1' or '0')
        /// </summary>
        public readonly string? Format;
        /// <summary>
        /// An array of EAP methods for the realm.
        /// </summary>
        public readonly ImmutableArray<Outputs.WirelessSsidsHotspot20NaiRealmMethod> Methods;
        public readonly string? Name;
        /// <summary>
        /// The name of the realm
        /// </summary>
        public readonly string? Realm;

        [OutputConstructor]
        private WirelessSsidsHotspot20NaiRealm(
            string? format,

            ImmutableArray<Outputs.WirelessSsidsHotspot20NaiRealmMethod> methods,

            string? name,

            string? realm)
        {
            Format = format;
            Methods = methods;
            Name = name;
            Realm = realm;
        }
    }
}
