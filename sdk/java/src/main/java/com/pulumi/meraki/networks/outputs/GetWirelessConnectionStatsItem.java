// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetWirelessConnectionStatsItem {
    /**
     * @return The number of failed association attempts
     * 
     */
    private Integer assoc;
    /**
     * @return The number of failed authentication attempts
     * 
     */
    private Integer auth;
    /**
     * @return The number of failed DHCP attempts
     * 
     */
    private Integer dhcp;
    /**
     * @return The number of failed DNS attempts
     * 
     */
    private Integer dns;
    /**
     * @return The number of successful connection attempts
     * 
     */
    private Integer success;

    private GetWirelessConnectionStatsItem() {}
    /**
     * @return The number of failed association attempts
     * 
     */
    public Integer assoc() {
        return this.assoc;
    }
    /**
     * @return The number of failed authentication attempts
     * 
     */
    public Integer auth() {
        return this.auth;
    }
    /**
     * @return The number of failed DHCP attempts
     * 
     */
    public Integer dhcp() {
        return this.dhcp;
    }
    /**
     * @return The number of failed DNS attempts
     * 
     */
    public Integer dns() {
        return this.dns;
    }
    /**
     * @return The number of successful connection attempts
     * 
     */
    public Integer success() {
        return this.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessConnectionStatsItem defaults) {
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
        public Builder(GetWirelessConnectionStatsItem defaults) {
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
              throw new MissingRequiredPropertyException("GetWirelessConnectionStatsItem", "assoc");
            }
            this.assoc = assoc;
            return this;
        }
        @CustomType.Setter
        public Builder auth(Integer auth) {
            if (auth == null) {
              throw new MissingRequiredPropertyException("GetWirelessConnectionStatsItem", "auth");
            }
            this.auth = auth;
            return this;
        }
        @CustomType.Setter
        public Builder dhcp(Integer dhcp) {
            if (dhcp == null) {
              throw new MissingRequiredPropertyException("GetWirelessConnectionStatsItem", "dhcp");
            }
            this.dhcp = dhcp;
            return this;
        }
        @CustomType.Setter
        public Builder dns(Integer dns) {
            if (dns == null) {
              throw new MissingRequiredPropertyException("GetWirelessConnectionStatsItem", "dns");
            }
            this.dns = dns;
            return this;
        }
        @CustomType.Setter
        public Builder success(Integer success) {
            if (success == null) {
              throw new MissingRequiredPropertyException("GetWirelessConnectionStatsItem", "success");
            }
            this.success = success;
            return this;
        }
        public GetWirelessConnectionStatsItem build() {
            final var _resultValue = new GetWirelessConnectionStatsItem();
            _resultValue.assoc = assoc;
            _resultValue.auth = auth;
            _resultValue.dhcp = dhcp;
            _resultValue.dns = dns;
            _resultValue.success = success;
            return _resultValue;
        }
    }
}
