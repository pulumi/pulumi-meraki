// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SensorAlertsProfilesConditionsResponseThresholdVoltage {
    /**
     * @return Alerting threshold in volts. Must be between 0 and 250.
     * 
     */
    private @Nullable Double level;

    private SensorAlertsProfilesConditionsResponseThresholdVoltage() {}
    /**
     * @return Alerting threshold in volts. Must be between 0 and 250.
     * 
     */
    public Optional<Double> level() {
        return Optional.ofNullable(this.level);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SensorAlertsProfilesConditionsResponseThresholdVoltage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Double level;
        public Builder() {}
        public Builder(SensorAlertsProfilesConditionsResponseThresholdVoltage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.level = defaults.level;
        }

        @CustomType.Setter
        public Builder level(@Nullable Double level) {

            this.level = level;
            return this;
        }
        public SensorAlertsProfilesConditionsResponseThresholdVoltage build() {
            final var _resultValue = new SensorAlertsProfilesConditionsResponseThresholdVoltage();
            _resultValue.level = level;
            return _resultValue;
        }
    }
}