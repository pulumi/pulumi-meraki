// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetApplianceTrafficShapingRulesItemRulePerClientBandwidthLimitsBandwidthLimits {
    private Integer limitDown;
    private Integer limitUp;

    private GetApplianceTrafficShapingRulesItemRulePerClientBandwidthLimitsBandwidthLimits() {}
    public Integer limitDown() {
        return this.limitDown;
    }
    public Integer limitUp() {
        return this.limitUp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceTrafficShapingRulesItemRulePerClientBandwidthLimitsBandwidthLimits defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer limitDown;
        private Integer limitUp;
        public Builder() {}
        public Builder(GetApplianceTrafficShapingRulesItemRulePerClientBandwidthLimitsBandwidthLimits defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limitDown = defaults.limitDown;
    	      this.limitUp = defaults.limitUp;
        }

        @CustomType.Setter
        public Builder limitDown(Integer limitDown) {
            if (limitDown == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingRulesItemRulePerClientBandwidthLimitsBandwidthLimits", "limitDown");
            }
            this.limitDown = limitDown;
            return this;
        }
        @CustomType.Setter
        public Builder limitUp(Integer limitUp) {
            if (limitUp == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingRulesItemRulePerClientBandwidthLimitsBandwidthLimits", "limitUp");
            }
            this.limitUp = limitUp;
            return this;
        }
        public GetApplianceTrafficShapingRulesItemRulePerClientBandwidthLimitsBandwidthLimits build() {
            final var _resultValue = new GetApplianceTrafficShapingRulesItemRulePerClientBandwidthLimitsBandwidthLimits();
            _resultValue.limitDown = limitDown;
            _resultValue.limitUp = limitUp;
            return _resultValue;
        }
    }
}