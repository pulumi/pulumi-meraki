// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetSummaryTopNetworksByStatusItem;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSummaryTopNetworksByStatusResult {
    /**
     * @return endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    private @Nullable String endingBefore;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Array of ResponseOrganizationsGetOrganizationSummaryTopNetworksByStatus
     * 
     */
    private List<GetSummaryTopNetworksByStatusItem> items;
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    private String organizationId;
    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 5000.
     * 
     */
    private @Nullable Integer perPage;
    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    private @Nullable String startingAfter;

    private GetSummaryTopNetworksByStatusResult() {}
    /**
     * @return endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<String> endingBefore() {
        return Optional.ofNullable(this.endingBefore);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Array of ResponseOrganizationsGetOrganizationSummaryTopNetworksByStatus
     * 
     */
    public List<GetSummaryTopNetworksByStatusItem> items() {
        return this.items;
    }
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }
    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 5000.
     * 
     */
    public Optional<Integer> perPage() {
        return Optional.ofNullable(this.perPage);
    }
    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<String> startingAfter() {
        return Optional.ofNullable(this.startingAfter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSummaryTopNetworksByStatusResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String endingBefore;
        private String id;
        private List<GetSummaryTopNetworksByStatusItem> items;
        private String organizationId;
        private @Nullable Integer perPage;
        private @Nullable String startingAfter;
        public Builder() {}
        public Builder(GetSummaryTopNetworksByStatusResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endingBefore = defaults.endingBefore;
    	      this.id = defaults.id;
    	      this.items = defaults.items;
    	      this.organizationId = defaults.organizationId;
    	      this.perPage = defaults.perPage;
    	      this.startingAfter = defaults.startingAfter;
        }

        @CustomType.Setter
        public Builder endingBefore(@Nullable String endingBefore) {

            this.endingBefore = endingBefore;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSummaryTopNetworksByStatusResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetSummaryTopNetworksByStatusItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetSummaryTopNetworksByStatusResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetSummaryTopNetworksByStatusItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder organizationId(String organizationId) {
            if (organizationId == null) {
              throw new MissingRequiredPropertyException("GetSummaryTopNetworksByStatusResult", "organizationId");
            }
            this.organizationId = organizationId;
            return this;
        }
        @CustomType.Setter
        public Builder perPage(@Nullable Integer perPage) {

            this.perPage = perPage;
            return this;
        }
        @CustomType.Setter
        public Builder startingAfter(@Nullable String startingAfter) {

            this.startingAfter = startingAfter;
            return this;
        }
        public GetSummaryTopNetworksByStatusResult build() {
            final var _resultValue = new GetSummaryTopNetworksByStatusResult();
            _resultValue.endingBefore = endingBefore;
            _resultValue.id = id;
            _resultValue.items = items;
            _resultValue.organizationId = organizationId;
            _resultValue.perPage = perPage;
            _resultValue.startingAfter = startingAfter;
            return _resultValue;
        }
    }
}