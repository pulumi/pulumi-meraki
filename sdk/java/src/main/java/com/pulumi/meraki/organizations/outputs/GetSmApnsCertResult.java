// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetSmApnsCertItem;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSmApnsCertResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private GetSmApnsCertItem item;
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    private String organizationId;

    private GetSmApnsCertResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public GetSmApnsCertItem item() {
        return this.item;
    }
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSmApnsCertResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private GetSmApnsCertItem item;
        private String organizationId;
        public Builder() {}
        public Builder(GetSmApnsCertResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.item = defaults.item;
    	      this.organizationId = defaults.organizationId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSmApnsCertResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetSmApnsCertItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetSmApnsCertResult", "item");
            }
            this.item = item;
            return this;
        }
        @CustomType.Setter
        public Builder organizationId(String organizationId) {
            if (organizationId == null) {
              throw new MissingRequiredPropertyException("GetSmApnsCertResult", "organizationId");
            }
            this.organizationId = organizationId;
            return this;
        }
        public GetSmApnsCertResult build() {
            final var _resultValue = new GetSmApnsCertResult();
            _resultValue.id = id;
            _resultValue.item = item;
            _resultValue.organizationId = organizationId;
            return _resultValue;
        }
    }
}