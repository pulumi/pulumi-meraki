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
    public sealed class SwitchStacksRemoveParameters
    {
        /// <summary>
        /// The serial of the switch to be removed
        /// </summary>
        public readonly string? Serial;

        [OutputConstructor]
        private SwitchStacksRemoveParameters(string? serial)
        {
            Serial = serial;
        }
    }
}