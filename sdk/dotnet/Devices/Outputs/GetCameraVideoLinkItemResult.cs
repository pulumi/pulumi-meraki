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
    public sealed class GetCameraVideoLinkItemResult
    {
        public readonly string Url;
        public readonly string VisionUrl;

        [OutputConstructor]
        private GetCameraVideoLinkItemResult(
            string url,

            string visionUrl)
        {
            Url = url;
            VisionUrl = visionUrl;
        }
    }
}