// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.VlanProfilesVlanNameAdaptivePolicyGroupArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VlanProfilesVlanNameArgs extends com.pulumi.resources.ResourceArgs {

    public static final VlanProfilesVlanNameArgs Empty = new VlanProfilesVlanNameArgs();

    /**
     * Adaptive Policy Group assigned to Vlan ID
     * 
     */
    @Import(name="adaptivePolicyGroup")
    private @Nullable Output<VlanProfilesVlanNameAdaptivePolicyGroupArgs> adaptivePolicyGroup;

    /**
     * @return Adaptive Policy Group assigned to Vlan ID
     * 
     */
    public Optional<Output<VlanProfilesVlanNameAdaptivePolicyGroupArgs>> adaptivePolicyGroup() {
        return Optional.ofNullable(this.adaptivePolicyGroup);
    }

    /**
     * Name of the VLAN, string length must be from 1 to 32 characters
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the VLAN, string length must be from 1 to 32 characters
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * VLAN ID
     * 
     */
    @Import(name="vlanId")
    private @Nullable Output<String> vlanId;

    /**
     * @return VLAN ID
     * 
     */
    public Optional<Output<String>> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    private VlanProfilesVlanNameArgs() {}

    private VlanProfilesVlanNameArgs(VlanProfilesVlanNameArgs $) {
        this.adaptivePolicyGroup = $.adaptivePolicyGroup;
        this.name = $.name;
        this.vlanId = $.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VlanProfilesVlanNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VlanProfilesVlanNameArgs $;

        public Builder() {
            $ = new VlanProfilesVlanNameArgs();
        }

        public Builder(VlanProfilesVlanNameArgs defaults) {
            $ = new VlanProfilesVlanNameArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adaptivePolicyGroup Adaptive Policy Group assigned to Vlan ID
         * 
         * @return builder
         * 
         */
        public Builder adaptivePolicyGroup(@Nullable Output<VlanProfilesVlanNameAdaptivePolicyGroupArgs> adaptivePolicyGroup) {
            $.adaptivePolicyGroup = adaptivePolicyGroup;
            return this;
        }

        /**
         * @param adaptivePolicyGroup Adaptive Policy Group assigned to Vlan ID
         * 
         * @return builder
         * 
         */
        public Builder adaptivePolicyGroup(VlanProfilesVlanNameAdaptivePolicyGroupArgs adaptivePolicyGroup) {
            return adaptivePolicyGroup(Output.of(adaptivePolicyGroup));
        }

        /**
         * @param name Name of the VLAN, string length must be from 1 to 32 characters
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the VLAN, string length must be from 1 to 32 characters
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param vlanId VLAN ID
         * 
         * @return builder
         * 
         */
        public Builder vlanId(@Nullable Output<String> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        /**
         * @param vlanId VLAN ID
         * 
         * @return builder
         * 
         */
        public Builder vlanId(String vlanId) {
            return vlanId(Output.of(vlanId));
        }

        public VlanProfilesVlanNameArgs build() {
            return $;
        }
    }

}
