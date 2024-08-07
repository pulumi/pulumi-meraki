// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimitsCellular;
import com.pulumi.meraki.networks.outputs.GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimitsWan1;
import com.pulumi.meraki.networks.outputs.GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimitsWan2;
import java.util.Objects;

@CustomType
public final class GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimits {
    /**
     * @return uplink cellular configured limits [optional]
     * 
     */
    private GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimitsCellular cellular;
    /**
     * @return uplink wan1 configured limits [optional]
     * 
     */
    private GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimitsWan1 wan1;
    /**
     * @return uplink wan2 configured limits [optional]
     * 
     */
    private GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimitsWan2 wan2;

    private GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimits() {}
    /**
     * @return uplink cellular configured limits [optional]
     * 
     */
    public GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimitsCellular cellular() {
        return this.cellular;
    }
    /**
     * @return uplink wan1 configured limits [optional]
     * 
     */
    public GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimitsWan1 wan1() {
        return this.wan1;
    }
    /**
     * @return uplink wan2 configured limits [optional]
     * 
     */
    public GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimitsWan2 wan2() {
        return this.wan2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimits defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimitsCellular cellular;
        private GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimitsWan1 wan1;
        private GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimitsWan2 wan2;
        public Builder() {}
        public Builder(GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimits defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cellular = defaults.cellular;
    	      this.wan1 = defaults.wan1;
    	      this.wan2 = defaults.wan2;
        }

        @CustomType.Setter
        public Builder cellular(GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimitsCellular cellular) {
            if (cellular == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimits", "cellular");
            }
            this.cellular = cellular;
            return this;
        }
        @CustomType.Setter
        public Builder wan1(GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimitsWan1 wan1) {
            if (wan1 == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimits", "wan1");
            }
            this.wan1 = wan1;
            return this;
        }
        @CustomType.Setter
        public Builder wan2(GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimitsWan2 wan2) {
            if (wan2 == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimits", "wan2");
            }
            this.wan2 = wan2;
            return this;
        }
        public GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimits build() {
            final var _resultValue = new GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimits();
            _resultValue.cellular = cellular;
            _resultValue.wan1 = wan1;
            _resultValue.wan2 = wan2;
            return _resultValue;
        }
    }
}
