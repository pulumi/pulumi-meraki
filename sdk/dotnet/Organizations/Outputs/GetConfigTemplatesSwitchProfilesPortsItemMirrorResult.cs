// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class GetConfigTemplatesSwitchProfilesPortsItemMirrorResult
    {
        /// <summary>
        /// The port mirror mode. Can be one of ('Destination port', 'Source port' or 'Not mirroring traffic').
        /// </summary>
        public readonly string Mode;

        [OutputConstructor]
        private GetConfigTemplatesSwitchProfilesPortsItemMirrorResult(string mode)
        {
            Mode = mode;
        }
    }
}