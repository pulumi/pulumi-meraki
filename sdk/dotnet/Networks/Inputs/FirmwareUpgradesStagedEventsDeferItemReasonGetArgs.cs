// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesStagedEventsDeferItemReasonGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Reason for the rollback
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// Additional comment about the rollback
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        public FirmwareUpgradesStagedEventsDeferItemReasonGetArgs()
        {
        }
        public static new FirmwareUpgradesStagedEventsDeferItemReasonGetArgs Empty => new FirmwareUpgradesStagedEventsDeferItemReasonGetArgs();
    }
}