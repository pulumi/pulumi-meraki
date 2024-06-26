// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.FirmwareUpgradesProductsSwitchLastUpgradeFromVersion;
import com.pulumi.meraki.networks.outputs.FirmwareUpgradesProductsSwitchLastUpgradeToVersion;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirmwareUpgradesProductsSwitchLastUpgrade {
    /**
     * @return Details of the version the device upgraded from
     * 
     */
    private @Nullable FirmwareUpgradesProductsSwitchLastUpgradeFromVersion fromVersion;
    /**
     * @return Timestamp of the last successful firmware upgrade
     * 
     */
    private @Nullable String time;
    /**
     * @return Details of the version the device upgraded to
     * 
     */
    private @Nullable FirmwareUpgradesProductsSwitchLastUpgradeToVersion toVersion;

    private FirmwareUpgradesProductsSwitchLastUpgrade() {}
    /**
     * @return Details of the version the device upgraded from
     * 
     */
    public Optional<FirmwareUpgradesProductsSwitchLastUpgradeFromVersion> fromVersion() {
        return Optional.ofNullable(this.fromVersion);
    }
    /**
     * @return Timestamp of the last successful firmware upgrade
     * 
     */
    public Optional<String> time() {
        return Optional.ofNullable(this.time);
    }
    /**
     * @return Details of the version the device upgraded to
     * 
     */
    public Optional<FirmwareUpgradesProductsSwitchLastUpgradeToVersion> toVersion() {
        return Optional.ofNullable(this.toVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirmwareUpgradesProductsSwitchLastUpgrade defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable FirmwareUpgradesProductsSwitchLastUpgradeFromVersion fromVersion;
        private @Nullable String time;
        private @Nullable FirmwareUpgradesProductsSwitchLastUpgradeToVersion toVersion;
        public Builder() {}
        public Builder(FirmwareUpgradesProductsSwitchLastUpgrade defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromVersion = defaults.fromVersion;
    	      this.time = defaults.time;
    	      this.toVersion = defaults.toVersion;
        }

        @CustomType.Setter
        public Builder fromVersion(@Nullable FirmwareUpgradesProductsSwitchLastUpgradeFromVersion fromVersion) {

            this.fromVersion = fromVersion;
            return this;
        }
        @CustomType.Setter
        public Builder time(@Nullable String time) {

            this.time = time;
            return this;
        }
        @CustomType.Setter
        public Builder toVersion(@Nullable FirmwareUpgradesProductsSwitchLastUpgradeToVersion toVersion) {

            this.toVersion = toVersion;
            return this;
        }
        public FirmwareUpgradesProductsSwitchLastUpgrade build() {
            final var _resultValue = new FirmwareUpgradesProductsSwitchLastUpgrade();
            _resultValue.fromVersion = fromVersion;
            _resultValue.time = time;
            _resultValue.toVersion = toVersion;
            return _resultValue;
        }
    }
}
