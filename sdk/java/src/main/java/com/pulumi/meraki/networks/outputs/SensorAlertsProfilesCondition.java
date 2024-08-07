// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.SensorAlertsProfilesConditionThreshold;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SensorAlertsProfilesCondition {
    /**
     * @return If &#39;above&#39;, an alert will be sent when a sensor reads above the threshold. If &#39;below&#39;, an alert will be sent when a sensor reads below the threshold. Only applicable for temperature, humidity, realPower, apparentPower, powerFactor, voltage, current, and frequency thresholds.
     * 
     */
    private @Nullable String direction;
    /**
     * @return Length of time in seconds that the triggering state must persist before an alert is sent. Available options are 0 seconds, 1 minute, 2 minutes, 3 minutes, 4 minutes, 5 minutes, 10 minutes, 15 minutes, 30 minutes, 1 hour, 2 hours, 4 hours, and 8 hours. Default is 0.
     * 
     */
    private @Nullable Integer duration;
    /**
     * @return The type of sensor metric that will be monitored for changes. Available metrics are apparentPower, co2, current, door, frequency, humidity, indoorAirQuality, noise, pm25, powerFactor, realPower, temperature, tvoc, upstreamPower, voltage, and water.
     * 
     */
    private @Nullable String metric;
    /**
     * @return Threshold for sensor readings that will cause an alert to be sent. This object should contain a single property key matching the condition&#39;s &#39;metric&#39; value.
     * 
     */
    private @Nullable SensorAlertsProfilesConditionThreshold threshold;

    private SensorAlertsProfilesCondition() {}
    /**
     * @return If &#39;above&#39;, an alert will be sent when a sensor reads above the threshold. If &#39;below&#39;, an alert will be sent when a sensor reads below the threshold. Only applicable for temperature, humidity, realPower, apparentPower, powerFactor, voltage, current, and frequency thresholds.
     * 
     */
    public Optional<String> direction() {
        return Optional.ofNullable(this.direction);
    }
    /**
     * @return Length of time in seconds that the triggering state must persist before an alert is sent. Available options are 0 seconds, 1 minute, 2 minutes, 3 minutes, 4 minutes, 5 minutes, 10 minutes, 15 minutes, 30 minutes, 1 hour, 2 hours, 4 hours, and 8 hours. Default is 0.
     * 
     */
    public Optional<Integer> duration() {
        return Optional.ofNullable(this.duration);
    }
    /**
     * @return The type of sensor metric that will be monitored for changes. Available metrics are apparentPower, co2, current, door, frequency, humidity, indoorAirQuality, noise, pm25, powerFactor, realPower, temperature, tvoc, upstreamPower, voltage, and water.
     * 
     */
    public Optional<String> metric() {
        return Optional.ofNullable(this.metric);
    }
    /**
     * @return Threshold for sensor readings that will cause an alert to be sent. This object should contain a single property key matching the condition&#39;s &#39;metric&#39; value.
     * 
     */
    public Optional<SensorAlertsProfilesConditionThreshold> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SensorAlertsProfilesCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String direction;
        private @Nullable Integer duration;
        private @Nullable String metric;
        private @Nullable SensorAlertsProfilesConditionThreshold threshold;
        public Builder() {}
        public Builder(SensorAlertsProfilesCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
    	      this.duration = defaults.duration;
    	      this.metric = defaults.metric;
    	      this.threshold = defaults.threshold;
        }

        @CustomType.Setter
        public Builder direction(@Nullable String direction) {

            this.direction = direction;
            return this;
        }
        @CustomType.Setter
        public Builder duration(@Nullable Integer duration) {

            this.duration = duration;
            return this;
        }
        @CustomType.Setter
        public Builder metric(@Nullable String metric) {

            this.metric = metric;
            return this;
        }
        @CustomType.Setter
        public Builder threshold(@Nullable SensorAlertsProfilesConditionThreshold threshold) {

            this.threshold = threshold;
            return this;
        }
        public SensorAlertsProfilesCondition build() {
            final var _resultValue = new SensorAlertsProfilesCondition();
            _resultValue.direction = direction;
            _resultValue.duration = duration;
            _resultValue.metric = metric;
            _resultValue.threshold = threshold;
            return _resultValue;
        }
    }
}
