// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirmwareUpgradesStagedGroupsAssignedDevicesDevice {
    /**
     * @return Name of the device
     * 
     */
    private @Nullable String name;
    /**
     * @return Serial of the device
     * 
     */
    private @Nullable String serial;

    private FirmwareUpgradesStagedGroupsAssignedDevicesDevice() {}
    /**
     * @return Name of the device
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Serial of the device
     * 
     */
    public Optional<String> serial() {
        return Optional.ofNullable(this.serial);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirmwareUpgradesStagedGroupsAssignedDevicesDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String serial;
        public Builder() {}
        public Builder(FirmwareUpgradesStagedGroupsAssignedDevicesDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.serial = defaults.serial;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder serial(@Nullable String serial) {

            this.serial = serial;
            return this;
        }
        public FirmwareUpgradesStagedGroupsAssignedDevicesDevice build() {
            final var _resultValue = new FirmwareUpgradesStagedGroupsAssignedDevicesDevice();
            _resultValue.name = name;
            _resultValue.serial = serial;
            return _resultValue;
        }
    }
}