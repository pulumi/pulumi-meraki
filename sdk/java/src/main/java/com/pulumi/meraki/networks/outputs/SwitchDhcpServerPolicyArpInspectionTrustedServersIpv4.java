// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4 {
    /**
     * @return IPv4 address of the trusted server.
     * 
     */
    private @Nullable String address;

    private SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4() {}
    /**
     * @return IPv4 address of the trusted server.
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String address;
        public Builder() {}
        public Builder(SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
        }

        @CustomType.Setter
        public Builder address(@Nullable String address) {

            this.address = address;
            return this;
        }
        public SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4 build() {
            final var _resultValue = new SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4();
            _resultValue.address = address;
            return _resultValue;
        }
    }
}
