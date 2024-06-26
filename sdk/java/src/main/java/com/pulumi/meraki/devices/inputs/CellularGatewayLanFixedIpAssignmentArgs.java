// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CellularGatewayLanFixedIpAssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final CellularGatewayLanFixedIpAssignmentArgs Empty = new CellularGatewayLanFixedIpAssignmentArgs();

    /**
     * The IP address you want to assign to a specific server or device
     * 
     */
    @Import(name="ip")
    private @Nullable Output<String> ip;

    /**
     * @return The IP address you want to assign to a specific server or device
     * 
     */
    public Optional<Output<String>> ip() {
        return Optional.ofNullable(this.ip);
    }

    /**
     * The MAC address of the server or device that hosts the internal resource that you wish to receive the specified IP address
     * 
     */
    @Import(name="mac")
    private @Nullable Output<String> mac;

    /**
     * @return The MAC address of the server or device that hosts the internal resource that you wish to receive the specified IP address
     * 
     */
    public Optional<Output<String>> mac() {
        return Optional.ofNullable(this.mac);
    }

    /**
     * A descriptive name of the assignment
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A descriptive name of the assignment
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private CellularGatewayLanFixedIpAssignmentArgs() {}

    private CellularGatewayLanFixedIpAssignmentArgs(CellularGatewayLanFixedIpAssignmentArgs $) {
        this.ip = $.ip;
        this.mac = $.mac;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CellularGatewayLanFixedIpAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CellularGatewayLanFixedIpAssignmentArgs $;

        public Builder() {
            $ = new CellularGatewayLanFixedIpAssignmentArgs();
        }

        public Builder(CellularGatewayLanFixedIpAssignmentArgs defaults) {
            $ = new CellularGatewayLanFixedIpAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ip The IP address you want to assign to a specific server or device
         * 
         * @return builder
         * 
         */
        public Builder ip(@Nullable Output<String> ip) {
            $.ip = ip;
            return this;
        }

        /**
         * @param ip The IP address you want to assign to a specific server or device
         * 
         * @return builder
         * 
         */
        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        /**
         * @param mac The MAC address of the server or device that hosts the internal resource that you wish to receive the specified IP address
         * 
         * @return builder
         * 
         */
        public Builder mac(@Nullable Output<String> mac) {
            $.mac = mac;
            return this;
        }

        /**
         * @param mac The MAC address of the server or device that hosts the internal resource that you wish to receive the specified IP address
         * 
         * @return builder
         * 
         */
        public Builder mac(String mac) {
            return mac(Output.of(mac));
        }

        /**
         * @param name A descriptive name of the assignment
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A descriptive name of the assignment
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public CellularGatewayLanFixedIpAssignmentArgs build() {
            return $;
        }
    }

}
