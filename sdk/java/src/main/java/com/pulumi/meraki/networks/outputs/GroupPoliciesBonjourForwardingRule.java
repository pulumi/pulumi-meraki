// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GroupPoliciesBonjourForwardingRule {
    /**
     * @return A description for your Bonjour forwarding rule. Optional.
     * 
     */
    private @Nullable String description;
    /**
     * @return A list of Bonjour services. At least one service must be specified. Available services are &#39;All Services&#39;, &#39;AirPlay&#39;, &#39;AFP&#39;, &#39;BitTorrent&#39;, &#39;FTP&#39;, &#39;iChat&#39;, &#39;iTunes&#39;, &#39;Printers&#39;, &#39;Samba&#39;, &#39;Scanners&#39; and &#39;SSH&#39;
     * 
     */
    private @Nullable List<String> services;
    /**
     * @return The ID of the service VLAN. Required.
     * 
     */
    private @Nullable String vlanId;

    private GroupPoliciesBonjourForwardingRule() {}
    /**
     * @return A description for your Bonjour forwarding rule. Optional.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return A list of Bonjour services. At least one service must be specified. Available services are &#39;All Services&#39;, &#39;AirPlay&#39;, &#39;AFP&#39;, &#39;BitTorrent&#39;, &#39;FTP&#39;, &#39;iChat&#39;, &#39;iTunes&#39;, &#39;Printers&#39;, &#39;Samba&#39;, &#39;Scanners&#39; and &#39;SSH&#39;
     * 
     */
    public List<String> services() {
        return this.services == null ? List.of() : this.services;
    }
    /**
     * @return The ID of the service VLAN. Required.
     * 
     */
    public Optional<String> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupPoliciesBonjourForwardingRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<String> services;
        private @Nullable String vlanId;
        public Builder() {}
        public Builder(GroupPoliciesBonjourForwardingRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.services = defaults.services;
    	      this.vlanId = defaults.vlanId;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder services(@Nullable List<String> services) {

            this.services = services;
            return this;
        }
        public Builder services(String... services) {
            return services(List.of(services));
        }
        @CustomType.Setter
        public Builder vlanId(@Nullable String vlanId) {

            this.vlanId = vlanId;
            return this;
        }
        public GroupPoliciesBonjourForwardingRule build() {
            final var _resultValue = new GroupPoliciesBonjourForwardingRule();
            _resultValue.description = description;
            _resultValue.services = services;
            _resultValue.vlanId = vlanId;
            return _resultValue;
        }
    }
}
