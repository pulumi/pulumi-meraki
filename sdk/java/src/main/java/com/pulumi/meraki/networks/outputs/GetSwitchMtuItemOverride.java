// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSwitchMtuItemOverride {
    /**
     * @return MTU size for the switches or switch templates.
     * 
     */
    private Integer mtuSize;
    /**
     * @return List of switch template IDs. Applicable only for template network.
     * 
     */
    private List<String> switchProfiles;
    /**
     * @return List of switch serials. Applicable only for switch network.
     * 
     */
    private List<String> switches;

    private GetSwitchMtuItemOverride() {}
    /**
     * @return MTU size for the switches or switch templates.
     * 
     */
    public Integer mtuSize() {
        return this.mtuSize;
    }
    /**
     * @return List of switch template IDs. Applicable only for template network.
     * 
     */
    public List<String> switchProfiles() {
        return this.switchProfiles;
    }
    /**
     * @return List of switch serials. Applicable only for switch network.
     * 
     */
    public List<String> switches() {
        return this.switches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchMtuItemOverride defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer mtuSize;
        private List<String> switchProfiles;
        private List<String> switches;
        public Builder() {}
        public Builder(GetSwitchMtuItemOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mtuSize = defaults.mtuSize;
    	      this.switchProfiles = defaults.switchProfiles;
    	      this.switches = defaults.switches;
        }

        @CustomType.Setter
        public Builder mtuSize(Integer mtuSize) {
            if (mtuSize == null) {
              throw new MissingRequiredPropertyException("GetSwitchMtuItemOverride", "mtuSize");
            }
            this.mtuSize = mtuSize;
            return this;
        }
        @CustomType.Setter
        public Builder switchProfiles(List<String> switchProfiles) {
            if (switchProfiles == null) {
              throw new MissingRequiredPropertyException("GetSwitchMtuItemOverride", "switchProfiles");
            }
            this.switchProfiles = switchProfiles;
            return this;
        }
        public Builder switchProfiles(String... switchProfiles) {
            return switchProfiles(List.of(switchProfiles));
        }
        @CustomType.Setter
        public Builder switches(List<String> switches) {
            if (switches == null) {
              throw new MissingRequiredPropertyException("GetSwitchMtuItemOverride", "switches");
            }
            this.switches = switches;
            return this;
        }
        public Builder switches(String... switches) {
            return switches(List.of(switches));
        }
        public GetSwitchMtuItemOverride build() {
            final var _resultValue = new GetSwitchMtuItemOverride();
            _resultValue.mtuSize = mtuSize;
            _resultValue.switchProfiles = switchProfiles;
            _resultValue.switches = switches;
            return _resultValue;
        }
    }
}