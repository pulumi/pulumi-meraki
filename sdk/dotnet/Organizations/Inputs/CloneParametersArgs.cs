// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class CloneParametersArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the new organization
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public CloneParametersArgs()
        {
        }
        public static new CloneParametersArgs Empty => new CloneParametersArgs();
    }
}
