// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInventoryOnboardingCloudMonitoringNetworksPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInventoryOnboardingCloudMonitoringNetworksPlainArgs Empty = new GetInventoryOnboardingCloudMonitoringNetworksPlainArgs();

    /**
     * deviceType query parameter. Device Type switch or wireless controller
     * 
     */
    @Import(name="deviceType", required=true)
    private String deviceType;

    /**
     * @return deviceType query parameter. Device Type switch or wireless controller
     * 
     */
    public String deviceType() {
        return this.deviceType;
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
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 100000. Default is 1000.
     * 
     */
    @Import(name="perPage")
    private @Nullable Integer perPage;

    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 100000. Default is 1000.
     * 
     */
    public Optional<Integer> perPage() {
        return Optional.ofNullable(this.perPage);
    }

    /**
     * search query parameter. Optional parameter to search on network name
     * 
     */
    @Import(name="search")
    private @Nullable String search;

    /**
     * @return search query parameter. Optional parameter to search on network name
     * 
     */
    public Optional<String> search() {
        return Optional.ofNullable(this.search);
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

    private GetInventoryOnboardingCloudMonitoringNetworksPlainArgs() {}

    private GetInventoryOnboardingCloudMonitoringNetworksPlainArgs(GetInventoryOnboardingCloudMonitoringNetworksPlainArgs $) {
        this.deviceType = $.deviceType;
        this.endingBefore = $.endingBefore;
        this.organizationId = $.organizationId;
        this.perPage = $.perPage;
        this.search = $.search;
        this.startingAfter = $.startingAfter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInventoryOnboardingCloudMonitoringNetworksPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInventoryOnboardingCloudMonitoringNetworksPlainArgs $;

        public Builder() {
            $ = new GetInventoryOnboardingCloudMonitoringNetworksPlainArgs();
        }

        public Builder(GetInventoryOnboardingCloudMonitoringNetworksPlainArgs defaults) {
            $ = new GetInventoryOnboardingCloudMonitoringNetworksPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceType deviceType query parameter. Device Type switch or wireless controller
         * 
         * @return builder
         * 
         */
        public Builder deviceType(String deviceType) {
            $.deviceType = deviceType;
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
         * @param perPage perPage query parameter. The number of entries per page returned. Acceptable range is 3 100000. Default is 1000.
         * 
         * @return builder
         * 
         */
        public Builder perPage(@Nullable Integer perPage) {
            $.perPage = perPage;
            return this;
        }

        /**
         * @param search search query parameter. Optional parameter to search on network name
         * 
         * @return builder
         * 
         */
        public Builder search(@Nullable String search) {
            $.search = search;
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

        public GetInventoryOnboardingCloudMonitoringNetworksPlainArgs build() {
            if ($.deviceType == null) {
                throw new MissingRequiredPropertyException("GetInventoryOnboardingCloudMonitoringNetworksPlainArgs", "deviceType");
            }
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetInventoryOnboardingCloudMonitoringNetworksPlainArgs", "organizationId");
            }
            return $;
        }
    }

}
