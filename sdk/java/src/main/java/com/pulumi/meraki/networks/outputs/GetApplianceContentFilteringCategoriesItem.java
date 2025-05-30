// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetApplianceContentFilteringCategoriesItemCategory;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApplianceContentFilteringCategoriesItem {
    private List<GetApplianceContentFilteringCategoriesItemCategory> categories;

    private GetApplianceContentFilteringCategoriesItem() {}
    public List<GetApplianceContentFilteringCategoriesItemCategory> categories() {
        return this.categories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceContentFilteringCategoriesItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetApplianceContentFilteringCategoriesItemCategory> categories;
        public Builder() {}
        public Builder(GetApplianceContentFilteringCategoriesItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
        }

        @CustomType.Setter
        public Builder categories(List<GetApplianceContentFilteringCategoriesItemCategory> categories) {
            if (categories == null) {
              throw new MissingRequiredPropertyException("GetApplianceContentFilteringCategoriesItem", "categories");
            }
            this.categories = categories;
            return this;
        }
        public Builder categories(GetApplianceContentFilteringCategoriesItemCategory... categories) {
            return categories(List.of(categories));
        }
        public GetApplianceContentFilteringCategoriesItem build() {
            final var _resultValue = new GetApplianceContentFilteringCategoriesItem();
            _resultValue.categories = categories;
            return _resultValue;
        }
    }
}
