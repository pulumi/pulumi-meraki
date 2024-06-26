// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCellularGatewayPortForwardingRulesItemRule {
    private String access;
    private String lanIp;
    private String localPort;
    private String name;
    private String protocol;
    private String publicPort;
    private String uplink;

    private GetCellularGatewayPortForwardingRulesItemRule() {}
    public String access() {
        return this.access;
    }
    public String lanIp() {
        return this.lanIp;
    }
    public String localPort() {
        return this.localPort;
    }
    public String name() {
        return this.name;
    }
    public String protocol() {
        return this.protocol;
    }
    public String publicPort() {
        return this.publicPort;
    }
    public String uplink() {
        return this.uplink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCellularGatewayPortForwardingRulesItemRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String access;
        private String lanIp;
        private String localPort;
        private String name;
        private String protocol;
        private String publicPort;
        private String uplink;
        public Builder() {}
        public Builder(GetCellularGatewayPortForwardingRulesItemRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.lanIp = defaults.lanIp;
    	      this.localPort = defaults.localPort;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
    	      this.publicPort = defaults.publicPort;
    	      this.uplink = defaults.uplink;
        }

        @CustomType.Setter
        public Builder access(String access) {
            if (access == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewayPortForwardingRulesItemRule", "access");
            }
            this.access = access;
            return this;
        }
        @CustomType.Setter
        public Builder lanIp(String lanIp) {
            if (lanIp == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewayPortForwardingRulesItemRule", "lanIp");
            }
            this.lanIp = lanIp;
            return this;
        }
        @CustomType.Setter
        public Builder localPort(String localPort) {
            if (localPort == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewayPortForwardingRulesItemRule", "localPort");
            }
            this.localPort = localPort;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewayPortForwardingRulesItemRule", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewayPortForwardingRulesItemRule", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder publicPort(String publicPort) {
            if (publicPort == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewayPortForwardingRulesItemRule", "publicPort");
            }
            this.publicPort = publicPort;
            return this;
        }
        @CustomType.Setter
        public Builder uplink(String uplink) {
            if (uplink == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewayPortForwardingRulesItemRule", "uplink");
            }
            this.uplink = uplink;
            return this;
        }
        public GetCellularGatewayPortForwardingRulesItemRule build() {
            final var _resultValue = new GetCellularGatewayPortForwardingRulesItemRule();
            _resultValue.access = access;
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
