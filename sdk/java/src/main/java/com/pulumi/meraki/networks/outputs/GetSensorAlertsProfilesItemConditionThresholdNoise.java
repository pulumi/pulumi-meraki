// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetSensorAlertsProfilesItemConditionThresholdNoiseAmbient;
import java.util.Objects;

@CustomType
public final class GetSensorAlertsProfilesItemConditionThresholdNoise {
    /**
     * @return Ambient noise threshold. One of &#39;level&#39; or &#39;quality&#39; must be provided.
     * 
     */
    private GetSensorAlertsProfilesItemConditionThresholdNoiseAmbient ambient;

    private GetSensorAlertsProfilesItemConditionThresholdNoise() {}
    /**
     * @return Ambient noise threshold. One of &#39;level&#39; or &#39;quality&#39; must be provided.
     * 
     */
    public GetSensorAlertsProfilesItemConditionThresholdNoiseAmbient ambient() {
        return this.ambient;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSensorAlertsProfilesItemConditionThresholdNoise defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetSensorAlertsProfilesItemConditionThresholdNoiseAmbient ambient;
        public Builder() {}
        public Builder(GetSensorAlertsProfilesItemConditionThresholdNoise defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ambient = defaults.ambient;
        }

        @CustomType.Setter
        public Builder ambient(GetSensorAlertsProfilesItemConditionThresholdNoiseAmbient ambient) {
            if (ambient == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsProfilesItemConditionThresholdNoise", "ambient");
            }
            this.ambient = ambient;
            return this;
        }
        public GetSensorAlertsProfilesItemConditionThresholdNoise build() {
            final var _resultValue = new GetSensorAlertsProfilesItemConditionThresholdNoise();
            _resultValue.ambient = ambient;
            return _resultValue;
        }
    }
}
