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
    public sealed class InventoryOnboardingCloudMonitoringImportsParametersItemItem
    {
        /// <summary>
        /// Unique id associated with the import of the device
        /// </summary>
        public readonly string? ImportId;
        /// <summary>
        /// Response method
        /// </summary>
        public readonly string? Message;
        /// <summary>
        /// Cloud monitor import status
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private InventoryOnboardingCloudMonitoringImportsParametersItemItem(
            string? importId,

            string? message,

            string? status)
        {
            ImportId = importId;
            Message = message;
            Status = status;
        }
    }
}
