// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WirelessSsidsVpnFailover {
    /**
     * @return Idle timer interval in seconds.
     * 
     */
    private @Nullable Integer heartbeatInterval;
    /**
     * @return Idle timer timeout in seconds.
     * 
     */
    private @Nullable Integer idleTimeout;
    /**
     * @return IP addressed reserved on DHCP server where SSID will terminate.
     * 
     */
    private @Nullable String requestIp;

    private WirelessSsidsVpnFailover() {}
    /**
     * @return Idle timer interval in seconds.
     * 
     */
    public Optional<Integer> heartbeatInterval() {
        return Optional.ofNullable(this.heartbeatInterval);
    }
    /**
     * @return Idle timer timeout in seconds.
     * 
     */
    public Optional<Integer> idleTimeout() {
        return Optional.ofNullable(this.idleTimeout);
    }
    /**
     * @return IP addressed reserved on DHCP server where SSID will terminate.
     * 
     */
    public Optional<String> requestIp() {
        return Optional.ofNullable(this.requestIp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessSsidsVpnFailover defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer heartbeatInterval;
        private @Nullable Integer idleTimeout;
        private @Nullable String requestIp;
        public Builder() {}
        public Builder(WirelessSsidsVpnFailover defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.heartbeatInterval = defaults.heartbeatInterval;
    	      this.idleTimeout = defaults.idleTimeout;
    	      this.requestIp = defaults.requestIp;
        }

        @CustomType.Setter
        public Builder heartbeatInterval(@Nullable Integer heartbeatInterval) {

            this.heartbeatInterval = heartbeatInterval;
            return this;
        }
        @CustomType.Setter
        public Builder idleTimeout(@Nullable Integer idleTimeout) {

            this.idleTimeout = idleTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder requestIp(@Nullable String requestIp) {

            this.requestIp = requestIp;
            return this;
        }
        public WirelessSsidsVpnFailover build() {
            final var _resultValue = new WirelessSsidsVpnFailover();
            _resultValue.heartbeatInterval = heartbeatInterval;
            _resultValue.idleTimeout = idleTimeout;
            _resultValue.requestIp = requestIp;
            return _resultValue;
        }
    }
}
