// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetWirelessClientsConnectionStatsItemConnectionStats {
    private Integer assoc;
    private Integer auth;
    private Integer dhcp;
    private Integer dns;
    private Integer success;

    private GetWirelessClientsConnectionStatsItemConnectionStats() {}
    public Integer assoc() {
        return this.assoc;
    }
    public Integer auth() {
        return this.auth;
    }
    public Integer dhcp() {
        return this.dhcp;
    }
    public Integer dns() {
        return this.dns;
    }
    public Integer success() {
        return this.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessClientsConnectionStatsItemConnectionStats defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer assoc;
        private Integer auth;
        private Integer dhcp;
        private Integer dns;
        private Integer success;
        public Builder() {}
        public Builder(GetWirelessClientsConnectionStatsItemConnectionStats defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assoc = defaults.assoc;
    	      this.auth = defaults.auth;
    	      this.dhcp = defaults.dhcp;
    	      this.dns = defaults.dns;
    	      this.success = defaults.success;
        }

        @CustomType.Setter
        public Builder assoc(Integer assoc) {
            if (assoc == null) {
              throw new MissingRequiredPropertyException("GetWirelessClientsConnectionStatsItemConnectionStats", "assoc");
            }
            this.assoc = assoc;
            return this;
        }
        @CustomType.Setter
        public Builder auth(Integer auth) {
            if (auth == null) {
              throw new MissingRequiredPropertyException("GetWirelessClientsConnectionStatsItemConnectionStats", "auth");
            }
            this.auth = auth;
            return this;
        }
        @CustomType.Setter
        public Builder dhcp(Integer dhcp) {
            if (dhcp == null) {
              throw new MissingRequiredPropertyException("GetWirelessClientsConnectionStatsItemConnectionStats", "dhcp");
            }
            this.dhcp = dhcp;
            return this;
        }
        @CustomType.Setter
        public Builder dns(Integer dns) {
            if (dns == null) {
              throw new MissingRequiredPropertyException("GetWirelessClientsConnectionStatsItemConnectionStats", "dns");
            }
            this.dns = dns;
            return this;
        }
        @CustomType.Setter
        public Builder success(Integer success) {
            if (success == null) {
              throw new MissingRequiredPropertyException("GetWirelessClientsConnectionStatsItemConnectionStats", "success");
            }
            this.success = success;
            return this;
        }
        public GetWirelessClientsConnectionStatsItemConnectionStats build() {
            final var _resultValue = new GetWirelessClientsConnectionStatsItemConnectionStats();
            _resultValue.assoc = assoc;
            _resultValue.auth = auth;
            _resultValue.dhcp = dhcp;
            _resultValue.dns = dns;
            _resultValue.success = success;
            return _resultValue;
        }
    }
}