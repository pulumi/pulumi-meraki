// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Outputs
{

    [OutputType]
    public sealed class GetSmBypassActivationLockAttemptsItemResult
    {
        public readonly Outputs.GetSmBypassActivationLockAttemptsItemDataResult Data;
        public readonly string Id;
        public readonly string Status;

        [OutputConstructor]
        private GetSmBypassActivationLockAttemptsItemResult(
            Outputs.GetSmBypassActivationLockAttemptsItemDataResult data,

            string id,

            string status)
        {
            Data = data;
            Id = id;
            Status = status;
        }
    }
}
