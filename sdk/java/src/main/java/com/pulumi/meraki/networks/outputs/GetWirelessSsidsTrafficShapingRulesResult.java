// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetWirelessSsidsTrafficShapingRulesItem;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWirelessSsidsTrafficShapingRulesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private GetWirelessSsidsTrafficShapingRulesItem item;
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    private String networkId;
    /**
     * @return number path parameter.
     * 
     */
    private String number;

    private GetWirelessSsidsTrafficShapingRulesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public GetWirelessSsidsTrafficShapingRulesItem item() {
        return this.item;
    }
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public String networkId() {
        return this.networkId;
    }
    /**
     * @return number path parameter.
     * 
     */
    public String number() {
        return this.number;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessSsidsTrafficShapingRulesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private GetWirelessSsidsTrafficShapingRulesItem item;
        private String networkId;
        private String number;
        public Builder() {}
        public Builder(GetWirelessSsidsTrafficShapingRulesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.item = defaults.item;
    	      this.networkId = defaults.networkId;
    	      this.number = defaults.number;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsTrafficShapingRulesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetWirelessSsidsTrafficShapingRulesItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsTrafficShapingRulesResult", "item");
            }
            this.item = item;
            return this;
        }
        @CustomType.Setter
        public Builder networkId(String networkId) {
            if (networkId == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsTrafficShapingRulesResult", "networkId");
            }
            this.networkId = networkId;
            return this;
        }
        @CustomType.Setter
        public Builder number(String number) {
            if (number == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsTrafficShapingRulesResult", "number");
            }
            this.number = number;
            return this;
        }
        public GetWirelessSsidsTrafficShapingRulesResult build() {
            final var _resultValue = new GetWirelessSsidsTrafficShapingRulesResult();
            _resultValue.id = id;
            _resultValue.item = item;
            _resultValue.networkId = networkId;
            _resultValue.number = number;
            return _resultValue;
        }
    }
}