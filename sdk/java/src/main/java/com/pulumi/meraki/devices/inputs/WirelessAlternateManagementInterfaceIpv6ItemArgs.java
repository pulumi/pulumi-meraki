// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.devices.inputs.WirelessAlternateManagementInterfaceIpv6ItemAddressArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessAlternateManagementInterfaceIpv6ItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessAlternateManagementInterfaceIpv6ItemArgs Empty = new WirelessAlternateManagementInterfaceIpv6ItemArgs();

    /**
     * configured alternate management interface addresses
     * 
     */
    @Import(name="addresses")
    private @Nullable Output<List<WirelessAlternateManagementInterfaceIpv6ItemAddressArgs>> addresses;

    /**
     * @return configured alternate management interface addresses
     * 
     */
    public Optional<Output<List<WirelessAlternateManagementInterfaceIpv6ItemAddressArgs>>> addresses() {
        return Optional.ofNullable(this.addresses);
    }

    private WirelessAlternateManagementInterfaceIpv6ItemArgs() {}

    private WirelessAlternateManagementInterfaceIpv6ItemArgs(WirelessAlternateManagementInterfaceIpv6ItemArgs $) {
        this.addresses = $.addresses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessAlternateManagementInterfaceIpv6ItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessAlternateManagementInterfaceIpv6ItemArgs $;

        public Builder() {
            $ = new WirelessAlternateManagementInterfaceIpv6ItemArgs();
        }

        public Builder(WirelessAlternateManagementInterfaceIpv6ItemArgs defaults) {
            $ = new WirelessAlternateManagementInterfaceIpv6ItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addresses configured alternate management interface addresses
         * 
         * @return builder
         * 
         */
        public Builder addresses(@Nullable Output<List<WirelessAlternateManagementInterfaceIpv6ItemAddressArgs>> addresses) {
            $.addresses = addresses;
            return this;
        }

        /**
         * @param addresses configured alternate management interface addresses
         * 
         * @return builder
         * 
         */
        public Builder addresses(List<WirelessAlternateManagementInterfaceIpv6ItemAddressArgs> addresses) {
            return addresses(Output.of(addresses));
        }

        /**
         * @param addresses configured alternate management interface addresses
         * 
         * @return builder
         * 
         */
        public Builder addresses(WirelessAlternateManagementInterfaceIpv6ItemAddressArgs... addresses) {
            return addresses(List.of(addresses));
        }

        public WirelessAlternateManagementInterfaceIpv6ItemArgs build() {
            return $;
        }
    }

}