// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetWirelessSsidsTrafficShapingRulesItemRulePerClientBandwidthLimitsBandwidthLimits {
    /**
     * @return The maximum download limit (integer, in Kbps).
     * 
     */
    private Integer limitDown;
    /**
     * @return The maximum upload limit (integer, in Kbps).
     * 
     */
    private Integer limitUp;

    private GetWirelessSsidsTrafficShapingRulesItemRulePerClientBandwidthLimitsBandwidthLimits() {}
    /**
     * @return The maximum download limit (integer, in Kbps).
     * 
     */
    public Integer limitDown() {
        return this.limitDown;
    }
    /**
     * @return The maximum upload limit (integer, in Kbps).
     * 
     */
    public Integer limitUp() {
        return this.limitUp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessSsidsTrafficShapingRulesItemRulePerClientBandwidthLimitsBandwidthLimits defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer limitDown;
        private Integer limitUp;
        public Builder() {}
        public Builder(GetWirelessSsidsTrafficShapingRulesItemRulePerClientBandwidthLimitsBandwidthLimits defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limitDown = defaults.limitDown;
    	      this.limitUp = defaults.limitUp;
        }

        @CustomType.Setter
        public Builder limitDown(Integer limitDown) {
            if (limitDown == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsTrafficShapingRulesItemRulePerClientBandwidthLimitsBandwidthLimits", "limitDown");
            }
            this.limitDown = limitDown;
            return this;
        }
        @CustomType.Setter
        public Builder limitUp(Integer limitUp) {
            if (limitUp == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsTrafficShapingRulesItemRulePerClientBandwidthLimitsBandwidthLimits", "limitUp");
            }
            this.limitUp = limitUp;
            return this;
        }
        public GetWirelessSsidsTrafficShapingRulesItemRulePerClientBandwidthLimitsBandwidthLimits build() {
            final var _resultValue = new GetWirelessSsidsTrafficShapingRulesItemRulePerClientBandwidthLimitsBandwidthLimits();
            _resultValue.limitDown = limitDown;
            _resultValue.limitUp = limitUp;
            return _resultValue;
        }
    }
}