// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessSsidsSplashSettingsSentryEnrollmentSystemsManagerNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessSsidsSplashSettingsSentryEnrollmentSystemsManagerNetworkArgs Empty = new WirelessSsidsSplashSettingsSentryEnrollmentSystemsManagerNetworkArgs();

    /**
     * The network ID of the Systems Manager network.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The network ID of the Systems Manager network.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private WirelessSsidsSplashSettingsSentryEnrollmentSystemsManagerNetworkArgs() {}

    private WirelessSsidsSplashSettingsSentryEnrollmentSystemsManagerNetworkArgs(WirelessSsidsSplashSettingsSentryEnrollmentSystemsManagerNetworkArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessSsidsSplashSettingsSentryEnrollmentSystemsManagerNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessSsidsSplashSettingsSentryEnrollmentSystemsManagerNetworkArgs $;

        public Builder() {
            $ = new WirelessSsidsSplashSettingsSentryEnrollmentSystemsManagerNetworkArgs();
        }

        public Builder(WirelessSsidsSplashSettingsSentryEnrollmentSystemsManagerNetworkArgs defaults) {
            $ = new WirelessSsidsSplashSettingsSentryEnrollmentSystemsManagerNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The network ID of the Systems Manager network.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The network ID of the Systems Manager network.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public WirelessSsidsSplashSettingsSentryEnrollmentSystemsManagerNetworkArgs build() {
            return $;
        }
    }

}