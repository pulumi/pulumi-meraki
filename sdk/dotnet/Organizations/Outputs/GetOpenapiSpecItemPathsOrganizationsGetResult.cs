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
    public sealed class GetOpenapiSpecItemPathsOrganizationsGetResult
    {
        public readonly string Description;
        public readonly string OperationId;
        public readonly Outputs.GetOpenapiSpecItemPathsOrganizationsGetResponsesResult Responses;

        [OutputConstructor]
        private GetOpenapiSpecItemPathsOrganizationsGetResult(
            string description,

            string operationId,

            Outputs.GetOpenapiSpecItemPathsOrganizationsGetResponsesResult responses)
        {
            Description = description;
            OperationId = operationId;
            Responses = responses;
        }
    }
}
