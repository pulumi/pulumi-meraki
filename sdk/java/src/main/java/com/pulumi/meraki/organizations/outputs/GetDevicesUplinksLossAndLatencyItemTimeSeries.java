// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDevicesUplinksLossAndLatencyItemTimeSeries {
    /**
     * @return Latency in milliseconds
     * 
     */
    private Double latencyMs;
    /**
     * @return Loss percentage
     * 
     */
    private Double lossPercent;
    /**
     * @return Timestamp for this data point
     * 
     */
    private String ts;

    private GetDevicesUplinksLossAndLatencyItemTimeSeries() {}
    /**
     * @return Latency in milliseconds
     * 
     */
    public Double latencyMs() {
        return this.latencyMs;
    }
    /**
     * @return Loss percentage
     * 
     */
    public Double lossPercent() {
        return this.lossPercent;
    }
    /**
     * @return Timestamp for this data point
     * 
     */
    public String ts() {
        return this.ts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDevicesUplinksLossAndLatencyItemTimeSeries defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double latencyMs;
        private Double lossPercent;
        private String ts;
        public Builder() {}
        public Builder(GetDevicesUplinksLossAndLatencyItemTimeSeries defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.latencyMs = defaults.latencyMs;
    	      this.lossPercent = defaults.lossPercent;
    	      this.ts = defaults.ts;
        }

        @CustomType.Setter
        public Builder latencyMs(Double latencyMs) {
            if (latencyMs == null) {
              throw new MissingRequiredPropertyException("GetDevicesUplinksLossAndLatencyItemTimeSeries", "latencyMs");
            }
            this.latencyMs = latencyMs;
            return this;
        }
        @CustomType.Setter
        public Builder lossPercent(Double lossPercent) {
            if (lossPercent == null) {
              throw new MissingRequiredPropertyException("GetDevicesUplinksLossAndLatencyItemTimeSeries", "lossPercent");
            }
            this.lossPercent = lossPercent;
            return this;
        }
        @CustomType.Setter
        public Builder ts(String ts) {
            if (ts == null) {
              throw new MissingRequiredPropertyException("GetDevicesUplinksLossAndLatencyItemTimeSeries", "ts");
            }
            this.ts = ts;
            return this;
        }
        public GetDevicesUplinksLossAndLatencyItemTimeSeries build() {
            final var _resultValue = new GetDevicesUplinksLossAndLatencyItemTimeSeries();
            _resultValue.latencyMs = latencyMs;
            _resultValue.lossPercent = lossPercent;
            _resultValue.ts = ts;
            return _resultValue;
        }
    }
}
