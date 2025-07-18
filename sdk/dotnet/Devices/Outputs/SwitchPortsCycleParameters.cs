// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class SwitchPortsCycleParameters
    {
        /// <summary>
        /// List of switch ports
        /// </summary>
        public readonly ImmutableArray<string> Ports;

        [OutputConstructor]
        private SwitchPortsCycleParameters(ImmutableArray<string> ports)
        {
            Ports = ports;
        }
    }
}
