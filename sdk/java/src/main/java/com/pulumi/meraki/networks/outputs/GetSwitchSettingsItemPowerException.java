// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSwitchSettingsItemPowerException {
    /**
     * @return Per switch exception (combined, redundant, useNetworkSetting)
     * 
     */
    private String powerType;
    /**
     * @return Serial number of the switch
     * 
     */
    private String serial;

    private GetSwitchSettingsItemPowerException() {}
    /**
     * @return Per switch exception (combined, redundant, useNetworkSetting)
     * 
     */
    public String powerType() {
        return this.powerType;
    }
    /**
     * @return Serial number of the switch
     * 
     */
    public String serial() {
        return this.serial;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchSettingsItemPowerException defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String powerType;
        private String serial;
        public Builder() {}
        public Builder(GetSwitchSettingsItemPowerException defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.powerType = defaults.powerType;
    	      this.serial = defaults.serial;
        }

        @CustomType.Setter
        public Builder powerType(String powerType) {
            if (powerType == null) {
              throw new MissingRequiredPropertyException("GetSwitchSettingsItemPowerException", "powerType");
            }
            this.powerType = powerType;
            return this;
        }
        @CustomType.Setter
        public Builder serial(String serial) {
            if (serial == null) {
              throw new MissingRequiredPropertyException("GetSwitchSettingsItemPowerException", "serial");
            }
            this.serial = serial;
            return this;
        }
        public GetSwitchSettingsItemPowerException build() {
            final var _resultValue = new GetSwitchSettingsItemPowerException();
            _resultValue.powerType = powerType;
            _resultValue.serial = serial;
            return _resultValue;
        }
    }
}
