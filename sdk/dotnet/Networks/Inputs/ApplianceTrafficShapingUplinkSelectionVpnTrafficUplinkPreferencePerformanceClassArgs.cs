// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferencePerformanceClassArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of builtin performance class. Must be present when performanceClass type is 'builtin' and value must be one of: 'VoIP'
        /// </summary>
        [Input("builtinPerformanceClassName")]
        public Input<string>? BuiltinPerformanceClassName { get; set; }

        /// <summary>
        /// ID of created custom performance class, must be present when performanceClass type is "custom"
        /// </summary>
        [Input("customPerformanceClassId")]
        public Input<string>? CustomPerformanceClassId { get; set; }

        /// <summary>
        /// Type of this performance class. Must be one of: 'builtin' or 'custom'
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferencePerformanceClassArgs()
        {
        }
        public static new ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferencePerformanceClassArgs Empty => new ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferencePerformanceClassArgs();
    }
}