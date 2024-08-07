// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceContentFilteringArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceContentFilteringArgs Empty = new ApplianceContentFilteringArgs();

    /**
     * A list of URL patterns that are allowed
     * 
     */
    @Import(name="allowedUrlPatterns")
    private @Nullable Output<List<String>> allowedUrlPatterns;

    /**
     * @return A list of URL patterns that are allowed
     * 
     */
    public Optional<Output<List<String>>> allowedUrlPatterns() {
        return Optional.ofNullable(this.allowedUrlPatterns);
    }

    /**
     * A list of URL categories to block
     * 
     */
    @Import(name="blockedUrlCategories")
    private @Nullable Output<List<String>> blockedUrlCategories;

    /**
     * @return A list of URL categories to block
     * 
     */
    public Optional<Output<List<String>>> blockedUrlCategories() {
        return Optional.ofNullable(this.blockedUrlCategories);
    }

    /**
     * A list of URL patterns that are blocked
     * 
     */
    @Import(name="blockedUrlPatterns")
    private @Nullable Output<List<String>> blockedUrlPatterns;

    /**
     * @return A list of URL patterns that are blocked
     * 
     */
    public Optional<Output<List<String>>> blockedUrlPatterns() {
        return Optional.ofNullable(this.blockedUrlPatterns);
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId", required=true)
    private Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Output<String> networkId() {
        return this.networkId;
    }

    /**
     * URL category list size which is either &#39;topSites&#39; or &#39;fullList&#39;
     * 
     */
    @Import(name="urlCategoryListSize")
    private @Nullable Output<String> urlCategoryListSize;

    /**
     * @return URL category list size which is either &#39;topSites&#39; or &#39;fullList&#39;
     * 
     */
    public Optional<Output<String>> urlCategoryListSize() {
        return Optional.ofNullable(this.urlCategoryListSize);
    }

    private ApplianceContentFilteringArgs() {}

    private ApplianceContentFilteringArgs(ApplianceContentFilteringArgs $) {
        this.allowedUrlPatterns = $.allowedUrlPatterns;
        this.blockedUrlCategories = $.blockedUrlCategories;
        this.blockedUrlPatterns = $.blockedUrlPatterns;
        this.networkId = $.networkId;
        this.urlCategoryListSize = $.urlCategoryListSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceContentFilteringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceContentFilteringArgs $;

        public Builder() {
            $ = new ApplianceContentFilteringArgs();
        }

        public Builder(ApplianceContentFilteringArgs defaults) {
            $ = new ApplianceContentFilteringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedUrlPatterns A list of URL patterns that are allowed
         * 
         * @return builder
         * 
         */
        public Builder allowedUrlPatterns(@Nullable Output<List<String>> allowedUrlPatterns) {
            $.allowedUrlPatterns = allowedUrlPatterns;
            return this;
        }

        /**
         * @param allowedUrlPatterns A list of URL patterns that are allowed
         * 
         * @return builder
         * 
         */
        public Builder allowedUrlPatterns(List<String> allowedUrlPatterns) {
            return allowedUrlPatterns(Output.of(allowedUrlPatterns));
        }

        /**
         * @param allowedUrlPatterns A list of URL patterns that are allowed
         * 
         * @return builder
         * 
         */
        public Builder allowedUrlPatterns(String... allowedUrlPatterns) {
            return allowedUrlPatterns(List.of(allowedUrlPatterns));
        }

        /**
         * @param blockedUrlCategories A list of URL categories to block
         * 
         * @return builder
         * 
         */
        public Builder blockedUrlCategories(@Nullable Output<List<String>> blockedUrlCategories) {
            $.blockedUrlCategories = blockedUrlCategories;
            return this;
        }

        /**
         * @param blockedUrlCategories A list of URL categories to block
         * 
         * @return builder
         * 
         */
        public Builder blockedUrlCategories(List<String> blockedUrlCategories) {
            return blockedUrlCategories(Output.of(blockedUrlCategories));
        }

        /**
         * @param blockedUrlCategories A list of URL categories to block
         * 
         * @return builder
         * 
         */
        public Builder blockedUrlCategories(String... blockedUrlCategories) {
            return blockedUrlCategories(List.of(blockedUrlCategories));
        }

        /**
         * @param blockedUrlPatterns A list of URL patterns that are blocked
         * 
         * @return builder
         * 
         */
        public Builder blockedUrlPatterns(@Nullable Output<List<String>> blockedUrlPatterns) {
            $.blockedUrlPatterns = blockedUrlPatterns;
            return this;
        }

        /**
         * @param blockedUrlPatterns A list of URL patterns that are blocked
         * 
         * @return builder
         * 
         */
        public Builder blockedUrlPatterns(List<String> blockedUrlPatterns) {
            return blockedUrlPatterns(Output.of(blockedUrlPatterns));
        }

        /**
         * @param blockedUrlPatterns A list of URL patterns that are blocked
         * 
         * @return builder
         * 
         */
        public Builder blockedUrlPatterns(String... blockedUrlPatterns) {
            return blockedUrlPatterns(List.of(blockedUrlPatterns));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        /**
         * @param urlCategoryListSize URL category list size which is either &#39;topSites&#39; or &#39;fullList&#39;
         * 
         * @return builder
         * 
         */
        public Builder urlCategoryListSize(@Nullable Output<String> urlCategoryListSize) {
            $.urlCategoryListSize = urlCategoryListSize;
            return this;
        }

        /**
         * @param urlCategoryListSize URL category list size which is either &#39;topSites&#39; or &#39;fullList&#39;
         * 
         * @return builder
         * 
         */
        public Builder urlCategoryListSize(String urlCategoryListSize) {
            return urlCategoryListSize(Output.of(urlCategoryListSize));
        }

        public ApplianceContentFilteringArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("ApplianceContentFilteringArgs", "networkId");
            }
            return $;
        }
    }

}
