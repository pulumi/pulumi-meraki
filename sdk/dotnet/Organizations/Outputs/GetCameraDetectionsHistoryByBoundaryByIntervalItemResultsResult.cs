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
    public sealed class GetCameraDetectionsHistoryByBoundaryByIntervalItemResultsResult
    {
        /// <summary>
        /// The period end time
        /// </summary>
        public readonly string EndTime;
        /// <summary>
        /// The number of detections entered
        /// </summary>
        public readonly int In;
        /// <summary>
        /// The detection type
        /// </summary>
        public readonly string ObjectType;
        /// <summary>
        /// The number of detections exited
        /// </summary>
        public readonly int Out;
        /// <summary>
        /// The period start time
        /// </summary>
        public readonly string StartTime;

        [OutputConstructor]
        private GetCameraDetectionsHistoryByBoundaryByIntervalItemResultsResult(
            string endTime,

            int @in,

            string objectType,

            int @out,

            string startTime)
        {
            EndTime = endTime;
            In = @in;
            ObjectType = objectType;
            Out = @out;
            StartTime = startTime;
        }
    }
}
