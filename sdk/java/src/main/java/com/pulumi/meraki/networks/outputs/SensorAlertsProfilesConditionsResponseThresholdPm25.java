// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SensorAlertsProfilesConditionsResponseThresholdPm25 {
    /**
     * @return Alerting threshold as PM2.5 parts per million.
     * 
     */
    private @Nullable Integer concentration;
    /**
     * @return Alerting threshold as a qualitative PM2.5 level.
     * 
     */
    private @Nullable String quality;

    private SensorAlertsProfilesConditionsResponseThresholdPm25() {}
    /**
     * @return Alerting threshold as PM2.5 parts per million.
     * 
     */
    public Optional<Integer> concentration() {
        return Optional.ofNullable(this.concentration);
    }
    /**
     * @return Alerting threshold as a qualitative PM2.5 level.
     * 
     */
    public Optional<String> quality() {
        return Optional.ofNullable(this.quality);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SensorAlertsProfilesConditionsResponseThresholdPm25 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer concentration;
        private @Nullable String quality;
        public Builder() {}
        public Builder(SensorAlertsProfilesConditionsResponseThresholdPm25 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.concentration = defaults.concentration;
    	      this.quality = defaults.quality;
        }

        @CustomType.Setter
        public Builder concentration(@Nullable Integer concentration) {

            this.concentration = concentration;
            return this;
        }
        @CustomType.Setter
        public Builder quality(@Nullable String quality) {

            this.quality = quality;
            return this;
        }
        public SensorAlertsProfilesConditionsResponseThresholdPm25 build() {
            final var _resultValue = new SensorAlertsProfilesConditionsResponseThresholdPm25();
            _resultValue.concentration = concentration;
            _resultValue.quality = quality;
            return _resultValue;
        }
    }
}