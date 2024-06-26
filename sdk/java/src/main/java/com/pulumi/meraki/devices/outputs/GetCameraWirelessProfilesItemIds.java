// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCameraWirelessProfilesItemIds {
    private String backup;
    private String primary;
    private String secondary;

    private GetCameraWirelessProfilesItemIds() {}
    public String backup() {
        return this.backup;
    }
    public String primary() {
        return this.primary;
    }
    public String secondary() {
        return this.secondary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCameraWirelessProfilesItemIds defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String backup;
        private String primary;
        private String secondary;
        public Builder() {}
        public Builder(GetCameraWirelessProfilesItemIds defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backup = defaults.backup;
    	      this.primary = defaults.primary;
    	      this.secondary = defaults.secondary;
        }

        @CustomType.Setter
        public Builder backup(String backup) {
            if (backup == null) {
              throw new MissingRequiredPropertyException("GetCameraWirelessProfilesItemIds", "backup");
            }
            this.backup = backup;
            return this;
        }
        @CustomType.Setter
        public Builder primary(String primary) {
            if (primary == null) {
              throw new MissingRequiredPropertyException("GetCameraWirelessProfilesItemIds", "primary");
            }
            this.primary = primary;
            return this;
        }
        @CustomType.Setter
        public Builder secondary(String secondary) {
            if (secondary == null) {
              throw new MissingRequiredPropertyException("GetCameraWirelessProfilesItemIds", "secondary");
            }
            this.secondary = secondary;
            return this;
        }
        public GetCameraWirelessProfilesItemIds build() {
            final var _resultValue = new GetCameraWirelessProfilesItemIds();
            _resultValue.backup = backup;
            _resultValue.primary = primary;
            _resultValue.secondary = secondary;
            return _resultValue;
        }
    }
}
