// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClientsSearchItemRecordClientVpnConnection {
    private Integer connectedAt;
    private Integer disconnectedAt;
    private String remoteIp;

    private GetClientsSearchItemRecordClientVpnConnection() {}
    public Integer connectedAt() {
        return this.connectedAt;
    }
    public Integer disconnectedAt() {
        return this.disconnectedAt;
    }
    public String remoteIp() {
        return this.remoteIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientsSearchItemRecordClientVpnConnection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer connectedAt;
        private Integer disconnectedAt;
        private String remoteIp;
        public Builder() {}
        public Builder(GetClientsSearchItemRecordClientVpnConnection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectedAt = defaults.connectedAt;
    	      this.disconnectedAt = defaults.disconnectedAt;
    	      this.remoteIp = defaults.remoteIp;
        }

        @CustomType.Setter
        public Builder connectedAt(Integer connectedAt) {
            if (connectedAt == null) {
              throw new MissingRequiredPropertyException("GetClientsSearchItemRecordClientVpnConnection", "connectedAt");
            }
            this.connectedAt = connectedAt;
            return this;
        }
        @CustomType.Setter
        public Builder disconnectedAt(Integer disconnectedAt) {
            if (disconnectedAt == null) {
              throw new MissingRequiredPropertyException("GetClientsSearchItemRecordClientVpnConnection", "disconnectedAt");
            }
            this.disconnectedAt = disconnectedAt;
            return this;
        }
        @CustomType.Setter
        public Builder remoteIp(String remoteIp) {
            if (remoteIp == null) {
              throw new MissingRequiredPropertyException("GetClientsSearchItemRecordClientVpnConnection", "remoteIp");
            }
            this.remoteIp = remoteIp;
            return this;
        }
        public GetClientsSearchItemRecordClientVpnConnection build() {
            final var _resultValue = new GetClientsSearchItemRecordClientVpnConnection();
            _resultValue.connectedAt = connectedAt;
            _resultValue.disconnectedAt = disconnectedAt;
            _resultValue.remoteIp = remoteIp;
            return _resultValue;
        }
    }
}