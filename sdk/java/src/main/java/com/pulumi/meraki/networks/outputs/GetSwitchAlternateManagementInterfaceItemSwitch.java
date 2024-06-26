// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSwitchAlternateManagementInterfaceItemSwitch {
    /**
     * @return Switch alternative management IP. To remove a prior IP setting, provide an empty string
     * 
     */
    private String alternateManagementIp;
    /**
     * @return Switch gateway must be in IP format. Only and must be specified for Polaris switches
     * 
     */
    private String gateway;
    /**
     * @return Switch serial number
     * 
     */
    private String serial;
    /**
     * @return Switch subnet mask must be in IP format. Only and must be specified for Polaris switches
     * 
     */
    private String subnetMask;

    private GetSwitchAlternateManagementInterfaceItemSwitch() {}
    /**
     * @return Switch alternative management IP. To remove a prior IP setting, provide an empty string
     * 
     */
    public String alternateManagementIp() {
        return this.alternateManagementIp;
    }
    /**
     * @return Switch gateway must be in IP format. Only and must be specified for Polaris switches
     * 
     */
    public String gateway() {
        return this.gateway;
    }
    /**
     * @return Switch serial number
     * 
     */
    public String serial() {
        return this.serial;
    }
    /**
     * @return Switch subnet mask must be in IP format. Only and must be specified for Polaris switches
     * 
     */
    public String subnetMask() {
        return this.subnetMask;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchAlternateManagementInterfaceItemSwitch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String alternateManagementIp;
        private String gateway;
        private String serial;
        private String subnetMask;
        public Builder() {}
        public Builder(GetSwitchAlternateManagementInterfaceItemSwitch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternateManagementIp = defaults.alternateManagementIp;
    	      this.gateway = defaults.gateway;
    	      this.serial = defaults.serial;
    	      this.subnetMask = defaults.subnetMask;
        }

        @CustomType.Setter
        public Builder alternateManagementIp(String alternateManagementIp) {
            if (alternateManagementIp == null) {
              throw new MissingRequiredPropertyException("GetSwitchAlternateManagementInterfaceItemSwitch", "alternateManagementIp");
            }
            this.alternateManagementIp = alternateManagementIp;
            return this;
        }
        @CustomType.Setter
        public Builder gateway(String gateway) {
            if (gateway == null) {
              throw new MissingRequiredPropertyException("GetSwitchAlternateManagementInterfaceItemSwitch", "gateway");
            }
            this.gateway = gateway;
            return this;
        }
        @CustomType.Setter
        public Builder serial(String serial) {
            if (serial == null) {
              throw new MissingRequiredPropertyException("GetSwitchAlternateManagementInterfaceItemSwitch", "serial");
            }
            this.serial = serial;
            return this;
        }
        @CustomType.Setter
        public Builder subnetMask(String subnetMask) {
            if (subnetMask == null) {
              throw new MissingRequiredPropertyException("GetSwitchAlternateManagementInterfaceItemSwitch", "subnetMask");
            }
            this.subnetMask = subnetMask;
            return this;
        }
        public GetSwitchAlternateManagementInterfaceItemSwitch build() {
            final var _resultValue = new GetSwitchAlternateManagementInterfaceItemSwitch();
            _resultValue.alternateManagementIp = alternateManagementIp;
            _resultValue.gateway = gateway;
            _resultValue.serial = serial;
            _resultValue.subnetMask = subnetMask;
            return _resultValue;
        }
    }
}
