// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLicensingCotermLicensesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLicensingCotermLicensesPlainArgs Empty = new GetLicensingCotermLicensesPlainArgs();

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
     * expired query parameter. Filter for licenses that are expired
     * 
     */
    @Import(name="expired")
    private @Nullable Boolean expired;

    /**
     * @return expired query parameter. Filter for licenses that are expired
     * 
     */
    public Optional<Boolean> expired() {
        return Optional.ofNullable(this.expired);
    }

    /**
     * invalidated query parameter. Filter for licenses that are invalidated
     * 
     */
    @Import(name="invalidated")
    private @Nullable Boolean invalidated;

    /**
     * @return invalidated query parameter. Filter for licenses that are invalidated
     * 
     */
    public Optional<Boolean> invalidated() {
        return Optional.ofNullable(this.invalidated);
    }

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId", required=true)
    private String organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public String organizationId() {
        return this.organizationId;
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

    private GetLicensingCotermLicensesPlainArgs() {}

    private GetLicensingCotermLicensesPlainArgs(GetLicensingCotermLicensesPlainArgs $) {
        this.endingBefore = $.endingBefore;
        this.expired = $.expired;
        this.invalidated = $.invalidated;
        this.organizationId = $.organizationId;
        this.perPage = $.perPage;
        this.startingAfter = $.startingAfter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLicensingCotermLicensesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLicensingCotermLicensesPlainArgs $;

        public Builder() {
            $ = new GetLicensingCotermLicensesPlainArgs();
        }

        public Builder(GetLicensingCotermLicensesPlainArgs defaults) {
            $ = new GetLicensingCotermLicensesPlainArgs(Objects.requireNonNull(defaults));
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
         * @param expired expired query parameter. Filter for licenses that are expired
         * 
         * @return builder
         * 
         */
        public Builder expired(@Nullable Boolean expired) {
            $.expired = expired;
            return this;
        }

        /**
         * @param invalidated invalidated query parameter. Filter for licenses that are invalidated
         * 
         * @return builder
         * 
         */
        public Builder invalidated(@Nullable Boolean invalidated) {
            $.invalidated = invalidated;
            return this;
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
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
         * @param startingAfter startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
         * 
         * @return builder
         * 
         */
        public Builder startingAfter(@Nullable String startingAfter) {
            $.startingAfter = startingAfter;
            return this;
        }

        public GetLicensingCotermLicensesPlainArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetLicensingCotermLicensesPlainArgs", "organizationId");
            }
            return $;
        }
    }

}