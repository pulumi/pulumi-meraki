// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetFirmwareUpgradesItemProductsSwitchNextUpgradeToVersion;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFirmwareUpgradesItemProductsSwitchNextUpgrade {
    /**
     * @return Timestamp of the next scheduled firmware upgrade
     * 
     */
    private String time;
    /**
     * @return Details of the version the device will upgrade to if it exists
     * 
     */
    private GetFirmwareUpgradesItemProductsSwitchNextUpgradeToVersion toVersion;

    private GetFirmwareUpgradesItemProductsSwitchNextUpgrade() {}
    /**
     * @return Timestamp of the next scheduled firmware upgrade
     * 
     */
    public String time() {
        return this.time;
    }
    /**
     * @return Details of the version the device will upgrade to if it exists
     * 
     */
    public GetFirmwareUpgradesItemProductsSwitchNextUpgradeToVersion toVersion() {
        return this.toVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirmwareUpgradesItemProductsSwitchNextUpgrade defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String time;
        private GetFirmwareUpgradesItemProductsSwitchNextUpgradeToVersion toVersion;
        public Builder() {}
        public Builder(GetFirmwareUpgradesItemProductsSwitchNextUpgrade defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.time = defaults.time;
    	      this.toVersion = defaults.toVersion;
        }

        @CustomType.Setter
        public Builder time(String time) {
            if (time == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItemProductsSwitchNextUpgrade", "time");
            }
            this.time = time;
            return this;
        }
        @CustomType.Setter
        public Builder toVersion(GetFirmwareUpgradesItemProductsSwitchNextUpgradeToVersion toVersion) {
            if (toVersion == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItemProductsSwitchNextUpgrade", "toVersion");
            }
            this.toVersion = toVersion;
            return this;
        }
        public GetFirmwareUpgradesItemProductsSwitchNextUpgrade build() {
            final var _resultValue = new GetFirmwareUpgradesItemProductsSwitchNextUpgrade();
            _resultValue.time = time;
            _resultValue.toVersion = toVersion;
            return _resultValue;
        }
    }
}
