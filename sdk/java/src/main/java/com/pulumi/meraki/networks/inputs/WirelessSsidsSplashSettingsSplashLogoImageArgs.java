// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessSsidsSplashSettingsSplashLogoImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessSsidsSplashSettingsSplashLogoImageArgs Empty = new WirelessSsidsSplashSettingsSplashLogoImageArgs();

    /**
     * The file contents (a base 64 encoded string) of your new logo.
     * 
     */
    @Import(name="contents")
    private @Nullable Output<String> contents;

    /**
     * @return The file contents (a base 64 encoded string) of your new logo.
     * 
     */
    public Optional<Output<String>> contents() {
        return Optional.ofNullable(this.contents);
    }

    /**
     * The format of the encoded contents. Supported formats are &#39;png&#39;, &#39;gif&#39;, and jpg&#39;.
     * 
     */
    @Import(name="format")
    private @Nullable Output<String> format;

    /**
     * @return The format of the encoded contents. Supported formats are &#39;png&#39;, &#39;gif&#39;, and jpg&#39;.
     * 
     */
    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    private WirelessSsidsSplashSettingsSplashLogoImageArgs() {}

    private WirelessSsidsSplashSettingsSplashLogoImageArgs(WirelessSsidsSplashSettingsSplashLogoImageArgs $) {
        this.contents = $.contents;
        this.format = $.format;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessSsidsSplashSettingsSplashLogoImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessSsidsSplashSettingsSplashLogoImageArgs $;

        public Builder() {
            $ = new WirelessSsidsSplashSettingsSplashLogoImageArgs();
        }

        public Builder(WirelessSsidsSplashSettingsSplashLogoImageArgs defaults) {
            $ = new WirelessSsidsSplashSettingsSplashLogoImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contents The file contents (a base 64 encoded string) of your new logo.
         * 
         * @return builder
         * 
         */
        public Builder contents(@Nullable Output<String> contents) {
            $.contents = contents;
            return this;
        }

        /**
         * @param contents The file contents (a base 64 encoded string) of your new logo.
         * 
         * @return builder
         * 
         */
        public Builder contents(String contents) {
            return contents(Output.of(contents));
        }

        /**
         * @param format The format of the encoded contents. Supported formats are &#39;png&#39;, &#39;gif&#39;, and jpg&#39;.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format The format of the encoded contents. Supported formats are &#39;png&#39;, &#39;gif&#39;, and jpg&#39;.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        public WirelessSsidsSplashSettingsSplashLogoImageArgs build() {
            return $;
        }
    }

}
