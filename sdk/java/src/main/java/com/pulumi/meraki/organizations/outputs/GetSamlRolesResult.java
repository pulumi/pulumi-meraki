// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetSamlRolesItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSamlRolesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private GetSamlRolesItem item;
    /**
     * @return Array of ResponseOrganizationsGetOrganizationSamlRoles
     * 
     */
    private List<GetSamlRolesItem> items;
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    private @Nullable String organizationId;
    /**
     * @return samlRoleId path parameter. Saml role ID
     * 
     */
    private @Nullable String samlRoleId;

    private GetSamlRolesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public GetSamlRolesItem item() {
        return this.item;
    }
    /**
     * @return Array of ResponseOrganizationsGetOrganizationSamlRoles
     * 
     */
    public List<GetSamlRolesItem> items() {
        return this.items;
    }
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Optional<String> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }
    /**
     * @return samlRoleId path parameter. Saml role ID
     * 
     */
    public Optional<String> samlRoleId() {
        return Optional.ofNullable(this.samlRoleId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSamlRolesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private GetSamlRolesItem item;
        private List<GetSamlRolesItem> items;
        private @Nullable String organizationId;
        private @Nullable String samlRoleId;
        public Builder() {}
        public Builder(GetSamlRolesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.item = defaults.item;
    	      this.items = defaults.items;
    	      this.organizationId = defaults.organizationId;
    	      this.samlRoleId = defaults.samlRoleId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSamlRolesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetSamlRolesItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetSamlRolesResult", "item");
            }
            this.item = item;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetSamlRolesItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetSamlRolesResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetSamlRolesItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder organizationId(@Nullable String organizationId) {

            this.organizationId = organizationId;
            return this;
        }
        @CustomType.Setter
        public Builder samlRoleId(@Nullable String samlRoleId) {

            this.samlRoleId = samlRoleId;
            return this;
        }
        public GetSamlRolesResult build() {
            final var _resultValue = new GetSamlRolesResult();
            _resultValue.id = id;
            _resultValue.item = item;
            _resultValue.items = items;
            _resultValue.organizationId = organizationId;
            _resultValue.samlRoleId = samlRoleId;
            return _resultValue;
        }
    }
}
