// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesStagedEventsRollbacksItemProductsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Switch network to be updated
        /// </summary>
        [Input("switch")]
        public Input<Inputs.FirmwareUpgradesStagedEventsRollbacksItemProductsSwitchGetArgs>? Switch { get; set; }

        public FirmwareUpgradesStagedEventsRollbacksItemProductsGetArgs()
        {
        }
        public static new FirmwareUpgradesStagedEventsRollbacksItemProductsGetArgs Empty => new FirmwareUpgradesStagedEventsRollbacksItemProductsGetArgs();
    }
}
