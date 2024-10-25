// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WirelessAlternateManagementInterfaceAccessPoint {
    /**
     * @return Wireless alternate management interface device IP. Provide an empty string to remove alternate management IP assignment
     * 
     */
    private @Nullable String alternateManagementIp;
    /**
     * @return Primary DNS must be in IP format
     * 
     */
    private @Nullable String dns1;
    /**
     * @return Optional secondary DNS must be in IP format
     * 
     */
    private @Nullable String dns2;
    /**
     * @return Gateway must be in IP format
     * 
     */
    private @Nullable String gateway;
    /**
     * @return Serial number of access point to be configured with alternate management IP
     * 
     */
    private @Nullable String serial;
    /**
     * @return Subnet mask must be in IP format
     * 
     */
    private @Nullable String subnetMask;

    private WirelessAlternateManagementInterfaceAccessPoint() {}
    /**
     * @return Wireless alternate management interface device IP. Provide an empty string to remove alternate management IP assignment
     * 
     */
    public Optional<String> alternateManagementIp() {
        return Optional.ofNullable(this.alternateManagementIp);
    }
    /**
     * @return Primary DNS must be in IP format
     * 
     */
    public Optional<String> dns1() {
        return Optional.ofNullable(this.dns1);
    }
    /**
     * @return Optional secondary DNS must be in IP format
     * 
     */
    public Optional<String> dns2() {
        return Optional.ofNullable(this.dns2);
    }
    /**
     * @return Gateway must be in IP format
     * 
     */
    public Optional<String> gateway() {
        return Optional.ofNullable(this.gateway);
    }
    /**
     * @return Serial number of access point to be configured with alternate management IP
     * 
     */
    public Optional<String> serial() {
        return Optional.ofNullable(this.serial);
    }
    /**
     * @return Subnet mask must be in IP format
     * 
     */
    public Optional<String> subnetMask() {
        return Optional.ofNullable(this.subnetMask);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessAlternateManagementInterfaceAccessPoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String alternateManagementIp;
        private @Nullable String dns1;
        private @Nullable String dns2;
        private @Nullable String gateway;
        private @Nullable String serial;
        private @Nullable String subnetMask;
        public Builder() {}
        public Builder(WirelessAlternateManagementInterfaceAccessPoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternateManagementIp = defaults.alternateManagementIp;
    	      this.dns1 = defaults.dns1;
    	      this.dns2 = defaults.dns2;
    	      this.gateway = defaults.gateway;
    	      this.serial = defaults.serial;
    	      this.subnetMask = defaults.subnetMask;
        }

        @CustomType.Setter
        public Builder alternateManagementIp(@Nullable String alternateManagementIp) {

            this.alternateManagementIp = alternateManagementIp;
            return this;
        }
        @CustomType.Setter
        public Builder dns1(@Nullable String dns1) {

            this.dns1 = dns1;
            return this;
        }
        @CustomType.Setter
        public Builder dns2(@Nullable String dns2) {

            this.dns2 = dns2;
            return this;
        }
        @CustomType.Setter
        public Builder gateway(@Nullable String gateway) {

            this.gateway = gateway;
            return this;
        }
        @CustomType.Setter
        public Builder serial(@Nullable String serial) {

            this.serial = serial;
            return this;
        }
        @CustomType.Setter
        public Builder subnetMask(@Nullable String subnetMask) {

            this.subnetMask = subnetMask;
            return this;
        }
        public WirelessAlternateManagementInterfaceAccessPoint build() {
            final var _resultValue = new WirelessAlternateManagementInterfaceAccessPoint();
            _resultValue.alternateManagementIp = alternateManagementIp;
            _resultValue.dns1 = dns1;
            _resultValue.dns2 = dns2;
            _resultValue.gateway = gateway;
            _resultValue.serial = serial;
            _resultValue.subnetMask = subnetMask;
            return _resultValue;
        }
    }
}
