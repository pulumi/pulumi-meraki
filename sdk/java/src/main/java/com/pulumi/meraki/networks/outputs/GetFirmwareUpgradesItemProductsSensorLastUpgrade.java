// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetFirmwareUpgradesItemProductsSensorLastUpgradeFromVersion;
import com.pulumi.meraki.networks.outputs.GetFirmwareUpgradesItemProductsSensorLastUpgradeToVersion;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFirmwareUpgradesItemProductsSensorLastUpgrade {
    /**
     * @return Details of the version the device upgraded from
     * 
     */
    private GetFirmwareUpgradesItemProductsSensorLastUpgradeFromVersion fromVersion;
    /**
     * @return Timestamp of the last successful firmware upgrade
     * 
     */
    private String time;
    /**
     * @return Details of the version the device upgraded to
     * 
     */
    private GetFirmwareUpgradesItemProductsSensorLastUpgradeToVersion toVersion;

    private GetFirmwareUpgradesItemProductsSensorLastUpgrade() {}
    /**
     * @return Details of the version the device upgraded from
     * 
     */
    public GetFirmwareUpgradesItemProductsSensorLastUpgradeFromVersion fromVersion() {
        return this.fromVersion;
    }
    /**
     * @return Timestamp of the last successful firmware upgrade
     * 
     */
    public String time() {
        return this.time;
    }
    /**
     * @return Details of the version the device upgraded to
     * 
     */
    public GetFirmwareUpgradesItemProductsSensorLastUpgradeToVersion toVersion() {
        return this.toVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirmwareUpgradesItemProductsSensorLastUpgrade defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetFirmwareUpgradesItemProductsSensorLastUpgradeFromVersion fromVersion;
        private String time;
        private GetFirmwareUpgradesItemProductsSensorLastUpgradeToVersion toVersion;
        public Builder() {}
        public Builder(GetFirmwareUpgradesItemProductsSensorLastUpgrade defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromVersion = defaults.fromVersion;
    	      this.time = defaults.time;
    	      this.toVersion = defaults.toVersion;
        }

        @CustomType.Setter
        public Builder fromVersion(GetFirmwareUpgradesItemProductsSensorLastUpgradeFromVersion fromVersion) {
            if (fromVersion == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItemProductsSensorLastUpgrade", "fromVersion");
            }
            this.fromVersion = fromVersion;
            return this;
        }
        @CustomType.Setter
        public Builder time(String time) {
            if (time == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItemProductsSensorLastUpgrade", "time");
            }
            this.time = time;
            return this;
        }
        @CustomType.Setter
        public Builder toVersion(GetFirmwareUpgradesItemProductsSensorLastUpgradeToVersion toVersion) {
            if (toVersion == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItemProductsSensorLastUpgrade", "toVersion");
            }
            this.toVersion = toVersion;
            return this;
        }
        public GetFirmwareUpgradesItemProductsSensorLastUpgrade build() {
            final var _resultValue = new GetFirmwareUpgradesItemProductsSensorLastUpgrade();
            _resultValue.fromVersion = fromVersion;
            _resultValue.time = time;
            _resultValue.toVersion = toVersion;
            return _resultValue;
        }
    }
}