// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceVlansDhcpOptionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The code for the DHCP option. This should be an integer between 2 and 254.
        /// </summary>
        [Input("code")]
        public Input<string>? Code { get; set; }

        /// <summary>
        /// The type for the DHCP option. One of: 'text', 'ip', 'hex' or 'integer'
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The value for the DHCP option
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public ApplianceVlansDhcpOptionArgs()
        {
        }
        public static new ApplianceVlansDhcpOptionArgs Empty => new ApplianceVlansDhcpOptionArgs();
    }
}
