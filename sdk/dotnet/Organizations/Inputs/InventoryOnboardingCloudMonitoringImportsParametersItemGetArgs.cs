// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class InventoryOnboardingCloudMonitoringImportsParametersItemGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("items")]
        private InputList<Inputs.InventoryOnboardingCloudMonitoringImportsParametersItemItemGetArgs>? _items;

        /// <summary>
        /// Array of ResponseOrganizationsCreateOrganizationInventoryOnboardingCloudMonitoringImport
        /// </summary>
        public InputList<Inputs.InventoryOnboardingCloudMonitoringImportsParametersItemItemGetArgs> Items
        {
            get => _items ?? (_items = new InputList<Inputs.InventoryOnboardingCloudMonitoringImportsParametersItemItemGetArgs>());
            set => _items = value;
        }

        public InventoryOnboardingCloudMonitoringImportsParametersItemGetArgs()
        {
        }
        public static new InventoryOnboardingCloudMonitoringImportsParametersItemGetArgs Empty => new InventoryOnboardingCloudMonitoringImportsParametersItemGetArgs();
    }
}
