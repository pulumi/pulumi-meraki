// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValueDestination {
    /**
     * @return CIDR format address (e.g.&#34;192.168.10.1&#34;, which is the same as &#34;192.168.10.1/32&#34;), or &#34;any&#34;
     * 
     */
    private String cidr;
    /**
     * @return E.g.: &#34;any&#34;, &#34;0&#34; (also means &#34;any&#34;), &#34;8080&#34;, &#34;1-1024&#34;
     * 
     */
    private String port;

    private GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValueDestination() {}
    /**
     * @return CIDR format address (e.g.&#34;192.168.10.1&#34;, which is the same as &#34;192.168.10.1/32&#34;), or &#34;any&#34;
     * 
     */
    public String cidr() {
        return this.cidr;
    }
    /**
     * @return E.g.: &#34;any&#34;, &#34;0&#34; (also means &#34;any&#34;), &#34;8080&#34;, &#34;1-1024&#34;
     * 
     */
    public String port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValueDestination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cidr;
        private String port;
        public Builder() {}
        public Builder(GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValueDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.port = defaults.port;
        }

        @CustomType.Setter
        public Builder cidr(String cidr) {
            if (cidr == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValueDestination", "cidr");
            }
            this.cidr = cidr;
            return this;
        }
        @CustomType.Setter
        public Builder port(String port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValueDestination", "port");
            }
            this.port = port;
            return this;
        }
        public GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValueDestination build() {
            final var _resultValue = new GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValueDestination();
            _resultValue.cidr = cidr;
            _resultValue.port = port;
            return _resultValue;
        }
    }
}