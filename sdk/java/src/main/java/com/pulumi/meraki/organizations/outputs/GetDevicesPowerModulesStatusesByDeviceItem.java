// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetDevicesPowerModulesStatusesByDeviceItemNetwork;
import com.pulumi.meraki.organizations.outputs.GetDevicesPowerModulesStatusesByDeviceItemSlot;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDevicesPowerModulesStatusesByDeviceItem {
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
    private GetDevicesPowerModulesStatusesByDeviceItemNetwork network;
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
     * @return Information for the device&#39;s AC power supplies.
     * 
     */
    private List<GetDevicesPowerModulesStatusesByDeviceItemSlot> slots;
    /**
     * @return List of custom tags for the device.
     * 
     */
    private List<String> tags;

    private GetDevicesPowerModulesStatusesByDeviceItem() {}
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
    public GetDevicesPowerModulesStatusesByDeviceItemNetwork network() {
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
     * @return Information for the device&#39;s AC power supplies.
     * 
     */
    public List<GetDevicesPowerModulesStatusesByDeviceItemSlot> slots() {
        return this.slots;
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

    public static Builder builder(GetDevicesPowerModulesStatusesByDeviceItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String mac;
        private String name;
        private GetDevicesPowerModulesStatusesByDeviceItemNetwork network;
        private String productType;
        private String serial;
        private List<GetDevicesPowerModulesStatusesByDeviceItemSlot> slots;
        private List<String> tags;
        public Builder() {}
        public Builder(GetDevicesPowerModulesStatusesByDeviceItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mac = defaults.mac;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.productType = defaults.productType;
    	      this.serial = defaults.serial;
    	      this.slots = defaults.slots;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder mac(String mac) {
            if (mac == null) {
              throw new MissingRequiredPropertyException("GetDevicesPowerModulesStatusesByDeviceItem", "mac");
            }
            this.mac = mac;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDevicesPowerModulesStatusesByDeviceItem", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder network(GetDevicesPowerModulesStatusesByDeviceItemNetwork network) {
            if (network == null) {
              throw new MissingRequiredPropertyException("GetDevicesPowerModulesStatusesByDeviceItem", "network");
            }
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder productType(String productType) {
            if (productType == null) {
              throw new MissingRequiredPropertyException("GetDevicesPowerModulesStatusesByDeviceItem", "productType");
            }
            this.productType = productType;
            return this;
        }
        @CustomType.Setter
        public Builder serial(String serial) {
            if (serial == null) {
              throw new MissingRequiredPropertyException("GetDevicesPowerModulesStatusesByDeviceItem", "serial");
            }
            this.serial = serial;
            return this;
        }
        @CustomType.Setter
        public Builder slots(List<GetDevicesPowerModulesStatusesByDeviceItemSlot> slots) {
            if (slots == null) {
              throw new MissingRequiredPropertyException("GetDevicesPowerModulesStatusesByDeviceItem", "slots");
            }
            this.slots = slots;
            return this;
        }
        public Builder slots(GetDevicesPowerModulesStatusesByDeviceItemSlot... slots) {
            return slots(List.of(slots));
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetDevicesPowerModulesStatusesByDeviceItem", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public GetDevicesPowerModulesStatusesByDeviceItem build() {
            final var _resultValue = new GetDevicesPowerModulesStatusesByDeviceItem();
            _resultValue.mac = mac;
            _resultValue.name = name;
            _resultValue.network = network;
            _resultValue.productType = productType;
            _resultValue.serial = serial;
            _resultValue.slots = slots;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
