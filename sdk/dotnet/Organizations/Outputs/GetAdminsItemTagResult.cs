// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class GetAdminsItemTagResult
    {
        /// <summary>
        /// Access level for the tag
        /// </summary>
        public readonly string Access;
        /// <summary>
        /// Tag value
        /// </summary>
        public readonly string Tag;

        [OutputConstructor]
        private GetAdminsItemTagResult(
            string access,

            string tag)
        {
            Access = access;
            Tag = tag;
        }
    }
}