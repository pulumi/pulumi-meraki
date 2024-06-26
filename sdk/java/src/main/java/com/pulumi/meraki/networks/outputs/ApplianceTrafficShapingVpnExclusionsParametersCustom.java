// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplianceTrafficShapingVpnExclusionsParametersCustom {
    /**
     * @return Destination address; hostname required for DNS, IPv4 otherwise.
     * 
     */
    private @Nullable String destination;
    /**
     * @return Destination port.
     * 
     */
    private @Nullable String port;
    /**
     * @return Protocol.
     * 
     */
    private @Nullable String protocol;

    private ApplianceTrafficShapingVpnExclusionsParametersCustom() {}
    /**
     * @return Destination address; hostname required for DNS, IPv4 otherwise.
     * 
     */
    public Optional<String> destination() {
        return Optional.ofNullable(this.destination);
    }
    /**
     * @return Destination port.
     * 
     */
    public Optional<String> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return Protocol.
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplianceTrafficShapingVpnExclusionsParametersCustom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String destination;
        private @Nullable String port;
        private @Nullable String protocol;
        public Builder() {}
        public Builder(ApplianceTrafficShapingVpnExclusionsParametersCustom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        @CustomType.Setter
        public Builder destination(@Nullable String destination) {

            this.destination = destination;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable String port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {

            this.protocol = protocol;
            return this;
        }
        public ApplianceTrafficShapingVpnExclusionsParametersCustom build() {
            final var _resultValue = new ApplianceTrafficShapingVpnExclusionsParametersCustom();
            _resultValue.destination = destination;
            _resultValue.port = port;
            _resultValue.protocol = protocol;
            return _resultValue;
        }
    }
}
