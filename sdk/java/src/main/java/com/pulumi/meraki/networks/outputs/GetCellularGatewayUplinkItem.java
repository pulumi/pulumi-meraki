// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetCellularGatewayUplinkItemBandwidthLimits;
import java.util.Objects;

@CustomType
public final class GetCellularGatewayUplinkItem {
    /**
     * @return The bandwidth settings for the &#39;cellular&#39; uplink
     * 
     */
    private GetCellularGatewayUplinkItemBandwidthLimits bandwidthLimits;

    private GetCellularGatewayUplinkItem() {}
    /**
     * @return The bandwidth settings for the &#39;cellular&#39; uplink
     * 
     */
    public GetCellularGatewayUplinkItemBandwidthLimits bandwidthLimits() {
        return this.bandwidthLimits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCellularGatewayUplinkItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetCellularGatewayUplinkItemBandwidthLimits bandwidthLimits;
        public Builder() {}
        public Builder(GetCellularGatewayUplinkItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidthLimits = defaults.bandwidthLimits;
        }

        @CustomType.Setter
        public Builder bandwidthLimits(GetCellularGatewayUplinkItemBandwidthLimits bandwidthLimits) {
            if (bandwidthLimits == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewayUplinkItem", "bandwidthLimits");
            }
            this.bandwidthLimits = bandwidthLimits;
            return this;
        }
        public GetCellularGatewayUplinkItem build() {
            final var _resultValue = new GetCellularGatewayUplinkItem();
            _resultValue.bandwidthLimits = bandwidthLimits;
            return _resultValue;
        }
    }
}
