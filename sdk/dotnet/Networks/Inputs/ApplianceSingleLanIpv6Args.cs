// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceSingleLanIpv6Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable IPv6 on single LAN
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("prefixAssignments")]
        private InputList<Inputs.ApplianceSingleLanIpv6PrefixAssignmentArgs>? _prefixAssignments;

        /// <summary>
        /// Prefix assignments on the single LAN
        /// </summary>
        public InputList<Inputs.ApplianceSingleLanIpv6PrefixAssignmentArgs> PrefixAssignments
        {
            get => _prefixAssignments ?? (_prefixAssignments = new InputList<Inputs.ApplianceSingleLanIpv6PrefixAssignmentArgs>());
            set => _prefixAssignments = value;
        }

        public ApplianceSingleLanIpv6Args()
        {
        }
        public static new ApplianceSingleLanIpv6Args Empty => new ApplianceSingleLanIpv6Args();
    }
}
