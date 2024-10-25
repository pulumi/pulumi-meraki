// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SensorAlertsProfilesConditionsResponseThresholdTemperatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final SensorAlertsProfilesConditionsResponseThresholdTemperatureArgs Empty = new SensorAlertsProfilesConditionsResponseThresholdTemperatureArgs();

    /**
     * Alerting threshold in degrees Celsius.
     * 
     */
    @Import(name="celsius")
    private @Nullable Output<Double> celsius;

    /**
     * @return Alerting threshold in degrees Celsius.
     * 
     */
    public Optional<Output<Double>> celsius() {
        return Optional.ofNullable(this.celsius);
    }

    /**
     * Alerting threshold in degrees Fahrenheit.
     * 
     */
    @Import(name="fahrenheit")
    private @Nullable Output<Double> fahrenheit;

    /**
     * @return Alerting threshold in degrees Fahrenheit.
     * 
     */
    public Optional<Output<Double>> fahrenheit() {
        return Optional.ofNullable(this.fahrenheit);
    }

    /**
     * Alerting threshold as a qualitative temperature level.
     * 
     */
    @Import(name="quality")
    private @Nullable Output<String> quality;

    /**
     * @return Alerting threshold as a qualitative temperature level.
     * 
     */
    public Optional<Output<String>> quality() {
        return Optional.ofNullable(this.quality);
    }

    private SensorAlertsProfilesConditionsResponseThresholdTemperatureArgs() {}

    private SensorAlertsProfilesConditionsResponseThresholdTemperatureArgs(SensorAlertsProfilesConditionsResponseThresholdTemperatureArgs $) {
        this.celsius = $.celsius;
        this.fahrenheit = $.fahrenheit;
        this.quality = $.quality;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SensorAlertsProfilesConditionsResponseThresholdTemperatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SensorAlertsProfilesConditionsResponseThresholdTemperatureArgs $;

        public Builder() {
            $ = new SensorAlertsProfilesConditionsResponseThresholdTemperatureArgs();
        }

        public Builder(SensorAlertsProfilesConditionsResponseThresholdTemperatureArgs defaults) {
            $ = new SensorAlertsProfilesConditionsResponseThresholdTemperatureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param celsius Alerting threshold in degrees Celsius.
         * 
         * @return builder
         * 
         */
        public Builder celsius(@Nullable Output<Double> celsius) {
            $.celsius = celsius;
            return this;
        }

        /**
         * @param celsius Alerting threshold in degrees Celsius.
         * 
         * @return builder
         * 
         */
        public Builder celsius(Double celsius) {
            return celsius(Output.of(celsius));
        }

        /**
         * @param fahrenheit Alerting threshold in degrees Fahrenheit.
         * 
         * @return builder
         * 
         */
        public Builder fahrenheit(@Nullable Output<Double> fahrenheit) {
            $.fahrenheit = fahrenheit;
            return this;
        }

        /**
         * @param fahrenheit Alerting threshold in degrees Fahrenheit.
         * 
         * @return builder
         * 
         */
        public Builder fahrenheit(Double fahrenheit) {
            return fahrenheit(Output.of(fahrenheit));
        }

        /**
         * @param quality Alerting threshold as a qualitative temperature level.
         * 
         * @return builder
         * 
         */
        public Builder quality(@Nullable Output<String> quality) {
            $.quality = quality;
            return this;
        }

        /**
         * @param quality Alerting threshold as a qualitative temperature level.
         * 
         * @return builder
         * 
         */
        public Builder quality(String quality) {
            return quality(Output.of(quality));
        }

        public SensorAlertsProfilesConditionsResponseThresholdTemperatureArgs build() {
            return $;
        }
    }

}
