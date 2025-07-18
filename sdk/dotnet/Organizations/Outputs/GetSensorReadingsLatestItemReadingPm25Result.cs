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
    public sealed class GetSensorReadingsLatestItemReadingPm25Result
    {
        /// <summary>
        /// PM2.5 reading in micrograms per cubic meter.
        /// </summary>
        public readonly int Concentration;

        [OutputConstructor]
        private GetSensorReadingsLatestItemReadingPm25Result(int concentration)
        {
            Concentration = concentration;
        }
    }
}
