// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WirelessSsidsDnsRewrite {
    /**
     * @return User specified DNS servers (up to two servers)
     * 
     */
    private @Nullable List<String> dnsCustomNameservers;
    /**
     * @return Boolean indicating whether or not DNS server rewrite is enabled. If disabled, upstream DNS will be used
     * 
     */
    private @Nullable Boolean enabled;

    private WirelessSsidsDnsRewrite() {}
    /**
     * @return User specified DNS servers (up to two servers)
     * 
     */
    public List<String> dnsCustomNameservers() {
        return this.dnsCustomNameservers == null ? List.of() : this.dnsCustomNameservers;
    }
    /**
     * @return Boolean indicating whether or not DNS server rewrite is enabled. If disabled, upstream DNS will be used
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessSsidsDnsRewrite defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> dnsCustomNameservers;
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(WirelessSsidsDnsRewrite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsCustomNameservers = defaults.dnsCustomNameservers;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder dnsCustomNameservers(@Nullable List<String> dnsCustomNameservers) {

            this.dnsCustomNameservers = dnsCustomNameservers;
            return this;
        }
        public Builder dnsCustomNameservers(String... dnsCustomNameservers) {
            return dnsCustomNameservers(List.of(dnsCustomNameservers));
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        public WirelessSsidsDnsRewrite build() {
            final var _resultValue = new WirelessSsidsDnsRewrite();
            _resultValue.dnsCustomNameservers = dnsCustomNameservers;
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
