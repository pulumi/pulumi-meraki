// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSensorRelationshipsItemDevice {
    /**
     * @return The name of the device
     * 
     */
    private String name;
    /**
     * @return The product type of the device
     * 
     */
    private String productType;
    /**
     * @return The serial of the device
     * 
     */
    private String serial;

    private GetSensorRelationshipsItemDevice() {}
    /**
     * @return The name of the device
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The product type of the device
     * 
     */
    public String productType() {
        return this.productType;
    }
    /**
     * @return The serial of the device
     * 
     */
    public String serial() {
        return this.serial;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSensorRelationshipsItemDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String productType;
        private String serial;
        public Builder() {}
        public Builder(GetSensorRelationshipsItemDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.productType = defaults.productType;
    	      this.serial = defaults.serial;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSensorRelationshipsItemDevice", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder productType(String productType) {
            if (productType == null) {
              throw new MissingRequiredPropertyException("GetSensorRelationshipsItemDevice", "productType");
            }
            this.productType = productType;
            return this;
        }
        @CustomType.Setter
        public Builder serial(String serial) {
            if (serial == null) {
              throw new MissingRequiredPropertyException("GetSensorRelationshipsItemDevice", "serial");
            }
            this.serial = serial;
            return this;
        }
        public GetSensorRelationshipsItemDevice build() {
            final var _resultValue = new GetSensorRelationshipsItemDevice();
            _resultValue.name = name;
            _resultValue.productType = productType;
            _resultValue.serial = serial;
            return _resultValue;
        }
    }
}