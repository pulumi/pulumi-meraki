// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetHealthAlertsItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetHealthAlertsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Array of ResponseNetworksGetNetworkHealthAlerts
     * 
     */
    private List<GetHealthAlertsItem> items;
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    private String networkId;

    private GetHealthAlertsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Array of ResponseNetworksGetNetworkHealthAlerts
     * 
     */
    public List<GetHealthAlertsItem> items() {
        return this.items;
    }
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public String networkId() {
        return this.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHealthAlertsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetHealthAlertsItem> items;
        private String networkId;
        public Builder() {}
        public Builder(GetHealthAlertsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.items = defaults.items;
    	      this.networkId = defaults.networkId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetHealthAlertsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetHealthAlertsItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetHealthAlertsResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetHealthAlertsItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder networkId(String networkId) {
            if (networkId == null) {
              throw new MissingRequiredPropertyException("GetHealthAlertsResult", "networkId");
            }
            this.networkId = networkId;
            return this;
        }
        public GetHealthAlertsResult build() {
            final var _resultValue = new GetHealthAlertsResult();
            _resultValue.id = id;
            _resultValue.items = items;
            _resultValue.networkId = networkId;
            return _resultValue;
        }
    }
}
