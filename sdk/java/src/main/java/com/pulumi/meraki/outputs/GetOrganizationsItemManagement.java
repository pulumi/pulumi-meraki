// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.outputs.GetOrganizationsItemManagementDetail;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetOrganizationsItemManagement {
    /**
     * @return Details related to organization management, possibly empty. Details may be named &#39;MSP ID&#39;, &#39;IP restriction mode for API&#39;, or &#39;IP restriction mode for dashboard&#39;, if the organization admin has configured any.
     * 
     */
    private List<GetOrganizationsItemManagementDetail> details;

    private GetOrganizationsItemManagement() {}
    /**
     * @return Details related to organization management, possibly empty. Details may be named &#39;MSP ID&#39;, &#39;IP restriction mode for API&#39;, or &#39;IP restriction mode for dashboard&#39;, if the organization admin has configured any.
     * 
     */
    public List<GetOrganizationsItemManagementDetail> details() {
        return this.details;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationsItemManagement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetOrganizationsItemManagementDetail> details;
        public Builder() {}
        public Builder(GetOrganizationsItemManagement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
        }

        @CustomType.Setter
        public Builder details(List<GetOrganizationsItemManagementDetail> details) {
            if (details == null) {
              throw new MissingRequiredPropertyException("GetOrganizationsItemManagement", "details");
            }
            this.details = details;
            return this;
        }
        public Builder details(GetOrganizationsItemManagementDetail... details) {
            return details(List.of(details));
        }
        public GetOrganizationsItemManagement build() {
            final var _resultValue = new GetOrganizationsItemManagement();
            _resultValue.details = details;
            return _resultValue;
        }
    }
}