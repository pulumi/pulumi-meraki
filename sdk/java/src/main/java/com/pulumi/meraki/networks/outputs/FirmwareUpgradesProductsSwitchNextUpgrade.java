// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.FirmwareUpgradesProductsSwitchNextUpgradeToVersion;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirmwareUpgradesProductsSwitchNextUpgrade {
    /**
     * @return Timestamp of the next scheduled firmware upgrade
     * 
     */
    private @Nullable String time;
    /**
     * @return Details of the version the device will upgrade to if it exists
     * 
     */
    private @Nullable FirmwareUpgradesProductsSwitchNextUpgradeToVersion toVersion;

    private FirmwareUpgradesProductsSwitchNextUpgrade() {}
    /**
     * @return Timestamp of the next scheduled firmware upgrade
     * 
     */
    public Optional<String> time() {
        return Optional.ofNullable(this.time);
    }
    /**
     * @return Details of the version the device will upgrade to if it exists
     * 
     */
    public Optional<FirmwareUpgradesProductsSwitchNextUpgradeToVersion> toVersion() {
        return Optional.ofNullable(this.toVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirmwareUpgradesProductsSwitchNextUpgrade defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String time;
        private @Nullable FirmwareUpgradesProductsSwitchNextUpgradeToVersion toVersion;
        public Builder() {}
        public Builder(FirmwareUpgradesProductsSwitchNextUpgrade defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.time = defaults.time;
    	      this.toVersion = defaults.toVersion;
        }

        @CustomType.Setter
        public Builder time(@Nullable String time) {

            this.time = time;
            return this;
        }
        @CustomType.Setter
        public Builder toVersion(@Nullable FirmwareUpgradesProductsSwitchNextUpgradeToVersion toVersion) {

            this.toVersion = toVersion;
            return this;
        }
        public FirmwareUpgradesProductsSwitchNextUpgrade build() {
            final var _resultValue = new FirmwareUpgradesProductsSwitchNextUpgrade();
            _resultValue.time = time;
            _resultValue.toVersion = toVersion;
            return _resultValue;
        }
    }
}
