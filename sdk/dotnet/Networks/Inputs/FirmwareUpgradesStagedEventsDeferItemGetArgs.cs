// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesStagedEventsDeferItemGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The network devices to be updated
        /// </summary>
        [Input("products")]
        public Input<Inputs.FirmwareUpgradesStagedEventsDeferItemProductsGetArgs>? Products { get; set; }

        [Input("reasons")]
        private InputList<Inputs.FirmwareUpgradesStagedEventsDeferItemReasonGetArgs>? _reasons;

        /// <summary>
        /// Reasons for the rollback
        /// </summary>
        public InputList<Inputs.FirmwareUpgradesStagedEventsDeferItemReasonGetArgs> Reasons
        {
            get => _reasons ?? (_reasons = new InputList<Inputs.FirmwareUpgradesStagedEventsDeferItemReasonGetArgs>());
            set => _reasons = value;
        }

        [Input("stages")]
        private InputList<Inputs.FirmwareUpgradesStagedEventsDeferItemStageGetArgs>? _stages;

        /// <summary>
        /// The ordered stages in the network
        /// </summary>
        public InputList<Inputs.FirmwareUpgradesStagedEventsDeferItemStageGetArgs> Stages
        {
            get => _stages ?? (_stages = new InputList<Inputs.FirmwareUpgradesStagedEventsDeferItemStageGetArgs>());
            set => _stages = value;
        }

        public FirmwareUpgradesStagedEventsDeferItemGetArgs()
        {
        }
        public static new FirmwareUpgradesStagedEventsDeferItemGetArgs Empty => new FirmwareUpgradesStagedEventsDeferItemGetArgs();
    }
}