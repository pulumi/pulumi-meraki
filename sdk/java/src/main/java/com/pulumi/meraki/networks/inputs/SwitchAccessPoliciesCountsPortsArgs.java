// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchAccessPoliciesCountsPortsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchAccessPoliciesCountsPortsArgs Empty = new SwitchAccessPoliciesCountsPortsArgs();

    /**
     * Number of ports in the network with this policy. For template networks, this is the number of template ports (not child ports) with this policy.
     * 
     */
    @Import(name="withThisPolicy")
    private @Nullable Output<Integer> withThisPolicy;

    /**
     * @return Number of ports in the network with this policy. For template networks, this is the number of template ports (not child ports) with this policy.
     * 
     */
    public Optional<Output<Integer>> withThisPolicy() {
        return Optional.ofNullable(this.withThisPolicy);
    }

    private SwitchAccessPoliciesCountsPortsArgs() {}

    private SwitchAccessPoliciesCountsPortsArgs(SwitchAccessPoliciesCountsPortsArgs $) {
        this.withThisPolicy = $.withThisPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchAccessPoliciesCountsPortsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchAccessPoliciesCountsPortsArgs $;

        public Builder() {
            $ = new SwitchAccessPoliciesCountsPortsArgs();
        }

        public Builder(SwitchAccessPoliciesCountsPortsArgs defaults) {
            $ = new SwitchAccessPoliciesCountsPortsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param withThisPolicy Number of ports in the network with this policy. For template networks, this is the number of template ports (not child ports) with this policy.
         * 
         * @return builder
         * 
         */
        public Builder withThisPolicy(@Nullable Output<Integer> withThisPolicy) {
            $.withThisPolicy = withThisPolicy;
            return this;
        }

        /**
         * @param withThisPolicy Number of ports in the network with this policy. For template networks, this is the number of template ports (not child ports) with this policy.
         * 
         * @return builder
         * 
         */
        public Builder withThisPolicy(Integer withThisPolicy) {
            return withThisPolicy(Output.of(withThisPolicy));
        }

        public SwitchAccessPoliciesCountsPortsArgs build() {
            return $;
        }
    }

}