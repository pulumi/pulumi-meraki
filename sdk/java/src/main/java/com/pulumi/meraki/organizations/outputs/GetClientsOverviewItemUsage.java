// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetClientsOverviewItemUsageOverall;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class GetClientsOverviewItemUsage {
    /**
     * @return Average data usage (in kb) of each client in organization
     * 
     */
    private Double average;
    /**
     * @return Overall data usage of all clients across organization
     * 
     */
    private GetClientsOverviewItemUsageOverall overall;

    private GetClientsOverviewItemUsage() {}
    /**
     * @return Average data usage (in kb) of each client in organization
     * 
     */
    public Double average() {
        return this.average;
    }
    /**
     * @return Overall data usage of all clients across organization
     * 
     */
    public GetClientsOverviewItemUsageOverall overall() {
        return this.overall;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientsOverviewItemUsage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double average;
        private GetClientsOverviewItemUsageOverall overall;
        public Builder() {}
        public Builder(GetClientsOverviewItemUsage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.average = defaults.average;
    	      this.overall = defaults.overall;
        }

        @CustomType.Setter
        public Builder average(Double average) {
            if (average == null) {
              throw new MissingRequiredPropertyException("GetClientsOverviewItemUsage", "average");
            }
            this.average = average;
            return this;
        }
        @CustomType.Setter
        public Builder overall(GetClientsOverviewItemUsageOverall overall) {
            if (overall == null) {
              throw new MissingRequiredPropertyException("GetClientsOverviewItemUsage", "overall");
            }
            this.overall = overall;
            return this;
        }
        public GetClientsOverviewItemUsage build() {
            final var _resultValue = new GetClientsOverviewItemUsage();
            _resultValue.average = average;
            _resultValue.overall = overall;
            return _resultValue;
        }
    }
}
