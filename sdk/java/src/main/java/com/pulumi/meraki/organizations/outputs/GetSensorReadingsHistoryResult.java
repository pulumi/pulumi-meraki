// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetSensorReadingsHistoryItem;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSensorReadingsHistoryResult {
    /**
     * @return endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    private @Nullable String endingBefore;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Array of ResponseSensorGetOrganizationSensorReadingsHistory
     * 
     */
    private List<GetSensorReadingsHistoryItem> items;
    /**
     * @return metrics query parameter. Types of sensor readings to retrieve. If no metrics are supplied, all available types of readings will be retrieved. Allowed values are apparentPower, battery, button, co2, current, door, downstreamPower, frequency, humidity, indoorAirQuality, noise, pm25, powerFactor, realPower, remoteLockoutSwitch, temperature, tvoc, voltage, and water.
     * 
     */
    private @Nullable List<String> metrics;
    /**
     * @return networkIds query parameter. Optional parameter to filter readings by network.
     * 
     */
    private @Nullable List<String> networkIds;
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    private String organizationId;
    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     * 
     */
    private @Nullable Integer perPage;
    /**
     * @return serials query parameter. Optional parameter to filter readings by sensor.
     * 
     */
    private @Nullable List<String> serials;
    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    private @Nullable String startingAfter;
    /**
     * @return t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 365 days and 6 hours from today.
     * 
     */
    private @Nullable String t0;
    /**
     * @return t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
     * 
     */
    private @Nullable String t1;
    /**
     * @return timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days. The default is 2 hours.
     * 
     */
    private @Nullable Double timespan;

    private GetSensorReadingsHistoryResult() {}
    /**
     * @return endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<String> endingBefore() {
        return Optional.ofNullable(this.endingBefore);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Array of ResponseSensorGetOrganizationSensorReadingsHistory
     * 
     */
    public List<GetSensorReadingsHistoryItem> items() {
        return this.items;
    }
    /**
     * @return metrics query parameter. Types of sensor readings to retrieve. If no metrics are supplied, all available types of readings will be retrieved. Allowed values are apparentPower, battery, button, co2, current, door, downstreamPower, frequency, humidity, indoorAirQuality, noise, pm25, powerFactor, realPower, remoteLockoutSwitch, temperature, tvoc, voltage, and water.
     * 
     */
    public List<String> metrics() {
        return this.metrics == null ? List.of() : this.metrics;
    }
    /**
     * @return networkIds query parameter. Optional parameter to filter readings by network.
     * 
     */
    public List<String> networkIds() {
        return this.networkIds == null ? List.of() : this.networkIds;
    }
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }
    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     * 
     */
    public Optional<Integer> perPage() {
        return Optional.ofNullable(this.perPage);
    }
    /**
     * @return serials query parameter. Optional parameter to filter readings by sensor.
     * 
     */
    public List<String> serials() {
        return this.serials == null ? List.of() : this.serials;
    }
    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<String> startingAfter() {
        return Optional.ofNullable(this.startingAfter);
    }
    /**
     * @return t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 365 days and 6 hours from today.
     * 
     */
    public Optional<String> t0() {
        return Optional.ofNullable(this.t0);
    }
    /**
     * @return t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
     * 
     */
    public Optional<String> t1() {
        return Optional.ofNullable(this.t1);
    }
    /**
     * @return timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days. The default is 2 hours.
     * 
     */
    public Optional<Double> timespan() {
        return Optional.ofNullable(this.timespan);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSensorReadingsHistoryResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String endingBefore;
        private String id;
        private List<GetSensorReadingsHistoryItem> items;
        private @Nullable List<String> metrics;
        private @Nullable List<String> networkIds;
        private String organizationId;
        private @Nullable Integer perPage;
        private @Nullable List<String> serials;
        private @Nullable String startingAfter;
        private @Nullable String t0;
        private @Nullable String t1;
        private @Nullable Double timespan;
        public Builder() {}
        public Builder(GetSensorReadingsHistoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endingBefore = defaults.endingBefore;
    	      this.id = defaults.id;
    	      this.items = defaults.items;
    	      this.metrics = defaults.metrics;
    	      this.networkIds = defaults.networkIds;
    	      this.organizationId = defaults.organizationId;
    	      this.perPage = defaults.perPage;
    	      this.serials = defaults.serials;
    	      this.startingAfter = defaults.startingAfter;
    	      this.t0 = defaults.t0;
    	      this.t1 = defaults.t1;
    	      this.timespan = defaults.timespan;
        }

        @CustomType.Setter
        public Builder endingBefore(@Nullable String endingBefore) {

            this.endingBefore = endingBefore;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSensorReadingsHistoryResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetSensorReadingsHistoryItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetSensorReadingsHistoryResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetSensorReadingsHistoryItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder metrics(@Nullable List<String> metrics) {

            this.metrics = metrics;
            return this;
        }
        public Builder metrics(String... metrics) {
            return metrics(List.of(metrics));
        }
        @CustomType.Setter
        public Builder networkIds(@Nullable List<String> networkIds) {

            this.networkIds = networkIds;
            return this;
        }
        public Builder networkIds(String... networkIds) {
            return networkIds(List.of(networkIds));
        }
        @CustomType.Setter
        public Builder organizationId(String organizationId) {
            if (organizationId == null) {
              throw new MissingRequiredPropertyException("GetSensorReadingsHistoryResult", "organizationId");
            }
            this.organizationId = organizationId;
            return this;
        }
        @CustomType.Setter
        public Builder perPage(@Nullable Integer perPage) {

            this.perPage = perPage;
            return this;
        }
        @CustomType.Setter
        public Builder serials(@Nullable List<String> serials) {

            this.serials = serials;
            return this;
        }
        public Builder serials(String... serials) {
            return serials(List.of(serials));
        }
        @CustomType.Setter
        public Builder startingAfter(@Nullable String startingAfter) {

            this.startingAfter = startingAfter;
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
        public GetSensorReadingsHistoryResult build() {
            final var _resultValue = new GetSensorReadingsHistoryResult();
            _resultValue.endingBefore = endingBefore;
            _resultValue.id = id;
            _resultValue.items = items;
            _resultValue.metrics = metrics;
            _resultValue.networkIds = networkIds;
            _resultValue.organizationId = organizationId;
            _resultValue.perPage = perPage;
            _resultValue.serials = serials;
            _resultValue.startingAfter = startingAfter;
            _resultValue.t0 = t0;
            _resultValue.t1 = t1;
            _resultValue.timespan = timespan;
            return _resultValue;
        }
    }
}