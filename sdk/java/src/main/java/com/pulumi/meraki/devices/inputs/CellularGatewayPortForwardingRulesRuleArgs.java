// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CellularGatewayPortForwardingRulesRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final CellularGatewayPortForwardingRulesRuleArgs Empty = new CellularGatewayPortForwardingRulesRuleArgs();

    /**
     * *any* or *restricted*. Specify the right to make inbound connections on the specified ports or port ranges. If *restricted*, a list of allowed IPs is mandatory.
     * 
     */
    @Import(name="access")
    private @Nullable Output<String> access;

    /**
     * @return *any* or *restricted*. Specify the right to make inbound connections on the specified ports or port ranges. If *restricted*, a list of allowed IPs is mandatory.
     * 
     */
    public Optional<Output<String>> access() {
        return Optional.ofNullable(this.access);
    }

    /**
     * An array of ranges of WAN IP addresses that are allowed to make inbound connections on the specified ports or port ranges.
     * 
     */
    @Import(name="allowedIps")
    private @Nullable Output<List<String>> allowedIps;

    /**
     * @return An array of ranges of WAN IP addresses that are allowed to make inbound connections on the specified ports or port ranges.
     * 
     */
    public Optional<Output<List<String>>> allowedIps() {
        return Optional.ofNullable(this.allowedIps);
    }

    /**
     * The IP address of the server or device that hosts the internal resource that you wish to make available on the WAN
     * 
     */
    @Import(name="lanIp")
    private @Nullable Output<String> lanIp;

    /**
     * @return The IP address of the server or device that hosts the internal resource that you wish to make available on the WAN
     * 
     */
    public Optional<Output<String>> lanIp() {
        return Optional.ofNullable(this.lanIp);
    }

    /**
     * A port or port ranges that will receive the forwarded traffic from the WAN
     * 
     */
    @Import(name="localPort")
    private @Nullable Output<String> localPort;

    /**
     * @return A port or port ranges that will receive the forwarded traffic from the WAN
     * 
     */
    public Optional<Output<String>> localPort() {
        return Optional.ofNullable(this.localPort);
    }

    /**
     * A descriptive name for the rule
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A descriptive name for the rule
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * TCP or UDP
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return TCP or UDP
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * A port or port ranges that will be forwarded to the host on the LAN
     * 
     */
    @Import(name="publicPort")
    private @Nullable Output<String> publicPort;

    /**
     * @return A port or port ranges that will be forwarded to the host on the LAN
     * 
     */
    public Optional<Output<String>> publicPort() {
        return Optional.ofNullable(this.publicPort);
    }

    @Import(name="uplink")
    private @Nullable Output<String> uplink;

    public Optional<Output<String>> uplink() {
        return Optional.ofNullable(this.uplink);
    }

    private CellularGatewayPortForwardingRulesRuleArgs() {}

    private CellularGatewayPortForwardingRulesRuleArgs(CellularGatewayPortForwardingRulesRuleArgs $) {
        this.access = $.access;
        this.allowedIps = $.allowedIps;
        this.lanIp = $.lanIp;
        this.localPort = $.localPort;
        this.name = $.name;
        this.protocol = $.protocol;
        this.publicPort = $.publicPort;
        this.uplink = $.uplink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CellularGatewayPortForwardingRulesRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CellularGatewayPortForwardingRulesRuleArgs $;

        public Builder() {
            $ = new CellularGatewayPortForwardingRulesRuleArgs();
        }

        public Builder(CellularGatewayPortForwardingRulesRuleArgs defaults) {
            $ = new CellularGatewayPortForwardingRulesRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param access *any* or *restricted*. Specify the right to make inbound connections on the specified ports or port ranges. If *restricted*, a list of allowed IPs is mandatory.
         * 
         * @return builder
         * 
         */
        public Builder access(@Nullable Output<String> access) {
            $.access = access;
            return this;
        }

        /**
         * @param access *any* or *restricted*. Specify the right to make inbound connections on the specified ports or port ranges. If *restricted*, a list of allowed IPs is mandatory.
         * 
         * @return builder
         * 
         */
        public Builder access(String access) {
            return access(Output.of(access));
        }

        /**
         * @param allowedIps An array of ranges of WAN IP addresses that are allowed to make inbound connections on the specified ports or port ranges.
         * 
         * @return builder
         * 
         */
        public Builder allowedIps(@Nullable Output<List<String>> allowedIps) {
            $.allowedIps = allowedIps;
            return this;
        }

        /**
         * @param allowedIps An array of ranges of WAN IP addresses that are allowed to make inbound connections on the specified ports or port ranges.
         * 
         * @return builder
         * 
         */
        public Builder allowedIps(List<String> allowedIps) {
            return allowedIps(Output.of(allowedIps));
        }

        /**
         * @param allowedIps An array of ranges of WAN IP addresses that are allowed to make inbound connections on the specified ports or port ranges.
         * 
         * @return builder
         * 
         */
        public Builder allowedIps(String... allowedIps) {
            return allowedIps(List.of(allowedIps));
        }

        /**
         * @param lanIp The IP address of the server or device that hosts the internal resource that you wish to make available on the WAN
         * 
         * @return builder
         * 
         */
        public Builder lanIp(@Nullable Output<String> lanIp) {
            $.lanIp = lanIp;
            return this;
        }

        /**
         * @param lanIp The IP address of the server or device that hosts the internal resource that you wish to make available on the WAN
         * 
         * @return builder
         * 
         */
        public Builder lanIp(String lanIp) {
            return lanIp(Output.of(lanIp));
        }

        /**
         * @param localPort A port or port ranges that will receive the forwarded traffic from the WAN
         * 
         * @return builder
         * 
         */
        public Builder localPort(@Nullable Output<String> localPort) {
            $.localPort = localPort;
            return this;
        }

        /**
         * @param localPort A port or port ranges that will receive the forwarded traffic from the WAN
         * 
         * @return builder
         * 
         */
        public Builder localPort(String localPort) {
            return localPort(Output.of(localPort));
        }

        /**
         * @param name A descriptive name for the rule
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A descriptive name for the rule
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param protocol TCP or UDP
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol TCP or UDP
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param publicPort A port or port ranges that will be forwarded to the host on the LAN
         * 
         * @return builder
         * 
         */
        public Builder publicPort(@Nullable Output<String> publicPort) {
            $.publicPort = publicPort;
            return this;
        }

        /**
         * @param publicPort A port or port ranges that will be forwarded to the host on the LAN
         * 
         * @return builder
         * 
         */
        public Builder publicPort(String publicPort) {
            return publicPort(Output.of(publicPort));
        }

        public Builder uplink(@Nullable Output<String> uplink) {
            $.uplink = uplink;
            return this;
        }

        public Builder uplink(String uplink) {
            return uplink(Output.of(uplink));
        }

        public CellularGatewayPortForwardingRulesRuleArgs build() {
            return $;
        }
    }

}
