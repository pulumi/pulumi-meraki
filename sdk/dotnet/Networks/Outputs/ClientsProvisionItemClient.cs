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
    public sealed class ClientsProvisionItemClient
    {
        /// <summary>
        /// The identifier of the client
        /// </summary>
        public readonly string? ClientId;
        /// <summary>
        /// The MAC address of the client
        /// </summary>
        public readonly string? Mac;
        /// <summary>
        /// The client's display message if its group policy is 'Blocked'
        /// </summary>
        public readonly string? Message;
        /// <summary>
        /// The name of the client
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private ClientsProvisionItemClient(
            string? clientId,

            string? mac,

            string? message,

            string? name)
        {
            ClientId = clientId;
            Mac = mac;
            Message = message;
            Name = name;
        }
    }
}
