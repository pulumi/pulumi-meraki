// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.administered.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.administered.inputs.LicensingSubscriptionSubscriptionsClaimItemCountsSeatsArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LicensingSubscriptionSubscriptionsClaimItemCountsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LicensingSubscriptionSubscriptionsClaimItemCountsArgs Empty = new LicensingSubscriptionSubscriptionsClaimItemCountsArgs();

    /**
     * Number of networks bound to this subscription
     * 
     */
    @Import(name="networks")
    private @Nullable Output<Integer> networks;

    /**
     * @return Number of networks bound to this subscription
     * 
     */
    public Optional<Output<Integer>> networks() {
        return Optional.ofNullable(this.networks);
    }

    /**
     * Seat distribution
     * 
     */
    @Import(name="seats")
    private @Nullable Output<LicensingSubscriptionSubscriptionsClaimItemCountsSeatsArgs> seats;

    /**
     * @return Seat distribution
     * 
     */
    public Optional<Output<LicensingSubscriptionSubscriptionsClaimItemCountsSeatsArgs>> seats() {
        return Optional.ofNullable(this.seats);
    }

    private LicensingSubscriptionSubscriptionsClaimItemCountsArgs() {}

    private LicensingSubscriptionSubscriptionsClaimItemCountsArgs(LicensingSubscriptionSubscriptionsClaimItemCountsArgs $) {
        this.networks = $.networks;
        this.seats = $.seats;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LicensingSubscriptionSubscriptionsClaimItemCountsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LicensingSubscriptionSubscriptionsClaimItemCountsArgs $;

        public Builder() {
            $ = new LicensingSubscriptionSubscriptionsClaimItemCountsArgs();
        }

        public Builder(LicensingSubscriptionSubscriptionsClaimItemCountsArgs defaults) {
            $ = new LicensingSubscriptionSubscriptionsClaimItemCountsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networks Number of networks bound to this subscription
         * 
         * @return builder
         * 
         */
        public Builder networks(@Nullable Output<Integer> networks) {
            $.networks = networks;
            return this;
        }

        /**
         * @param networks Number of networks bound to this subscription
         * 
         * @return builder
         * 
         */
        public Builder networks(Integer networks) {
            return networks(Output.of(networks));
        }

        /**
         * @param seats Seat distribution
         * 
         * @return builder
         * 
         */
        public Builder seats(@Nullable Output<LicensingSubscriptionSubscriptionsClaimItemCountsSeatsArgs> seats) {
            $.seats = seats;
            return this;
        }

        /**
         * @param seats Seat distribution
         * 
         * @return builder
         * 
         */
        public Builder seats(LicensingSubscriptionSubscriptionsClaimItemCountsSeatsArgs seats) {
            return seats(Output.of(seats));
        }

        public LicensingSubscriptionSubscriptionsClaimItemCountsArgs build() {
            return $;
        }
    }

}