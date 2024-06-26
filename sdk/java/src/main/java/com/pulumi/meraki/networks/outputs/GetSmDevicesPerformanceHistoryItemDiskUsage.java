// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetSmDevicesPerformanceHistoryItemDiskUsageC;
import java.util.Objects;

@CustomType
public final class GetSmDevicesPerformanceHistoryItemDiskUsage {
    /**
     * @return An object containing current disk usage details.
     * 
     */
    private GetSmDevicesPerformanceHistoryItemDiskUsageC c;

    private GetSmDevicesPerformanceHistoryItemDiskUsage() {}
    /**
     * @return An object containing current disk usage details.
     * 
     */
    public GetSmDevicesPerformanceHistoryItemDiskUsageC c() {
        return this.c;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSmDevicesPerformanceHistoryItemDiskUsage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetSmDevicesPerformanceHistoryItemDiskUsageC c;
        public Builder() {}
        public Builder(GetSmDevicesPerformanceHistoryItemDiskUsage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.c = defaults.c;
        }

        @CustomType.Setter
        public Builder c(GetSmDevicesPerformanceHistoryItemDiskUsageC c) {
            if (c == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesPerformanceHistoryItemDiskUsage", "c");
            }
            this.c = c;
            return this;
        }
        public GetSmDevicesPerformanceHistoryItemDiskUsage build() {
            final var _resultValue = new GetSmDevicesPerformanceHistoryItemDiskUsage();
            _resultValue.c = c;
            return _resultValue;
        }
    }
}
