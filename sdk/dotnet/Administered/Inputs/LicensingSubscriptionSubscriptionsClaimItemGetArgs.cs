// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Administered.Inputs
{

    public sealed class LicensingSubscriptionSubscriptionsClaimItemGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Numeric breakdown of network and entitlement counts
        /// </summary>
        [Input("counts")]
        public Input<Inputs.LicensingSubscriptionSubscriptionsClaimItemCountsGetArgs>? Counts { get; set; }

        /// <summary>
        /// Subscription description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Subscription expiration date
        /// </summary>
        [Input("endDate")]
        public Input<string>? EndDate { get; set; }

        [Input("entitlements")]
        private InputList<Inputs.LicensingSubscriptionSubscriptionsClaimItemEntitlementGetArgs>? _entitlements;

        /// <summary>
        /// Entitlement info
        /// </summary>
        public InputList<Inputs.LicensingSubscriptionSubscriptionsClaimItemEntitlementGetArgs> Entitlements
        {
            get => _entitlements ?? (_entitlements = new InputList<Inputs.LicensingSubscriptionSubscriptionsClaimItemEntitlementGetArgs>());
            set => _entitlements = value;
        }

        /// <summary>
        /// Subscription name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("productTypes")]
        private InputList<string>? _productTypes;

        /// <summary>
        /// Products the subscription has entitlements for
        /// </summary>
        public InputList<string> ProductTypes
        {
            get => _productTypes ?? (_productTypes = new InputList<string>());
            set => _productTypes = value;
        }

        /// <summary>
        /// Subscription start date
        /// </summary>
        [Input("startDate")]
        public Input<string>? StartDate { get; set; }

        /// <summary>
        /// Subscription status
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Subscription's ID
        /// </summary>
        [Input("subscriptionId")]
        public Input<string>? SubscriptionId { get; set; }

        /// <summary>
        /// Web order id
        /// </summary>
        [Input("webOrderId")]
        public Input<string>? WebOrderId { get; set; }

        public LicensingSubscriptionSubscriptionsClaimItemGetArgs()
        {
        }
        public static new LicensingSubscriptionSubscriptionsClaimItemGetArgs Empty => new LicensingSubscriptionSubscriptionsClaimItemGetArgs();
    }
}