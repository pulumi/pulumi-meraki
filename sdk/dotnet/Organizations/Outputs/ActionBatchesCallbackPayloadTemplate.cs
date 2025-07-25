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
    public sealed class ActionBatchesCallbackPayloadTemplate
    {
        /// <summary>
        /// The ID of the payload template. Defaults to 'wpt_00005' for the Callback (included) template.
        /// </summary>
        public readonly string? Id;

        [OutputConstructor]
        private ActionBatchesCallbackPayloadTemplate(string? id)
        {
            Id = id;
        }
    }
}
