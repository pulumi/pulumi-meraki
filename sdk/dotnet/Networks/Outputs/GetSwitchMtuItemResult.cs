// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Outputs
{

    [OutputType]
    public sealed class GetSwitchMtuItemResult
    {
        /// <summary>
        /// MTU size for the entire network. Default value is 9578.
        /// </summary>
        public readonly int DefaultMtuSize;
        /// <summary>
        /// Override MTU size for individual switches or switch templates.
        ///   An empty array will clear overrides.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSwitchMtuItemOverrideResult> Overrides;

        [OutputConstructor]
        private GetSwitchMtuItemResult(
            int defaultMtuSize,

            ImmutableArray<Outputs.GetSwitchMtuItemOverrideResult> overrides)
        {
            DefaultMtuSize = defaultMtuSize;
            Overrides = overrides;
        }
    }
}