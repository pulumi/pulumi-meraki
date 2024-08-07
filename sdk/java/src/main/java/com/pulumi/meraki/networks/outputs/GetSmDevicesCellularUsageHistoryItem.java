// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSmDevicesCellularUsageHistoryItem {
    /**
     * @return The amount of cellular data received by the device.
     * 
     */
    private Double received;
    /**
     * @return The amount of cellular sent received by the device.
     * 
     */
    private Double sent;
    /**
     * @return When the cellular usage data was collected.
     * 
     */
    private String ts;

    private GetSmDevicesCellularUsageHistoryItem() {}
    /**
     * @return The amount of cellular data received by the device.
     * 
     */
    public Double received() {
        return this.received;
    }
    /**
     * @return The amount of cellular sent received by the device.
     * 
     */
    public Double sent() {
        return this.sent;
    }
    /**
     * @return When the cellular usage data was collected.
     * 
     */
    public String ts() {
        return this.ts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSmDevicesCellularUsageHistoryItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double received;
        private Double sent;
        private String ts;
        public Builder() {}
        public Builder(GetSmDevicesCellularUsageHistoryItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.received = defaults.received;
    	      this.sent = defaults.sent;
    	      this.ts = defaults.ts;
        }

        @CustomType.Setter
        public Builder received(Double received) {
            if (received == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesCellularUsageHistoryItem", "received");
            }
            this.received = received;
            return this;
        }
        @CustomType.Setter
        public Builder sent(Double sent) {
            if (sent == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesCellularUsageHistoryItem", "sent");
            }
            this.sent = sent;
            return this;
        }
        @CustomType.Setter
        public Builder ts(String ts) {
            if (ts == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesCellularUsageHistoryItem", "ts");
            }
            this.ts = ts;
            return this;
        }
        public GetSmDevicesCellularUsageHistoryItem build() {
            final var _resultValue = new GetSmDevicesCellularUsageHistoryItem();
            _resultValue.received = received;
            _resultValue.sent = sent;
            _resultValue.ts = ts;
            return _resultValue;
        }
    }
}
