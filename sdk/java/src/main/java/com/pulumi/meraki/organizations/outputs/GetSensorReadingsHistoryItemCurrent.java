// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class GetSensorReadingsHistoryItemCurrent {
    /**
     * @return Electrical current reading in amperes.
     * 
     */
    private Double draw;

    private GetSensorReadingsHistoryItemCurrent() {}
    /**
     * @return Electrical current reading in amperes.
     * 
     */
    public Double draw() {
        return this.draw;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSensorReadingsHistoryItemCurrent defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double draw;
        public Builder() {}
        public Builder(GetSensorReadingsHistoryItemCurrent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.draw = defaults.draw;
        }

        @CustomType.Setter
        public Builder draw(Double draw) {
            if (draw == null) {
              throw new MissingRequiredPropertyException("GetSensorReadingsHistoryItemCurrent", "draw");
            }
            this.draw = draw;
            return this;
        }
        public GetSensorReadingsHistoryItemCurrent build() {
            final var _resultValue = new GetSensorReadingsHistoryItemCurrent();
            _resultValue.draw = draw;
            return _resultValue;
        }
    }
}
