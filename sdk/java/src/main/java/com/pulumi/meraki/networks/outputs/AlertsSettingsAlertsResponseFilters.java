// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertsSettingsAlertsResponseFilters {
    private @Nullable Integer period;
    private @Nullable Integer threshold;
    private @Nullable Integer timeout;

    private AlertsSettingsAlertsResponseFilters() {}
    public Optional<Integer> period() {
        return Optional.ofNullable(this.period);
    }
    public Optional<Integer> threshold() {
        return Optional.ofNullable(this.threshold);
    }
    public Optional<Integer> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertsSettingsAlertsResponseFilters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer period;
        private @Nullable Integer threshold;
        private @Nullable Integer timeout;
        public Builder() {}
        public Builder(AlertsSettingsAlertsResponseFilters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.period = defaults.period;
    	      this.threshold = defaults.threshold;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder period(@Nullable Integer period) {

            this.period = period;
            return this;
        }
        @CustomType.Setter
        public Builder threshold(@Nullable Integer threshold) {

            this.threshold = threshold;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(@Nullable Integer timeout) {

            this.timeout = timeout;
            return this;
        }
        public AlertsSettingsAlertsResponseFilters build() {
            final var _resultValue = new AlertsSettingsAlertsResponseFilters();
            _resultValue.period = period;
            _resultValue.threshold = threshold;
            _resultValue.timeout = timeout;
            return _resultValue;
        }
    }
}