// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetGroupPoliciesItemFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimitsBandwidthLimits;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGroupPoliciesItemFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimits {
    /**
     * @return The bandwidth limits object, specifying the upload (&#39;limitUp&#39;) and download (&#39;limitDown&#39;) speed in Kbps. These are only enforced if &#39;settings&#39; is set to &#39;custom&#39;.
     * 
     */
    private GetGroupPoliciesItemFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimitsBandwidthLimits bandwidthLimits;
    /**
     * @return How bandwidth limits are applied by your rule. Can be one of &#39;network default&#39;, &#39;ignore&#39; or &#39;custom&#39;.
     * 
     */
    private String settings;

    private GetGroupPoliciesItemFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimits() {}
    /**
     * @return The bandwidth limits object, specifying the upload (&#39;limitUp&#39;) and download (&#39;limitDown&#39;) speed in Kbps. These are only enforced if &#39;settings&#39; is set to &#39;custom&#39;.
     * 
     */
    public GetGroupPoliciesItemFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimitsBandwidthLimits bandwidthLimits() {
        return this.bandwidthLimits;
    }
    /**
     * @return How bandwidth limits are applied by your rule. Can be one of &#39;network default&#39;, &#39;ignore&#39; or &#39;custom&#39;.
     * 
     */
    public String settings() {
        return this.settings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupPoliciesItemFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimits defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetGroupPoliciesItemFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimitsBandwidthLimits bandwidthLimits;
        private String settings;
        public Builder() {}
        public Builder(GetGroupPoliciesItemFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimits defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidthLimits = defaults.bandwidthLimits;
    	      this.settings = defaults.settings;
        }

        @CustomType.Setter
        public Builder bandwidthLimits(GetGroupPoliciesItemFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimitsBandwidthLimits bandwidthLimits) {
            if (bandwidthLimits == null) {
              throw new MissingRequiredPropertyException("GetGroupPoliciesItemFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimits", "bandwidthLimits");
            }
            this.bandwidthLimits = bandwidthLimits;
            return this;
        }
        @CustomType.Setter
        public Builder settings(String settings) {
            if (settings == null) {
              throw new MissingRequiredPropertyException("GetGroupPoliciesItemFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimits", "settings");
            }
            this.settings = settings;
            return this;
        }
        public GetGroupPoliciesItemFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimits build() {
            final var _resultValue = new GetGroupPoliciesItemFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimits();
            _resultValue.bandwidthLimits = bandwidthLimits;
            _resultValue.settings = settings;
            return _resultValue;
        }
    }
}