// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWirelessChannelUtilizationHistoryItem {
    /**
     * @return The end time of the query range
     * 
     */
    private String endTs;
    /**
     * @return The start time of the query range
     * 
     */
    private String startTs;
    /**
     * @return Average wifi utilization
     * 
     */
    private Double utilization80211;
    /**
     * @return Average signal interference
     * 
     */
    private Double utilizationNon80211;
    /**
     * @return Total channel utilization
     * 
     */
    private Double utilizationTotal;

    private GetWirelessChannelUtilizationHistoryItem() {}
    /**
     * @return The end time of the query range
     * 
     */
    public String endTs() {
        return this.endTs;
    }
    /**
     * @return The start time of the query range
     * 
     */
    public String startTs() {
        return this.startTs;
    }
    /**
     * @return Average wifi utilization
     * 
     */
    public Double utilization80211() {
        return this.utilization80211;
    }
    /**
     * @return Average signal interference
     * 
     */
    public Double utilizationNon80211() {
        return this.utilizationNon80211;
    }
    /**
     * @return Total channel utilization
     * 
     */
    public Double utilizationTotal() {
        return this.utilizationTotal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessChannelUtilizationHistoryItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endTs;
        private String startTs;
        private Double utilization80211;
        private Double utilizationNon80211;
        private Double utilizationTotal;
        public Builder() {}
        public Builder(GetWirelessChannelUtilizationHistoryItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTs = defaults.endTs;
    	      this.startTs = defaults.startTs;
    	      this.utilization80211 = defaults.utilization80211;
    	      this.utilizationNon80211 = defaults.utilizationNon80211;
    	      this.utilizationTotal = defaults.utilizationTotal;
        }

        @CustomType.Setter
        public Builder endTs(String endTs) {
            if (endTs == null) {
              throw new MissingRequiredPropertyException("GetWirelessChannelUtilizationHistoryItem", "endTs");
            }
            this.endTs = endTs;
            return this;
        }
        @CustomType.Setter
        public Builder startTs(String startTs) {
            if (startTs == null) {
              throw new MissingRequiredPropertyException("GetWirelessChannelUtilizationHistoryItem", "startTs");
            }
            this.startTs = startTs;
            return this;
        }
        @CustomType.Setter
        public Builder utilization80211(Double utilization80211) {
            if (utilization80211 == null) {
              throw new MissingRequiredPropertyException("GetWirelessChannelUtilizationHistoryItem", "utilization80211");
            }
            this.utilization80211 = utilization80211;
            return this;
        }
        @CustomType.Setter
        public Builder utilizationNon80211(Double utilizationNon80211) {
            if (utilizationNon80211 == null) {
              throw new MissingRequiredPropertyException("GetWirelessChannelUtilizationHistoryItem", "utilizationNon80211");
            }
            this.utilizationNon80211 = utilizationNon80211;
            return this;
        }
        @CustomType.Setter
        public Builder utilizationTotal(Double utilizationTotal) {
            if (utilizationTotal == null) {
              throw new MissingRequiredPropertyException("GetWirelessChannelUtilizationHistoryItem", "utilizationTotal");
            }
            this.utilizationTotal = utilizationTotal;
            return this;
        }
        public GetWirelessChannelUtilizationHistoryItem build() {
            final var _resultValue = new GetWirelessChannelUtilizationHistoryItem();
            _resultValue.endTs = endTs;
            _resultValue.startTs = startTs;
            _resultValue.utilization80211 = utilization80211;
            _resultValue.utilizationNon80211 = utilizationNon80211;
            _resultValue.utilizationTotal = utilizationTotal;
            return _resultValue;
        }
    }
}
