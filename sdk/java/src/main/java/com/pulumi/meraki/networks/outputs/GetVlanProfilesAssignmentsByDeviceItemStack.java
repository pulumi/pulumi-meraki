// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVlanProfilesAssignmentsByDeviceItemStack {
    /**
     * @return ID of the Switch Stack
     * 
     */
    private String id;

    private GetVlanProfilesAssignmentsByDeviceItemStack() {}
    /**
     * @return ID of the Switch Stack
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVlanProfilesAssignmentsByDeviceItemStack defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(GetVlanProfilesAssignmentsByDeviceItemStack defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetVlanProfilesAssignmentsByDeviceItemStack", "id");
            }
            this.id = id;
            return this;
        }
        public GetVlanProfilesAssignmentsByDeviceItemStack build() {
            final var _resultValue = new GetVlanProfilesAssignmentsByDeviceItemStack();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}