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
    public sealed class GetSwitchRoutingOspfItemV3AreaResult
    {
        public readonly string AreaId;
        public readonly string AreaName;
        public readonly string AreaType;

        [OutputConstructor]
        private GetSwitchRoutingOspfItemV3AreaResult(
            string areaId,

            string areaName,

            string areaType)
        {
            AreaId = areaId;
            AreaName = areaName;
            AreaType = areaType;
        }
    }
}