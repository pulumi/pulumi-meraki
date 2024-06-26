// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHealthAlertsItemScopeDeviceClient {
    /**
     * @return Mac address of the client
     * 
     */
    private String mac;

    private GetHealthAlertsItemScopeDeviceClient() {}
    /**
     * @return Mac address of the client
     * 
     */
    public String mac() {
        return this.mac;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHealthAlertsItemScopeDeviceClient defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String mac;
        public Builder() {}
        public Builder(GetHealthAlertsItemScopeDeviceClient defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mac = defaults.mac;
        }

        @CustomType.Setter
        public Builder mac(String mac) {
            if (mac == null) {
              throw new MissingRequiredPropertyException("GetHealthAlertsItemScopeDeviceClient", "mac");
            }
            this.mac = mac;
            return this;
        }
        public GetHealthAlertsItemScopeDeviceClient build() {
            final var _resultValue = new GetHealthAlertsItemScopeDeviceClient();
            _resultValue.mac = mac;
            return _resultValue;
        }
    }
}
