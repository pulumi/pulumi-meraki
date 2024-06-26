// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.ClientsSplashAuthorizationStatusSsidsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientsSplashAuthorizationStatusState extends com.pulumi.resources.ResourceArgs {

    public static final ClientsSplashAuthorizationStatusState Empty = new ClientsSplashAuthorizationStatusState();

    /**
     * clientId path parameter. Client ID
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return clientId path parameter. Client ID
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    /**
     * The target SSIDs. Each SSID must be enabled and must have Click-through splash enabled. For each SSID where isAuthorized is true, the expiration time will automatically be set according to the SSID&#39;s splash frequency. Not all networks support configuring all SSIDs
     * 
     */
    @Import(name="ssids")
    private @Nullable Output<ClientsSplashAuthorizationStatusSsidsArgs> ssids;

    /**
     * @return The target SSIDs. Each SSID must be enabled and must have Click-through splash enabled. For each SSID where isAuthorized is true, the expiration time will automatically be set according to the SSID&#39;s splash frequency. Not all networks support configuring all SSIDs
     * 
     */
    public Optional<Output<ClientsSplashAuthorizationStatusSsidsArgs>> ssids() {
        return Optional.ofNullable(this.ssids);
    }

    private ClientsSplashAuthorizationStatusState() {}

    private ClientsSplashAuthorizationStatusState(ClientsSplashAuthorizationStatusState $) {
        this.clientId = $.clientId;
        this.networkId = $.networkId;
        this.ssids = $.ssids;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientsSplashAuthorizationStatusState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientsSplashAuthorizationStatusState $;

        public Builder() {
            $ = new ClientsSplashAuthorizationStatusState();
        }

        public Builder(ClientsSplashAuthorizationStatusState defaults) {
            $ = new ClientsSplashAuthorizationStatusState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId clientId path parameter. Client ID
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId clientId path parameter. Client ID
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        /**
         * @param ssids The target SSIDs. Each SSID must be enabled and must have Click-through splash enabled. For each SSID where isAuthorized is true, the expiration time will automatically be set according to the SSID&#39;s splash frequency. Not all networks support configuring all SSIDs
         * 
         * @return builder
         * 
         */
        public Builder ssids(@Nullable Output<ClientsSplashAuthorizationStatusSsidsArgs> ssids) {
            $.ssids = ssids;
            return this;
        }

        /**
         * @param ssids The target SSIDs. Each SSID must be enabled and must have Click-through splash enabled. For each SSID where isAuthorized is true, the expiration time will automatically be set according to the SSID&#39;s splash frequency. Not all networks support configuring all SSIDs
         * 
         * @return builder
         * 
         */
        public Builder ssids(ClientsSplashAuthorizationStatusSsidsArgs ssids) {
            return ssids(Output.of(ssids));
        }

        public ClientsSplashAuthorizationStatusState build() {
            return $;
        }
    }

}
