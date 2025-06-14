// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class MqttBrokersParametersSecurityTlsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// CA Certificate of the MQTT broker.
        /// </summary>
        [Input("caCertificate")]
        public Input<string>? CaCertificate { get; set; }

        /// <summary>
        /// Whether the TLS hostname verification is enabled for the MQTT broker.
        /// </summary>
        [Input("verifyHostnames")]
        public Input<bool>? VerifyHostnames { get; set; }

        public MqttBrokersParametersSecurityTlsArgs()
        {
        }
        public static new MqttBrokersParametersSecurityTlsArgs Empty => new MqttBrokersParametersSecurityTlsArgs();
    }
}
