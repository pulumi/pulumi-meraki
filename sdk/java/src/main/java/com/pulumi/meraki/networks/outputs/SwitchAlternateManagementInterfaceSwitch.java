// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchAlternateManagementInterfaceSwitch {
    /**
     * @return Switch alternative management IP. To remove a prior IP setting, provide an empty string
     * 
     */
    private @Nullable String alternateManagementIp;
    /**
     * @return Switch gateway must be in IP format. Only and must be specified for Polaris switches
     * 
     */
    private @Nullable String gateway;
    /**
     * @return Switch serial number
     * 
     */
    private @Nullable String serial;
    /**
     * @return Switch subnet mask must be in IP format. Only and must be specified for Polaris switches
     * 
     */
    private @Nullable String subnetMask;

    private SwitchAlternateManagementInterfaceSwitch() {}
    /**
     * @return Switch alternative management IP. To remove a prior IP setting, provide an empty string
     * 
     */
    public Optional<String> alternateManagementIp() {
        return Optional.ofNullable(this.alternateManagementIp);
    }
    /**
     * @return Switch gateway must be in IP format. Only and must be specified for Polaris switches
     * 
     */
    public Optional<String> gateway() {
        return Optional.ofNullable(this.gateway);
    }
    /**
     * @return Switch serial number
     * 
     */
    public Optional<String> serial() {
        return Optional.ofNullable(this.serial);
    }
    /**
     * @return Switch subnet mask must be in IP format. Only and must be specified for Polaris switches
     * 
     */
    public Optional<String> subnetMask() {
        return Optional.ofNullable(this.subnetMask);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchAlternateManagementInterfaceSwitch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String alternateManagementIp;
        private @Nullable String gateway;
        private @Nullable String serial;
        private @Nullable String subnetMask;
        public Builder() {}
        public Builder(SwitchAlternateManagementInterfaceSwitch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternateManagementIp = defaults.alternateManagementIp;
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
        public SwitchAlternateManagementInterfaceSwitch build() {
            final var _resultValue = new SwitchAlternateManagementInterfaceSwitch();
            _resultValue.alternateManagementIp = alternateManagementIp;
            _resultValue.gateway = gateway;
            _resultValue.serial = serial;
            _resultValue.subnetMask = subnetMask;
            return _resultValue;
        }
    }
}