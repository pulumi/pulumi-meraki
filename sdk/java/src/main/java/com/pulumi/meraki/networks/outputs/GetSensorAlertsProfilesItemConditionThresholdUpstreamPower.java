// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetSensorAlertsProfilesItemConditionThresholdUpstreamPower {
    /**
     * @return Alerting threshold for an upstream power event. Must be set to true.
     * 
     */
    private Boolean outageDetected;

    private GetSensorAlertsProfilesItemConditionThresholdUpstreamPower() {}
    /**
     * @return Alerting threshold for an upstream power event. Must be set to true.
     * 
     */
    public Boolean outageDetected() {
        return this.outageDetected;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSensorAlertsProfilesItemConditionThresholdUpstreamPower defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean outageDetected;
        public Builder() {}
        public Builder(GetSensorAlertsProfilesItemConditionThresholdUpstreamPower defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.outageDetected = defaults.outageDetected;
        }

        @CustomType.Setter
        public Builder outageDetected(Boolean outageDetected) {
            if (outageDetected == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsProfilesItemConditionThresholdUpstreamPower", "outageDetected");
            }
            this.outageDetected = outageDetected;
            return this;
        }
        public GetSensorAlertsProfilesItemConditionThresholdUpstreamPower build() {
            final var _resultValue = new GetSensorAlertsProfilesItemConditionThresholdUpstreamPower();
            _resultValue.outageDetected = outageDetected;
            return _resultValue;
        }
    }
}
