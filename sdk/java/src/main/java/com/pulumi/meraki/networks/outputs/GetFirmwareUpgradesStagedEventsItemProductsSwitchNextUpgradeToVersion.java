// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFirmwareUpgradesStagedEventsItemProductsSwitchNextUpgradeToVersion {
    /**
     * @return Id of the Version being upgraded to
     * 
     */
    private String id;
    /**
     * @return Firmware version short name
     * 
     */
    private String shortName;

    private GetFirmwareUpgradesStagedEventsItemProductsSwitchNextUpgradeToVersion() {}
    /**
     * @return Id of the Version being upgraded to
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Firmware version short name
     * 
     */
    public String shortName() {
        return this.shortName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirmwareUpgradesStagedEventsItemProductsSwitchNextUpgradeToVersion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String shortName;
        public Builder() {}
        public Builder(GetFirmwareUpgradesStagedEventsItemProductsSwitchNextUpgradeToVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.shortName = defaults.shortName;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesStagedEventsItemProductsSwitchNextUpgradeToVersion", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder shortName(String shortName) {
            if (shortName == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesStagedEventsItemProductsSwitchNextUpgradeToVersion", "shortName");
            }
            this.shortName = shortName;
            return this;
        }
        public GetFirmwareUpgradesStagedEventsItemProductsSwitchNextUpgradeToVersion build() {
            final var _resultValue = new GetFirmwareUpgradesStagedEventsItemProductsSwitchNextUpgradeToVersion();
            _resultValue.id = id;
            _resultValue.shortName = shortName;
            return _resultValue;
        }
    }
}