// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class BaseManagementDetailArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of management data
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Value of management data
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public BaseManagementDetailArgs()
        {
        }
        public static new BaseManagementDetailArgs Empty => new BaseManagementDetailArgs();
    }
}
