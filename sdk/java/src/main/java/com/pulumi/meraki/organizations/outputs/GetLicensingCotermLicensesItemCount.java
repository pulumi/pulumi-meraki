// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLicensingCotermLicensesItemCount {
    /**
     * @return The number of counts the license contains of this model
     * 
     */
    private Integer count;
    /**
     * @return The license model type
     * 
     */
    private String model;

    private GetLicensingCotermLicensesItemCount() {}
    /**
     * @return The number of counts the license contains of this model
     * 
     */
    public Integer count() {
        return this.count;
    }
    /**
     * @return The license model type
     * 
     */
    public String model() {
        return this.model;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicensingCotermLicensesItemCount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer count;
        private String model;
        public Builder() {}
        public Builder(GetLicensingCotermLicensesItemCount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.model = defaults.model;
        }

        @CustomType.Setter
        public Builder count(Integer count) {
            if (count == null) {
              throw new MissingRequiredPropertyException("GetLicensingCotermLicensesItemCount", "count");
            }
            this.count = count;
            return this;
        }
        @CustomType.Setter
        public Builder model(String model) {
            if (model == null) {
              throw new MissingRequiredPropertyException("GetLicensingCotermLicensesItemCount", "model");
            }
            this.model = model;
            return this;
        }
        public GetLicensingCotermLicensesItemCount build() {
            final var _resultValue = new GetLicensingCotermLicensesItemCount();
            _resultValue.count = count;
            _resultValue.model = model;
            return _resultValue;
        }
    }
}
