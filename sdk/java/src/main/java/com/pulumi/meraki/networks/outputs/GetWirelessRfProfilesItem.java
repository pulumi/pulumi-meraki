// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetWirelessRfProfilesItemApBandSettings;
import com.pulumi.meraki.networks.outputs.GetWirelessRfProfilesItemFiveGhzSettings;
import com.pulumi.meraki.networks.outputs.GetWirelessRfProfilesItemPerSsidSettings;
import com.pulumi.meraki.networks.outputs.GetWirelessRfProfilesItemSixGhzSettings;
import com.pulumi.meraki.networks.outputs.GetWirelessRfProfilesItemTransmission;
import com.pulumi.meraki.networks.outputs.GetWirelessRfProfilesItemTwoFourGhzSettings;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWirelessRfProfilesItem {
    /**
     * @return Settings that will be enabled if selectionType is set to &#39;ap&#39;.
     * 
     */
    private GetWirelessRfProfilesItemApBandSettings apBandSettings;
    /**
     * @return Band selection can be set to either &#39;ssid&#39; or &#39;ap&#39;. This param is required on creation.
     * 
     */
    private String bandSelectionType;
    /**
     * @return Steers client to best available access point. Can be either true or false. Defaults to true.
     * 
     */
    private Boolean clientBalancingEnabled;
    /**
     * @return Settings related to 5Ghz band
     * 
     */
    private GetWirelessRfProfilesItemFiveGhzSettings fiveGhzSettings;
    /**
     * @return The name of the new profile. Must be unique.
     * 
     */
    private String id;
    /**
     * @return Minimum bitrate can be set to either &#39;band&#39; or &#39;ssid&#39;. Defaults to band.
     * 
     */
    private String minBitrateType;
    /**
     * @return The name of the new profile. Must be unique. This param is required on creation.
     * 
     */
    private String name;
    /**
     * @return The network ID of the RF Profile
     * 
     */
    private String networkId;
    /**
     * @return Per-SSID radio settings by number.
     * 
     */
    private GetWirelessRfProfilesItemPerSsidSettings perSsidSettings;
    /**
     * @return Settings related to 6Ghz band. Only applicable to networks with 6Ghz capable APs
     * 
     */
    private GetWirelessRfProfilesItemSixGhzSettings sixGhzSettings;
    /**
     * @return Settings related to radio transmission.
     * 
     */
    private GetWirelessRfProfilesItemTransmission transmission;
    /**
     * @return Settings related to 2.4Ghz band
     * 
     */
    private GetWirelessRfProfilesItemTwoFourGhzSettings twoFourGhzSettings;

    private GetWirelessRfProfilesItem() {}
    /**
     * @return Settings that will be enabled if selectionType is set to &#39;ap&#39;.
     * 
     */
    public GetWirelessRfProfilesItemApBandSettings apBandSettings() {
        return this.apBandSettings;
    }
    /**
     * @return Band selection can be set to either &#39;ssid&#39; or &#39;ap&#39;. This param is required on creation.
     * 
     */
    public String bandSelectionType() {
        return this.bandSelectionType;
    }
    /**
     * @return Steers client to best available access point. Can be either true or false. Defaults to true.
     * 
     */
    public Boolean clientBalancingEnabled() {
        return this.clientBalancingEnabled;
    }
    /**
     * @return Settings related to 5Ghz band
     * 
     */
    public GetWirelessRfProfilesItemFiveGhzSettings fiveGhzSettings() {
        return this.fiveGhzSettings;
    }
    /**
     * @return The name of the new profile. Must be unique.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Minimum bitrate can be set to either &#39;band&#39; or &#39;ssid&#39;. Defaults to band.
     * 
     */
    public String minBitrateType() {
        return this.minBitrateType;
    }
    /**
     * @return The name of the new profile. Must be unique. This param is required on creation.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The network ID of the RF Profile
     * 
     */
    public String networkId() {
        return this.networkId;
    }
    /**
     * @return Per-SSID radio settings by number.
     * 
     */
    public GetWirelessRfProfilesItemPerSsidSettings perSsidSettings() {
        return this.perSsidSettings;
    }
    /**
     * @return Settings related to 6Ghz band. Only applicable to networks with 6Ghz capable APs
     * 
     */
    public GetWirelessRfProfilesItemSixGhzSettings sixGhzSettings() {
        return this.sixGhzSettings;
    }
    /**
     * @return Settings related to radio transmission.
     * 
     */
    public GetWirelessRfProfilesItemTransmission transmission() {
        return this.transmission;
    }
    /**
     * @return Settings related to 2.4Ghz band
     * 
     */
    public GetWirelessRfProfilesItemTwoFourGhzSettings twoFourGhzSettings() {
        return this.twoFourGhzSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessRfProfilesItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetWirelessRfProfilesItemApBandSettings apBandSettings;
        private String bandSelectionType;
        private Boolean clientBalancingEnabled;
        private GetWirelessRfProfilesItemFiveGhzSettings fiveGhzSettings;
        private String id;
        private String minBitrateType;
        private String name;
        private String networkId;
        private GetWirelessRfProfilesItemPerSsidSettings perSsidSettings;
        private GetWirelessRfProfilesItemSixGhzSettings sixGhzSettings;
        private GetWirelessRfProfilesItemTransmission transmission;
        private GetWirelessRfProfilesItemTwoFourGhzSettings twoFourGhzSettings;
        public Builder() {}
        public Builder(GetWirelessRfProfilesItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apBandSettings = defaults.apBandSettings;
    	      this.bandSelectionType = defaults.bandSelectionType;
    	      this.clientBalancingEnabled = defaults.clientBalancingEnabled;
    	      this.fiveGhzSettings = defaults.fiveGhzSettings;
    	      this.id = defaults.id;
    	      this.minBitrateType = defaults.minBitrateType;
    	      this.name = defaults.name;
    	      this.networkId = defaults.networkId;
    	      this.perSsidSettings = defaults.perSsidSettings;
    	      this.sixGhzSettings = defaults.sixGhzSettings;
    	      this.transmission = defaults.transmission;
    	      this.twoFourGhzSettings = defaults.twoFourGhzSettings;
        }

        @CustomType.Setter
        public Builder apBandSettings(GetWirelessRfProfilesItemApBandSettings apBandSettings) {
            if (apBandSettings == null) {
              throw new MissingRequiredPropertyException("GetWirelessRfProfilesItem", "apBandSettings");
            }
            this.apBandSettings = apBandSettings;
            return this;
        }
        @CustomType.Setter
        public Builder bandSelectionType(String bandSelectionType) {
            if (bandSelectionType == null) {
              throw new MissingRequiredPropertyException("GetWirelessRfProfilesItem", "bandSelectionType");
            }
            this.bandSelectionType = bandSelectionType;
            return this;
        }
        @CustomType.Setter
        public Builder clientBalancingEnabled(Boolean clientBalancingEnabled) {
            if (clientBalancingEnabled == null) {
              throw new MissingRequiredPropertyException("GetWirelessRfProfilesItem", "clientBalancingEnabled");
            }
            this.clientBalancingEnabled = clientBalancingEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder fiveGhzSettings(GetWirelessRfProfilesItemFiveGhzSettings fiveGhzSettings) {
            if (fiveGhzSettings == null) {
              throw new MissingRequiredPropertyException("GetWirelessRfProfilesItem", "fiveGhzSettings");
            }
            this.fiveGhzSettings = fiveGhzSettings;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetWirelessRfProfilesItem", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder minBitrateType(String minBitrateType) {
            if (minBitrateType == null) {
              throw new MissingRequiredPropertyException("GetWirelessRfProfilesItem", "minBitrateType");
            }
            this.minBitrateType = minBitrateType;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetWirelessRfProfilesItem", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder networkId(String networkId) {
            if (networkId == null) {
              throw new MissingRequiredPropertyException("GetWirelessRfProfilesItem", "networkId");
            }
            this.networkId = networkId;
            return this;
        }
        @CustomType.Setter
        public Builder perSsidSettings(GetWirelessRfProfilesItemPerSsidSettings perSsidSettings) {
            if (perSsidSettings == null) {
              throw new MissingRequiredPropertyException("GetWirelessRfProfilesItem", "perSsidSettings");
            }
            this.perSsidSettings = perSsidSettings;
            return this;
        }
        @CustomType.Setter
        public Builder sixGhzSettings(GetWirelessRfProfilesItemSixGhzSettings sixGhzSettings) {
            if (sixGhzSettings == null) {
              throw new MissingRequiredPropertyException("GetWirelessRfProfilesItem", "sixGhzSettings");
            }
            this.sixGhzSettings = sixGhzSettings;
            return this;
        }
        @CustomType.Setter
        public Builder transmission(GetWirelessRfProfilesItemTransmission transmission) {
            if (transmission == null) {
              throw new MissingRequiredPropertyException("GetWirelessRfProfilesItem", "transmission");
            }
            this.transmission = transmission;
            return this;
        }
        @CustomType.Setter
        public Builder twoFourGhzSettings(GetWirelessRfProfilesItemTwoFourGhzSettings twoFourGhzSettings) {
            if (twoFourGhzSettings == null) {
              throw new MissingRequiredPropertyException("GetWirelessRfProfilesItem", "twoFourGhzSettings");
            }
            this.twoFourGhzSettings = twoFourGhzSettings;
            return this;
        }
        public GetWirelessRfProfilesItem build() {
            final var _resultValue = new GetWirelessRfProfilesItem();
            _resultValue.apBandSettings = apBandSettings;
            _resultValue.bandSelectionType = bandSelectionType;
            _resultValue.clientBalancingEnabled = clientBalancingEnabled;
            _resultValue.fiveGhzSettings = fiveGhzSettings;
            _resultValue.id = id;
            _resultValue.minBitrateType = minBitrateType;
            _resultValue.name = name;
            _resultValue.networkId = networkId;
            _resultValue.perSsidSettings = perSsidSettings;
            _resultValue.sixGhzSettings = sixGhzSettings;
            _resultValue.transmission = transmission;
            _resultValue.twoFourGhzSettings = twoFourGhzSettings;
            return _resultValue;
        }
    }
}
