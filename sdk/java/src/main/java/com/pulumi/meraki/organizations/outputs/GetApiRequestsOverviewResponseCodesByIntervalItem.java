// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetApiRequestsOverviewResponseCodesByIntervalItemCount;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApiRequestsOverviewResponseCodesByIntervalItem {
    /**
     * @return list of response codes and a count of how many requests had that code in the given time period
     * 
     */
    private List<GetApiRequestsOverviewResponseCodesByIntervalItemCount> counts;
    /**
     * @return The end time of the access period
     * 
     */
    private String endTs;
    /**
     * @return The start time of the access period
     * 
     */
    private String startTs;

    private GetApiRequestsOverviewResponseCodesByIntervalItem() {}
    /**
     * @return list of response codes and a count of how many requests had that code in the given time period
     * 
     */
    public List<GetApiRequestsOverviewResponseCodesByIntervalItemCount> counts() {
        return this.counts;
    }
    /**
     * @return The end time of the access period
     * 
     */
    public String endTs() {
        return this.endTs;
    }
    /**
     * @return The start time of the access period
     * 
     */
    public String startTs() {
        return this.startTs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiRequestsOverviewResponseCodesByIntervalItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetApiRequestsOverviewResponseCodesByIntervalItemCount> counts;
        private String endTs;
        private String startTs;
        public Builder() {}
        public Builder(GetApiRequestsOverviewResponseCodesByIntervalItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.counts = defaults.counts;
    	      this.endTs = defaults.endTs;
    	      this.startTs = defaults.startTs;
        }

        @CustomType.Setter
        public Builder counts(List<GetApiRequestsOverviewResponseCodesByIntervalItemCount> counts) {
            if (counts == null) {
              throw new MissingRequiredPropertyException("GetApiRequestsOverviewResponseCodesByIntervalItem", "counts");
            }
            this.counts = counts;
            return this;
        }
        public Builder counts(GetApiRequestsOverviewResponseCodesByIntervalItemCount... counts) {
            return counts(List.of(counts));
        }
        @CustomType.Setter
        public Builder endTs(String endTs) {
            if (endTs == null) {
              throw new MissingRequiredPropertyException("GetApiRequestsOverviewResponseCodesByIntervalItem", "endTs");
            }
            this.endTs = endTs;
            return this;
        }
        @CustomType.Setter
        public Builder startTs(String startTs) {
            if (startTs == null) {
              throw new MissingRequiredPropertyException("GetApiRequestsOverviewResponseCodesByIntervalItem", "startTs");
            }
            this.startTs = startTs;
            return this;
        }
        public GetApiRequestsOverviewResponseCodesByIntervalItem build() {
            final var _resultValue = new GetApiRequestsOverviewResponseCodesByIntervalItem();
            _resultValue.counts = counts;
            _resultValue.endTs = endTs;
            _resultValue.startTs = startTs;
            return _resultValue;
        }
    }
}