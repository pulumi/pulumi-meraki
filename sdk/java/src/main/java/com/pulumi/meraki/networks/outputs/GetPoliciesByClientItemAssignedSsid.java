// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetPoliciesByClientItemAssignedSsid {
    /**
     * @return number of ssid
     * 
     */
    private Integer ssidNumber;

    private GetPoliciesByClientItemAssignedSsid() {}
    /**
     * @return number of ssid
     * 
     */
    public Integer ssidNumber() {
        return this.ssidNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPoliciesByClientItemAssignedSsid defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer ssidNumber;
        public Builder() {}
        public Builder(GetPoliciesByClientItemAssignedSsid defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ssidNumber = defaults.ssidNumber;
        }

        @CustomType.Setter
        public Builder ssidNumber(Integer ssidNumber) {
            if (ssidNumber == null) {
              throw new MissingRequiredPropertyException("GetPoliciesByClientItemAssignedSsid", "ssidNumber");
            }
            this.ssidNumber = ssidNumber;
            return this;
        }
        public GetPoliciesByClientItemAssignedSsid build() {
            final var _resultValue = new GetPoliciesByClientItemAssignedSsid();
            _resultValue.ssidNumber = ssidNumber;
            return _resultValue;
        }
    }
}