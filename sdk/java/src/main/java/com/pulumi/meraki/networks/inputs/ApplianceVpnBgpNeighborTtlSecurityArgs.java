// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceVpnBgpNeighborTtlSecurityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceVpnBgpNeighborTtlSecurityArgs Empty = new ApplianceVpnBgpNeighborTtlSecurityArgs();

    /**
     * Boolean value to enable or disable BGP TTL security.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Boolean value to enable or disable BGP TTL security.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ApplianceVpnBgpNeighborTtlSecurityArgs() {}

    private ApplianceVpnBgpNeighborTtlSecurityArgs(ApplianceVpnBgpNeighborTtlSecurityArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceVpnBgpNeighborTtlSecurityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceVpnBgpNeighborTtlSecurityArgs $;

        public Builder() {
            $ = new ApplianceVpnBgpNeighborTtlSecurityArgs();
        }

        public Builder(ApplianceVpnBgpNeighborTtlSecurityArgs defaults) {
            $ = new ApplianceVpnBgpNeighborTtlSecurityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Boolean value to enable or disable BGP TTL security.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Boolean value to enable or disable BGP TTL security.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ApplianceVpnBgpNeighborTtlSecurityArgs build() {
            return $;
        }
    }

}