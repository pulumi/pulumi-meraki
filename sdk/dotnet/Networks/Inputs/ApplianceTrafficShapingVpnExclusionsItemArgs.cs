// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceTrafficShapingVpnExclusionsItemArgs : global::Pulumi.ResourceArgs
    {
        [Input("customs")]
        private InputList<Inputs.ApplianceTrafficShapingVpnExclusionsItemCustomArgs>? _customs;

        /// <summary>
        /// Custom VPN exclusion rules.
        /// </summary>
        public InputList<Inputs.ApplianceTrafficShapingVpnExclusionsItemCustomArgs> Customs
        {
            get => _customs ?? (_customs = new InputList<Inputs.ApplianceTrafficShapingVpnExclusionsItemCustomArgs>());
            set => _customs = value;
        }

        [Input("majorApplications")]
        private InputList<Inputs.ApplianceTrafficShapingVpnExclusionsItemMajorApplicationArgs>? _majorApplications;

        /// <summary>
        /// Major Application based VPN exclusion rules.
        /// </summary>
        public InputList<Inputs.ApplianceTrafficShapingVpnExclusionsItemMajorApplicationArgs> MajorApplications
        {
            get => _majorApplications ?? (_majorApplications = new InputList<Inputs.ApplianceTrafficShapingVpnExclusionsItemMajorApplicationArgs>());
            set => _majorApplications = value;
        }

        /// <summary>
        /// ID of the network whose VPN exclusion rules are returned.
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// Name of the network whose VPN exclusion rules are returned.
        /// </summary>
        [Input("networkName")]
        public Input<string>? NetworkName { get; set; }

        public ApplianceTrafficShapingVpnExclusionsItemArgs()
        {
        }
        public static new ApplianceTrafficShapingVpnExclusionsItemArgs Empty => new ApplianceTrafficShapingVpnExclusionsItemArgs();
    }
}