// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLiveToolsPingDeviceItemRequest {
    /**
     * @return Number of pings to send
     * 
     */
    private Integer countR;
    /**
     * @return Device serial number
     * 
     */
    private String serial;
    /**
     * @return IP address or FQDN to ping
     * 
     */
    private String target;

    private GetLiveToolsPingDeviceItemRequest() {}
    /**
     * @return Number of pings to send
     * 
     */
    public Integer countR() {
        return this.countR;
    }
    /**
     * @return Device serial number
     * 
     */
    public String serial() {
        return this.serial;
    }
    /**
     * @return IP address or FQDN to ping
     * 
     */
    public String target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLiveToolsPingDeviceItemRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer countR;
        private String serial;
        private String target;
        public Builder() {}
        public Builder(GetLiveToolsPingDeviceItemRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countR = defaults.countR;
    	      this.serial = defaults.serial;
    	      this.target = defaults.target;
        }

        @CustomType.Setter
        public Builder countR(Integer countR) {
            if (countR == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsPingDeviceItemRequest", "countR");
            }
            this.countR = countR;
            return this;
        }
        @CustomType.Setter
        public Builder serial(String serial) {
            if (serial == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsPingDeviceItemRequest", "serial");
            }
            this.serial = serial;
            return this;
        }
        @CustomType.Setter
        public Builder target(String target) {
            if (target == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsPingDeviceItemRequest", "target");
            }
            this.target = target;
            return this;
        }
        public GetLiveToolsPingDeviceItemRequest build() {
            final var _resultValue = new GetLiveToolsPingDeviceItemRequest();
            _resultValue.countR = countR;
            _resultValue.serial = serial;
            _resultValue.target = target;
            return _resultValue;
        }
    }
}