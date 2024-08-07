// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SensorAlertsProfilesConditionsResponseThresholdCurrentArgs extends com.pulumi.resources.ResourceArgs {

    public static final SensorAlertsProfilesConditionsResponseThresholdCurrentArgs Empty = new SensorAlertsProfilesConditionsResponseThresholdCurrentArgs();

    /**
     * Alerting threshold in amps. Must be between 0 and 15.
     * 
     */
    @Import(name="draw")
    private @Nullable Output<Double> draw;

    /**
     * @return Alerting threshold in amps. Must be between 0 and 15.
     * 
     */
    public Optional<Output<Double>> draw() {
        return Optional.ofNullable(this.draw);
    }

    private SensorAlertsProfilesConditionsResponseThresholdCurrentArgs() {}

    private SensorAlertsProfilesConditionsResponseThresholdCurrentArgs(SensorAlertsProfilesConditionsResponseThresholdCurrentArgs $) {
        this.draw = $.draw;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SensorAlertsProfilesConditionsResponseThresholdCurrentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SensorAlertsProfilesConditionsResponseThresholdCurrentArgs $;

        public Builder() {
            $ = new SensorAlertsProfilesConditionsResponseThresholdCurrentArgs();
        }

        public Builder(SensorAlertsProfilesConditionsResponseThresholdCurrentArgs defaults) {
            $ = new SensorAlertsProfilesConditionsResponseThresholdCurrentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param draw Alerting threshold in amps. Must be between 0 and 15.
         * 
         * @return builder
         * 
         */
        public Builder draw(@Nullable Output<Double> draw) {
            $.draw = draw;
            return this;
        }

        /**
         * @param draw Alerting threshold in amps. Must be between 0 and 15.
         * 
         * @return builder
         * 
         */
        public Builder draw(Double draw) {
            return draw(Output.of(draw));
        }

        public SensorAlertsProfilesConditionsResponseThresholdCurrentArgs build() {
            return $;
        }
    }

}
