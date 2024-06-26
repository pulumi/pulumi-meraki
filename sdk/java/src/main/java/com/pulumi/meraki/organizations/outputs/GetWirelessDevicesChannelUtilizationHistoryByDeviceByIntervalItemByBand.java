// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBandNonWifi;
import com.pulumi.meraki.organizations.outputs.GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBandTotal;
import com.pulumi.meraki.organizations.outputs.GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBandWifi;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBand {
    /**
     * @return The band for the given metrics.
     * 
     */
    private String band;
    /**
     * @return An object containing non-wifi utilization.
     * 
     */
    private GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBandNonWifi nonWifi;
    /**
     * @return An object containing total channel utilization.
     * 
     */
    private GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBandTotal total;
    /**
     * @return An object containing wifi utilization.
     * 
     */
    private GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBandWifi wifi;

    private GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBand() {}
    /**
     * @return The band for the given metrics.
     * 
     */
    public String band() {
        return this.band;
    }
    /**
     * @return An object containing non-wifi utilization.
     * 
     */
    public GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBandNonWifi nonWifi() {
        return this.nonWifi;
    }
    /**
     * @return An object containing total channel utilization.
     * 
     */
    public GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBandTotal total() {
        return this.total;
    }
    /**
     * @return An object containing wifi utilization.
     * 
     */
    public GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBandWifi wifi() {
        return this.wifi;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBand defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String band;
        private GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBandNonWifi nonWifi;
        private GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBandTotal total;
        private GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBandWifi wifi;
        public Builder() {}
        public Builder(GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBand defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.band = defaults.band;
    	      this.nonWifi = defaults.nonWifi;
    	      this.total = defaults.total;
    	      this.wifi = defaults.wifi;
        }

        @CustomType.Setter
        public Builder band(String band) {
            if (band == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBand", "band");
            }
            this.band = band;
            return this;
        }
        @CustomType.Setter
        public Builder nonWifi(GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBandNonWifi nonWifi) {
            if (nonWifi == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBand", "nonWifi");
            }
            this.nonWifi = nonWifi;
            return this;
        }
        @CustomType.Setter
        public Builder total(GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBandTotal total) {
            if (total == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBand", "total");
            }
            this.total = total;
            return this;
        }
        @CustomType.Setter
        public Builder wifi(GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBandWifi wifi) {
            if (wifi == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBand", "wifi");
            }
            this.wifi = wifi;
            return this;
        }
        public GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBand build() {
            final var _resultValue = new GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBand();
            _resultValue.band = band;
            _resultValue.nonWifi = nonWifi;
            _resultValue.total = total;
            _resultValue.wifi = wifi;
            return _resultValue;
        }
    }
}
