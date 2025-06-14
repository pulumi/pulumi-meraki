// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class BaseManagementGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("details")]
        private InputList<Inputs.BaseManagementDetailGetArgs>? _details;

        /// <summary>
        /// Details related to organization management, possibly empty. Details may be named 'MSP ID', 'IP restriction mode for API', or 'IP restriction mode for dashboard', if the organization admin has configured any.
        /// </summary>
        public InputList<Inputs.BaseManagementDetailGetArgs> Details
        {
            get => _details ?? (_details = new InputList<Inputs.BaseManagementDetailGetArgs>());
            set => _details = value;
        }

        public BaseManagementGetArgs()
        {
        }
        public static new BaseManagementGetArgs Empty => new BaseManagementGetArgs();
    }
}
