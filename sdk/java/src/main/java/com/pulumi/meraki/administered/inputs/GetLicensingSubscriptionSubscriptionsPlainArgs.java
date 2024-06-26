// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.administered.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLicensingSubscriptionSubscriptionsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLicensingSubscriptionSubscriptionsPlainArgs Empty = new GetLicensingSubscriptionSubscriptionsPlainArgs();

    /**
     * endDate query parameter. Filter subscriptions by end date, ISO 8601 format. To filter with a range of dates, use &#39;endDate[
     * ]=?&#39; in the request. Accepted options include lt, gt, lte, gte.
     * 
     */
    @Import(name="endDate")
    private @Nullable String endDate;

    /**
     * @return endDate query parameter. Filter subscriptions by end date, ISO 8601 format. To filter with a range of dates, use &#39;endDate[
     * ]=?&#39; in the request. Accepted options include lt, gt, lte, gte.
     * 
     */
    public Optional<String> endDate() {
        return Optional.ofNullable(this.endDate);
    }

    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    @Import(name="endingBefore")
    private @Nullable String endingBefore;

    /**
     * @return endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<String> endingBefore() {
        return Optional.ofNullable(this.endingBefore);
    }

    /**
     * organizationIds query parameter. Organizations to get associated subscriptions for
     * 
     */
    @Import(name="organizationIds")
    private @Nullable List<String> organizationIds;

    /**
     * @return organizationIds query parameter. Organizations to get associated subscriptions for
     * 
     */
    public Optional<List<String>> organizationIds() {
        return Optional.ofNullable(this.organizationIds);
    }

    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     * 
     */
    @Import(name="perPage")
    private @Nullable Integer perPage;

    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     * 
     */
    public Optional<Integer> perPage() {
        return Optional.ofNullable(this.perPage);
    }

    /**
     * productTypes query parameter. List of product types that returned subscriptions need to have entitlements for.
     * 
     */
    @Import(name="productTypes")
    private @Nullable List<String> productTypes;

    /**
     * @return productTypes query parameter. List of product types that returned subscriptions need to have entitlements for.
     * 
     */
    public Optional<List<String>> productTypes() {
        return Optional.ofNullable(this.productTypes);
    }

    /**
     * startDate query parameter. Filter subscriptions by start date, ISO 8601 format. To filter with a range of dates, use &#39;startDate[
     * ]=?&#39; in the request. Accepted options include lt, gt, lte, gte.
     * 
     */
    @Import(name="startDate")
    private @Nullable String startDate;

    /**
     * @return startDate query parameter. Filter subscriptions by start date, ISO 8601 format. To filter with a range of dates, use &#39;startDate[
     * ]=?&#39; in the request. Accepted options include lt, gt, lte, gte.
     * 
     */
    public Optional<String> startDate() {
        return Optional.ofNullable(this.startDate);
    }

    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    @Import(name="startingAfter")
    private @Nullable String startingAfter;

    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<String> startingAfter() {
        return Optional.ofNullable(this.startingAfter);
    }

    /**
     * statuses query parameter. List of statuses that returned subscriptions can have
     * 
     */
    @Import(name="statuses")
    private @Nullable List<String> statuses;

    /**
     * @return statuses query parameter. List of statuses that returned subscriptions can have
     * 
     */
    public Optional<List<String>> statuses() {
        return Optional.ofNullable(this.statuses);
    }

    /**
     * subscriptionIds query parameter. List of subscription ids to fetch
     * 
     */
    @Import(name="subscriptionIds")
    private @Nullable List<String> subscriptionIds;

    /**
     * @return subscriptionIds query parameter. List of subscription ids to fetch
     * 
     */
    public Optional<List<String>> subscriptionIds() {
        return Optional.ofNullable(this.subscriptionIds);
    }

    private GetLicensingSubscriptionSubscriptionsPlainArgs() {}

    private GetLicensingSubscriptionSubscriptionsPlainArgs(GetLicensingSubscriptionSubscriptionsPlainArgs $) {
        this.endDate = $.endDate;
        this.endingBefore = $.endingBefore;
        this.organizationIds = $.organizationIds;
        this.perPage = $.perPage;
        this.productTypes = $.productTypes;
        this.startDate = $.startDate;
        this.startingAfter = $.startingAfter;
        this.statuses = $.statuses;
        this.subscriptionIds = $.subscriptionIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLicensingSubscriptionSubscriptionsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLicensingSubscriptionSubscriptionsPlainArgs $;

        public Builder() {
            $ = new GetLicensingSubscriptionSubscriptionsPlainArgs();
        }

        public Builder(GetLicensingSubscriptionSubscriptionsPlainArgs defaults) {
            $ = new GetLicensingSubscriptionSubscriptionsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endDate endDate query parameter. Filter subscriptions by end date, ISO 8601 format. To filter with a range of dates, use &#39;endDate[
         * ]=?&#39; in the request. Accepted options include lt, gt, lte, gte.
         * 
         * @return builder
         * 
         */
        public Builder endDate(@Nullable String endDate) {
            $.endDate = endDate;
            return this;
        }

        /**
         * @param endingBefore endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
         * 
         * @return builder
         * 
         */
        public Builder endingBefore(@Nullable String endingBefore) {
            $.endingBefore = endingBefore;
            return this;
        }

        /**
         * @param organizationIds organizationIds query parameter. Organizations to get associated subscriptions for
         * 
         * @return builder
         * 
         */
        public Builder organizationIds(@Nullable List<String> organizationIds) {
            $.organizationIds = organizationIds;
            return this;
        }

        /**
         * @param organizationIds organizationIds query parameter. Organizations to get associated subscriptions for
         * 
         * @return builder
         * 
         */
        public Builder organizationIds(String... organizationIds) {
            return organizationIds(List.of(organizationIds));
        }

        /**
         * @param perPage perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
         * 
         * @return builder
         * 
         */
        public Builder perPage(@Nullable Integer perPage) {
            $.perPage = perPage;
            return this;
        }

        /**
         * @param productTypes productTypes query parameter. List of product types that returned subscriptions need to have entitlements for.
         * 
         * @return builder
         * 
         */
        public Builder productTypes(@Nullable List<String> productTypes) {
            $.productTypes = productTypes;
            return this;
        }

        /**
         * @param productTypes productTypes query parameter. List of product types that returned subscriptions need to have entitlements for.
         * 
         * @return builder
         * 
         */
        public Builder productTypes(String... productTypes) {
            return productTypes(List.of(productTypes));
        }

        /**
         * @param startDate startDate query parameter. Filter subscriptions by start date, ISO 8601 format. To filter with a range of dates, use &#39;startDate[
         * ]=?&#39; in the request. Accepted options include lt, gt, lte, gte.
         * 
         * @return builder
         * 
         */
        public Builder startDate(@Nullable String startDate) {
            $.startDate = startDate;
            return this;
        }

        /**
         * @param startingAfter startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
         * 
         * @return builder
         * 
         */
        public Builder startingAfter(@Nullable String startingAfter) {
            $.startingAfter = startingAfter;
            return this;
        }

        /**
         * @param statuses statuses query parameter. List of statuses that returned subscriptions can have
         * 
         * @return builder
         * 
         */
        public Builder statuses(@Nullable List<String> statuses) {
            $.statuses = statuses;
            return this;
        }

        /**
         * @param statuses statuses query parameter. List of statuses that returned subscriptions can have
         * 
         * @return builder
         * 
         */
        public Builder statuses(String... statuses) {
            return statuses(List.of(statuses));
        }

        /**
         * @param subscriptionIds subscriptionIds query parameter. List of subscription ids to fetch
         * 
         * @return builder
         * 
         */
        public Builder subscriptionIds(@Nullable List<String> subscriptionIds) {
            $.subscriptionIds = subscriptionIds;
            return this;
        }

        /**
         * @param subscriptionIds subscriptionIds query parameter. List of subscription ids to fetch
         * 
         * @return builder
         * 
         */
        public Builder subscriptionIds(String... subscriptionIds) {
            return subscriptionIds(List.of(subscriptionIds));
        }

        public GetLicensingSubscriptionSubscriptionsPlainArgs build() {
            return $;
        }
    }

}
