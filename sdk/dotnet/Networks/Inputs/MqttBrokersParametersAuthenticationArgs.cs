// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class MqttBrokersParametersAuthenticationArgs : global::Pulumi.ResourceArgs
    {
        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// Password for the MQTT broker.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Username for the MQTT broker.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public MqttBrokersParametersAuthenticationArgs()
        {
        }
        public static new MqttBrokersParametersAuthenticationArgs Empty => new MqttBrokersParametersAuthenticationArgs();
    }
}