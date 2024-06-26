// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.organizations.outputs.LicensesAssignSeatsItemResultingLicensePermanentlyQueuedLicense;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LicensesAssignSeatsItemResultingLicense {
    /**
     * @return The date the license started burning
     * 
     */
    private @Nullable String activationDate;
    /**
     * @return The date the license was claimed into the organization
     * 
     */
    private @Nullable String claimDate;
    /**
     * @return Serial number of the device the license is assigned to
     * 
     */
    private @Nullable String deviceSerial;
    /**
     * @return The duration of the individual license
     * 
     */
    private @Nullable Integer durationInDays;
    /**
     * @return The date the license will expire
     * 
     */
    private @Nullable String expirationDate;
    /**
     * @return The id of the head license this license is queued behind. If there is no head license, it returns nil.
     * 
     */
    private @Nullable String headLicenseId;
    /**
     * @return License ID
     * 
     */
    private @Nullable String id;
    /**
     * @return License key
     * 
     */
    private @Nullable String licenseKey;
    /**
     * @return License type
     * 
     */
    private @Nullable String licenseType;
    /**
     * @return ID of the network the license is assigned to
     * 
     */
    private @Nullable String networkId;
    /**
     * @return Order number
     * 
     */
    private @Nullable String orderNumber;
    /**
     * @return DEPRECATED List of permanently queued licenses attached to the license. Instead, use /organizations/{organizationId}/licenses?deviceSerial= to retrieved queued licenses for a given device.
     * 
     */
    private @Nullable List<LicensesAssignSeatsItemResultingLicensePermanentlyQueuedLicense> permanentlyQueuedLicenses;
    /**
     * @return The number of seats of the license. Only applicable to SM licenses.
     * 
     */
    private @Nullable Integer seatCount;
    /**
     * @return The state of the license. All queued licenses have a status of *recentlyQueued*.
     * 
     */
    private @Nullable String state;
    /**
     * @return The duration of the license plus all permanently queued licenses associated with it
     * 
     */
    private @Nullable Integer totalDurationInDays;

    private LicensesAssignSeatsItemResultingLicense() {}
    /**
     * @return The date the license started burning
     * 
     */
    public Optional<String> activationDate() {
        return Optional.ofNullable(this.activationDate);
    }
    /**
     * @return The date the license was claimed into the organization
     * 
     */
    public Optional<String> claimDate() {
        return Optional.ofNullable(this.claimDate);
    }
    /**
     * @return Serial number of the device the license is assigned to
     * 
     */
    public Optional<String> deviceSerial() {
        return Optional.ofNullable(this.deviceSerial);
    }
    /**
     * @return The duration of the individual license
     * 
     */
    public Optional<Integer> durationInDays() {
        return Optional.ofNullable(this.durationInDays);
    }
    /**
     * @return The date the license will expire
     * 
     */
    public Optional<String> expirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }
    /**
     * @return The id of the head license this license is queued behind. If there is no head license, it returns nil.
     * 
     */
    public Optional<String> headLicenseId() {
        return Optional.ofNullable(this.headLicenseId);
    }
    /**
     * @return License ID
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return License key
     * 
     */
    public Optional<String> licenseKey() {
        return Optional.ofNullable(this.licenseKey);
    }
    /**
     * @return License type
     * 
     */
    public Optional<String> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }
    /**
     * @return ID of the network the license is assigned to
     * 
     */
    public Optional<String> networkId() {
        return Optional.ofNullable(this.networkId);
    }
    /**
     * @return Order number
     * 
     */
    public Optional<String> orderNumber() {
        return Optional.ofNullable(this.orderNumber);
    }
    /**
     * @return DEPRECATED List of permanently queued licenses attached to the license. Instead, use /organizations/{organizationId}/licenses?deviceSerial= to retrieved queued licenses for a given device.
     * 
     */
    public List<LicensesAssignSeatsItemResultingLicensePermanentlyQueuedLicense> permanentlyQueuedLicenses() {
        return this.permanentlyQueuedLicenses == null ? List.of() : this.permanentlyQueuedLicenses;
    }
    /**
     * @return The number of seats of the license. Only applicable to SM licenses.
     * 
     */
    public Optional<Integer> seatCount() {
        return Optional.ofNullable(this.seatCount);
    }
    /**
     * @return The state of the license. All queued licenses have a status of *recentlyQueued*.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return The duration of the license plus all permanently queued licenses associated with it
     * 
     */
    public Optional<Integer> totalDurationInDays() {
        return Optional.ofNullable(this.totalDurationInDays);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicensesAssignSeatsItemResultingLicense defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String activationDate;
        private @Nullable String claimDate;
        private @Nullable String deviceSerial;
        private @Nullable Integer durationInDays;
        private @Nullable String expirationDate;
        private @Nullable String headLicenseId;
        private @Nullable String id;
        private @Nullable String licenseKey;
        private @Nullable String licenseType;
        private @Nullable String networkId;
        private @Nullable String orderNumber;
        private @Nullable List<LicensesAssignSeatsItemResultingLicensePermanentlyQueuedLicense> permanentlyQueuedLicenses;
        private @Nullable Integer seatCount;
        private @Nullable String state;
        private @Nullable Integer totalDurationInDays;
        public Builder() {}
        public Builder(LicensesAssignSeatsItemResultingLicense defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationDate = defaults.activationDate;
    	      this.claimDate = defaults.claimDate;
    	      this.deviceSerial = defaults.deviceSerial;
    	      this.durationInDays = defaults.durationInDays;
    	      this.expirationDate = defaults.expirationDate;
    	      this.headLicenseId = defaults.headLicenseId;
    	      this.id = defaults.id;
    	      this.licenseKey = defaults.licenseKey;
    	      this.licenseType = defaults.licenseType;
    	      this.networkId = defaults.networkId;
    	      this.orderNumber = defaults.orderNumber;
    	      this.permanentlyQueuedLicenses = defaults.permanentlyQueuedLicenses;
    	      this.seatCount = defaults.seatCount;
    	      this.state = defaults.state;
    	      this.totalDurationInDays = defaults.totalDurationInDays;
        }

        @CustomType.Setter
        public Builder activationDate(@Nullable String activationDate) {

            this.activationDate = activationDate;
            return this;
        }
        @CustomType.Setter
        public Builder claimDate(@Nullable String claimDate) {

            this.claimDate = claimDate;
            return this;
        }
        @CustomType.Setter
        public Builder deviceSerial(@Nullable String deviceSerial) {

            this.deviceSerial = deviceSerial;
            return this;
        }
        @CustomType.Setter
        public Builder durationInDays(@Nullable Integer durationInDays) {

            this.durationInDays = durationInDays;
            return this;
        }
        @CustomType.Setter
        public Builder expirationDate(@Nullable String expirationDate) {

            this.expirationDate = expirationDate;
            return this;
        }
        @CustomType.Setter
        public Builder headLicenseId(@Nullable String headLicenseId) {

            this.headLicenseId = headLicenseId;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder licenseKey(@Nullable String licenseKey) {

            this.licenseKey = licenseKey;
            return this;
        }
        @CustomType.Setter
        public Builder licenseType(@Nullable String licenseType) {

            this.licenseType = licenseType;
            return this;
        }
        @CustomType.Setter
        public Builder networkId(@Nullable String networkId) {

            this.networkId = networkId;
            return this;
        }
        @CustomType.Setter
        public Builder orderNumber(@Nullable String orderNumber) {

            this.orderNumber = orderNumber;
            return this;
        }
        @CustomType.Setter
        public Builder permanentlyQueuedLicenses(@Nullable List<LicensesAssignSeatsItemResultingLicensePermanentlyQueuedLicense> permanentlyQueuedLicenses) {

            this.permanentlyQueuedLicenses = permanentlyQueuedLicenses;
            return this;
        }
        public Builder permanentlyQueuedLicenses(LicensesAssignSeatsItemResultingLicensePermanentlyQueuedLicense... permanentlyQueuedLicenses) {
            return permanentlyQueuedLicenses(List.of(permanentlyQueuedLicenses));
        }
        @CustomType.Setter
        public Builder seatCount(@Nullable Integer seatCount) {

            this.seatCount = seatCount;
            return this;
        }
        @CustomType.Setter
        public Builder state(@Nullable String state) {

            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder totalDurationInDays(@Nullable Integer totalDurationInDays) {

            this.totalDurationInDays = totalDurationInDays;
            return this;
        }
        public LicensesAssignSeatsItemResultingLicense build() {
            final var _resultValue = new LicensesAssignSeatsItemResultingLicense();
            _resultValue.activationDate = activationDate;
            _resultValue.claimDate = claimDate;
            _resultValue.deviceSerial = deviceSerial;
            _resultValue.durationInDays = durationInDays;
            _resultValue.expirationDate = expirationDate;
            _resultValue.headLicenseId = headLicenseId;
            _resultValue.id = id;
            _resultValue.licenseKey = licenseKey;
            _resultValue.licenseType = licenseType;
            _resultValue.networkId = networkId;
            _resultValue.orderNumber = orderNumber;
            _resultValue.permanentlyQueuedLicenses = permanentlyQueuedLicenses;
            _resultValue.seatCount = seatCount;
            _resultValue.state = state;
            _resultValue.totalDurationInDays = totalDurationInDays;
            return _resultValue;
        }
    }
}
