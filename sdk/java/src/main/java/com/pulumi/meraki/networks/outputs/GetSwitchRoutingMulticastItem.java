// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetSwitchRoutingMulticastItemDefaultSettings;
import com.pulumi.meraki.networks.outputs.GetSwitchRoutingMulticastItemOverride;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSwitchRoutingMulticastItem {
    /**
     * @return Default multicast setting for entire network. IGMP snooping and Flood unknown
     *   multicast traffic settings are enabled by default.
     * 
     */
    private GetSwitchRoutingMulticastItemDefaultSettings defaultSettings;
    /**
     * @return Array of paired switches/stacks/profiles and corresponding multicast settings.
     *   An empty array will clear the multicast settings.
     * 
     */
    private List<GetSwitchRoutingMulticastItemOverride> overrides;

    private GetSwitchRoutingMulticastItem() {}
    /**
     * @return Default multicast setting for entire network. IGMP snooping and Flood unknown
     *   multicast traffic settings are enabled by default.
     * 
     */
    public GetSwitchRoutingMulticastItemDefaultSettings defaultSettings() {
        return this.defaultSettings;
    }
    /**
     * @return Array of paired switches/stacks/profiles and corresponding multicast settings.
     *   An empty array will clear the multicast settings.
     * 
     */
    public List<GetSwitchRoutingMulticastItemOverride> overrides() {
        return this.overrides;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchRoutingMulticastItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetSwitchRoutingMulticastItemDefaultSettings defaultSettings;
        private List<GetSwitchRoutingMulticastItemOverride> overrides;
        public Builder() {}
        public Builder(GetSwitchRoutingMulticastItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultSettings = defaults.defaultSettings;
    	      this.overrides = defaults.overrides;
        }

        @CustomType.Setter
        public Builder defaultSettings(GetSwitchRoutingMulticastItemDefaultSettings defaultSettings) {
            if (defaultSettings == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingMulticastItem", "defaultSettings");
            }
            this.defaultSettings = defaultSettings;
            return this;
        }
        @CustomType.Setter
        public Builder overrides(List<GetSwitchRoutingMulticastItemOverride> overrides) {
            if (overrides == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingMulticastItem", "overrides");
            }
            this.overrides = overrides;
            return this;
        }
        public Builder overrides(GetSwitchRoutingMulticastItemOverride... overrides) {
            return overrides(List.of(overrides));
        }
        public GetSwitchRoutingMulticastItem build() {
            final var _resultValue = new GetSwitchRoutingMulticastItem();
            _resultValue.defaultSettings = defaultSettings;
            _resultValue.overrides = overrides;
            return _resultValue;
        }
    }
}
