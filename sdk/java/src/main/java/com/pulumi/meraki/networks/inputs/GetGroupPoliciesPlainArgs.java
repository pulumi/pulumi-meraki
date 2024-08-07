// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGroupPoliciesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGroupPoliciesPlainArgs Empty = new GetGroupPoliciesPlainArgs();

    /**
     * groupPolicyId path parameter. Group policy ID
     * 
     */
    @Import(name="groupPolicyId")
    private @Nullable String groupPolicyId;

    /**
     * @return groupPolicyId path parameter. Group policy ID
     * 
     */
    public Optional<String> groupPolicyId() {
        return Optional.ofNullable(this.groupPolicyId);
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId")
    private @Nullable String networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<String> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    private GetGroupPoliciesPlainArgs() {}

    private GetGroupPoliciesPlainArgs(GetGroupPoliciesPlainArgs $) {
        this.groupPolicyId = $.groupPolicyId;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGroupPoliciesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGroupPoliciesPlainArgs $;

        public Builder() {
            $ = new GetGroupPoliciesPlainArgs();
        }

        public Builder(GetGroupPoliciesPlainArgs defaults) {
            $ = new GetGroupPoliciesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupPolicyId groupPolicyId path parameter. Group policy ID
         * 
         * @return builder
         * 
         */
        public Builder groupPolicyId(@Nullable String groupPolicyId) {
            $.groupPolicyId = groupPolicyId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable String networkId) {
            $.networkId = networkId;
            return this;
        }

        public GetGroupPoliciesPlainArgs build() {
            return $;
        }
    }

}
