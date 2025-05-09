// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.WirelessSsidsActiveDirectoryCredentials;
import com.pulumi.meraki.networks.outputs.WirelessSsidsActiveDirectoryServer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WirelessSsidsActiveDirectory {
    /**
     * @return (Optional) The credentials of the user account to be used by the AP to bind to your Active Directory server. The Active Directory account should have permissions on all your Active Directory servers. Only valid if the splashPage is &#39;Password-protected with Active Directory&#39;.
     * 
     */
    private @Nullable WirelessSsidsActiveDirectoryCredentials credentials;
    /**
     * @return The Active Directory servers to be used for authentication.
     * 
     */
    private @Nullable List<WirelessSsidsActiveDirectoryServer> servers;

    private WirelessSsidsActiveDirectory() {}
    /**
     * @return (Optional) The credentials of the user account to be used by the AP to bind to your Active Directory server. The Active Directory account should have permissions on all your Active Directory servers. Only valid if the splashPage is &#39;Password-protected with Active Directory&#39;.
     * 
     */
    public Optional<WirelessSsidsActiveDirectoryCredentials> credentials() {
        return Optional.ofNullable(this.credentials);
    }
    /**
     * @return The Active Directory servers to be used for authentication.
     * 
     */
    public List<WirelessSsidsActiveDirectoryServer> servers() {
        return this.servers == null ? List.of() : this.servers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessSsidsActiveDirectory defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WirelessSsidsActiveDirectoryCredentials credentials;
        private @Nullable List<WirelessSsidsActiveDirectoryServer> servers;
        public Builder() {}
        public Builder(WirelessSsidsActiveDirectory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.servers = defaults.servers;
        }

        @CustomType.Setter
        public Builder credentials(@Nullable WirelessSsidsActiveDirectoryCredentials credentials) {

            this.credentials = credentials;
            return this;
        }
        @CustomType.Setter
        public Builder servers(@Nullable List<WirelessSsidsActiveDirectoryServer> servers) {

            this.servers = servers;
            return this;
        }
        public Builder servers(WirelessSsidsActiveDirectoryServer... servers) {
            return servers(List.of(servers));
        }
        public WirelessSsidsActiveDirectory build() {
            final var _resultValue = new WirelessSsidsActiveDirectory();
            _resultValue.credentials = credentials;
            _resultValue.servers = servers;
            return _resultValue;
        }
    }
}
