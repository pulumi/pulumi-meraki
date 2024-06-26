// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.GroupPoliciesContentFilteringAllowedUrlPatternsArgs;
import com.pulumi.meraki.networks.inputs.GroupPoliciesContentFilteringBlockedUrlCategoriesArgs;
import com.pulumi.meraki.networks.inputs.GroupPoliciesContentFilteringBlockedUrlPatternsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupPoliciesContentFilteringArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupPoliciesContentFilteringArgs Empty = new GroupPoliciesContentFilteringArgs();

    /**
     * Settings for allowed URL patterns
     * 
     */
    @Import(name="allowedUrlPatterns")
    private @Nullable Output<GroupPoliciesContentFilteringAllowedUrlPatternsArgs> allowedUrlPatterns;

    /**
     * @return Settings for allowed URL patterns
     * 
     */
    public Optional<Output<GroupPoliciesContentFilteringAllowedUrlPatternsArgs>> allowedUrlPatterns() {
        return Optional.ofNullable(this.allowedUrlPatterns);
    }

    /**
     * Settings for blocked URL categories
     * 
     */
    @Import(name="blockedUrlCategories")
    private @Nullable Output<GroupPoliciesContentFilteringBlockedUrlCategoriesArgs> blockedUrlCategories;

    /**
     * @return Settings for blocked URL categories
     * 
     */
    public Optional<Output<GroupPoliciesContentFilteringBlockedUrlCategoriesArgs>> blockedUrlCategories() {
        return Optional.ofNullable(this.blockedUrlCategories);
    }

    /**
     * Settings for blocked URL patterns
     * 
     */
    @Import(name="blockedUrlPatterns")
    private @Nullable Output<GroupPoliciesContentFilteringBlockedUrlPatternsArgs> blockedUrlPatterns;

    /**
     * @return Settings for blocked URL patterns
     * 
     */
    public Optional<Output<GroupPoliciesContentFilteringBlockedUrlPatternsArgs>> blockedUrlPatterns() {
        return Optional.ofNullable(this.blockedUrlPatterns);
    }

    private GroupPoliciesContentFilteringArgs() {}

    private GroupPoliciesContentFilteringArgs(GroupPoliciesContentFilteringArgs $) {
        this.allowedUrlPatterns = $.allowedUrlPatterns;
        this.blockedUrlCategories = $.blockedUrlCategories;
        this.blockedUrlPatterns = $.blockedUrlPatterns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupPoliciesContentFilteringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupPoliciesContentFilteringArgs $;

        public Builder() {
            $ = new GroupPoliciesContentFilteringArgs();
        }

        public Builder(GroupPoliciesContentFilteringArgs defaults) {
            $ = new GroupPoliciesContentFilteringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedUrlPatterns Settings for allowed URL patterns
         * 
         * @return builder
         * 
         */
        public Builder allowedUrlPatterns(@Nullable Output<GroupPoliciesContentFilteringAllowedUrlPatternsArgs> allowedUrlPatterns) {
            $.allowedUrlPatterns = allowedUrlPatterns;
            return this;
        }

        /**
         * @param allowedUrlPatterns Settings for allowed URL patterns
         * 
         * @return builder
         * 
         */
        public Builder allowedUrlPatterns(GroupPoliciesContentFilteringAllowedUrlPatternsArgs allowedUrlPatterns) {
            return allowedUrlPatterns(Output.of(allowedUrlPatterns));
        }

        /**
         * @param blockedUrlCategories Settings for blocked URL categories
         * 
         * @return builder
         * 
         */
        public Builder blockedUrlCategories(@Nullable Output<GroupPoliciesContentFilteringBlockedUrlCategoriesArgs> blockedUrlCategories) {
            $.blockedUrlCategories = blockedUrlCategories;
            return this;
        }

        /**
         * @param blockedUrlCategories Settings for blocked URL categories
         * 
         * @return builder
         * 
         */
        public Builder blockedUrlCategories(GroupPoliciesContentFilteringBlockedUrlCategoriesArgs blockedUrlCategories) {
            return blockedUrlCategories(Output.of(blockedUrlCategories));
        }

        /**
         * @param blockedUrlPatterns Settings for blocked URL patterns
         * 
         * @return builder
         * 
         */
        public Builder blockedUrlPatterns(@Nullable Output<GroupPoliciesContentFilteringBlockedUrlPatternsArgs> blockedUrlPatterns) {
            $.blockedUrlPatterns = blockedUrlPatterns;
            return this;
        }

        /**
         * @param blockedUrlPatterns Settings for blocked URL patterns
         * 
         * @return builder
         * 
         */
        public Builder blockedUrlPatterns(GroupPoliciesContentFilteringBlockedUrlPatternsArgs blockedUrlPatterns) {
            return blockedUrlPatterns(Output.of(blockedUrlPatterns));
        }

        public GroupPoliciesContentFilteringArgs build() {
            return $;
        }
    }

}
