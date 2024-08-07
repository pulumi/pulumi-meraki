// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetSummaryTopSsidsByUsageItemClientsCounts;
import java.util.Objects;

@CustomType
public final class GetSummaryTopSsidsByUsageItemClients {
    /**
     * @return Counts of the clients
     * 
     */
    private GetSummaryTopSsidsByUsageItemClientsCounts counts;

    private GetSummaryTopSsidsByUsageItemClients() {}
    /**
     * @return Counts of the clients
     * 
     */
    public GetSummaryTopSsidsByUsageItemClientsCounts counts() {
        return this.counts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSummaryTopSsidsByUsageItemClients defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetSummaryTopSsidsByUsageItemClientsCounts counts;
        public Builder() {}
        public Builder(GetSummaryTopSsidsByUsageItemClients defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.counts = defaults.counts;
        }

        @CustomType.Setter
        public Builder counts(GetSummaryTopSsidsByUsageItemClientsCounts counts) {
            if (counts == null) {
              throw new MissingRequiredPropertyException("GetSummaryTopSsidsByUsageItemClients", "counts");
            }
            this.counts = counts;
            return this;
        }
        public GetSummaryTopSsidsByUsageItemClients build() {
            final var _resultValue = new GetSummaryTopSsidsByUsageItemClients();
            _resultValue.counts = counts;
            return _resultValue;
        }
    }
}
