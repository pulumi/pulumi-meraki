// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Administered.Outputs
{

    [OutputType]
    public sealed class GetLicensingSubscriptionEntitlementsItemResult
    {
        /// <summary>
        /// The feature tier associated with the entitlement (null for add-ons)
        /// </summary>
        public readonly string FeatureTier;
        /// <summary>
        /// Whether or not the entitlement is an add-on
        /// </summary>
        public readonly bool IsAddOn;
        /// <summary>
        /// The user-facing name of the entitlement
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The product class associated with the entitlement
        /// </summary>
        public readonly string ProductClass;
        /// <summary>
        /// The product type of the entitlement
        /// </summary>
        public readonly string ProductType;
        /// <summary>
        /// The SKU identifier of the entitlement
        /// </summary>
        public readonly string Sku;

        [OutputConstructor]
        private GetLicensingSubscriptionEntitlementsItemResult(
            string featureTier,

            bool isAddOn,

            string name,

            string productClass,

            string productType,

            string sku)
        {
            FeatureTier = featureTier;
            IsAddOn = isAddOn;
            Name = name;
            ProductClass = productClass;
            ProductType = productType;
            Sku = sku;
        }
    }
}