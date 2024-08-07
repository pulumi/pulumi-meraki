// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupPoliciesContentFilteringBlockedUrlCategoriesArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupPoliciesContentFilteringBlockedUrlCategoriesArgs Empty = new GroupPoliciesContentFilteringBlockedUrlCategoriesArgs();

    /**
     * A list of URL categories to block
     * 
     */
    @Import(name="categories")
    private @Nullable Output<List<String>> categories;

    /**
     * @return A list of URL categories to block
     * 
     */
    public Optional<Output<List<String>>> categories() {
        return Optional.ofNullable(this.categories);
    }

    /**
     * How URL categories are applied. Can be &#39;network default&#39;, &#39;append&#39; or &#39;override&#39;.
     * 
     */
    @Import(name="settings")
    private @Nullable Output<String> settings;

    /**
     * @return How URL categories are applied. Can be &#39;network default&#39;, &#39;append&#39; or &#39;override&#39;.
     * 
     */
    public Optional<Output<String>> settings() {
        return Optional.ofNullable(this.settings);
    }

    private GroupPoliciesContentFilteringBlockedUrlCategoriesArgs() {}

    private GroupPoliciesContentFilteringBlockedUrlCategoriesArgs(GroupPoliciesContentFilteringBlockedUrlCategoriesArgs $) {
        this.categories = $.categories;
        this.settings = $.settings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupPoliciesContentFilteringBlockedUrlCategoriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupPoliciesContentFilteringBlockedUrlCategoriesArgs $;

        public Builder() {
            $ = new GroupPoliciesContentFilteringBlockedUrlCategoriesArgs();
        }

        public Builder(GroupPoliciesContentFilteringBlockedUrlCategoriesArgs defaults) {
            $ = new GroupPoliciesContentFilteringBlockedUrlCategoriesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param categories A list of URL categories to block
         * 
         * @return builder
         * 
         */
        public Builder categories(@Nullable Output<List<String>> categories) {
            $.categories = categories;
            return this;
        }

        /**
         * @param categories A list of URL categories to block
         * 
         * @return builder
         * 
         */
        public Builder categories(List<String> categories) {
            return categories(Output.of(categories));
        }

        /**
         * @param categories A list of URL categories to block
         * 
         * @return builder
         * 
         */
        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }

        /**
         * @param settings How URL categories are applied. Can be &#39;network default&#39;, &#39;append&#39; or &#39;override&#39;.
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<String> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings How URL categories are applied. Can be &#39;network default&#39;, &#39;append&#39; or &#39;override&#39;.
         * 
         * @return builder
         * 
         */
        public Builder settings(String settings) {
            return settings(Output.of(settings));
        }

        public GroupPoliciesContentFilteringBlockedUrlCategoriesArgs build() {
            return $;
        }
    }

}
