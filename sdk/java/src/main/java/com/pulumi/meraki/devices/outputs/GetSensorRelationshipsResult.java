// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.devices.outputs.GetSensorRelationshipsItem;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSensorRelationshipsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private GetSensorRelationshipsItem item;
    /**
     * @return serial path parameter.
     * 
     */
    private String serial;

    private GetSensorRelationshipsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public GetSensorRelationshipsItem item() {
        return this.item;
    }
    /**
     * @return serial path parameter.
     * 
     */
    public String serial() {
        return this.serial;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSensorRelationshipsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private GetSensorRelationshipsItem item;
        private String serial;
        public Builder() {}
        public Builder(GetSensorRelationshipsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.item = defaults.item;
    	      this.serial = defaults.serial;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSensorRelationshipsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetSensorRelationshipsItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetSensorRelationshipsResult", "item");
            }
            this.item = item;
            return this;
        }
        @CustomType.Setter
        public Builder serial(String serial) {
            if (serial == null) {
              throw new MissingRequiredPropertyException("GetSensorRelationshipsResult", "serial");
            }
            this.serial = serial;
            return this;
        }
        public GetSensorRelationshipsResult build() {
            final var _resultValue = new GetSensorRelationshipsResult();
            _resultValue.id = id;
            _resultValue.item = item;
            _resultValue.serial = serial;
            return _resultValue;
        }
    }
}