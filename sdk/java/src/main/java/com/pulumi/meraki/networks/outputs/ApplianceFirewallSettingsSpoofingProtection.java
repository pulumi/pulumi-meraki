// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.ApplianceFirewallSettingsSpoofingProtectionIpSourceGuard;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplianceFirewallSettingsSpoofingProtection {
    /**
     * @return IP source address spoofing settings
     * 
     */
    private @Nullable ApplianceFirewallSettingsSpoofingProtectionIpSourceGuard ipSourceGuard;

    private ApplianceFirewallSettingsSpoofingProtection() {}
    /**
     * @return IP source address spoofing settings
     * 
     */
    public Optional<ApplianceFirewallSettingsSpoofingProtectionIpSourceGuard> ipSourceGuard() {
        return Optional.ofNullable(this.ipSourceGuard);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplianceFirewallSettingsSpoofingProtection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ApplianceFirewallSettingsSpoofingProtectionIpSourceGuard ipSourceGuard;
        public Builder() {}
        public Builder(ApplianceFirewallSettingsSpoofingProtection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipSourceGuard = defaults.ipSourceGuard;
        }

        @CustomType.Setter
        public Builder ipSourceGuard(@Nullable ApplianceFirewallSettingsSpoofingProtectionIpSourceGuard ipSourceGuard) {

            this.ipSourceGuard = ipSourceGuard;
            return this;
        }
        public ApplianceFirewallSettingsSpoofingProtection build() {
            final var _resultValue = new ApplianceFirewallSettingsSpoofingProtection();
            _resultValue.ipSourceGuard = ipSourceGuard;
            return _resultValue;
        }
    }
}