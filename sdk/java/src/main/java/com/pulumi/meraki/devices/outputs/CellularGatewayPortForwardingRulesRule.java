// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CellularGatewayPortForwardingRulesRule {
    /**
     * @return *any* or *restricted*. Specify the right to make inbound connections on the specified ports or port ranges. If *restricted*, a list of allowed IPs is mandatory.
     * 
     */
    private @Nullable String access;
    /**
     * @return An array of ranges of WAN IP addresses that are allowed to make inbound connections on the specified ports or port ranges.
     * 
     */
    private @Nullable List<String> allowedIps;
    /**
     * @return The IP address of the server or device that hosts the internal resource that you wish to make available on the WAN
     * 
     */
    private @Nullable String lanIp;
    /**
     * @return A port or port ranges that will receive the forwarded traffic from the WAN
     * 
     */
    private @Nullable String localPort;
    /**
     * @return A descriptive name for the rule
     * 
     */
    private @Nullable String name;
    /**
     * @return TCP or UDP
     * 
     */
    private @Nullable String protocol;
    /**
     * @return A port or port ranges that will be forwarded to the host on the LAN
     * 
     */
    private @Nullable String publicPort;
    private @Nullable String uplink;

    private CellularGatewayPortForwardingRulesRule() {}
    /**
     * @return *any* or *restricted*. Specify the right to make inbound connections on the specified ports or port ranges. If *restricted*, a list of allowed IPs is mandatory.
     * 
     */
    public Optional<String> access() {
        return Optional.ofNullable(this.access);
    }
    /**
     * @return An array of ranges of WAN IP addresses that are allowed to make inbound connections on the specified ports or port ranges.
     * 
     */
    public List<String> allowedIps() {
        return this.allowedIps == null ? List.of() : this.allowedIps;
    }
    /**
     * @return The IP address of the server or device that hosts the internal resource that you wish to make available on the WAN
     * 
     */
    public Optional<String> lanIp() {
        return Optional.ofNullable(this.lanIp);
    }
    /**
     * @return A port or port ranges that will receive the forwarded traffic from the WAN
     * 
     */
    public Optional<String> localPort() {
        return Optional.ofNullable(this.localPort);
    }
    /**
     * @return A descriptive name for the rule
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return TCP or UDP
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * @return A port or port ranges that will be forwarded to the host on the LAN
     * 
     */
    public Optional<String> publicPort() {
        return Optional.ofNullable(this.publicPort);
    }
    public Optional<String> uplink() {
        return Optional.ofNullable(this.uplink);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CellularGatewayPortForwardingRulesRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String access;
        private @Nullable List<String> allowedIps;
        private @Nullable String lanIp;
        private @Nullable String localPort;
        private @Nullable String name;
        private @Nullable String protocol;
        private @Nullable String publicPort;
        private @Nullable String uplink;
        public Builder() {}
        public Builder(CellularGatewayPortForwardingRulesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.allowedIps = defaults.allowedIps;
    	      this.lanIp = defaults.lanIp;
    	      this.localPort = defaults.localPort;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
    	      this.publicPort = defaults.publicPort;
    	      this.uplink = defaults.uplink;
        }

        @CustomType.Setter
        public Builder access(@Nullable String access) {

            this.access = access;
            return this;
        }
        @CustomType.Setter
        public Builder allowedIps(@Nullable List<String> allowedIps) {

            this.allowedIps = allowedIps;
            return this;
        }
        public Builder allowedIps(String... allowedIps) {
            return allowedIps(List.of(allowedIps));
        }
        @CustomType.Setter
        public Builder lanIp(@Nullable String lanIp) {

            this.lanIp = lanIp;
            return this;
        }
        @CustomType.Setter
        public Builder localPort(@Nullable String localPort) {

            this.localPort = localPort;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {

            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder publicPort(@Nullable String publicPort) {

            this.publicPort = publicPort;
            return this;
        }
        @CustomType.Setter
        public Builder uplink(@Nullable String uplink) {

            this.uplink = uplink;
            return this;
        }
        public CellularGatewayPortForwardingRulesRule build() {
            final var _resultValue = new CellularGatewayPortForwardingRulesRule();
            _resultValue.access = access;
            _resultValue.allowedIps = allowedIps;
            _resultValue.lanIp = lanIp;
            _resultValue.localPort = localPort;
            _resultValue.name = name;
            _resultValue.protocol = protocol;
            _resultValue.publicPort = publicPort;
            _resultValue.uplink = uplink;
            return _resultValue;
        }
    }
}