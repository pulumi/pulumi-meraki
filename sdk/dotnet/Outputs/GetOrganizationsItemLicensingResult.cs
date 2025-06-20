// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Outputs
{

    [OutputType]
    public sealed class GetOrganizationsItemLicensingResult
    {
        /// <summary>
        /// Organization licensing model. Can be 'co-term', 'per-device', or 'subscription'.
        /// </summary>
        public readonly string Model;

        [OutputConstructor]
        private GetOrganizationsItemLicensingResult(string model)
        {
            Model = model;
        }
    }
}
