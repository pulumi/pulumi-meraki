// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.administered.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.administered.outputs.GetLicensingSubscriptionSubscriptionsComplianceStatusesItemViolationsByProductClassMissing;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLicensingSubscriptionSubscriptionsComplianceStatusesItemViolationsByProductClass {
    /**
     * @return End date of the grace period in ISO 8601 format
     * 
     */
    private String gracePeriodEndsAt;
    /**
     * @return Missing entitlements details
     * 
     */
    private GetLicensingSubscriptionSubscriptionsComplianceStatusesItemViolationsByProductClassMissing missing;
    /**
     * @return Name of the product class
     * 
     */
    private String productClass;

    private GetLicensingSubscriptionSubscriptionsComplianceStatusesItemViolationsByProductClass() {}
    /**
     * @return End date of the grace period in ISO 8601 format
     * 
     */
    public String gracePeriodEndsAt() {
        return this.gracePeriodEndsAt;
    }
    /**
     * @return Missing entitlements details
     * 
     */
    public GetLicensingSubscriptionSubscriptionsComplianceStatusesItemViolationsByProductClassMissing missing() {
        return this.missing;
    }
    /**
     * @return Name of the product class
     * 
     */
    public String productClass() {
        return this.productClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicensingSubscriptionSubscriptionsComplianceStatusesItemViolationsByProductClass defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String gracePeriodEndsAt;
        private GetLicensingSubscriptionSubscriptionsComplianceStatusesItemViolationsByProductClassMissing missing;
        private String productClass;
        public Builder() {}
        public Builder(GetLicensingSubscriptionSubscriptionsComplianceStatusesItemViolationsByProductClass defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gracePeriodEndsAt = defaults.gracePeriodEndsAt;
    	      this.missing = defaults.missing;
    	      this.productClass = defaults.productClass;
        }

        @CustomType.Setter
        public Builder gracePeriodEndsAt(String gracePeriodEndsAt) {
            if (gracePeriodEndsAt == null) {
              throw new MissingRequiredPropertyException("GetLicensingSubscriptionSubscriptionsComplianceStatusesItemViolationsByProductClass", "gracePeriodEndsAt");
            }
            this.gracePeriodEndsAt = gracePeriodEndsAt;
            return this;
        }
        @CustomType.Setter
        public Builder missing(GetLicensingSubscriptionSubscriptionsComplianceStatusesItemViolationsByProductClassMissing missing) {
            if (missing == null) {
              throw new MissingRequiredPropertyException("GetLicensingSubscriptionSubscriptionsComplianceStatusesItemViolationsByProductClass", "missing");
            }
            this.missing = missing;
            return this;
        }
        @CustomType.Setter
        public Builder productClass(String productClass) {
            if (productClass == null) {
              throw new MissingRequiredPropertyException("GetLicensingSubscriptionSubscriptionsComplianceStatusesItemViolationsByProductClass", "productClass");
            }
            this.productClass = productClass;
            return this;
        }
        public GetLicensingSubscriptionSubscriptionsComplianceStatusesItemViolationsByProductClass build() {
            final var _resultValue = new GetLicensingSubscriptionSubscriptionsComplianceStatusesItemViolationsByProductClass();
            _resultValue.gracePeriodEndsAt = gracePeriodEndsAt;
            _resultValue.missing = missing;
            _resultValue.productClass = productClass;
            return _resultValue;
        }
    }
}
