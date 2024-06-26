// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessSsidsLdapServerCaCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessSsidsLdapServerCaCertificateArgs Empty = new WirelessSsidsLdapServerCaCertificateArgs();

    /**
     * The contents of the CA certificate. Must be in PEM or DER format.
     * 
     */
    @Import(name="contents")
    private @Nullable Output<String> contents;

    /**
     * @return The contents of the CA certificate. Must be in PEM or DER format.
     * 
     */
    public Optional<Output<String>> contents() {
        return Optional.ofNullable(this.contents);
    }

    private WirelessSsidsLdapServerCaCertificateArgs() {}

    private WirelessSsidsLdapServerCaCertificateArgs(WirelessSsidsLdapServerCaCertificateArgs $) {
        this.contents = $.contents;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessSsidsLdapServerCaCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessSsidsLdapServerCaCertificateArgs $;

        public Builder() {
            $ = new WirelessSsidsLdapServerCaCertificateArgs();
        }

        public Builder(WirelessSsidsLdapServerCaCertificateArgs defaults) {
            $ = new WirelessSsidsLdapServerCaCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contents The contents of the CA certificate. Must be in PEM or DER format.
         * 
         * @return builder
         * 
         */
        public Builder contents(@Nullable Output<String> contents) {
            $.contents = contents;
            return this;
        }

        /**
         * @param contents The contents of the CA certificate. Must be in PEM or DER format.
         * 
         * @return builder
         * 
         */
        public Builder contents(String contents) {
            return contents(Output.of(contents));
        }

        public WirelessSsidsLdapServerCaCertificateArgs build() {
            return $;
        }
    }

}
