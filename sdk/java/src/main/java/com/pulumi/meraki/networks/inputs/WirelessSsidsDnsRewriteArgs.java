// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessSsidsDnsRewriteArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessSsidsDnsRewriteArgs Empty = new WirelessSsidsDnsRewriteArgs();

    /**
     * User specified DNS servers (up to two servers)
     * 
     */
    @Import(name="dnsCustomNameservers")
    private @Nullable Output<List<String>> dnsCustomNameservers;

    /**
     * @return User specified DNS servers (up to two servers)
     * 
     */
    public Optional<Output<List<String>>> dnsCustomNameservers() {
        return Optional.ofNullable(this.dnsCustomNameservers);
    }

    /**
     * Boolean indicating whether or not DNS server rewrite is enabled. If disabled, upstream DNS will be used
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Boolean indicating whether or not DNS server rewrite is enabled. If disabled, upstream DNS will be used
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private WirelessSsidsDnsRewriteArgs() {}

    private WirelessSsidsDnsRewriteArgs(WirelessSsidsDnsRewriteArgs $) {
        this.dnsCustomNameservers = $.dnsCustomNameservers;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessSsidsDnsRewriteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessSsidsDnsRewriteArgs $;

        public Builder() {
            $ = new WirelessSsidsDnsRewriteArgs();
        }

        public Builder(WirelessSsidsDnsRewriteArgs defaults) {
            $ = new WirelessSsidsDnsRewriteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dnsCustomNameservers User specified DNS servers (up to two servers)
         * 
         * @return builder
         * 
         */
        public Builder dnsCustomNameservers(@Nullable Output<List<String>> dnsCustomNameservers) {
            $.dnsCustomNameservers = dnsCustomNameservers;
            return this;
        }

        /**
         * @param dnsCustomNameservers User specified DNS servers (up to two servers)
         * 
         * @return builder
         * 
         */
        public Builder dnsCustomNameservers(List<String> dnsCustomNameservers) {
            return dnsCustomNameservers(Output.of(dnsCustomNameservers));
        }

        /**
         * @param dnsCustomNameservers User specified DNS servers (up to two servers)
         * 
         * @return builder
         * 
         */
        public Builder dnsCustomNameservers(String... dnsCustomNameservers) {
            return dnsCustomNameservers(List.of(dnsCustomNameservers));
        }

        /**
         * @param enabled Boolean indicating whether or not DNS server rewrite is enabled. If disabled, upstream DNS will be used
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Boolean indicating whether or not DNS server rewrite is enabled. If disabled, upstream DNS will be used
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public WirelessSsidsDnsRewriteArgs build() {
            return $;
        }
    }

}
