// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessSettingsNamedVlansPoolDhcpMonitoringArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessSettingsNamedVlansPoolDhcpMonitoringArgs Empty = new WirelessSettingsNamedVlansPoolDhcpMonitoringArgs();

    /**
     * The duration in minutes that devices will refrain from using dirty VLANs before adding them back to the pool.
     * 
     */
    @Import(name="duration")
    private @Nullable Output<Integer> duration;

    /**
     * @return The duration in minutes that devices will refrain from using dirty VLANs before adding them back to the pool.
     * 
     */
    public Optional<Output<Integer>> duration() {
        return Optional.ofNullable(this.duration);
    }

    /**
     * Whether or not devices using named VLAN pools should remove dirty VLANs from the pool, thereby preventing clients from being assigned to VLANs where they would be unable to obtain an IP address via DHCP
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether or not devices using named VLAN pools should remove dirty VLANs from the pool, thereby preventing clients from being assigned to VLANs where they would be unable to obtain an IP address via DHCP
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private WirelessSettingsNamedVlansPoolDhcpMonitoringArgs() {}

    private WirelessSettingsNamedVlansPoolDhcpMonitoringArgs(WirelessSettingsNamedVlansPoolDhcpMonitoringArgs $) {
        this.duration = $.duration;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessSettingsNamedVlansPoolDhcpMonitoringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessSettingsNamedVlansPoolDhcpMonitoringArgs $;

        public Builder() {
            $ = new WirelessSettingsNamedVlansPoolDhcpMonitoringArgs();
        }

        public Builder(WirelessSettingsNamedVlansPoolDhcpMonitoringArgs defaults) {
            $ = new WirelessSettingsNamedVlansPoolDhcpMonitoringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param duration The duration in minutes that devices will refrain from using dirty VLANs before adding them back to the pool.
         * 
         * @return builder
         * 
         */
        public Builder duration(@Nullable Output<Integer> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration The duration in minutes that devices will refrain from using dirty VLANs before adding them back to the pool.
         * 
         * @return builder
         * 
         */
        public Builder duration(Integer duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param enabled Whether or not devices using named VLAN pools should remove dirty VLANs from the pool, thereby preventing clients from being assigned to VLANs where they would be unable to obtain an IP address via DHCP
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether or not devices using named VLAN pools should remove dirty VLANs from the pool, thereby preventing clients from being assigned to VLANs where they would be unable to obtain an IP address via DHCP
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public WirelessSettingsNamedVlansPoolDhcpMonitoringArgs build() {
            return $;
        }
    }

}
