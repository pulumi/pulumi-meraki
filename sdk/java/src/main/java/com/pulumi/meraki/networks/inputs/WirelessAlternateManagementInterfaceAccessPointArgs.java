// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessAlternateManagementInterfaceAccessPointArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessAlternateManagementInterfaceAccessPointArgs Empty = new WirelessAlternateManagementInterfaceAccessPointArgs();

    /**
     * Wireless alternate management interface device IP. Provide an empty string to remove alternate management IP assignment
     * 
     */
    @Import(name="alternateManagementIp")
    private @Nullable Output<String> alternateManagementIp;

    /**
     * @return Wireless alternate management interface device IP. Provide an empty string to remove alternate management IP assignment
     * 
     */
    public Optional<Output<String>> alternateManagementIp() {
        return Optional.ofNullable(this.alternateManagementIp);
    }

    /**
     * Primary DNS must be in IP format
     * 
     */
    @Import(name="dns1")
    private @Nullable Output<String> dns1;

    /**
     * @return Primary DNS must be in IP format
     * 
     */
    public Optional<Output<String>> dns1() {
        return Optional.ofNullable(this.dns1);
    }

    /**
     * Optional secondary DNS must be in IP format
     * 
     */
    @Import(name="dns2")
    private @Nullable Output<String> dns2;

    /**
     * @return Optional secondary DNS must be in IP format
     * 
     */
    public Optional<Output<String>> dns2() {
        return Optional.ofNullable(this.dns2);
    }

    /**
     * Gateway must be in IP format
     * 
     */
    @Import(name="gateway")
    private @Nullable Output<String> gateway;

    /**
     * @return Gateway must be in IP format
     * 
     */
    public Optional<Output<String>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    /**
     * Serial number of access point to be configured with alternate management IP
     * 
     */
    @Import(name="serial")
    private @Nullable Output<String> serial;

    /**
     * @return Serial number of access point to be configured with alternate management IP
     * 
     */
    public Optional<Output<String>> serial() {
        return Optional.ofNullable(this.serial);
    }

    /**
     * Subnet mask must be in IP format
     * 
     */
    @Import(name="subnetMask")
    private @Nullable Output<String> subnetMask;

    /**
     * @return Subnet mask must be in IP format
     * 
     */
    public Optional<Output<String>> subnetMask() {
        return Optional.ofNullable(this.subnetMask);
    }

    private WirelessAlternateManagementInterfaceAccessPointArgs() {}

    private WirelessAlternateManagementInterfaceAccessPointArgs(WirelessAlternateManagementInterfaceAccessPointArgs $) {
        this.alternateManagementIp = $.alternateManagementIp;
        this.dns1 = $.dns1;
        this.dns2 = $.dns2;
        this.gateway = $.gateway;
        this.serial = $.serial;
        this.subnetMask = $.subnetMask;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessAlternateManagementInterfaceAccessPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessAlternateManagementInterfaceAccessPointArgs $;

        public Builder() {
            $ = new WirelessAlternateManagementInterfaceAccessPointArgs();
        }

        public Builder(WirelessAlternateManagementInterfaceAccessPointArgs defaults) {
            $ = new WirelessAlternateManagementInterfaceAccessPointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alternateManagementIp Wireless alternate management interface device IP. Provide an empty string to remove alternate management IP assignment
         * 
         * @return builder
         * 
         */
        public Builder alternateManagementIp(@Nullable Output<String> alternateManagementIp) {
            $.alternateManagementIp = alternateManagementIp;
            return this;
        }

        /**
         * @param alternateManagementIp Wireless alternate management interface device IP. Provide an empty string to remove alternate management IP assignment
         * 
         * @return builder
         * 
         */
        public Builder alternateManagementIp(String alternateManagementIp) {
            return alternateManagementIp(Output.of(alternateManagementIp));
        }

        /**
         * @param dns1 Primary DNS must be in IP format
         * 
         * @return builder
         * 
         */
        public Builder dns1(@Nullable Output<String> dns1) {
            $.dns1 = dns1;
            return this;
        }

        /**
         * @param dns1 Primary DNS must be in IP format
         * 
         * @return builder
         * 
         */
        public Builder dns1(String dns1) {
            return dns1(Output.of(dns1));
        }

        /**
         * @param dns2 Optional secondary DNS must be in IP format
         * 
         * @return builder
         * 
         */
        public Builder dns2(@Nullable Output<String> dns2) {
            $.dns2 = dns2;
            return this;
        }

        /**
         * @param dns2 Optional secondary DNS must be in IP format
         * 
         * @return builder
         * 
         */
        public Builder dns2(String dns2) {
            return dns2(Output.of(dns2));
        }

        /**
         * @param gateway Gateway must be in IP format
         * 
         * @return builder
         * 
         */
        public Builder gateway(@Nullable Output<String> gateway) {
            $.gateway = gateway;
            return this;
        }

        /**
         * @param gateway Gateway must be in IP format
         * 
         * @return builder
         * 
         */
        public Builder gateway(String gateway) {
            return gateway(Output.of(gateway));
        }

        /**
         * @param serial Serial number of access point to be configured with alternate management IP
         * 
         * @return builder
         * 
         */
        public Builder serial(@Nullable Output<String> serial) {
            $.serial = serial;
            return this;
        }

        /**
         * @param serial Serial number of access point to be configured with alternate management IP
         * 
         * @return builder
         * 
         */
        public Builder serial(String serial) {
            return serial(Output.of(serial));
        }

        /**
         * @param subnetMask Subnet mask must be in IP format
         * 
         * @return builder
         * 
         */
        public Builder subnetMask(@Nullable Output<String> subnetMask) {
            $.subnetMask = subnetMask;
            return this;
        }

        /**
         * @param subnetMask Subnet mask must be in IP format
         * 
         * @return builder
         * 
         */
        public Builder subnetMask(String subnetMask) {
            return subnetMask(Output.of(subnetMask));
        }

        public WirelessAlternateManagementInterfaceAccessPointArgs build() {
            return $;
        }
    }

}