// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class GetCameraRolesItemResult
    {
        public readonly ImmutableArray<Outputs.GetCameraRolesItemAppliedOnDeviceResult> AppliedOnDevices;
        public readonly ImmutableArray<Outputs.GetCameraRolesItemAppliedOnNetworkResult> AppliedOnNetworks;
        public readonly ImmutableArray<Outputs.GetCameraRolesItemAppliedOrgWideResult> AppliedOrgWides;
        public readonly string Name;

        [OutputConstructor]
        private GetCameraRolesItemResult(
            ImmutableArray<Outputs.GetCameraRolesItemAppliedOnDeviceResult> appliedOnDevices,

            ImmutableArray<Outputs.GetCameraRolesItemAppliedOnNetworkResult> appliedOnNetworks,

            ImmutableArray<Outputs.GetCameraRolesItemAppliedOrgWideResult> appliedOrgWides,

            string name)
        {
            AppliedOnDevices = appliedOnDevices;
            AppliedOnNetworks = appliedOnNetworks;
            AppliedOrgWides = appliedOrgWides;
            Name = name;
        }
    }
}
