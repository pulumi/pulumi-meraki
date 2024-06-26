// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetFirmwareUpgradesByDeviceItemUpgradeStagedGroup;
import java.util.Objects;

@CustomType
public final class GetFirmwareUpgradesByDeviceItemUpgradeStaged {
    /**
     * @return The staged upgrade group
     * 
     */
    private GetFirmwareUpgradesByDeviceItemUpgradeStagedGroup group;

    private GetFirmwareUpgradesByDeviceItemUpgradeStaged() {}
    /**
     * @return The staged upgrade group
     * 
     */
    public GetFirmwareUpgradesByDeviceItemUpgradeStagedGroup group() {
        return this.group;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirmwareUpgradesByDeviceItemUpgradeStaged defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetFirmwareUpgradesByDeviceItemUpgradeStagedGroup group;
        public Builder() {}
        public Builder(GetFirmwareUpgradesByDeviceItemUpgradeStaged defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
        }

        @CustomType.Setter
        public Builder group(GetFirmwareUpgradesByDeviceItemUpgradeStagedGroup group) {
            if (group == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesByDeviceItemUpgradeStaged", "group");
            }
            this.group = group;
            return this;
        }
        public GetFirmwareUpgradesByDeviceItemUpgradeStaged build() {
            final var _resultValue = new GetFirmwareUpgradesByDeviceItemUpgradeStaged();
            _resultValue.group = group;
            return _resultValue;
        }
    }
}
