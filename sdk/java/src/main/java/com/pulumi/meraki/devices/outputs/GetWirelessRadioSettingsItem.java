// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.devices.outputs.GetWirelessRadioSettingsItemFiveGhzSettings;
import com.pulumi.meraki.devices.outputs.GetWirelessRadioSettingsItemTwoFourGhzSettings;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWirelessRadioSettingsItem {
    private GetWirelessRadioSettingsItemFiveGhzSettings fiveGhzSettings;
    private String rfProfileId;
    private String serial;
    private GetWirelessRadioSettingsItemTwoFourGhzSettings twoFourGhzSettings;

    private GetWirelessRadioSettingsItem() {}
    public GetWirelessRadioSettingsItemFiveGhzSettings fiveGhzSettings() {
        return this.fiveGhzSettings;
    }
    public String rfProfileId() {
        return this.rfProfileId;
    }
    public String serial() {
        return this.serial;
    }
    public GetWirelessRadioSettingsItemTwoFourGhzSettings twoFourGhzSettings() {
        return this.twoFourGhzSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessRadioSettingsItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetWirelessRadioSettingsItemFiveGhzSettings fiveGhzSettings;
        private String rfProfileId;
        private String serial;
        private GetWirelessRadioSettingsItemTwoFourGhzSettings twoFourGhzSettings;
        public Builder() {}
        public Builder(GetWirelessRadioSettingsItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fiveGhzSettings = defaults.fiveGhzSettings;
    	      this.rfProfileId = defaults.rfProfileId;
    	      this.serial = defaults.serial;
    	      this.twoFourGhzSettings = defaults.twoFourGhzSettings;
        }

        @CustomType.Setter
        public Builder fiveGhzSettings(GetWirelessRadioSettingsItemFiveGhzSettings fiveGhzSettings) {
            if (fiveGhzSettings == null) {
              throw new MissingRequiredPropertyException("GetWirelessRadioSettingsItem", "fiveGhzSettings");
            }
            this.fiveGhzSettings = fiveGhzSettings;
            return this;
        }
        @CustomType.Setter
        public Builder rfProfileId(String rfProfileId) {
            if (rfProfileId == null) {
              throw new MissingRequiredPropertyException("GetWirelessRadioSettingsItem", "rfProfileId");
            }
            this.rfProfileId = rfProfileId;
            return this;
        }
        @CustomType.Setter
        public Builder serial(String serial) {
            if (serial == null) {
              throw new MissingRequiredPropertyException("GetWirelessRadioSettingsItem", "serial");
            }
            this.serial = serial;
            return this;
        }
        @CustomType.Setter
        public Builder twoFourGhzSettings(GetWirelessRadioSettingsItemTwoFourGhzSettings twoFourGhzSettings) {
            if (twoFourGhzSettings == null) {
              throw new MissingRequiredPropertyException("GetWirelessRadioSettingsItem", "twoFourGhzSettings");
            }
            this.twoFourGhzSettings = twoFourGhzSettings;
            return this;
        }
        public GetWirelessRadioSettingsItem build() {
            final var _resultValue = new GetWirelessRadioSettingsItem();
            _resultValue.fiveGhzSettings = fiveGhzSettings;
            _resultValue.rfProfileId = rfProfileId;
            _resultValue.serial = serial;
            _resultValue.twoFourGhzSettings = twoFourGhzSettings;
            return _resultValue;
        }
    }
}
