// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LicensesAssignSeatsItemResultingLicensePermanentlyQueuedLicenseArgs extends com.pulumi.resources.ResourceArgs {

    public static final LicensesAssignSeatsItemResultingLicensePermanentlyQueuedLicenseArgs Empty = new LicensesAssignSeatsItemResultingLicensePermanentlyQueuedLicenseArgs();

    /**
     * The duration of the individual license
     * 
     */
    @Import(name="durationInDays")
    private @Nullable Output<Integer> durationInDays;

    /**
     * @return The duration of the individual license
     * 
     */
    public Optional<Output<Integer>> durationInDays() {
        return Optional.ofNullable(this.durationInDays);
    }

    /**
     * Permanently queued license ID
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Permanently queued license ID
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * License key
     * 
     */
    @Import(name="licenseKey")
    private @Nullable Output<String> licenseKey;

    /**
     * @return License key
     * 
     */
    public Optional<Output<String>> licenseKey() {
        return Optional.ofNullable(this.licenseKey);
    }

    /**
     * License type
     * 
     */
    @Import(name="licenseType")
    private @Nullable Output<String> licenseType;

    /**
     * @return License type
     * 
     */
    public Optional<Output<String>> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }

    /**
     * Order number
     * 
     */
    @Import(name="orderNumber")
    private @Nullable Output<String> orderNumber;

    /**
     * @return Order number
     * 
     */
    public Optional<Output<String>> orderNumber() {
        return Optional.ofNullable(this.orderNumber);
    }

    private LicensesAssignSeatsItemResultingLicensePermanentlyQueuedLicenseArgs() {}

    private LicensesAssignSeatsItemResultingLicensePermanentlyQueuedLicenseArgs(LicensesAssignSeatsItemResultingLicensePermanentlyQueuedLicenseArgs $) {
        this.durationInDays = $.durationInDays;
        this.id = $.id;
        this.licenseKey = $.licenseKey;
        this.licenseType = $.licenseType;
        this.orderNumber = $.orderNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LicensesAssignSeatsItemResultingLicensePermanentlyQueuedLicenseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LicensesAssignSeatsItemResultingLicensePermanentlyQueuedLicenseArgs $;

        public Builder() {
            $ = new LicensesAssignSeatsItemResultingLicensePermanentlyQueuedLicenseArgs();
        }

        public Builder(LicensesAssignSeatsItemResultingLicensePermanentlyQueuedLicenseArgs defaults) {
            $ = new LicensesAssignSeatsItemResultingLicensePermanentlyQueuedLicenseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param durationInDays The duration of the individual license
         * 
         * @return builder
         * 
         */
        public Builder durationInDays(@Nullable Output<Integer> durationInDays) {
            $.durationInDays = durationInDays;
            return this;
        }

        /**
         * @param durationInDays The duration of the individual license
         * 
         * @return builder
         * 
         */
        public Builder durationInDays(Integer durationInDays) {
            return durationInDays(Output.of(durationInDays));
        }

        /**
         * @param id Permanently queued license ID
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Permanently queued license ID
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param licenseKey License key
         * 
         * @return builder
         * 
         */
        public Builder licenseKey(@Nullable Output<String> licenseKey) {
            $.licenseKey = licenseKey;
            return this;
        }

        /**
         * @param licenseKey License key
         * 
         * @return builder
         * 
         */
        public Builder licenseKey(String licenseKey) {
            return licenseKey(Output.of(licenseKey));
        }

        /**
         * @param licenseType License type
         * 
         * @return builder
         * 
         */
        public Builder licenseType(@Nullable Output<String> licenseType) {
            $.licenseType = licenseType;
            return this;
        }

        /**
         * @param licenseType License type
         * 
         * @return builder
         * 
         */
        public Builder licenseType(String licenseType) {
            return licenseType(Output.of(licenseType));
        }

        /**
         * @param orderNumber Order number
         * 
         * @return builder
         * 
         */
        public Builder orderNumber(@Nullable Output<String> orderNumber) {
            $.orderNumber = orderNumber;
            return this;
        }

        /**
         * @param orderNumber Order number
         * 
         * @return builder
         * 
         */
        public Builder orderNumber(String orderNumber) {
            return orderNumber(Output.of(orderNumber));
        }

        public LicensesAssignSeatsItemResultingLicensePermanentlyQueuedLicenseArgs build() {
            return $;
        }
    }

}
