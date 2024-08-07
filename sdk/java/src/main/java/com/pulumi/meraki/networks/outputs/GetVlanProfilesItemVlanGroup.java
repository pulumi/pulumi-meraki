// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVlanProfilesItemVlanGroup {
    /**
     * @return Name of the VLAN, string length must be from 1 to 32 characters
     * 
     */
    private String name;
    /**
     * @return Comma-separated VLAN IDs or ID ranges
     * 
     */
    private String vlanIds;

    private GetVlanProfilesItemVlanGroup() {}
    /**
     * @return Name of the VLAN, string length must be from 1 to 32 characters
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Comma-separated VLAN IDs or ID ranges
     * 
     */
    public String vlanIds() {
        return this.vlanIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVlanProfilesItemVlanGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String vlanIds;
        public Builder() {}
        public Builder(GetVlanProfilesItemVlanGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.vlanIds = defaults.vlanIds;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetVlanProfilesItemVlanGroup", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder vlanIds(String vlanIds) {
            if (vlanIds == null) {
              throw new MissingRequiredPropertyException("GetVlanProfilesItemVlanGroup", "vlanIds");
            }
            this.vlanIds = vlanIds;
            return this;
        }
        public GetVlanProfilesItemVlanGroup build() {
            final var _resultValue = new GetVlanProfilesItemVlanGroup();
            _resultValue.name = name;
            _resultValue.vlanIds = vlanIds;
            return _resultValue;
        }
    }
}
