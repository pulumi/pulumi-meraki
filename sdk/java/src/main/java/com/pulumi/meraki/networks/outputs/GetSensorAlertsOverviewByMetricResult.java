// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetSensorAlertsOverviewByMetricItem;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSensorAlertsOverviewByMetricResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return interval query parameter. The time interval in seconds for returned data. The valid intervals are: 86400, 604800. The default is 604800.
     * 
     */
    private @Nullable Integer interval;
    /**
     * @return Array of ResponseSensorGetNetworkSensorAlertsOverviewByMetric
     * 
     */
    private List<GetSensorAlertsOverviewByMetricItem> items;
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    private String networkId;
    /**
     * @return t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 365 days from today.
     * 
     */
    private @Nullable String t0;
    /**
     * @return t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
     * 
     */
    private @Nullable String t1;
    /**
     * @return timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 7 days.
     * 
     */
    private @Nullable Double timespan;

    private GetSensorAlertsOverviewByMetricResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return interval query parameter. The time interval in seconds for returned data. The valid intervals are: 86400, 604800. The default is 604800.
     * 
     */
    public Optional<Integer> interval() {
        return Optional.ofNullable(this.interval);
    }
    /**
     * @return Array of ResponseSensorGetNetworkSensorAlertsOverviewByMetric
     * 
     */
    public List<GetSensorAlertsOverviewByMetricItem> items() {
        return this.items;
    }
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public String networkId() {
        return this.networkId;
    }
    /**
     * @return t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 365 days from today.
     * 
     */
    public Optional<String> t0() {
        return Optional.ofNullable(this.t0);
    }
    /**
     * @return t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
     * 
     */
    public Optional<String> t1() {
        return Optional.ofNullable(this.t1);
    }
    /**
     * @return timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 7 days.
     * 
     */
    public Optional<Double> timespan() {
        return Optional.ofNullable(this.timespan);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSensorAlertsOverviewByMetricResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable Integer interval;
        private List<GetSensorAlertsOverviewByMetricItem> items;
        private String networkId;
        private @Nullable String t0;
        private @Nullable String t1;
        private @Nullable Double timespan;
        public Builder() {}
        public Builder(GetSensorAlertsOverviewByMetricResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.interval = defaults.interval;
    	      this.items = defaults.items;
    	      this.networkId = defaults.networkId;
    	      this.t0 = defaults.t0;
    	      this.t1 = defaults.t1;
    	      this.timespan = defaults.timespan;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsOverviewByMetricResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder interval(@Nullable Integer interval) {

            this.interval = interval;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetSensorAlertsOverviewByMetricItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsOverviewByMetricResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetSensorAlertsOverviewByMetricItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder networkId(String networkId) {
            if (networkId == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsOverviewByMetricResult", "networkId");
            }
            this.networkId = networkId;
            return this;
        }
        @CustomType.Setter
        public Builder t0(@Nullable String t0) {

            this.t0 = t0;
            return this;
        }
        @CustomType.Setter
        public Builder t1(@Nullable String t1) {

            this.t1 = t1;
            return this;
        }
        @CustomType.Setter
        public Builder timespan(@Nullable Double timespan) {

            this.timespan = timespan;
            return this;
        }
        public GetSensorAlertsOverviewByMetricResult build() {
            final var _resultValue = new GetSensorAlertsOverviewByMetricResult();
            _resultValue.id = id;
            _resultValue.interval = interval;
            _resultValue.items = items;
            _resultValue.networkId = networkId;
            _resultValue.t0 = t0;
            _resultValue.t1 = t1;
            _resultValue.timespan = timespan;
            return _resultValue;
        }
    }
}