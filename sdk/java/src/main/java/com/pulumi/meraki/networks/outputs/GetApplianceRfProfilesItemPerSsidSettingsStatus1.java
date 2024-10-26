// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplianceRfProfilesItemPerSsidSettingsStatus1 {
    /**
     * @return Band mode of this SSID
     * 
     */
    private String bandOperationMode;
    /**
     * @return Whether this SSID steers clients to the most open band between 2.4 GHz and 5 GHz.
     * 
     */
    private Boolean bandSteeringEnabled;

    private GetApplianceRfProfilesItemPerSsidSettingsStatus1() {}
    /**
     * @return Band mode of this SSID
     * 
     */
    public String bandOperationMode() {
        return this.bandOperationMode;
    }
    /**
     * @return Whether this SSID steers clients to the most open band between 2.4 GHz and 5 GHz.
     * 
     */
    public Boolean bandSteeringEnabled() {
        return this.bandSteeringEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceRfProfilesItemPerSsidSettingsStatus1 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bandOperationMode;
        private Boolean bandSteeringEnabled;
        public Builder() {}
        public Builder(GetApplianceRfProfilesItemPerSsidSettingsStatus1 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandOperationMode = defaults.bandOperationMode;
    	      this.bandSteeringEnabled = defaults.bandSteeringEnabled;
        }

        @CustomType.Setter
        public Builder bandOperationMode(String bandOperationMode) {
            if (bandOperationMode == null) {
              throw new MissingRequiredPropertyException("GetApplianceRfProfilesItemPerSsidSettingsStatus1", "bandOperationMode");
            }
            this.bandOperationMode = bandOperationMode;
            return this;
        }
        @CustomType.Setter
        public Builder bandSteeringEnabled(Boolean bandSteeringEnabled) {
            if (bandSteeringEnabled == null) {
              throw new MissingRequiredPropertyException("GetApplianceRfProfilesItemPerSsidSettingsStatus1", "bandSteeringEnabled");
            }
            this.bandSteeringEnabled = bandSteeringEnabled;
            return this;
        }
        public GetApplianceRfProfilesItemPerSsidSettingsStatus1 build() {
            final var _resultValue = new GetApplianceRfProfilesItemPerSsidSettingsStatus1();
            _resultValue.bandOperationMode = bandOperationMode;
            _resultValue.bandSteeringEnabled = bandSteeringEnabled;
            return _resultValue;
        }
    }
}
