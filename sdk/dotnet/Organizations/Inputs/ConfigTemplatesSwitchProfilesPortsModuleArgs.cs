// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class ConfigTemplatesSwitchProfilesPortsModuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The model of the expansion module.
        /// </summary>
        [Input("model")]
        public Input<string>? Model { get; set; }

        public ConfigTemplatesSwitchProfilesPortsModuleArgs()
        {
        }
        public static new ConfigTemplatesSwitchProfilesPortsModuleArgs Empty => new ConfigTemplatesSwitchProfilesPortsModuleArgs();
    }
}
