// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.administered.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.administered.inputs.LicensingSubscriptionSubscriptionsClaimItemEntitlementSeatsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LicensingSubscriptionSubscriptionsClaimItemEntitlementArgs extends com.pulumi.resources.ResourceArgs {

    public static final LicensingSubscriptionSubscriptionsClaimItemEntitlementArgs Empty = new LicensingSubscriptionSubscriptionsClaimItemEntitlementArgs();

    /**
     * Seat distribution
     * 
     */
    @Import(name="seats")
    private @Nullable Output<LicensingSubscriptionSubscriptionsClaimItemEntitlementSeatsArgs> seats;

    /**
     * @return Seat distribution
     * 
     */
    public Optional<Output<LicensingSubscriptionSubscriptionsClaimItemEntitlementSeatsArgs>> seats() {
        return Optional.ofNullable(this.seats);
    }

    /**
     * SKU of the required product
     * 
     */
    @Import(name="sku")
    private @Nullable Output<String> sku;

    /**
     * @return SKU of the required product
     * 
     */
    public Optional<Output<String>> sku() {
        return Optional.ofNullable(this.sku);
    }

    private LicensingSubscriptionSubscriptionsClaimItemEntitlementArgs() {}

    private LicensingSubscriptionSubscriptionsClaimItemEntitlementArgs(LicensingSubscriptionSubscriptionsClaimItemEntitlementArgs $) {
        this.seats = $.seats;
        this.sku = $.sku;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LicensingSubscriptionSubscriptionsClaimItemEntitlementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LicensingSubscriptionSubscriptionsClaimItemEntitlementArgs $;

        public Builder() {
            $ = new LicensingSubscriptionSubscriptionsClaimItemEntitlementArgs();
        }

        public Builder(LicensingSubscriptionSubscriptionsClaimItemEntitlementArgs defaults) {
            $ = new LicensingSubscriptionSubscriptionsClaimItemEntitlementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param seats Seat distribution
         * 
         * @return builder
         * 
         */
        public Builder seats(@Nullable Output<LicensingSubscriptionSubscriptionsClaimItemEntitlementSeatsArgs> seats) {
            $.seats = seats;
            return this;
        }

        /**
         * @param seats Seat distribution
         * 
         * @return builder
         * 
         */
        public Builder seats(LicensingSubscriptionSubscriptionsClaimItemEntitlementSeatsArgs seats) {
            return seats(Output.of(seats));
        }

        /**
         * @param sku SKU of the required product
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<String> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku SKU of the required product
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        public LicensingSubscriptionSubscriptionsClaimItemEntitlementArgs build() {
            return $;
        }
    }

}