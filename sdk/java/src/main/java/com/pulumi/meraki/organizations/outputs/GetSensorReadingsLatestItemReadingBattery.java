// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetSensorReadingsLatestItemReadingBattery {
    /**
     * @return Remaining battery life.
     * 
     */
    private Integer percentage;

    private GetSensorReadingsLatestItemReadingBattery() {}
    /**
     * @return Remaining battery life.
     * 
     */
    public Integer percentage() {
        return this.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSensorReadingsLatestItemReadingBattery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer percentage;
        public Builder() {}
        public Builder(GetSensorReadingsLatestItemReadingBattery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.percentage = defaults.percentage;
        }

        @CustomType.Setter
        public Builder percentage(Integer percentage) {
            if (percentage == null) {
              throw new MissingRequiredPropertyException("GetSensorReadingsLatestItemReadingBattery", "percentage");
            }
            this.percentage = percentage;
            return this;
        }
        public GetSensorReadingsLatestItemReadingBattery build() {
            final var _resultValue = new GetSensorReadingsLatestItemReadingBattery();
            _resultValue.percentage = percentage;
            return _resultValue;
        }
    }
}