// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetApplianceRfProfilesItemFiveGhzSettings {
    /**
     * @return Whether ax radio on 5Ghz band is on or off.
     * 
     */
    private Boolean axEnabled;
    /**
     * @return Min bitrate (Mbps) of 2.4Ghz band.
     * 
     */
    private Integer minBitrate;

    private GetApplianceRfProfilesItemFiveGhzSettings() {}
    /**
     * @return Whether ax radio on 5Ghz band is on or off.
     * 
     */
    public Boolean axEnabled() {
        return this.axEnabled;
    }
    /**
     * @return Min bitrate (Mbps) of 2.4Ghz band.
     * 
     */
    public Integer minBitrate() {
        return this.minBitrate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceRfProfilesItemFiveGhzSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean axEnabled;
        private Integer minBitrate;
        public Builder() {}
        public Builder(GetApplianceRfProfilesItemFiveGhzSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.axEnabled = defaults.axEnabled;
    	      this.minBitrate = defaults.minBitrate;
        }

        @CustomType.Setter
        public Builder axEnabled(Boolean axEnabled) {
            if (axEnabled == null) {
              throw new MissingRequiredPropertyException("GetApplianceRfProfilesItemFiveGhzSettings", "axEnabled");
            }
            this.axEnabled = axEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder minBitrate(Integer minBitrate) {
            if (minBitrate == null) {
              throw new MissingRequiredPropertyException("GetApplianceRfProfilesItemFiveGhzSettings", "minBitrate");
            }
            this.minBitrate = minBitrate;
            return this;
        }
        public GetApplianceRfProfilesItemFiveGhzSettings build() {
            final var _resultValue = new GetApplianceRfProfilesItemFiveGhzSettings();
            _resultValue.axEnabled = axEnabled;
            _resultValue.minBitrate = minBitrate;
            return _resultValue;
        }
    }
}
