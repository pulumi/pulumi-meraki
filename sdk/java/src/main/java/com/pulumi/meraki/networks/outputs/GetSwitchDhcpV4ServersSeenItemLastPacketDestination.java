// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetSwitchDhcpV4ServersSeenItemLastPacketDestinationIpv4;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSwitchDhcpV4ServersSeenItemLastPacketDestination {
    /**
     * @return Destination ipv4 attributes of the packet.
     * 
     */
    private GetSwitchDhcpV4ServersSeenItemLastPacketDestinationIpv4 ipv4;
    /**
     * @return Destination mac address of the packet.
     * 
     */
    private String mac;
    /**
     * @return Destination port of the packet.
     * 
     */
    private Integer port;

    private GetSwitchDhcpV4ServersSeenItemLastPacketDestination() {}
    /**
     * @return Destination ipv4 attributes of the packet.
     * 
     */
    public GetSwitchDhcpV4ServersSeenItemLastPacketDestinationIpv4 ipv4() {
        return this.ipv4;
    }
    /**
     * @return Destination mac address of the packet.
     * 
     */
    public String mac() {
        return this.mac;
    }
    /**
     * @return Destination port of the packet.
     * 
     */
    public Integer port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchDhcpV4ServersSeenItemLastPacketDestination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetSwitchDhcpV4ServersSeenItemLastPacketDestinationIpv4 ipv4;
        private String mac;
        private Integer port;
        public Builder() {}
        public Builder(GetSwitchDhcpV4ServersSeenItemLastPacketDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv4 = defaults.ipv4;
    	      this.mac = defaults.mac;
    	      this.port = defaults.port;
        }

        @CustomType.Setter
        public Builder ipv4(GetSwitchDhcpV4ServersSeenItemLastPacketDestinationIpv4 ipv4) {
            if (ipv4 == null) {
              throw new MissingRequiredPropertyException("GetSwitchDhcpV4ServersSeenItemLastPacketDestination", "ipv4");
            }
            this.ipv4 = ipv4;
            return this;
        }
        @CustomType.Setter
        public Builder mac(String mac) {
            if (mac == null) {
              throw new MissingRequiredPropertyException("GetSwitchDhcpV4ServersSeenItemLastPacketDestination", "mac");
            }
            this.mac = mac;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetSwitchDhcpV4ServersSeenItemLastPacketDestination", "port");
            }
            this.port = port;
            return this;
        }
        public GetSwitchDhcpV4ServersSeenItemLastPacketDestination build() {
            final var _resultValue = new GetSwitchDhcpV4ServersSeenItemLastPacketDestination();
            _resultValue.ipv4 = ipv4;
            _resultValue.mac = mac;
            _resultValue.port = port;
            return _resultValue;
        }
    }
}