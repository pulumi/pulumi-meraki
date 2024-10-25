// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetSwitchDhcpV4ServersSeenItemLastAckIpv4;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSwitchDhcpV4ServersSeenItemLastAck {
    /**
     * @return IPv4 attributes of the last ack.
     * 
     */
    private GetSwitchDhcpV4ServersSeenItemLastAckIpv4 ipv4;
    /**
     * @return Last time the server was acked.
     * 
     */
    private String ts;

    private GetSwitchDhcpV4ServersSeenItemLastAck() {}
    /**
     * @return IPv4 attributes of the last ack.
     * 
     */
    public GetSwitchDhcpV4ServersSeenItemLastAckIpv4 ipv4() {
        return this.ipv4;
    }
    /**
     * @return Last time the server was acked.
     * 
     */
    public String ts() {
        return this.ts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchDhcpV4ServersSeenItemLastAck defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetSwitchDhcpV4ServersSeenItemLastAckIpv4 ipv4;
        private String ts;
        public Builder() {}
        public Builder(GetSwitchDhcpV4ServersSeenItemLastAck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv4 = defaults.ipv4;
    	      this.ts = defaults.ts;
        }

        @CustomType.Setter
        public Builder ipv4(GetSwitchDhcpV4ServersSeenItemLastAckIpv4 ipv4) {
            if (ipv4 == null) {
              throw new MissingRequiredPropertyException("GetSwitchDhcpV4ServersSeenItemLastAck", "ipv4");
            }
            this.ipv4 = ipv4;
            return this;
        }
        @CustomType.Setter
        public Builder ts(String ts) {
            if (ts == null) {
              throw new MissingRequiredPropertyException("GetSwitchDhcpV4ServersSeenItemLastAck", "ts");
            }
            this.ts = ts;
            return this;
        }
        public GetSwitchDhcpV4ServersSeenItemLastAck build() {
            final var _resultValue = new GetSwitchDhcpV4ServersSeenItemLastAck();
            _resultValue.ipv4 = ipv4;
            _resultValue.ts = ts;
            return _resultValue;
        }
    }
}
