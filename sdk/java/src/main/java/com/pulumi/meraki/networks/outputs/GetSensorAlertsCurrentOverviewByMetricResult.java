// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetSensorAlertsCurrentOverviewByMetricItem;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSensorAlertsCurrentOverviewByMetricResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private GetSensorAlertsCurrentOverviewByMetricItem item;
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    private String networkId;

    private GetSensorAlertsCurrentOverviewByMetricResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public GetSensorAlertsCurrentOverviewByMetricItem item() {
        return this.item;
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

    public static Builder builder(GetSensorAlertsCurrentOverviewByMetricResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private GetSensorAlertsCurrentOverviewByMetricItem item;
        private String networkId;
        public Builder() {}
        public Builder(GetSensorAlertsCurrentOverviewByMetricResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.item = defaults.item;
    	      this.networkId = defaults.networkId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsCurrentOverviewByMetricResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetSensorAlertsCurrentOverviewByMetricItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsCurrentOverviewByMetricResult", "item");
            }
            this.item = item;
            return this;
        }
        @CustomType.Setter
        public Builder networkId(String networkId) {
            if (networkId == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsCurrentOverviewByMetricResult", "networkId");
            }
            this.networkId = networkId;
            return this;
        }
        public GetSensorAlertsCurrentOverviewByMetricResult build() {
            final var _resultValue = new GetSensorAlertsCurrentOverviewByMetricResult();
            _resultValue.id = id;
            _resultValue.item = item;
            _resultValue.networkId = networkId;
            return _resultValue;
        }
    }
}
