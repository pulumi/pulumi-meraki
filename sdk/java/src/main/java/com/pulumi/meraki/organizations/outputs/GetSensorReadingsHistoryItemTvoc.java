// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetSensorReadingsHistoryItemTvoc {
    /**
     * @return TVOC reading in micrograms per cubic meter.
     * 
     */
    private Integer concentration;

    private GetSensorReadingsHistoryItemTvoc() {}
    /**
     * @return TVOC reading in micrograms per cubic meter.
     * 
     */
    public Integer concentration() {
        return this.concentration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSensorReadingsHistoryItemTvoc defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer concentration;
        public Builder() {}
        public Builder(GetSensorReadingsHistoryItemTvoc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.concentration = defaults.concentration;
        }

        @CustomType.Setter
        public Builder concentration(Integer concentration) {
            if (concentration == null) {
              throw new MissingRequiredPropertyException("GetSensorReadingsHistoryItemTvoc", "concentration");
            }
            this.concentration = concentration;
            return this;
        }
        public GetSensorReadingsHistoryItemTvoc build() {
            final var _resultValue = new GetSensorReadingsHistoryItemTvoc();
            _resultValue.concentration = concentration;
            return _resultValue;
        }
    }
}