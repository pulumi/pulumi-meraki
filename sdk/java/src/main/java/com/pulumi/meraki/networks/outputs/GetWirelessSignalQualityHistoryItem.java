// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWirelessSignalQualityHistoryItem {
    /**
     * @return The end time of the query range
     * 
     */
    private String endTs;
    /**
     * @return Received signal strength indicator
     * 
     */
    private Integer rssi;
    /**
     * @return Signal to noise ratio
     * 
     */
    private Integer snr;
    /**
     * @return The start time of the query range
     * 
     */
    private String startTs;

    private GetWirelessSignalQualityHistoryItem() {}
    /**
     * @return The end time of the query range
     * 
     */
    public String endTs() {
        return this.endTs;
    }
    /**
     * @return Received signal strength indicator
     * 
     */
    public Integer rssi() {
        return this.rssi;
    }
    /**
     * @return Signal to noise ratio
     * 
     */
    public Integer snr() {
        return this.snr;
    }
    /**
     * @return The start time of the query range
     * 
     */
    public String startTs() {
        return this.startTs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessSignalQualityHistoryItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endTs;
        private Integer rssi;
        private Integer snr;
        private String startTs;
        public Builder() {}
        public Builder(GetWirelessSignalQualityHistoryItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTs = defaults.endTs;
    	      this.rssi = defaults.rssi;
    	      this.snr = defaults.snr;
    	      this.startTs = defaults.startTs;
        }

        @CustomType.Setter
        public Builder endTs(String endTs) {
            if (endTs == null) {
              throw new MissingRequiredPropertyException("GetWirelessSignalQualityHistoryItem", "endTs");
            }
            this.endTs = endTs;
            return this;
        }
        @CustomType.Setter
        public Builder rssi(Integer rssi) {
            if (rssi == null) {
              throw new MissingRequiredPropertyException("GetWirelessSignalQualityHistoryItem", "rssi");
            }
            this.rssi = rssi;
            return this;
        }
        @CustomType.Setter
        public Builder snr(Integer snr) {
            if (snr == null) {
              throw new MissingRequiredPropertyException("GetWirelessSignalQualityHistoryItem", "snr");
            }
            this.snr = snr;
            return this;
        }
        @CustomType.Setter
        public Builder startTs(String startTs) {
            if (startTs == null) {
              throw new MissingRequiredPropertyException("GetWirelessSignalQualityHistoryItem", "startTs");
            }
            this.startTs = startTs;
            return this;
        }
        public GetWirelessSignalQualityHistoryItem build() {
            final var _resultValue = new GetWirelessSignalQualityHistoryItem();
            _resultValue.endTs = endTs;
            _resultValue.rssi = rssi;
            _resultValue.snr = snr;
            _resultValue.startTs = startTs;
            return _resultValue;
        }
    }
}
