// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SmDevicesInstallAppsParametersGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("appIds")]
        private InputList<string>? _appIds;

        /// <summary>
        /// ids of applications to be installed
        /// </summary>
        public InputList<string> AppIds
        {
            get => _appIds ?? (_appIds = new InputList<string>());
            set => _appIds = value;
        }

        /// <summary>
        /// By default, installation of an app which is believed to already be present on the device will be skipped. If you'd like to force the installation of the app, set this parameter to true.
        /// </summary>
        [Input("force")]
        public Input<bool>? Force { get; set; }

        public SmDevicesInstallAppsParametersGetArgs()
        {
        }
        public static new SmDevicesInstallAppsParametersGetArgs Empty => new SmDevicesInstallAppsParametersGetArgs();
    }
}
