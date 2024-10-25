// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.WirelessRfProfilesPerSsidSettingsStatus14BandsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessRfProfilesPerSsidSettingsStatus14Args extends com.pulumi.resources.ResourceArgs {

    public static final WirelessRfProfilesPerSsidSettingsStatus14Args Empty = new WirelessRfProfilesPerSsidSettingsStatus14Args();

    /**
     * Choice between &#39;dual&#39;, &#39;2.4ghz&#39;, &#39;5ghz&#39;, &#39;6ghz&#39; or &#39;multi&#39;.
     * 
     */
    @Import(name="bandOperationMode")
    private @Nullable Output<String> bandOperationMode;

    /**
     * @return Choice between &#39;dual&#39;, &#39;2.4ghz&#39;, &#39;5ghz&#39;, &#39;6ghz&#39; or &#39;multi&#39;.
     * 
     */
    public Optional<Output<String>> bandOperationMode() {
        return Optional.ofNullable(this.bandOperationMode);
    }

    /**
     * Steers client to most open band between 2.4 GHz and 5 GHz. Can be either true or false.
     * 
     */
    @Import(name="bandSteeringEnabled")
    private @Nullable Output<Boolean> bandSteeringEnabled;

    /**
     * @return Steers client to most open band between 2.4 GHz and 5 GHz. Can be either true or false.
     * 
     */
    public Optional<Output<Boolean>> bandSteeringEnabled() {
        return Optional.ofNullable(this.bandSteeringEnabled);
    }

    /**
     * Settings related to all bands
     * 
     */
    @Import(name="bands")
    private @Nullable Output<WirelessRfProfilesPerSsidSettingsStatus14BandsArgs> bands;

    /**
     * @return Settings related to all bands
     * 
     */
    public Optional<Output<WirelessRfProfilesPerSsidSettingsStatus14BandsArgs>> bands() {
        return Optional.ofNullable(this.bands);
    }

    /**
     * Sets min bitrate (Mbps) of this SSID. Can be one of &#39;1&#39;, &#39;2&#39;, &#39;5.5&#39;, &#39;6&#39;, &#39;9&#39;, &#39;11&#39;, &#39;12&#39;, &#39;18&#39;, &#39;24&#39;, &#39;36&#39;, &#39;48&#39; or &#39;54&#39;.
     * 
     */
    @Import(name="minBitrate")
    private @Nullable Output<Integer> minBitrate;

    /**
     * @return Sets min bitrate (Mbps) of this SSID. Can be one of &#39;1&#39;, &#39;2&#39;, &#39;5.5&#39;, &#39;6&#39;, &#39;9&#39;, &#39;11&#39;, &#39;12&#39;, &#39;18&#39;, &#39;24&#39;, &#39;36&#39;, &#39;48&#39; or &#39;54&#39;.
     * 
     */
    public Optional<Output<Integer>> minBitrate() {
        return Optional.ofNullable(this.minBitrate);
    }

    /**
     * Name of SSID
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of SSID
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private WirelessRfProfilesPerSsidSettingsStatus14Args() {}

    private WirelessRfProfilesPerSsidSettingsStatus14Args(WirelessRfProfilesPerSsidSettingsStatus14Args $) {
        this.bandOperationMode = $.bandOperationMode;
        this.bandSteeringEnabled = $.bandSteeringEnabled;
        this.bands = $.bands;
        this.minBitrate = $.minBitrate;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessRfProfilesPerSsidSettingsStatus14Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessRfProfilesPerSsidSettingsStatus14Args $;

        public Builder() {
            $ = new WirelessRfProfilesPerSsidSettingsStatus14Args();
        }

        public Builder(WirelessRfProfilesPerSsidSettingsStatus14Args defaults) {
            $ = new WirelessRfProfilesPerSsidSettingsStatus14Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandOperationMode Choice between &#39;dual&#39;, &#39;2.4ghz&#39;, &#39;5ghz&#39;, &#39;6ghz&#39; or &#39;multi&#39;.
         * 
         * @return builder
         * 
         */
        public Builder bandOperationMode(@Nullable Output<String> bandOperationMode) {
            $.bandOperationMode = bandOperationMode;
            return this;
        }

        /**
         * @param bandOperationMode Choice between &#39;dual&#39;, &#39;2.4ghz&#39;, &#39;5ghz&#39;, &#39;6ghz&#39; or &#39;multi&#39;.
         * 
         * @return builder
         * 
         */
        public Builder bandOperationMode(String bandOperationMode) {
            return bandOperationMode(Output.of(bandOperationMode));
        }

        /**
         * @param bandSteeringEnabled Steers client to most open band between 2.4 GHz and 5 GHz. Can be either true or false.
         * 
         * @return builder
         * 
         */
        public Builder bandSteeringEnabled(@Nullable Output<Boolean> bandSteeringEnabled) {
            $.bandSteeringEnabled = bandSteeringEnabled;
            return this;
        }

        /**
         * @param bandSteeringEnabled Steers client to most open band between 2.4 GHz and 5 GHz. Can be either true or false.
         * 
         * @return builder
         * 
         */
        public Builder bandSteeringEnabled(Boolean bandSteeringEnabled) {
            return bandSteeringEnabled(Output.of(bandSteeringEnabled));
        }

        /**
         * @param bands Settings related to all bands
         * 
         * @return builder
         * 
         */
        public Builder bands(@Nullable Output<WirelessRfProfilesPerSsidSettingsStatus14BandsArgs> bands) {
            $.bands = bands;
            return this;
        }

        /**
         * @param bands Settings related to all bands
         * 
         * @return builder
         * 
         */
        public Builder bands(WirelessRfProfilesPerSsidSettingsStatus14BandsArgs bands) {
            return bands(Output.of(bands));
        }

        /**
         * @param minBitrate Sets min bitrate (Mbps) of this SSID. Can be one of &#39;1&#39;, &#39;2&#39;, &#39;5.5&#39;, &#39;6&#39;, &#39;9&#39;, &#39;11&#39;, &#39;12&#39;, &#39;18&#39;, &#39;24&#39;, &#39;36&#39;, &#39;48&#39; or &#39;54&#39;.
         * 
         * @return builder
         * 
         */
        public Builder minBitrate(@Nullable Output<Integer> minBitrate) {
            $.minBitrate = minBitrate;
            return this;
        }

        /**
         * @param minBitrate Sets min bitrate (Mbps) of this SSID. Can be one of &#39;1&#39;, &#39;2&#39;, &#39;5.5&#39;, &#39;6&#39;, &#39;9&#39;, &#39;11&#39;, &#39;12&#39;, &#39;18&#39;, &#39;24&#39;, &#39;36&#39;, &#39;48&#39; or &#39;54&#39;.
         * 
         * @return builder
         * 
         */
        public Builder minBitrate(Integer minBitrate) {
            return minBitrate(Output.of(minBitrate));
        }

        /**
         * @param name Name of SSID
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of SSID
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public WirelessRfProfilesPerSsidSettingsStatus14Args build() {
            return $;
        }
    }

}
