// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.organizations.outputs.InventoryOnboardingCloudMonitoringPrepareItemConfigParams;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InventoryOnboardingCloudMonitoringPrepareItem {
    /**
     * @return Params used in order to connect to the device
     * 
     */
    private @Nullable InventoryOnboardingCloudMonitoringPrepareItemConfigParams configParams;
    /**
     * @return Import ID from the Import operation
     * 
     */
    private @Nullable String deviceId;
    /**
     * @return Message related to whether or not the device was found and can be imported.
     * 
     */
    private @Nullable String message;
    /**
     * @return The import status of the device
     * 
     */
    private @Nullable String status;
    /**
     * @return Device UDI certificate
     * 
     */
    private @Nullable String udi;

    private InventoryOnboardingCloudMonitoringPrepareItem() {}
    /**
     * @return Params used in order to connect to the device
     * 
     */
    public Optional<InventoryOnboardingCloudMonitoringPrepareItemConfigParams> configParams() {
        return Optional.ofNullable(this.configParams);
    }
    /**
     * @return Import ID from the Import operation
     * 
     */
    public Optional<String> deviceId() {
        return Optional.ofNullable(this.deviceId);
    }
    /**
     * @return Message related to whether or not the device was found and can be imported.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * @return The import status of the device
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return Device UDI certificate
     * 
     */
    public Optional<String> udi() {
        return Optional.ofNullable(this.udi);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InventoryOnboardingCloudMonitoringPrepareItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable InventoryOnboardingCloudMonitoringPrepareItemConfigParams configParams;
        private @Nullable String deviceId;
        private @Nullable String message;
        private @Nullable String status;
        private @Nullable String udi;
        public Builder() {}
        public Builder(InventoryOnboardingCloudMonitoringPrepareItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configParams = defaults.configParams;
    	      this.deviceId = defaults.deviceId;
    	      this.message = defaults.message;
    	      this.status = defaults.status;
    	      this.udi = defaults.udi;
        }

        @CustomType.Setter
        public Builder configParams(@Nullable InventoryOnboardingCloudMonitoringPrepareItemConfigParams configParams) {

            this.configParams = configParams;
            return this;
        }
        @CustomType.Setter
        public Builder deviceId(@Nullable String deviceId) {

            this.deviceId = deviceId;
            return this;
        }
        @CustomType.Setter
        public Builder message(@Nullable String message) {

            this.message = message;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder udi(@Nullable String udi) {

            this.udi = udi;
            return this;
        }
        public InventoryOnboardingCloudMonitoringPrepareItem build() {
            final var _resultValue = new InventoryOnboardingCloudMonitoringPrepareItem();
            _resultValue.configParams = configParams;
            _resultValue.deviceId = deviceId;
            _resultValue.message = message;
            _resultValue.status = status;
            _resultValue.udi = udi;
            return _resultValue;
        }
    }
}
