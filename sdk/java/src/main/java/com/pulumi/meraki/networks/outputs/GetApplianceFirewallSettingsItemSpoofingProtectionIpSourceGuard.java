// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplianceFirewallSettingsItemSpoofingProtectionIpSourceGuard {
    private String mode;

    private GetApplianceFirewallSettingsItemSpoofingProtectionIpSourceGuard() {}
    public String mode() {
        return this.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceFirewallSettingsItemSpoofingProtectionIpSourceGuard defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String mode;
        public Builder() {}
        public Builder(GetApplianceFirewallSettingsItemSpoofingProtectionIpSourceGuard defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        @CustomType.Setter
        public Builder mode(String mode) {
            if (mode == null) {
              throw new MissingRequiredPropertyException("GetApplianceFirewallSettingsItemSpoofingProtectionIpSourceGuard", "mode");
            }
            this.mode = mode;
            return this;
        }
        public GetApplianceFirewallSettingsItemSpoofingProtectionIpSourceGuard build() {
            final var _resultValue = new GetApplianceFirewallSettingsItemSpoofingProtectionIpSourceGuard();
            _resultValue.mode = mode;
            return _resultValue;
        }
    }
}
