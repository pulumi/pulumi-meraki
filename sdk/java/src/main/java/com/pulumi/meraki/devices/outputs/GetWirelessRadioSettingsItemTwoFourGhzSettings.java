// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetWirelessRadioSettingsItemTwoFourGhzSettings {
    private Integer channel;
    private Integer targetPower;

    private GetWirelessRadioSettingsItemTwoFourGhzSettings() {}
    public Integer channel() {
        return this.channel;
    }
    public Integer targetPower() {
        return this.targetPower;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessRadioSettingsItemTwoFourGhzSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer channel;
        private Integer targetPower;
        public Builder() {}
        public Builder(GetWirelessRadioSettingsItemTwoFourGhzSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channel = defaults.channel;
    	      this.targetPower = defaults.targetPower;
        }

        @CustomType.Setter
        public Builder channel(Integer channel) {
            if (channel == null) {
              throw new MissingRequiredPropertyException("GetWirelessRadioSettingsItemTwoFourGhzSettings", "channel");
            }
            this.channel = channel;
            return this;
        }
        @CustomType.Setter
        public Builder targetPower(Integer targetPower) {
            if (targetPower == null) {
              throw new MissingRequiredPropertyException("GetWirelessRadioSettingsItemTwoFourGhzSettings", "targetPower");
            }
            this.targetPower = targetPower;
            return this;
        }
        public GetWirelessRadioSettingsItemTwoFourGhzSettings build() {
            final var _resultValue = new GetWirelessRadioSettingsItemTwoFourGhzSettings();
            _resultValue.channel = channel;
            _resultValue.targetPower = targetPower;
            return _resultValue;
        }
    }
}