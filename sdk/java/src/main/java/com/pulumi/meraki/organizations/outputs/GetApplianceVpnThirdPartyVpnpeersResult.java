// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetApplianceVpnThirdPartyVpnpeersItem;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplianceVpnThirdPartyVpnpeersResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private GetApplianceVpnThirdPartyVpnpeersItem item;
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    private String organizationId;

    private GetApplianceVpnThirdPartyVpnpeersResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public GetApplianceVpnThirdPartyVpnpeersItem item() {
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

    public static Builder builder(GetApplianceVpnThirdPartyVpnpeersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private GetApplianceVpnThirdPartyVpnpeersItem item;
        private String organizationId;
        public Builder() {}
        public Builder(GetApplianceVpnThirdPartyVpnpeersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.item = defaults.item;
    	      this.organizationId = defaults.organizationId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetApplianceVpnThirdPartyVpnpeersResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetApplianceVpnThirdPartyVpnpeersItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetApplianceVpnThirdPartyVpnpeersResult", "item");
            }
            this.item = item;
            return this;
        }
        @CustomType.Setter
        public Builder organizationId(String organizationId) {
            if (organizationId == null) {
              throw new MissingRequiredPropertyException("GetApplianceVpnThirdPartyVpnpeersResult", "organizationId");
            }
            this.organizationId = organizationId;
            return this;
        }
        public GetApplianceVpnThirdPartyVpnpeersResult build() {
            final var _resultValue = new GetApplianceVpnThirdPartyVpnpeersResult();
            _resultValue.id = id;
            _resultValue.item = item;
            _resultValue.organizationId = organizationId;
            return _resultValue;
        }
    }
}
