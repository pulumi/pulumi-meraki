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
    public sealed class GetCellularGatewaySubnetPoolItemResult
    {
        public readonly string Cidr;
        public readonly string DeploymentMode;
        public readonly int Mask;
        public readonly ImmutableArray<Outputs.GetCellularGatewaySubnetPoolItemSubnetResult> Subnets;

        [OutputConstructor]
        private GetCellularGatewaySubnetPoolItemResult(
            string cidr,

            string deploymentMode,

            int mask,

            ImmutableArray<Outputs.GetCellularGatewaySubnetPoolItemSubnetResult> subnets)
        {
            Cidr = cidr;
            DeploymentMode = deploymentMode;
            Mask = mask;
            Subnets = subnets;
        }
    }
}