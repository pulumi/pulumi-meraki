// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWirelessSsidsVpnItemFailover {
    private Integer heartbeatInterval;
    private Integer idleTimeout;
    private String requestIp;

    private GetWirelessSsidsVpnItemFailover() {}
    public Integer heartbeatInterval() {
        return this.heartbeatInterval;
    }
    public Integer idleTimeout() {
        return this.idleTimeout;
    }
    public String requestIp() {
        return this.requestIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessSsidsVpnItemFailover defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer heartbeatInterval;
        private Integer idleTimeout;
        private String requestIp;
        public Builder() {}
        public Builder(GetWirelessSsidsVpnItemFailover defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.heartbeatInterval = defaults.heartbeatInterval;
    	      this.idleTimeout = defaults.idleTimeout;
    	      this.requestIp = defaults.requestIp;
        }

        @CustomType.Setter
        public Builder heartbeatInterval(Integer heartbeatInterval) {
            if (heartbeatInterval == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsVpnItemFailover", "heartbeatInterval");
            }
            this.heartbeatInterval = heartbeatInterval;
            return this;
        }
        @CustomType.Setter
        public Builder idleTimeout(Integer idleTimeout) {
            if (idleTimeout == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsVpnItemFailover", "idleTimeout");
            }
            this.idleTimeout = idleTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder requestIp(String requestIp) {
            if (requestIp == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsVpnItemFailover", "requestIp");
            }
            this.requestIp = requestIp;
            return this;
        }
        public GetWirelessSsidsVpnItemFailover build() {
            final var _resultValue = new GetWirelessSsidsVpnItemFailover();
            _resultValue.heartbeatInterval = heartbeatInterval;
            _resultValue.idleTimeout = idleTimeout;
            _resultValue.requestIp = requestIp;
            return _resultValue;
        }
    }
}
