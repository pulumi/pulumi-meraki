// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategoryApplication;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategory {
    /**
     * @return Details of the associated applications
     * 
     */
    private List<GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategoryApplication> applications;
    /**
     * @return The id of the category
     * 
     */
    private String id;
    /**
     * @return The name of the category
     * 
     */
    private String name;

    private GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategory() {}
    /**
     * @return Details of the associated applications
     * 
     */
    public List<GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategoryApplication> applications() {
        return this.applications;
    }
    /**
     * @return The id of the category
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the category
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategory defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategoryApplication> applications;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applications = defaults.applications;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder applications(List<GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategoryApplication> applications) {
            if (applications == null) {
              throw new MissingRequiredPropertyException("GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategory", "applications");
            }
            this.applications = applications;
            return this;
        }
        public Builder applications(GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategoryApplication... applications) {
            return applications(List.of(applications));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategory", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategory", "name");
            }
            this.name = name;
            return this;
        }
        public GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategory build() {
            final var _resultValue = new GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategory();
            _resultValue.applications = applications;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}