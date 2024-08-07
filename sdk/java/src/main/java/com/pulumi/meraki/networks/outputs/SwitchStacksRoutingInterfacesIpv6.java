// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchStacksRoutingInterfacesIpv6 {
    /**
     * @return IPv6 address
     * 
     */
    private @Nullable String address;
    /**
     * @return Assignment mode
     * 
     */
    private @Nullable String assignmentMode;
    /**
     * @return IPv6 gateway
     * 
     */
    private @Nullable String gateway;
    /**
     * @return IPv6 subnet
     * 
     */
    private @Nullable String prefix;

    private SwitchStacksRoutingInterfacesIpv6() {}
    /**
     * @return IPv6 address
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    /**
     * @return Assignment mode
     * 
     */
    public Optional<String> assignmentMode() {
        return Optional.ofNullable(this.assignmentMode);
    }
    /**
     * @return IPv6 gateway
     * 
     */
    public Optional<String> gateway() {
        return Optional.ofNullable(this.gateway);
    }
    /**
     * @return IPv6 subnet
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchStacksRoutingInterfacesIpv6 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String address;
        private @Nullable String assignmentMode;
        private @Nullable String gateway;
        private @Nullable String prefix;
        public Builder() {}
        public Builder(SwitchStacksRoutingInterfacesIpv6 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.assignmentMode = defaults.assignmentMode;
    	      this.gateway = defaults.gateway;
    	      this.prefix = defaults.prefix;
        }

        @CustomType.Setter
        public Builder address(@Nullable String address) {

            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder assignmentMode(@Nullable String assignmentMode) {

            this.assignmentMode = assignmentMode;
            return this;
        }
        @CustomType.Setter
        public Builder gateway(@Nullable String gateway) {

            this.gateway = gateway;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(@Nullable String prefix) {

            this.prefix = prefix;
            return this;
        }
        public SwitchStacksRoutingInterfacesIpv6 build() {
            final var _resultValue = new SwitchStacksRoutingInterfacesIpv6();
            _resultValue.address = address;
            _resultValue.assignmentMode = assignmentMode;
            _resultValue.gateway = gateway;
            _resultValue.prefix = prefix;
            return _resultValue;
        }
    }
}
