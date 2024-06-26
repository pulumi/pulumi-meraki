// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetGroupPoliciesItemBandwidthBandwidthLimits;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGroupPoliciesItemBandwidth {
    /**
     * @return The bandwidth limits object, specifying upload and download speed for clients bound to the group policy. These are only enforced if &#39;settings&#39; is set to &#39;custom&#39;.
     * 
     */
    private GetGroupPoliciesItemBandwidthBandwidthLimits bandwidthLimits;
    /**
     * @return How bandwidth limits are enforced. Can be &#39;network default&#39;, &#39;ignore&#39; or &#39;custom&#39;.
     * 
     */
    private String settings;

    private GetGroupPoliciesItemBandwidth() {}
    /**
     * @return The bandwidth limits object, specifying upload and download speed for clients bound to the group policy. These are only enforced if &#39;settings&#39; is set to &#39;custom&#39;.
     * 
     */
    public GetGroupPoliciesItemBandwidthBandwidthLimits bandwidthLimits() {
        return this.bandwidthLimits;
    }
    /**
     * @return How bandwidth limits are enforced. Can be &#39;network default&#39;, &#39;ignore&#39; or &#39;custom&#39;.
     * 
     */
    public String settings() {
        return this.settings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupPoliciesItemBandwidth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetGroupPoliciesItemBandwidthBandwidthLimits bandwidthLimits;
        private String settings;
        public Builder() {}
        public Builder(GetGroupPoliciesItemBandwidth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidthLimits = defaults.bandwidthLimits;
    	      this.settings = defaults.settings;
        }

        @CustomType.Setter
        public Builder bandwidthLimits(GetGroupPoliciesItemBandwidthBandwidthLimits bandwidthLimits) {
            if (bandwidthLimits == null) {
              throw new MissingRequiredPropertyException("GetGroupPoliciesItemBandwidth", "bandwidthLimits");
            }
            this.bandwidthLimits = bandwidthLimits;
            return this;
        }
        @CustomType.Setter
        public Builder settings(String settings) {
            if (settings == null) {
              throw new MissingRequiredPropertyException("GetGroupPoliciesItemBandwidth", "settings");
            }
            this.settings = settings;
            return this;
        }
        public GetGroupPoliciesItemBandwidth build() {
            final var _resultValue = new GetGroupPoliciesItemBandwidth();
            _resultValue.bandwidthLimits = bandwidthLimits;
            _resultValue.settings = settings;
            return _resultValue;
        }
    }
}
