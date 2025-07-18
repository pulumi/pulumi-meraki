// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessSsidsActiveDirectoryCredentialsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The logon name of the Active Directory account.
        /// </summary>
        [Input("logonName")]
        public Input<string>? LogonName { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The password to the Active Directory user account.
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

        public WirelessSsidsActiveDirectoryCredentialsArgs()
        {
        }
        public static new WirelessSsidsActiveDirectoryCredentialsArgs Empty => new WirelessSsidsActiveDirectoryCredentialsArgs();
    }
}
