// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class CameraCustomAnalyticsParameter
    {
        /// <summary>
        /// Name of the parameter
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Value of the parameter
        /// </summary>
        public readonly double? Value;

        [OutputConstructor]
        private CameraCustomAnalyticsParameter(
            string? name,

            double? value)
        {
            Name = name;
            Value = value;
        }
    }
}
