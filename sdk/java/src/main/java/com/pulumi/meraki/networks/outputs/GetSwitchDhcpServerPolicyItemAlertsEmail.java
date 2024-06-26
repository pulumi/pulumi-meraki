// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetSwitchDhcpServerPolicyItemAlertsEmail {
    /**
     * @return When enabled, send an email if a new DHCP server is seen. Default value is false.
     * 
     */
    private Boolean enabled;

    private GetSwitchDhcpServerPolicyItemAlertsEmail() {}
    /**
     * @return When enabled, send an email if a new DHCP server is seen. Default value is false.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchDhcpServerPolicyItemAlertsEmail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        public Builder() {}
        public Builder(GetSwitchDhcpServerPolicyItemAlertsEmail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetSwitchDhcpServerPolicyItemAlertsEmail", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        public GetSwitchDhcpServerPolicyItemAlertsEmail build() {
            final var _resultValue = new GetSwitchDhcpServerPolicyItemAlertsEmail();
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
