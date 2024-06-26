// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetWirelessSettingsItemNamedVlansPoolDhcpMonitoring {
    /**
     * @return The duration in minutes that devices will refrain from using dirty VLANs before adding them back to the pool.
     * 
     */
    private Integer duration;
    /**
     * @return Whether or not devices using named VLAN pools should remove dirty VLANs from the pool, thereby preventing clients from being assigned to VLANs where they would be unable to obtain an IP address via DHCP
     * 
     */
    private Boolean enabled;

    private GetWirelessSettingsItemNamedVlansPoolDhcpMonitoring() {}
    /**
     * @return The duration in minutes that devices will refrain from using dirty VLANs before adding them back to the pool.
     * 
     */
    public Integer duration() {
        return this.duration;
    }
    /**
     * @return Whether or not devices using named VLAN pools should remove dirty VLANs from the pool, thereby preventing clients from being assigned to VLANs where they would be unable to obtain an IP address via DHCP
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessSettingsItemNamedVlansPoolDhcpMonitoring defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer duration;
        private Boolean enabled;
        public Builder() {}
        public Builder(GetWirelessSettingsItemNamedVlansPoolDhcpMonitoring defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder duration(Integer duration) {
            if (duration == null) {
              throw new MissingRequiredPropertyException("GetWirelessSettingsItemNamedVlansPoolDhcpMonitoring", "duration");
            }
            this.duration = duration;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetWirelessSettingsItemNamedVlansPoolDhcpMonitoring", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        public GetWirelessSettingsItemNamedVlansPoolDhcpMonitoring build() {
            final var _resultValue = new GetWirelessSettingsItemNamedVlansPoolDhcpMonitoring();
            _resultValue.duration = duration;
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
