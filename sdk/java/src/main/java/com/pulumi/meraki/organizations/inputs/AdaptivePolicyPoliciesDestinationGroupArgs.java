// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AdaptivePolicyPoliciesDestinationGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final AdaptivePolicyPoliciesDestinationGroupArgs Empty = new AdaptivePolicyPoliciesDestinationGroupArgs();

    /**
     * The ID of the destination adaptive policy group
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the destination adaptive policy group
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the destination adaptive policy group
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the destination adaptive policy group
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The SGT of the destination adaptive policy group
     * 
     */
    @Import(name="sgt")
    private @Nullable Output<Integer> sgt;

    /**
     * @return The SGT of the destination adaptive policy group
     * 
     */
    public Optional<Output<Integer>> sgt() {
        return Optional.ofNullable(this.sgt);
    }

    private AdaptivePolicyPoliciesDestinationGroupArgs() {}

    private AdaptivePolicyPoliciesDestinationGroupArgs(AdaptivePolicyPoliciesDestinationGroupArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.sgt = $.sgt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdaptivePolicyPoliciesDestinationGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdaptivePolicyPoliciesDestinationGroupArgs $;

        public Builder() {
            $ = new AdaptivePolicyPoliciesDestinationGroupArgs();
        }

        public Builder(AdaptivePolicyPoliciesDestinationGroupArgs defaults) {
            $ = new AdaptivePolicyPoliciesDestinationGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the destination adaptive policy group
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the destination adaptive policy group
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the destination adaptive policy group
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the destination adaptive policy group
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sgt The SGT of the destination adaptive policy group
         * 
         * @return builder
         * 
         */
        public Builder sgt(@Nullable Output<Integer> sgt) {
            $.sgt = sgt;
            return this;
        }

        /**
         * @param sgt The SGT of the destination adaptive policy group
         * 
         * @return builder
         * 
         */
        public Builder sgt(Integer sgt) {
            return sgt(Output.of(sgt));
        }

        public AdaptivePolicyPoliciesDestinationGroupArgs build() {
            return $;
        }
    }

}
