// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.organizations.inputs.AdaptivePolicyPoliciesAclArgs;
import com.pulumi.meraki.organizations.inputs.AdaptivePolicyPoliciesDestinationGroupArgs;
import com.pulumi.meraki.organizations.inputs.AdaptivePolicyPoliciesSourceGroupArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AdaptivePolicyPoliciesState extends com.pulumi.resources.ResourceArgs {

    public static final AdaptivePolicyPoliciesState Empty = new AdaptivePolicyPoliciesState();

    /**
     * An ordered array of adaptive policy ACLs (each requires one unique attribute) that apply to this policy (default: [])
     * 
     */
    @Import(name="acls")
    private @Nullable Output<List<AdaptivePolicyPoliciesAclArgs>> acls;

    /**
     * @return An ordered array of adaptive policy ACLs (each requires one unique attribute) that apply to this policy (default: [])
     * 
     */
    public Optional<Output<List<AdaptivePolicyPoliciesAclArgs>>> acls() {
        return Optional.ofNullable(this.acls);
    }

    @Import(name="adaptivePolicyId")
    private @Nullable Output<String> adaptivePolicyId;

    public Optional<Output<String>> adaptivePolicyId() {
        return Optional.ofNullable(this.adaptivePolicyId);
    }

    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The destination adaptive policy group (requires one unique attribute)
     * 
     */
    @Import(name="destinationGroup")
    private @Nullable Output<AdaptivePolicyPoliciesDestinationGroupArgs> destinationGroup;

    /**
     * @return The destination adaptive policy group (requires one unique attribute)
     * 
     */
    public Optional<Output<AdaptivePolicyPoliciesDestinationGroupArgs>> destinationGroup() {
        return Optional.ofNullable(this.destinationGroup);
    }

    /**
     * The rule to apply if there is no matching ACL (default: &#34;default&#34;)
     * 
     */
    @Import(name="lastEntryRule")
    private @Nullable Output<String> lastEntryRule;

    /**
     * @return The rule to apply if there is no matching ACL (default: &#34;default&#34;)
     * 
     */
    public Optional<Output<String>> lastEntryRule() {
        return Optional.ofNullable(this.lastEntryRule);
    }

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    /**
     * The source adaptive policy group (requires one unique attribute)
     * 
     */
    @Import(name="sourceGroup")
    private @Nullable Output<AdaptivePolicyPoliciesSourceGroupArgs> sourceGroup;

    /**
     * @return The source adaptive policy group (requires one unique attribute)
     * 
     */
    public Optional<Output<AdaptivePolicyPoliciesSourceGroupArgs>> sourceGroup() {
        return Optional.ofNullable(this.sourceGroup);
    }

    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    private AdaptivePolicyPoliciesState() {}

    private AdaptivePolicyPoliciesState(AdaptivePolicyPoliciesState $) {
        this.acls = $.acls;
        this.adaptivePolicyId = $.adaptivePolicyId;
        this.createdAt = $.createdAt;
        this.destinationGroup = $.destinationGroup;
        this.lastEntryRule = $.lastEntryRule;
        this.organizationId = $.organizationId;
        this.sourceGroup = $.sourceGroup;
        this.updatedAt = $.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdaptivePolicyPoliciesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdaptivePolicyPoliciesState $;

        public Builder() {
            $ = new AdaptivePolicyPoliciesState();
        }

        public Builder(AdaptivePolicyPoliciesState defaults) {
            $ = new AdaptivePolicyPoliciesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param acls An ordered array of adaptive policy ACLs (each requires one unique attribute) that apply to this policy (default: [])
         * 
         * @return builder
         * 
         */
        public Builder acls(@Nullable Output<List<AdaptivePolicyPoliciesAclArgs>> acls) {
            $.acls = acls;
            return this;
        }

        /**
         * @param acls An ordered array of adaptive policy ACLs (each requires one unique attribute) that apply to this policy (default: [])
         * 
         * @return builder
         * 
         */
        public Builder acls(List<AdaptivePolicyPoliciesAclArgs> acls) {
            return acls(Output.of(acls));
        }

        /**
         * @param acls An ordered array of adaptive policy ACLs (each requires one unique attribute) that apply to this policy (default: [])
         * 
         * @return builder
         * 
         */
        public Builder acls(AdaptivePolicyPoliciesAclArgs... acls) {
            return acls(List.of(acls));
        }

        public Builder adaptivePolicyId(@Nullable Output<String> adaptivePolicyId) {
            $.adaptivePolicyId = adaptivePolicyId;
            return this;
        }

        public Builder adaptivePolicyId(String adaptivePolicyId) {
            return adaptivePolicyId(Output.of(adaptivePolicyId));
        }

        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param destinationGroup The destination adaptive policy group (requires one unique attribute)
         * 
         * @return builder
         * 
         */
        public Builder destinationGroup(@Nullable Output<AdaptivePolicyPoliciesDestinationGroupArgs> destinationGroup) {
            $.destinationGroup = destinationGroup;
            return this;
        }

        /**
         * @param destinationGroup The destination adaptive policy group (requires one unique attribute)
         * 
         * @return builder
         * 
         */
        public Builder destinationGroup(AdaptivePolicyPoliciesDestinationGroupArgs destinationGroup) {
            return destinationGroup(Output.of(destinationGroup));
        }

        /**
         * @param lastEntryRule The rule to apply if there is no matching ACL (default: &#34;default&#34;)
         * 
         * @return builder
         * 
         */
        public Builder lastEntryRule(@Nullable Output<String> lastEntryRule) {
            $.lastEntryRule = lastEntryRule;
            return this;
        }

        /**
         * @param lastEntryRule The rule to apply if there is no matching ACL (default: &#34;default&#34;)
         * 
         * @return builder
         * 
         */
        public Builder lastEntryRule(String lastEntryRule) {
            return lastEntryRule(Output.of(lastEntryRule));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param sourceGroup The source adaptive policy group (requires one unique attribute)
         * 
         * @return builder
         * 
         */
        public Builder sourceGroup(@Nullable Output<AdaptivePolicyPoliciesSourceGroupArgs> sourceGroup) {
            $.sourceGroup = sourceGroup;
            return this;
        }

        /**
         * @param sourceGroup The source adaptive policy group (requires one unique attribute)
         * 
         * @return builder
         * 
         */
        public Builder sourceGroup(AdaptivePolicyPoliciesSourceGroupArgs sourceGroup) {
            return sourceGroup(Output.of(sourceGroup));
        }

        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        public AdaptivePolicyPoliciesState build() {
            return $;
        }
    }

}
