// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class CellularGatewaySubnetPoolSubnetArgs : global::Pulumi.ResourceArgs
    {
        [Input("applianceIp")]
        public Input<string>? ApplianceIp { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("serial")]
        public Input<string>? Serial { get; set; }

        [Input("subnet")]
        public Input<string>? Subnet { get; set; }

        public CellularGatewaySubnetPoolSubnetArgs()
        {
        }
        public static new CellularGatewaySubnetPoolSubnetArgs Empty => new CellularGatewaySubnetPoolSubnetArgs();
    }
}
