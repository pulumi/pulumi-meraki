// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class CloneItemManagementGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("details")]
        private InputList<Inputs.CloneItemManagementDetailGetArgs>? _details;

        /// <summary>
        /// Details related to organization management, possibly empty. Details may be named 'MSP ID', 'IP restriction mode for API', or 'IP restriction mode for dashboard', if the organization admin has configured any.
        /// </summary>
        public InputList<Inputs.CloneItemManagementDetailGetArgs> Details
        {
            get => _details ?? (_details = new InputList<Inputs.CloneItemManagementDetailGetArgs>());
            set => _details = value;
        }

        public CloneItemManagementGetArgs()
        {
        }
        public static new CloneItemManagementGetArgs Empty => new CloneItemManagementGetArgs();
    }
}
