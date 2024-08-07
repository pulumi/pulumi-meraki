// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUplinksStatusesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUplinksStatusesArgs Empty = new GetUplinksStatusesArgs();

    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    @Import(name="endingBefore")
    private @Nullable Output<String> endingBefore;

    /**
     * @return endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<Output<String>> endingBefore() {
        return Optional.ofNullable(this.endingBefore);
    }

    /**
     * iccids query parameter. A list of ICCIDs. The returned devices will be filtered to only include these ICCIDs.
     * 
     */
    @Import(name="iccids")
    private @Nullable Output<List<String>> iccids;

    /**
     * @return iccids query parameter. A list of ICCIDs. The returned devices will be filtered to only include these ICCIDs.
     * 
     */
    public Optional<Output<List<String>>> iccids() {
        return Optional.ofNullable(this.iccids);
    }

    /**
     * networkIds query parameter. A list of network IDs. The returned devices will be filtered to only include these networks.
     * 
     */
    @Import(name="networkIds")
    private @Nullable Output<List<String>> networkIds;

    /**
     * @return networkIds query parameter. A list of network IDs. The returned devices will be filtered to only include these networks.
     * 
     */
    public Optional<Output<List<String>>> networkIds() {
        return Optional.ofNullable(this.networkIds);
    }

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     * 
     */
    @Import(name="perPage")
    private @Nullable Output<Integer> perPage;

    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     * 
     */
    public Optional<Output<Integer>> perPage() {
        return Optional.ofNullable(this.perPage);
    }

    /**
     * serials query parameter. A list of serial numbers. The returned devices will be filtered to only include these serials.
     * 
     */
    @Import(name="serials")
    private @Nullable Output<List<String>> serials;

    /**
     * @return serials query parameter. A list of serial numbers. The returned devices will be filtered to only include these serials.
     * 
     */
    public Optional<Output<List<String>>> serials() {
        return Optional.ofNullable(this.serials);
    }

    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    @Import(name="startingAfter")
    private @Nullable Output<String> startingAfter;

    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<Output<String>> startingAfter() {
        return Optional.ofNullable(this.startingAfter);
    }

    private GetUplinksStatusesArgs() {}

    private GetUplinksStatusesArgs(GetUplinksStatusesArgs $) {
        this.endingBefore = $.endingBefore;
        this.iccids = $.iccids;
        this.networkIds = $.networkIds;
        this.organizationId = $.organizationId;
        this.perPage = $.perPage;
        this.serials = $.serials;
        this.startingAfter = $.startingAfter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUplinksStatusesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUplinksStatusesArgs $;

        public Builder() {
            $ = new GetUplinksStatusesArgs();
        }

        public Builder(GetUplinksStatusesArgs defaults) {
            $ = new GetUplinksStatusesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endingBefore endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
         * 
         * @return builder
         * 
         */
        public Builder endingBefore(@Nullable Output<String> endingBefore) {
            $.endingBefore = endingBefore;
            return this;
        }

        /**
         * @param endingBefore endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
         * 
         * @return builder
         * 
         */
        public Builder endingBefore(String endingBefore) {
            return endingBefore(Output.of(endingBefore));
        }

        /**
         * @param iccids iccids query parameter. A list of ICCIDs. The returned devices will be filtered to only include these ICCIDs.
         * 
         * @return builder
         * 
         */
        public Builder iccids(@Nullable Output<List<String>> iccids) {
            $.iccids = iccids;
            return this;
        }

        /**
         * @param iccids iccids query parameter. A list of ICCIDs. The returned devices will be filtered to only include these ICCIDs.
         * 
         * @return builder
         * 
         */
        public Builder iccids(List<String> iccids) {
            return iccids(Output.of(iccids));
        }

        /**
         * @param iccids iccids query parameter. A list of ICCIDs. The returned devices will be filtered to only include these ICCIDs.
         * 
         * @return builder
         * 
         */
        public Builder iccids(String... iccids) {
            return iccids(List.of(iccids));
        }

        /**
         * @param networkIds networkIds query parameter. A list of network IDs. The returned devices will be filtered to only include these networks.
         * 
         * @return builder
         * 
         */
        public Builder networkIds(@Nullable Output<List<String>> networkIds) {
            $.networkIds = networkIds;
            return this;
        }

        /**
         * @param networkIds networkIds query parameter. A list of network IDs. The returned devices will be filtered to only include these networks.
         * 
         * @return builder
         * 
         */
        public Builder networkIds(List<String> networkIds) {
            return networkIds(Output.of(networkIds));
        }

        /**
         * @param networkIds networkIds query parameter. A list of network IDs. The returned devices will be filtered to only include these networks.
         * 
         * @return builder
         * 
         */
        public Builder networkIds(String... networkIds) {
            return networkIds(List.of(networkIds));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(Output<String> organizationId) {
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
         * @param perPage perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
         * 
         * @return builder
         * 
         */
        public Builder perPage(@Nullable Output<Integer> perPage) {
            $.perPage = perPage;
            return this;
        }

        /**
         * @param perPage perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
         * 
         * @return builder
         * 
         */
        public Builder perPage(Integer perPage) {
            return perPage(Output.of(perPage));
        }

        /**
         * @param serials serials query parameter. A list of serial numbers. The returned devices will be filtered to only include these serials.
         * 
         * @return builder
         * 
         */
        public Builder serials(@Nullable Output<List<String>> serials) {
            $.serials = serials;
            return this;
        }

        /**
         * @param serials serials query parameter. A list of serial numbers. The returned devices will be filtered to only include these serials.
         * 
         * @return builder
         * 
         */
        public Builder serials(List<String> serials) {
            return serials(Output.of(serials));
        }

        /**
         * @param serials serials query parameter. A list of serial numbers. The returned devices will be filtered to only include these serials.
         * 
         * @return builder
         * 
         */
        public Builder serials(String... serials) {
            return serials(List.of(serials));
        }

        /**
         * @param startingAfter startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
         * 
         * @return builder
         * 
         */
        public Builder startingAfter(@Nullable Output<String> startingAfter) {
            $.startingAfter = startingAfter;
            return this;
        }

        /**
         * @param startingAfter startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
         * 
         * @return builder
         * 
         */
        public Builder startingAfter(String startingAfter) {
            return startingAfter(Output.of(startingAfter));
        }

        public GetUplinksStatusesArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetUplinksStatusesArgs", "organizationId");
            }
            return $;
        }
    }

}
