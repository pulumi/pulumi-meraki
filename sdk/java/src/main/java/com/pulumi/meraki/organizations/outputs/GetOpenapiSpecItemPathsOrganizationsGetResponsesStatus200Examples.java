// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetOpenapiSpecItemPathsOrganizationsGetResponsesStatus200ExamplesApplicationJson;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetOpenapiSpecItemPathsOrganizationsGetResponsesStatus200Examples {
    private List<GetOpenapiSpecItemPathsOrganizationsGetResponsesStatus200ExamplesApplicationJson> applicationJsons;

    private GetOpenapiSpecItemPathsOrganizationsGetResponsesStatus200Examples() {}
    public List<GetOpenapiSpecItemPathsOrganizationsGetResponsesStatus200ExamplesApplicationJson> applicationJsons() {
        return this.applicationJsons;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOpenapiSpecItemPathsOrganizationsGetResponsesStatus200Examples defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetOpenapiSpecItemPathsOrganizationsGetResponsesStatus200ExamplesApplicationJson> applicationJsons;
        public Builder() {}
        public Builder(GetOpenapiSpecItemPathsOrganizationsGetResponsesStatus200Examples defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationJsons = defaults.applicationJsons;
        }

        @CustomType.Setter
        public Builder applicationJsons(List<GetOpenapiSpecItemPathsOrganizationsGetResponsesStatus200ExamplesApplicationJson> applicationJsons) {
            if (applicationJsons == null) {
              throw new MissingRequiredPropertyException("GetOpenapiSpecItemPathsOrganizationsGetResponsesStatus200Examples", "applicationJsons");
            }
            this.applicationJsons = applicationJsons;
            return this;
        }
        public Builder applicationJsons(GetOpenapiSpecItemPathsOrganizationsGetResponsesStatus200ExamplesApplicationJson... applicationJsons) {
            return applicationJsons(List.of(applicationJsons));
        }
        public GetOpenapiSpecItemPathsOrganizationsGetResponsesStatus200Examples build() {
            final var _resultValue = new GetOpenapiSpecItemPathsOrganizationsGetResponsesStatus200Examples();
            _resultValue.applicationJsons = applicationJsons;
            return _resultValue;
        }
    }
}