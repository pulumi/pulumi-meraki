// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetWirelessDevicesChannelUtilizationByNetworkItemByBandNonWifi;
import com.pulumi.meraki.organizations.outputs.GetWirelessDevicesChannelUtilizationByNetworkItemByBandTotal;
import com.pulumi.meraki.organizations.outputs.GetWirelessDevicesChannelUtilizationByNetworkItemByBandWifi;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWirelessDevicesChannelUtilizationByNetworkItemByBand {
    /**
     * @return The band for the given metrics.
     * 
     */
    private String band;
    /**
     * @return An object containing non-wifi utilization.
     * 
     */
    private GetWirelessDevicesChannelUtilizationByNetworkItemByBandNonWifi nonWifi;
    /**
     * @return An object containing total channel utilization.
     * 
     */
    private GetWirelessDevicesChannelUtilizationByNetworkItemByBandTotal total;
    /**
     * @return An object containing wifi utilization.
     * 
     */
    private GetWirelessDevicesChannelUtilizationByNetworkItemByBandWifi wifi;

    private GetWirelessDevicesChannelUtilizationByNetworkItemByBand() {}
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
    public GetWirelessDevicesChannelUtilizationByNetworkItemByBandNonWifi nonWifi() {
        return this.nonWifi;
    }
    /**
     * @return An object containing total channel utilization.
     * 
     */
    public GetWirelessDevicesChannelUtilizationByNetworkItemByBandTotal total() {
        return this.total;
    }
    /**
     * @return An object containing wifi utilization.
     * 
     */
    public GetWirelessDevicesChannelUtilizationByNetworkItemByBandWifi wifi() {
        return this.wifi;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessDevicesChannelUtilizationByNetworkItemByBand defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String band;
        private GetWirelessDevicesChannelUtilizationByNetworkItemByBandNonWifi nonWifi;
        private GetWirelessDevicesChannelUtilizationByNetworkItemByBandTotal total;
        private GetWirelessDevicesChannelUtilizationByNetworkItemByBandWifi wifi;
        public Builder() {}
        public Builder(GetWirelessDevicesChannelUtilizationByNetworkItemByBand defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.band = defaults.band;
    	      this.nonWifi = defaults.nonWifi;
    	      this.total = defaults.total;
    	      this.wifi = defaults.wifi;
        }

        @CustomType.Setter
        public Builder band(String band) {
            if (band == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesChannelUtilizationByNetworkItemByBand", "band");
            }
            this.band = band;
            return this;
        }
        @CustomType.Setter
        public Builder nonWifi(GetWirelessDevicesChannelUtilizationByNetworkItemByBandNonWifi nonWifi) {
            if (nonWifi == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesChannelUtilizationByNetworkItemByBand", "nonWifi");
            }
            this.nonWifi = nonWifi;
            return this;
        }
        @CustomType.Setter
        public Builder total(GetWirelessDevicesChannelUtilizationByNetworkItemByBandTotal total) {
            if (total == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesChannelUtilizationByNetworkItemByBand", "total");
            }
            this.total = total;
            return this;
        }
        @CustomType.Setter
        public Builder wifi(GetWirelessDevicesChannelUtilizationByNetworkItemByBandWifi wifi) {
            if (wifi == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesChannelUtilizationByNetworkItemByBand", "wifi");
            }
            this.wifi = wifi;
            return this;
        }
        public GetWirelessDevicesChannelUtilizationByNetworkItemByBand build() {
            final var _resultValue = new GetWirelessDevicesChannelUtilizationByNetworkItemByBand();
            _resultValue.band = band;
            _resultValue.nonWifi = nonWifi;
            _resultValue.total = total;
            _resultValue.wifi = wifi;
            return _resultValue;
        }
    }
}
