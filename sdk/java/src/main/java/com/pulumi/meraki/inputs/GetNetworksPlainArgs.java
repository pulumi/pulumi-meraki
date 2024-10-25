// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworksPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworksPlainArgs Empty = new GetNetworksPlainArgs();

    /**
     * configTemplateId query parameter. An optional parameter that is the ID of a config template. Will return all networks bound to that template.
     * 
     */
    @Import(name="configTemplateId")
    private @Nullable String configTemplateId;

    /**
     * @return configTemplateId query parameter. An optional parameter that is the ID of a config template. Will return all networks bound to that template.
     * 
     */
    public Optional<String> configTemplateId() {
        return Optional.ofNullable(this.configTemplateId);
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
     * isBoundToConfigTemplate query parameter. An optional parameter to filter config template bound networks. If configTemplateId is set, this cannot be false.
     * 
     */
    @Import(name="isBoundToConfigTemplate")
    private @Nullable Boolean isBoundToConfigTemplate;

    /**
     * @return isBoundToConfigTemplate query parameter. An optional parameter to filter config template bound networks. If configTemplateId is set, this cannot be false.
     * 
     */
    public Optional<Boolean> isBoundToConfigTemplate() {
        return Optional.ofNullable(this.isBoundToConfigTemplate);
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

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId")
    private @Nullable String organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Optional<String> organizationId() {
        return Optional.ofNullable(this.organizationId);
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
     * tags query parameter. An optional parameter to filter networks by tags. The filtering is case-sensitive. If tags are included, &#39;tagsFilterType&#39; should also be included (see below).
     * 
     */
    @Import(name="tags")
    private @Nullable List<String> tags;

    /**
     * @return tags query parameter. An optional parameter to filter networks by tags. The filtering is case-sensitive. If tags are included, &#39;tagsFilterType&#39; should also be included (see below).
     * 
     */
    public Optional<List<String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * tagsFilterType query parameter. An optional parameter of value &#39;withAnyTags&#39; or &#39;withAllTags&#39; to indicate whether to return networks which contain ANY or ALL of the included tags. If no type is included, &#39;withAnyTags&#39; will be selected.
     * 
     */
    @Import(name="tagsFilterType")
    private @Nullable String tagsFilterType;

    /**
     * @return tagsFilterType query parameter. An optional parameter of value &#39;withAnyTags&#39; or &#39;withAllTags&#39; to indicate whether to return networks which contain ANY or ALL of the included tags. If no type is included, &#39;withAnyTags&#39; will be selected.
     * 
     */
    public Optional<String> tagsFilterType() {
        return Optional.ofNullable(this.tagsFilterType);
    }

    private GetNetworksPlainArgs() {}

    private GetNetworksPlainArgs(GetNetworksPlainArgs $) {
        this.configTemplateId = $.configTemplateId;
        this.endingBefore = $.endingBefore;
        this.isBoundToConfigTemplate = $.isBoundToConfigTemplate;
        this.networkId = $.networkId;
        this.organizationId = $.organizationId;
        this.perPage = $.perPage;
        this.startingAfter = $.startingAfter;
        this.tags = $.tags;
        this.tagsFilterType = $.tagsFilterType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworksPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworksPlainArgs $;

        public Builder() {
            $ = new GetNetworksPlainArgs();
        }

        public Builder(GetNetworksPlainArgs defaults) {
            $ = new GetNetworksPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configTemplateId configTemplateId query parameter. An optional parameter that is the ID of a config template. Will return all networks bound to that template.
         * 
         * @return builder
         * 
         */
        public Builder configTemplateId(@Nullable String configTemplateId) {
            $.configTemplateId = configTemplateId;
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
         * @param isBoundToConfigTemplate isBoundToConfigTemplate query parameter. An optional parameter to filter config template bound networks. If configTemplateId is set, this cannot be false.
         * 
         * @return builder
         * 
         */
        public Builder isBoundToConfigTemplate(@Nullable Boolean isBoundToConfigTemplate) {
            $.isBoundToConfigTemplate = isBoundToConfigTemplate;
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

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable String organizationId) {
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
         * @param tags tags query parameter. An optional parameter to filter networks by tags. The filtering is case-sensitive. If tags are included, &#39;tagsFilterType&#39; should also be included (see below).
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable List<String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags tags query parameter. An optional parameter to filter networks by tags. The filtering is case-sensitive. If tags are included, &#39;tagsFilterType&#39; should also be included (see below).
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param tagsFilterType tagsFilterType query parameter. An optional parameter of value &#39;withAnyTags&#39; or &#39;withAllTags&#39; to indicate whether to return networks which contain ANY or ALL of the included tags. If no type is included, &#39;withAnyTags&#39; will be selected.
         * 
         * @return builder
         * 
         */
        public Builder tagsFilterType(@Nullable String tagsFilterType) {
            $.tagsFilterType = tagsFilterType;
            return this;
        }

        public GetNetworksPlainArgs build() {
            return $;
        }
    }

}
