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
    public sealed class ClientsProvisionParametersClient
    {
        /// <summary>
        /// The MAC address of the client. Required.
        /// </summary>
        public readonly string? Mac;
        /// <summary>
        /// The display name for the client. Optional. Limited to 255 bytes.
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private ClientsProvisionParametersClient(
            string? mac,

            string? name)
        {
            Mac = mac;
            Name = name;
        }
    }
}