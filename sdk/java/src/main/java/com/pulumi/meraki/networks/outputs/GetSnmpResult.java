// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetSnmpItem;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSnmpResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private GetSnmpItem item;
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    private String networkId;

    private GetSnmpResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public GetSnmpItem item() {
        return this.item;
    }
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public String networkId() {
        return this.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnmpResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private GetSnmpItem item;
        private String networkId;
        public Builder() {}
        public Builder(GetSnmpResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.item = defaults.item;
    	      this.networkId = defaults.networkId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSnmpResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetSnmpItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetSnmpResult", "item");
            }
            this.item = item;
            return this;
        }
        @CustomType.Setter
        public Builder networkId(String networkId) {
            if (networkId == null) {
              throw new MissingRequiredPropertyException("GetSnmpResult", "networkId");
            }
            this.networkId = networkId;
            return this;
        }
        public GetSnmpResult build() {
            final var _resultValue = new GetSnmpResult();
            _resultValue.id = id;
            _resultValue.item = item;
            _resultValue.networkId = networkId;
            return _resultValue;
        }
    }
}