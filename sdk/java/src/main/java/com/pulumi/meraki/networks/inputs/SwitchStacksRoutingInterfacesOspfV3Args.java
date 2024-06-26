// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchStacksRoutingInterfacesOspfV3Args extends com.pulumi.resources.ResourceArgs {

    public static final SwitchStacksRoutingInterfacesOspfV3Args Empty = new SwitchStacksRoutingInterfacesOspfV3Args();

    /**
     * Area id
     * 
     */
    @Import(name="area")
    private @Nullable Output<String> area;

    /**
     * @return Area id
     * 
     */
    public Optional<Output<String>> area() {
        return Optional.ofNullable(this.area);
    }

    /**
     * OSPF Cost
     * 
     */
    @Import(name="cost")
    private @Nullable Output<Integer> cost;

    /**
     * @return OSPF Cost
     * 
     */
    public Optional<Output<Integer>> cost() {
        return Optional.ofNullable(this.cost);
    }

    /**
     * Disable sending Hello packets on this interface&#39;s IPv6 area
     * 
     */
    @Import(name="isPassiveEnabled")
    private @Nullable Output<Boolean> isPassiveEnabled;

    /**
     * @return Disable sending Hello packets on this interface&#39;s IPv6 area
     * 
     */
    public Optional<Output<Boolean>> isPassiveEnabled() {
        return Optional.ofNullable(this.isPassiveEnabled);
    }

    private SwitchStacksRoutingInterfacesOspfV3Args() {}

    private SwitchStacksRoutingInterfacesOspfV3Args(SwitchStacksRoutingInterfacesOspfV3Args $) {
        this.area = $.area;
        this.cost = $.cost;
        this.isPassiveEnabled = $.isPassiveEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchStacksRoutingInterfacesOspfV3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchStacksRoutingInterfacesOspfV3Args $;

        public Builder() {
            $ = new SwitchStacksRoutingInterfacesOspfV3Args();
        }

        public Builder(SwitchStacksRoutingInterfacesOspfV3Args defaults) {
            $ = new SwitchStacksRoutingInterfacesOspfV3Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param area Area id
         * 
         * @return builder
         * 
         */
        public Builder area(@Nullable Output<String> area) {
            $.area = area;
            return this;
        }

        /**
         * @param area Area id
         * 
         * @return builder
         * 
         */
        public Builder area(String area) {
            return area(Output.of(area));
        }

        /**
         * @param cost OSPF Cost
         * 
         * @return builder
         * 
         */
        public Builder cost(@Nullable Output<Integer> cost) {
            $.cost = cost;
            return this;
        }

        /**
         * @param cost OSPF Cost
         * 
         * @return builder
         * 
         */
        public Builder cost(Integer cost) {
            return cost(Output.of(cost));
        }

        /**
         * @param isPassiveEnabled Disable sending Hello packets on this interface&#39;s IPv6 area
         * 
         * @return builder
         * 
         */
        public Builder isPassiveEnabled(@Nullable Output<Boolean> isPassiveEnabled) {
            $.isPassiveEnabled = isPassiveEnabled;
            return this;
        }

        /**
         * @param isPassiveEnabled Disable sending Hello packets on this interface&#39;s IPv6 area
         * 
         * @return builder
         * 
         */
        public Builder isPassiveEnabled(Boolean isPassiveEnabled) {
            return isPassiveEnabled(Output.of(isPassiveEnabled));
        }

        public SwitchStacksRoutingInterfacesOspfV3Args build() {
            return $;
        }
    }

}
