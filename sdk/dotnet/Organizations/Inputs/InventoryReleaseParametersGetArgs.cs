// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class InventoryReleaseParametersGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("serials")]
        private InputList<string>? _serials;

        /// <summary>
        /// Serials of the devices that should be released
        /// </summary>
        public InputList<string> Serials
        {
            get => _serials ?? (_serials = new InputList<string>());
            set => _serials = value;
        }

        public InventoryReleaseParametersGetArgs()
        {
        }
        public static new InventoryReleaseParametersGetArgs Empty => new InventoryReleaseParametersGetArgs();
    }
}