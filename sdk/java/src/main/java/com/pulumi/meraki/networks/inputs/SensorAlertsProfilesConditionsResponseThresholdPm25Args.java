// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SensorAlertsProfilesConditionsResponseThresholdPm25Args extends com.pulumi.resources.ResourceArgs {

    public static final SensorAlertsProfilesConditionsResponseThresholdPm25Args Empty = new SensorAlertsProfilesConditionsResponseThresholdPm25Args();

    /**
     * Alerting threshold as PM2.5 parts per million.
     * 
     */
    @Import(name="concentration")
    private @Nullable Output<Integer> concentration;

    /**
     * @return Alerting threshold as PM2.5 parts per million.
     * 
     */
    public Optional<Output<Integer>> concentration() {
        return Optional.ofNullable(this.concentration);
    }

    /**
     * Alerting threshold as a qualitative PM2.5 level.
     * 
     */
    @Import(name="quality")
    private @Nullable Output<String> quality;

    /**
     * @return Alerting threshold as a qualitative PM2.5 level.
     * 
     */
    public Optional<Output<String>> quality() {
        return Optional.ofNullable(this.quality);
    }

    private SensorAlertsProfilesConditionsResponseThresholdPm25Args() {}

    private SensorAlertsProfilesConditionsResponseThresholdPm25Args(SensorAlertsProfilesConditionsResponseThresholdPm25Args $) {
        this.concentration = $.concentration;
        this.quality = $.quality;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SensorAlertsProfilesConditionsResponseThresholdPm25Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SensorAlertsProfilesConditionsResponseThresholdPm25Args $;

        public Builder() {
            $ = new SensorAlertsProfilesConditionsResponseThresholdPm25Args();
        }

        public Builder(SensorAlertsProfilesConditionsResponseThresholdPm25Args defaults) {
            $ = new SensorAlertsProfilesConditionsResponseThresholdPm25Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param concentration Alerting threshold as PM2.5 parts per million.
         * 
         * @return builder
         * 
         */
        public Builder concentration(@Nullable Output<Integer> concentration) {
            $.concentration = concentration;
            return this;
        }

        /**
         * @param concentration Alerting threshold as PM2.5 parts per million.
         * 
         * @return builder
         * 
         */
        public Builder concentration(Integer concentration) {
            return concentration(Output.of(concentration));
        }

        /**
         * @param quality Alerting threshold as a qualitative PM2.5 level.
         * 
         * @return builder
         * 
         */
        public Builder quality(@Nullable Output<String> quality) {
            $.quality = quality;
            return this;
        }

        /**
         * @param quality Alerting threshold as a qualitative PM2.5 level.
         * 
         * @return builder
         * 
         */
        public Builder quality(String quality) {
            return quality(Output.of(quality));
        }

        public SensorAlertsProfilesConditionsResponseThresholdPm25Args build() {
            return $;
        }
    }

}
