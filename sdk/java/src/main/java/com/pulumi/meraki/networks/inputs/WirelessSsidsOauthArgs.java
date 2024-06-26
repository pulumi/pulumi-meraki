// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessSsidsOauthArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessSsidsOauthArgs Empty = new WirelessSsidsOauthArgs();

    /**
     * (Optional) The list of domains allowed access to the network.
     * 
     */
    @Import(name="allowedDomains")
    private @Nullable Output<List<String>> allowedDomains;

    /**
     * @return (Optional) The list of domains allowed access to the network.
     * 
     */
    public Optional<Output<List<String>>> allowedDomains() {
        return Optional.ofNullable(this.allowedDomains);
    }

    private WirelessSsidsOauthArgs() {}

    private WirelessSsidsOauthArgs(WirelessSsidsOauthArgs $) {
        this.allowedDomains = $.allowedDomains;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessSsidsOauthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessSsidsOauthArgs $;

        public Builder() {
            $ = new WirelessSsidsOauthArgs();
        }

        public Builder(WirelessSsidsOauthArgs defaults) {
            $ = new WirelessSsidsOauthArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedDomains (Optional) The list of domains allowed access to the network.
         * 
         * @return builder
         * 
         */
        public Builder allowedDomains(@Nullable Output<List<String>> allowedDomains) {
            $.allowedDomains = allowedDomains;
            return this;
        }

        /**
         * @param allowedDomains (Optional) The list of domains allowed access to the network.
         * 
         * @return builder
         * 
         */
        public Builder allowedDomains(List<String> allowedDomains) {
            return allowedDomains(Output.of(allowedDomains));
        }

        /**
         * @param allowedDomains (Optional) The list of domains allowed access to the network.
         * 
         * @return builder
         * 
         */
        public Builder allowedDomains(String... allowedDomains) {
            return allowedDomains(List.of(allowedDomains));
        }

        public WirelessSsidsOauthArgs build() {
            return $;
        }
    }

}
