// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SwitchAccessPoliciesCountsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Counts associated with ports
        /// </summary>
        [Input("ports")]
        public Input<Inputs.SwitchAccessPoliciesCountsPortsGetArgs>? Ports { get; set; }

        public SwitchAccessPoliciesCountsGetArgs()
        {
        }
        public static new SwitchAccessPoliciesCountsGetArgs Empty => new SwitchAccessPoliciesCountsGetArgs();
    }
}
