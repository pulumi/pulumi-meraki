// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetDevicesAvailabilitiesItemNetwork;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDevicesAvailabilitiesItem {
    /**
     * @return The device MAC address.
     * 
     */
    private String mac;
    /**
     * @return The device name.
     * 
     */
    private String name;
    /**
     * @return Network info.
     * 
     */
    private GetDevicesAvailabilitiesItemNetwork network;
    /**
     * @return Device product type.
     * 
     */
    private String productType;
    /**
     * @return The device serial number.
     * 
     */
    private String serial;
    /**
     * @return Status of the device. Possible values are: online, alerting, offline, dormant.
     * 
     */
    private String status;
    /**
     * @return List of custom tags for the device.
     * 
     */
    private List<String> tags;

    private GetDevicesAvailabilitiesItem() {}
    /**
     * @return The device MAC address.
     * 
     */
    public String mac() {
        return this.mac;
    }
    /**
     * @return The device name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Network info.
     * 
     */
    public GetDevicesAvailabilitiesItemNetwork network() {
        return this.network;
    }
    /**
     * @return Device product type.
     * 
     */
    public String productType() {
        return this.productType;
    }
    /**
     * @return The device serial number.
     * 
     */
    public String serial() {
        return this.serial;
    }
    /**
     * @return Status of the device. Possible values are: online, alerting, offline, dormant.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return List of custom tags for the device.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDevicesAvailabilitiesItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String mac;
        private String name;
        private GetDevicesAvailabilitiesItemNetwork network;
        private String productType;
        private String serial;
        private String status;
        private List<String> tags;
        public Builder() {}
        public Builder(GetDevicesAvailabilitiesItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mac = defaults.mac;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.productType = defaults.productType;
    	      this.serial = defaults.serial;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder mac(String mac) {
            if (mac == null) {
              throw new MissingRequiredPropertyException("GetDevicesAvailabilitiesItem", "mac");
            }
            this.mac = mac;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDevicesAvailabilitiesItem", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder network(GetDevicesAvailabilitiesItemNetwork network) {
            if (network == null) {
              throw new MissingRequiredPropertyException("GetDevicesAvailabilitiesItem", "network");
            }
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder productType(String productType) {
            if (productType == null) {
              throw new MissingRequiredPropertyException("GetDevicesAvailabilitiesItem", "productType");
            }
            this.productType = productType;
            return this;
        }
        @CustomType.Setter
        public Builder serial(String serial) {
            if (serial == null) {
              throw new MissingRequiredPropertyException("GetDevicesAvailabilitiesItem", "serial");
            }
            this.serial = serial;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetDevicesAvailabilitiesItem", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetDevicesAvailabilitiesItem", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public GetDevicesAvailabilitiesItem build() {
            final var _resultValue = new GetDevicesAvailabilitiesItem();
            _resultValue.mac = mac;
            _resultValue.name = name;
            _resultValue.network = network;
            _resultValue.productType = productType;
            _resultValue.serial = serial;
            _resultValue.status = status;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
