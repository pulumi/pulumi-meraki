// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.organizations.inputs.ApplianceVpnThirdPartyVpnpeersPeerArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceVpnThirdPartyVpnpeersState extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceVpnThirdPartyVpnpeersState Empty = new ApplianceVpnThirdPartyVpnpeersState();

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    /**
     * The list of VPN peers
     * 
     */
    @Import(name="peers")
    private @Nullable Output<List<ApplianceVpnThirdPartyVpnpeersPeerArgs>> peers;

    /**
     * @return The list of VPN peers
     * 
     */
    public Optional<Output<List<ApplianceVpnThirdPartyVpnpeersPeerArgs>>> peers() {
        return Optional.ofNullable(this.peers);
    }

    private ApplianceVpnThirdPartyVpnpeersState() {}

    private ApplianceVpnThirdPartyVpnpeersState(ApplianceVpnThirdPartyVpnpeersState $) {
        this.organizationId = $.organizationId;
        this.peers = $.peers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceVpnThirdPartyVpnpeersState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceVpnThirdPartyVpnpeersState $;

        public Builder() {
            $ = new ApplianceVpnThirdPartyVpnpeersState();
        }

        public Builder(ApplianceVpnThirdPartyVpnpeersState defaults) {
            $ = new ApplianceVpnThirdPartyVpnpeersState(Objects.requireNonNull(defaults));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param peers The list of VPN peers
         * 
         * @return builder
         * 
         */
        public Builder peers(@Nullable Output<List<ApplianceVpnThirdPartyVpnpeersPeerArgs>> peers) {
            $.peers = peers;
            return this;
        }

        /**
         * @param peers The list of VPN peers
         * 
         * @return builder
         * 
         */
        public Builder peers(List<ApplianceVpnThirdPartyVpnpeersPeerArgs> peers) {
            return peers(Output.of(peers));
        }

        /**
         * @param peers The list of VPN peers
         * 
         * @return builder
         * 
         */
        public Builder peers(ApplianceVpnThirdPartyVpnpeersPeerArgs... peers) {
            return peers(List.of(peers));
        }

        public ApplianceVpnThirdPartyVpnpeersState build() {
            return $;
        }
    }

}