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
    public sealed class BrandingPoliciesCustomLogoImage
    {
        /// <summary>
        /// The file contents (a base 64 encoded string) of your new logo.
        /// </summary>
        public readonly string? Contents;
        /// <summary>
        /// The format of the encoded contents.  Supported formats are 'png', 'gif', and jpg'.
        /// </summary>
        public readonly string? Format;
        /// <summary>
        /// Preview of the image
        /// </summary>
        public readonly Outputs.BrandingPoliciesCustomLogoImagePreview? Preview;

        [OutputConstructor]
        private BrandingPoliciesCustomLogoImage(
            string? contents,

            string? format,

            Outputs.BrandingPoliciesCustomLogoImagePreview? preview)
        {
            Contents = contents;
            Format = format;
            Preview = preview;
        }
    }
}