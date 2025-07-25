// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesRollbacksItemArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Product type to rollback (if the network is a combined network)
        /// </summary>
        [Input("product")]
        public Input<string>? Product { get; set; }

        [Input("reasons")]
        private InputList<Inputs.FirmwareUpgradesRollbacksItemReasonArgs>? _reasons;

        /// <summary>
        /// Reasons for the rollback
        /// </summary>
        public InputList<Inputs.FirmwareUpgradesRollbacksItemReasonArgs> Reasons
        {
            get => _reasons ?? (_reasons = new InputList<Inputs.FirmwareUpgradesRollbacksItemReasonArgs>());
            set => _reasons = value;
        }

        /// <summary>
        /// Status of the rollback
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Scheduled time for the rollback
        /// </summary>
        [Input("time")]
        public Input<string>? Time { get; set; }

        /// <summary>
        /// Version to downgrade to (if the network has firmware flexibility)
        /// </summary>
        [Input("toVersion")]
        public Input<Inputs.FirmwareUpgradesRollbacksItemToVersionArgs>? ToVersion { get; set; }

        /// <summary>
        /// Batch ID of the firmware rollback
        /// </summary>
        [Input("upgradeBatchId")]
        public Input<string>? UpgradeBatchId { get; set; }

        public FirmwareUpgradesRollbacksItemArgs()
        {
        }
        public static new FirmwareUpgradesRollbacksItemArgs Empty => new FirmwareUpgradesRollbacksItemArgs();
    }
}
