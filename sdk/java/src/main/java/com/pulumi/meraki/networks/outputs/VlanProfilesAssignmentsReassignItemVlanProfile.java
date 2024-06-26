// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VlanProfilesAssignmentsReassignItemVlanProfile {
    /**
     * @return IName of the VLAN Profile
     * 
     */
    private @Nullable String iname;
    /**
     * @return Name of the VLAN Profile
     * 
     */
    private @Nullable String name;

    private VlanProfilesAssignmentsReassignItemVlanProfile() {}
    /**
     * @return IName of the VLAN Profile
     * 
     */
    public Optional<String> iname() {
        return Optional.ofNullable(this.iname);
    }
    /**
     * @return Name of the VLAN Profile
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VlanProfilesAssignmentsReassignItemVlanProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String iname;
        private @Nullable String name;
        public Builder() {}
        public Builder(VlanProfilesAssignmentsReassignItemVlanProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iname = defaults.iname;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder iname(@Nullable String iname) {

            this.iname = iname;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        public VlanProfilesAssignmentsReassignItemVlanProfile build() {
            final var _resultValue = new VlanProfilesAssignmentsReassignItemVlanProfile();
            _resultValue.iname = iname;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
