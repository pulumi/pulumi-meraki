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
    public sealed class GetSensorReadingsLatestItemReadingCurrentResult
    {
        /// <summary>
        /// Electrical current reading in amperes.
        /// </summary>
        public readonly double Draw;

        [OutputConstructor]
        private GetSensorReadingsLatestItemReadingCurrentResult(double draw)
        {
            Draw = draw;
        }
    }
}
