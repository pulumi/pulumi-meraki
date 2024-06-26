// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetApiRequestsOverviewItemResponseCodeCounts;
import java.util.Objects;

@CustomType
public final class GetApiRequestsOverviewItem {
    /**
     * @return object of all supported HTTP response code
     * 
     */
    private GetApiRequestsOverviewItemResponseCodeCounts responseCodeCounts;

    private GetApiRequestsOverviewItem() {}
    /**
     * @return object of all supported HTTP response code
     * 
     */
    public GetApiRequestsOverviewItemResponseCodeCounts responseCodeCounts() {
        return this.responseCodeCounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiRequestsOverviewItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetApiRequestsOverviewItemResponseCodeCounts responseCodeCounts;
        public Builder() {}
        public Builder(GetApiRequestsOverviewItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.responseCodeCounts = defaults.responseCodeCounts;
        }

        @CustomType.Setter
        public Builder responseCodeCounts(GetApiRequestsOverviewItemResponseCodeCounts responseCodeCounts) {
            if (responseCodeCounts == null) {
              throw new MissingRequiredPropertyException("GetApiRequestsOverviewItem", "responseCodeCounts");
            }
            this.responseCodeCounts = responseCodeCounts;
            return this;
        }
        public GetApiRequestsOverviewItem build() {
            final var _resultValue = new GetApiRequestsOverviewItem();
            _resultValue.responseCodeCounts = responseCodeCounts;
            return _resultValue;
        }
    }
}
