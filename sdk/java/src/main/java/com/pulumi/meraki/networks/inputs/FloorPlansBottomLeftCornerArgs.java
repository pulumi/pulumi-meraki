// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FloorPlansBottomLeftCornerArgs extends com.pulumi.resources.ResourceArgs {

    public static final FloorPlansBottomLeftCornerArgs Empty = new FloorPlansBottomLeftCornerArgs();

    /**
     * Latitude
     * 
     */
    @Import(name="lat")
    private @Nullable Output<Double> lat;

    /**
     * @return Latitude
     * 
     */
    public Optional<Output<Double>> lat() {
        return Optional.ofNullable(this.lat);
    }

    /**
     * Longitude
     * 
     */
    @Import(name="lng")
    private @Nullable Output<Double> lng;

    /**
     * @return Longitude
     * 
     */
    public Optional<Output<Double>> lng() {
        return Optional.ofNullable(this.lng);
    }

    private FloorPlansBottomLeftCornerArgs() {}

    private FloorPlansBottomLeftCornerArgs(FloorPlansBottomLeftCornerArgs $) {
        this.lat = $.lat;
        this.lng = $.lng;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FloorPlansBottomLeftCornerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FloorPlansBottomLeftCornerArgs $;

        public Builder() {
            $ = new FloorPlansBottomLeftCornerArgs();
        }

        public Builder(FloorPlansBottomLeftCornerArgs defaults) {
            $ = new FloorPlansBottomLeftCornerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lat Latitude
         * 
         * @return builder
         * 
         */
        public Builder lat(@Nullable Output<Double> lat) {
            $.lat = lat;
            return this;
        }

        /**
         * @param lat Latitude
         * 
         * @return builder
         * 
         */
        public Builder lat(Double lat) {
            return lat(Output.of(lat));
        }

        /**
         * @param lng Longitude
         * 
         * @return builder
         * 
         */
        public Builder lng(@Nullable Output<Double> lng) {
            $.lng = lng;
            return this;
        }

        /**
         * @param lng Longitude
         * 
         * @return builder
         * 
         */
        public Builder lng(Double lng) {
            return lng(Output.of(lng));
        }

        public FloorPlansBottomLeftCornerArgs build() {
            return $;
        }
    }

}
