// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.WirelessSsidsActiveDirectoryCredentialsArgs;
import com.pulumi.meraki.networks.inputs.WirelessSsidsActiveDirectoryServerArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessSsidsActiveDirectoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessSsidsActiveDirectoryArgs Empty = new WirelessSsidsActiveDirectoryArgs();

    /**
     * (Optional) The credentials of the user account to be used by the AP to bind to your Active Directory server. The Active Directory account should have permissions on all your Active Directory servers. Only valid if the splashPage is &#39;Password-protected with Active Directory&#39;.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<WirelessSsidsActiveDirectoryCredentialsArgs> credentials;

    /**
     * @return (Optional) The credentials of the user account to be used by the AP to bind to your Active Directory server. The Active Directory account should have permissions on all your Active Directory servers. Only valid if the splashPage is &#39;Password-protected with Active Directory&#39;.
     * 
     */
    public Optional<Output<WirelessSsidsActiveDirectoryCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The Active Directory servers to be used for authentication.
     * 
     */
    @Import(name="servers")
    private @Nullable Output<List<WirelessSsidsActiveDirectoryServerArgs>> servers;

    /**
     * @return The Active Directory servers to be used for authentication.
     * 
     */
    public Optional<Output<List<WirelessSsidsActiveDirectoryServerArgs>>> servers() {
        return Optional.ofNullable(this.servers);
    }

    private WirelessSsidsActiveDirectoryArgs() {}

    private WirelessSsidsActiveDirectoryArgs(WirelessSsidsActiveDirectoryArgs $) {
        this.credentials = $.credentials;
        this.servers = $.servers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessSsidsActiveDirectoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessSsidsActiveDirectoryArgs $;

        public Builder() {
            $ = new WirelessSsidsActiveDirectoryArgs();
        }

        public Builder(WirelessSsidsActiveDirectoryArgs defaults) {
            $ = new WirelessSsidsActiveDirectoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param credentials (Optional) The credentials of the user account to be used by the AP to bind to your Active Directory server. The Active Directory account should have permissions on all your Active Directory servers. Only valid if the splashPage is &#39;Password-protected with Active Directory&#39;.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<WirelessSsidsActiveDirectoryCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials (Optional) The credentials of the user account to be used by the AP to bind to your Active Directory server. The Active Directory account should have permissions on all your Active Directory servers. Only valid if the splashPage is &#39;Password-protected with Active Directory&#39;.
         * 
         * @return builder
         * 
         */
        public Builder credentials(WirelessSsidsActiveDirectoryCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param servers The Active Directory servers to be used for authentication.
         * 
         * @return builder
         * 
         */
        public Builder servers(@Nullable Output<List<WirelessSsidsActiveDirectoryServerArgs>> servers) {
            $.servers = servers;
            return this;
        }

        /**
         * @param servers The Active Directory servers to be used for authentication.
         * 
         * @return builder
         * 
         */
        public Builder servers(List<WirelessSsidsActiveDirectoryServerArgs> servers) {
            return servers(Output.of(servers));
        }

        /**
         * @param servers The Active Directory servers to be used for authentication.
         * 
         * @return builder
         * 
         */
        public Builder servers(WirelessSsidsActiveDirectoryServerArgs... servers) {
            return servers(List.of(servers));
        }

        public WirelessSsidsActiveDirectoryArgs build() {
            return $;
        }
    }

}
