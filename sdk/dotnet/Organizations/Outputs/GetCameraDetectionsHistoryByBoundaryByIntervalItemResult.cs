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
    public sealed class GetCameraDetectionsHistoryByBoundaryByIntervalItemResult
    {
        /// <summary>
        /// The boundary id
        /// </summary>
        public readonly string BoundaryId;
        /// <summary>
        /// The analytics data
        /// </summary>
        public readonly Outputs.GetCameraDetectionsHistoryByBoundaryByIntervalItemResultsResult Results;
        /// <summary>
        /// The boundary type
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetCameraDetectionsHistoryByBoundaryByIntervalItemResult(
            string boundaryId,

            Outputs.GetCameraDetectionsHistoryByBoundaryByIntervalItemResultsResult results,

            string type)
        {
            BoundaryId = boundaryId;
            Results = results;
            Type = type;
        }
    }
}
