// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessSsidsSplashSettingsSplashLogoGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The extension of the logo file.
        /// </summary>
        [Input("extension")]
        public Input<string>? Extension { get; set; }

        /// <summary>
        /// Properties for setting a new image.
        /// </summary>
        [Input("image")]
        public Input<Inputs.WirelessSsidsSplashSettingsSplashLogoImageGetArgs>? Image { get; set; }

        /// <summary>
        /// The MD5 value of the logo file.
        /// </summary>
        [Input("md5")]
        public Input<string>? Md5 { get; set; }

        public WirelessSsidsSplashSettingsSplashLogoGetArgs()
        {
        }
        public static new WirelessSsidsSplashSettingsSplashLogoGetArgs Empty => new WirelessSsidsSplashSettingsSplashLogoGetArgs();
    }
}