// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceVpnSiteToSiteVpnSubnetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceVpnSiteToSiteVpnSubnetArgs Empty = new ApplianceVpnSiteToSiteVpnSubnetArgs();

    /**
     * The CIDR notation subnet used within the VPN
     * 
     */
    @Import(name="localSubnet")
    private @Nullable Output<String> localSubnet;

    /**
     * @return The CIDR notation subnet used within the VPN
     * 
     */
    public Optional<Output<String>> localSubnet() {
        return Optional.ofNullable(this.localSubnet);
    }

    /**
     * Indicates the presence of the subnet in the VPN
     * 
     */
    @Import(name="useVpn")
    private @Nullable Output<Boolean> useVpn;

    /**
     * @return Indicates the presence of the subnet in the VPN
     * 
     */
    public Optional<Output<Boolean>> useVpn() {
        return Optional.ofNullable(this.useVpn);
    }

    private ApplianceVpnSiteToSiteVpnSubnetArgs() {}

    private ApplianceVpnSiteToSiteVpnSubnetArgs(ApplianceVpnSiteToSiteVpnSubnetArgs $) {
        this.localSubnet = $.localSubnet;
        this.useVpn = $.useVpn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceVpnSiteToSiteVpnSubnetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceVpnSiteToSiteVpnSubnetArgs $;

        public Builder() {
            $ = new ApplianceVpnSiteToSiteVpnSubnetArgs();
        }

        public Builder(ApplianceVpnSiteToSiteVpnSubnetArgs defaults) {
            $ = new ApplianceVpnSiteToSiteVpnSubnetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param localSubnet The CIDR notation subnet used within the VPN
         * 
         * @return builder
         * 
         */
        public Builder localSubnet(@Nullable Output<String> localSubnet) {
            $.localSubnet = localSubnet;
            return this;
        }

        /**
         * @param localSubnet The CIDR notation subnet used within the VPN
         * 
         * @return builder
         * 
         */
        public Builder localSubnet(String localSubnet) {
            return localSubnet(Output.of(localSubnet));
        }

        /**
         * @param useVpn Indicates the presence of the subnet in the VPN
         * 
         * @return builder
         * 
         */
        public Builder useVpn(@Nullable Output<Boolean> useVpn) {
            $.useVpn = useVpn;
            return this;
        }

        /**
         * @param useVpn Indicates the presence of the subnet in the VPN
         * 
         * @return builder
         * 
         */
        public Builder useVpn(Boolean useVpn) {
            return useVpn(Output.of(useVpn));
        }

        public ApplianceVpnSiteToSiteVpnSubnetArgs build() {
            return $;
        }
    }

}