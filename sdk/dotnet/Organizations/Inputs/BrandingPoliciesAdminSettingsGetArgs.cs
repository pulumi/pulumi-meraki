// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class BrandingPoliciesAdminSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Which kinds of admins this policy applies to. Can be one of 'All organization admins', 'All enterprise admins', 'All network admins', 'All admins of networks...', 'All admins of networks tagged...', 'Specific admins...', 'All admins' or 'All SAML admins'.
        /// </summary>
        [Input("appliesTo")]
        public Input<string>? AppliesTo { get; set; }

        [Input("values")]
        private InputList<string>? _values;

        /// <summary>
        /// If 'appliesTo' is set to one of 'Specific admins...', 'All admins of networks...' or 'All admins of networks tagged...', then you must specify this 'values' property to provide the set of
        ///   entities to apply the branding policy to. For 'Specific admins...', specify an array of admin IDs. For 'All admins of
        ///   networks...', specify an array of network IDs and/or configuration template IDs. For 'All admins of networks tagged...',
        ///   specify an array of tag names.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public BrandingPoliciesAdminSettingsGetArgs()
        {
        }
        public static new BrandingPoliciesAdminSettingsGetArgs Empty => new BrandingPoliciesAdminSettingsGetArgs();
    }
}
