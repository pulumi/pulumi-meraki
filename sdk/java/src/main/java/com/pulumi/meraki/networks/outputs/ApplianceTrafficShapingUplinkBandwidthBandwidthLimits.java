// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsCellular;
import com.pulumi.meraki.networks.outputs.ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1;
import com.pulumi.meraki.networks.outputs.ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan2;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplianceTrafficShapingUplinkBandwidthBandwidthLimits {
    /**
     * @return uplink cellular configured limits [optional]
     * 
     */
    private @Nullable ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsCellular cellular;
    /**
     * @return uplink wan1 configured limits [optional]
     * 
     */
    private @Nullable ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1 wan1;
    /**
     * @return uplink wan2 configured limits [optional]
     * 
     */
    private @Nullable ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan2 wan2;

    private ApplianceTrafficShapingUplinkBandwidthBandwidthLimits() {}
    /**
     * @return uplink cellular configured limits [optional]
     * 
     */
    public Optional<ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsCellular> cellular() {
        return Optional.ofNullable(this.cellular);
    }
    /**
     * @return uplink wan1 configured limits [optional]
     * 
     */
    public Optional<ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1> wan1() {
        return Optional.ofNullable(this.wan1);
    }
    /**
     * @return uplink wan2 configured limits [optional]
     * 
     */
    public Optional<ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan2> wan2() {
        return Optional.ofNullable(this.wan2);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplianceTrafficShapingUplinkBandwidthBandwidthLimits defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsCellular cellular;
        private @Nullable ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1 wan1;
        private @Nullable ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan2 wan2;
        public Builder() {}
        public Builder(ApplianceTrafficShapingUplinkBandwidthBandwidthLimits defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cellular = defaults.cellular;
    	      this.wan1 = defaults.wan1;
    	      this.wan2 = defaults.wan2;
        }

        @CustomType.Setter
        public Builder cellular(@Nullable ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsCellular cellular) {

            this.cellular = cellular;
            return this;
        }
        @CustomType.Setter
        public Builder wan1(@Nullable ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1 wan1) {

            this.wan1 = wan1;
            return this;
        }
        @CustomType.Setter
        public Builder wan2(@Nullable ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan2 wan2) {

            this.wan2 = wan2;
            return this;
        }
        public ApplianceTrafficShapingUplinkBandwidthBandwidthLimits build() {
            final var _resultValue = new ApplianceTrafficShapingUplinkBandwidthBandwidthLimits();
            _resultValue.cellular = cellular;
            _resultValue.wan1 = wan1;
            _resultValue.wan2 = wan2;
            return _resultValue;
        }
    }
}