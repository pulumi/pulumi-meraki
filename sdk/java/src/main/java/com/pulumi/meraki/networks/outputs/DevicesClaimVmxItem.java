// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.DevicesClaimVmxItemDetail;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DevicesClaimVmxItem {
    /**
     * @return Physical address of the device
     * 
     */
    private @Nullable String address;
    /**
     * @return Additional device information
     * 
     */
    private @Nullable List<DevicesClaimVmxItemDetail> details;
    /**
     * @return Firmware version of the device
     * 
     */
    private @Nullable String firmware;
    /**
     * @return IMEI of the device, if applicable
     * 
     */
    private @Nullable String imei;
    /**
     * @return LAN IP address of the device
     * 
     */
    private @Nullable String lanIp;
    /**
     * @return Latitude of the device
     * 
     */
    private @Nullable Double lat;
    /**
     * @return Longitude of the device
     * 
     */
    private @Nullable Double lng;
    /**
     * @return MAC address of the device
     * 
     */
    private @Nullable String mac;
    /**
     * @return Model of the device
     * 
     */
    private @Nullable String model;
    /**
     * @return Name of the device
     * 
     */
    private @Nullable String name;
    /**
     * @return ID of the network the device belongs to
     * 
     */
    private @Nullable String networkId;
    /**
     * @return Notes for the device, limited to 255 characters
     * 
     */
    private @Nullable String notes;
    /**
     * @return Product type of the device
     * 
     */
    private @Nullable String productType;
    /**
     * @return Serial number of the device
     * 
     */
    private @Nullable String serial;
    /**
     * @return List of tags assigned to the device
     * 
     */
    private @Nullable List<String> tags;

    private DevicesClaimVmxItem() {}
    /**
     * @return Physical address of the device
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    /**
     * @return Additional device information
     * 
     */
    public List<DevicesClaimVmxItemDetail> details() {
        return this.details == null ? List.of() : this.details;
    }
    /**
     * @return Firmware version of the device
     * 
     */
    public Optional<String> firmware() {
        return Optional.ofNullable(this.firmware);
    }
    /**
     * @return IMEI of the device, if applicable
     * 
     */
    public Optional<String> imei() {
        return Optional.ofNullable(this.imei);
    }
    /**
     * @return LAN IP address of the device
     * 
     */
    public Optional<String> lanIp() {
        return Optional.ofNullable(this.lanIp);
    }
    /**
     * @return Latitude of the device
     * 
     */
    public Optional<Double> lat() {
        return Optional.ofNullable(this.lat);
    }
    /**
     * @return Longitude of the device
     * 
     */
    public Optional<Double> lng() {
        return Optional.ofNullable(this.lng);
    }
    /**
     * @return MAC address of the device
     * 
     */
    public Optional<String> mac() {
        return Optional.ofNullable(this.mac);
    }
    /**
     * @return Model of the device
     * 
     */
    public Optional<String> model() {
        return Optional.ofNullable(this.model);
    }
    /**
     * @return Name of the device
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return ID of the network the device belongs to
     * 
     */
    public Optional<String> networkId() {
        return Optional.ofNullable(this.networkId);
    }
    /**
     * @return Notes for the device, limited to 255 characters
     * 
     */
    public Optional<String> notes() {
        return Optional.ofNullable(this.notes);
    }
    /**
     * @return Product type of the device
     * 
     */
    public Optional<String> productType() {
        return Optional.ofNullable(this.productType);
    }
    /**
     * @return Serial number of the device
     * 
     */
    public Optional<String> serial() {
        return Optional.ofNullable(this.serial);
    }
    /**
     * @return List of tags assigned to the device
     * 
     */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevicesClaimVmxItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String address;
        private @Nullable List<DevicesClaimVmxItemDetail> details;
        private @Nullable String firmware;
        private @Nullable String imei;
        private @Nullable String lanIp;
        private @Nullable Double lat;
        private @Nullable Double lng;
        private @Nullable String mac;
        private @Nullable String model;
        private @Nullable String name;
        private @Nullable String networkId;
        private @Nullable String notes;
        private @Nullable String productType;
        private @Nullable String serial;
        private @Nullable List<String> tags;
        public Builder() {}
        public Builder(DevicesClaimVmxItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.details = defaults.details;
    	      this.firmware = defaults.firmware;
    	      this.imei = defaults.imei;
    	      this.lanIp = defaults.lanIp;
    	      this.lat = defaults.lat;
    	      this.lng = defaults.lng;
    	      this.mac = defaults.mac;
    	      this.model = defaults.model;
    	      this.name = defaults.name;
    	      this.networkId = defaults.networkId;
    	      this.notes = defaults.notes;
    	      this.productType = defaults.productType;
    	      this.serial = defaults.serial;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder address(@Nullable String address) {

            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder details(@Nullable List<DevicesClaimVmxItemDetail> details) {

            this.details = details;
            return this;
        }
        public Builder details(DevicesClaimVmxItemDetail... details) {
            return details(List.of(details));
        }
        @CustomType.Setter
        public Builder firmware(@Nullable String firmware) {

            this.firmware = firmware;
            return this;
        }
        @CustomType.Setter
        public Builder imei(@Nullable String imei) {

            this.imei = imei;
            return this;
        }
        @CustomType.Setter
        public Builder lanIp(@Nullable String lanIp) {

            this.lanIp = lanIp;
            return this;
        }
        @CustomType.Setter
        public Builder lat(@Nullable Double lat) {

            this.lat = lat;
            return this;
        }
        @CustomType.Setter
        public Builder lng(@Nullable Double lng) {

            this.lng = lng;
            return this;
        }
        @CustomType.Setter
        public Builder mac(@Nullable String mac) {

            this.mac = mac;
            return this;
        }
        @CustomType.Setter
        public Builder model(@Nullable String model) {

            this.model = model;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder networkId(@Nullable String networkId) {

            this.networkId = networkId;
            return this;
        }
        @CustomType.Setter
        public Builder notes(@Nullable String notes) {

            this.notes = notes;
            return this;
        }
        @CustomType.Setter
        public Builder productType(@Nullable String productType) {

            this.productType = productType;
            return this;
        }
        @CustomType.Setter
        public Builder serial(@Nullable String serial) {

            this.serial = serial;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {

            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public DevicesClaimVmxItem build() {
            final var _resultValue = new DevicesClaimVmxItem();
            _resultValue.address = address;
            _resultValue.details = details;
            _resultValue.firmware = firmware;
            _resultValue.imei = imei;
            _resultValue.lanIp = lanIp;
            _resultValue.lat = lat;
            _resultValue.lng = lng;
            _resultValue.mac = mac;
            _resultValue.model = model;
            _resultValue.name = name;
            _resultValue.networkId = networkId;
            _resultValue.notes = notes;
            _resultValue.productType = productType;
            _resultValue.serial = serial;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}