// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetDevicesAvailabilitiesChangeHistoryItem;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDevicesAvailabilitiesChangeHistoryResult {
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
     * @return Array of ResponseOrganizationsGetOrganizationDevicesAvailabilitiesChangeHistory
     * 
     */
    private List<GetDevicesAvailabilitiesChangeHistoryItem> items;
    /**
     * @return networkIds query parameter. Optional parameter to filter device availabilities history by network IDs
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
     * @return productTypes query parameter. Optional parameter to filter device availabilities history by device product types
     * 
     */
    private @Nullable List<String> productTypes;
    /**
     * @return serials query parameter. Optional parameter to filter device availabilities history by device serial numbers
     * 
     */
    private @Nullable List<String> serials;
    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    private @Nullable String startingAfter;
    /**
     * @return statuses query parameter. Optional parameter to filter device availabilities history by device statuses
     * 
     */
    private @Nullable List<String> statuses;
    /**
     * @return t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
     * 
     */
    private @Nullable String t0;
    /**
     * @return t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
     * 
     */
    private @Nullable String t1;
    /**
     * @return timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
     * 
     */
    private @Nullable Double timespan;

    private GetDevicesAvailabilitiesChangeHistoryResult() {}
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
     * @return Array of ResponseOrganizationsGetOrganizationDevicesAvailabilitiesChangeHistory
     * 
     */
    public List<GetDevicesAvailabilitiesChangeHistoryItem> items() {
        return this.items;
    }
    /**
     * @return networkIds query parameter. Optional parameter to filter device availabilities history by network IDs
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
     * @return productTypes query parameter. Optional parameter to filter device availabilities history by device product types
     * 
     */
    public List<String> productTypes() {
        return this.productTypes == null ? List.of() : this.productTypes;
    }
    /**
     * @return serials query parameter. Optional parameter to filter device availabilities history by device serial numbers
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
     * @return statuses query parameter. Optional parameter to filter device availabilities history by device statuses
     * 
     */
    public List<String> statuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }
    /**
     * @return t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
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
     * @return timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
     * 
     */
    public Optional<Double> timespan() {
        return Optional.ofNullable(this.timespan);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDevicesAvailabilitiesChangeHistoryResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String endingBefore;
        private String id;
        private List<GetDevicesAvailabilitiesChangeHistoryItem> items;
        private @Nullable List<String> networkIds;
        private String organizationId;
        private @Nullable Integer perPage;
        private @Nullable List<String> productTypes;
        private @Nullable List<String> serials;
        private @Nullable String startingAfter;
        private @Nullable List<String> statuses;
        private @Nullable String t0;
        private @Nullable String t1;
        private @Nullable Double timespan;
        public Builder() {}
        public Builder(GetDevicesAvailabilitiesChangeHistoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endingBefore = defaults.endingBefore;
    	      this.id = defaults.id;
    	      this.items = defaults.items;
    	      this.networkIds = defaults.networkIds;
    	      this.organizationId = defaults.organizationId;
    	      this.perPage = defaults.perPage;
    	      this.productTypes = defaults.productTypes;
    	      this.serials = defaults.serials;
    	      this.startingAfter = defaults.startingAfter;
    	      this.statuses = defaults.statuses;
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
              throw new MissingRequiredPropertyException("GetDevicesAvailabilitiesChangeHistoryResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetDevicesAvailabilitiesChangeHistoryItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetDevicesAvailabilitiesChangeHistoryResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetDevicesAvailabilitiesChangeHistoryItem... items) {
            return items(List.of(items));
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
              throw new MissingRequiredPropertyException("GetDevicesAvailabilitiesChangeHistoryResult", "organizationId");
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
        public Builder productTypes(@Nullable List<String> productTypes) {

            this.productTypes = productTypes;
            return this;
        }
        public Builder productTypes(String... productTypes) {
            return productTypes(List.of(productTypes));
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
        public Builder statuses(@Nullable List<String> statuses) {

            this.statuses = statuses;
            return this;
        }
        public Builder statuses(String... statuses) {
            return statuses(List.of(statuses));
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
        public GetDevicesAvailabilitiesChangeHistoryResult build() {
            final var _resultValue = new GetDevicesAvailabilitiesChangeHistoryResult();
            _resultValue.endingBefore = endingBefore;
            _resultValue.id = id;
            _resultValue.items = items;
            _resultValue.networkIds = networkIds;
            _resultValue.organizationId = organizationId;
            _resultValue.perPage = perPage;
            _resultValue.productTypes = productTypes;
            _resultValue.serials = serials;
            _resultValue.startingAfter = startingAfter;
            _resultValue.statuses = statuses;
            _resultValue.t0 = t0;
            _resultValue.t1 = t1;
            _resultValue.timespan = timespan;
            return _resultValue;
        }
    }
}