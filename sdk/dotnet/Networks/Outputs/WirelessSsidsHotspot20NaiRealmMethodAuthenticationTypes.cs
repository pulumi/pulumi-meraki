// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Outputs
{

    [OutputType]
    public sealed class WirelessSsidsHotspot20NaiRealmMethodAuthenticationTypes
    {
        public readonly ImmutableArray<string> Credentials;
        public readonly ImmutableArray<string> EapinnerAuthentications;
        public readonly ImmutableArray<string> NonEapinnerAuthentications;
        public readonly ImmutableArray<string> TunneledEapMethodCredentials;

        [OutputConstructor]
        private WirelessSsidsHotspot20NaiRealmMethodAuthenticationTypes(
            ImmutableArray<string> credentials,

            ImmutableArray<string> eapinnerAuthentications,

            ImmutableArray<string> nonEapinnerAuthentications,

            ImmutableArray<string> tunneledEapMethodCredentials)
        {
            Credentials = credentials;
            EapinnerAuthentications = eapinnerAuthentications;
            NonEapinnerAuthentications = nonEapinnerAuthentications;
            TunneledEapMethodCredentials = tunneledEapMethodCredentials;
        }
    }
}