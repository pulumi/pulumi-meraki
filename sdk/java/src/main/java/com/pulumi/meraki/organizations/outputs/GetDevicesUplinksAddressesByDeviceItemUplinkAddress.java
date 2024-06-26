// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetDevicesUplinksAddressesByDeviceItemUplinkAddressPublic;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDevicesUplinksAddressesByDeviceItemUplinkAddress {
    /**
     * @return Device uplink address.
     * 
     */
    private String address;
    /**
     * @return Indicates how the device uplink address is assigned. Available options are: static, dynamic.
     * 
     */
    private String assignmentMode;
    /**
     * @return Device uplink gateway address.
     * 
     */
    private String gateway;
    /**
     * @return Type of address for the device uplink. Available options are: ipv4, ipv6.
     * 
     */
    private String protocol;
    /**
     * @return Public interface information.
     * 
     */
    private GetDevicesUplinksAddressesByDeviceItemUplinkAddressPublic public_;

    private GetDevicesUplinksAddressesByDeviceItemUplinkAddress() {}
    /**
     * @return Device uplink address.
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return Indicates how the device uplink address is assigned. Available options are: static, dynamic.
     * 
     */
    public String assignmentMode() {
        return this.assignmentMode;
    }
    /**
     * @return Device uplink gateway address.
     * 
     */
    public String gateway() {
        return this.gateway;
    }
    /**
     * @return Type of address for the device uplink. Available options are: ipv4, ipv6.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return Public interface information.
     * 
     */
    public GetDevicesUplinksAddressesByDeviceItemUplinkAddressPublic public_() {
        return this.public_;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDevicesUplinksAddressesByDeviceItemUplinkAddress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private String assignmentMode;
        private String gateway;
        private String protocol;
        private GetDevicesUplinksAddressesByDeviceItemUplinkAddressPublic public_;
        public Builder() {}
        public Builder(GetDevicesUplinksAddressesByDeviceItemUplinkAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.assignmentMode = defaults.assignmentMode;
    	      this.gateway = defaults.gateway;
    	      this.protocol = defaults.protocol;
    	      this.public_ = defaults.public_;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("GetDevicesUplinksAddressesByDeviceItemUplinkAddress", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder assignmentMode(String assignmentMode) {
            if (assignmentMode == null) {
              throw new MissingRequiredPropertyException("GetDevicesUplinksAddressesByDeviceItemUplinkAddress", "assignmentMode");
            }
            this.assignmentMode = assignmentMode;
            return this;
        }
        @CustomType.Setter
        public Builder gateway(String gateway) {
            if (gateway == null) {
              throw new MissingRequiredPropertyException("GetDevicesUplinksAddressesByDeviceItemUplinkAddress", "gateway");
            }
            this.gateway = gateway;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("GetDevicesUplinksAddressesByDeviceItemUplinkAddress", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter("public")
        public Builder public_(GetDevicesUplinksAddressesByDeviceItemUplinkAddressPublic public_) {
            if (public_ == null) {
              throw new MissingRequiredPropertyException("GetDevicesUplinksAddressesByDeviceItemUplinkAddress", "public_");
            }
            this.public_ = public_;
            return this;
        }
        public GetDevicesUplinksAddressesByDeviceItemUplinkAddress build() {
            final var _resultValue = new GetDevicesUplinksAddressesByDeviceItemUplinkAddress();
            _resultValue.address = address;
            _resultValue.assignmentMode = assignmentMode;
            _resultValue.gateway = gateway;
            _resultValue.protocol = protocol;
            _resultValue.public_ = public_;
            return _resultValue;
        }
    }
}
