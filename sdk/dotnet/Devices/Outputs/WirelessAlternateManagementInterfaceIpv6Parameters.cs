// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class WirelessAlternateManagementInterfaceIpv6Parameters
    {
        /// <summary>
        /// configured alternate management interface addresses
        /// </summary>
        public readonly ImmutableArray<Outputs.WirelessAlternateManagementInterfaceIpv6ParametersAddress> Addresses;

        [OutputConstructor]
        private WirelessAlternateManagementInterfaceIpv6Parameters(ImmutableArray<Outputs.WirelessAlternateManagementInterfaceIpv6ParametersAddress> addresses)
        {
            Addresses = addresses;
        }
    }
}