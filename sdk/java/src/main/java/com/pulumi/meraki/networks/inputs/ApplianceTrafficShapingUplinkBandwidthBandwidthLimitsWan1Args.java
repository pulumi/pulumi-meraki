// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1Args extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1Args Empty = new ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1Args();

    /**
     * configured DOWN limit for the uplink (in Kbps).  Null indicated unlimited
     * 
     */
    @Import(name="limitDown")
    private @Nullable Output<Integer> limitDown;

    /**
     * @return configured DOWN limit for the uplink (in Kbps).  Null indicated unlimited
     * 
     */
    public Optional<Output<Integer>> limitDown() {
        return Optional.ofNullable(this.limitDown);
    }

    /**
     * configured UP limit for the uplink (in Kbps).  Null indicated unlimited
     * 
     */
    @Import(name="limitUp")
    private @Nullable Output<Integer> limitUp;

    /**
     * @return configured UP limit for the uplink (in Kbps).  Null indicated unlimited
     * 
     */
    public Optional<Output<Integer>> limitUp() {
        return Optional.ofNullable(this.limitUp);
    }

    private ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1Args() {}

    private ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1Args(ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1Args $) {
        this.limitDown = $.limitDown;
        this.limitUp = $.limitUp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1Args $;

        public Builder() {
            $ = new ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1Args();
        }

        public Builder(ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1Args defaults) {
            $ = new ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param limitDown configured DOWN limit for the uplink (in Kbps).  Null indicated unlimited
         * 
         * @return builder
         * 
         */
        public Builder limitDown(@Nullable Output<Integer> limitDown) {
            $.limitDown = limitDown;
            return this;
        }

        /**
         * @param limitDown configured DOWN limit for the uplink (in Kbps).  Null indicated unlimited
         * 
         * @return builder
         * 
         */
        public Builder limitDown(Integer limitDown) {
            return limitDown(Output.of(limitDown));
        }

        /**
         * @param limitUp configured UP limit for the uplink (in Kbps).  Null indicated unlimited
         * 
         * @return builder
         * 
         */
        public Builder limitUp(@Nullable Output<Integer> limitUp) {
            $.limitUp = limitUp;
            return this;
        }

        /**
         * @param limitUp configured UP limit for the uplink (in Kbps).  Null indicated unlimited
         * 
         * @return builder
         * 
         */
        public Builder limitUp(Integer limitUp) {
            return limitUp(Output.of(limitUp));
        }

        public ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1Args build() {
            return $;
        }
    }

}