// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WirelessSsidsSplashSettingsSplashLogoImage {
    /**
     * @return The file contents (a base 64 encoded string) of your new logo.
     * 
     */
    private @Nullable String contents;
    /**
     * @return The format of the encoded contents. Supported formats are &#39;png&#39;, &#39;gif&#39;, and jpg&#39;.
     * 
     */
    private @Nullable String format;

    private WirelessSsidsSplashSettingsSplashLogoImage() {}
    /**
     * @return The file contents (a base 64 encoded string) of your new logo.
     * 
     */
    public Optional<String> contents() {
        return Optional.ofNullable(this.contents);
    }
    /**
     * @return The format of the encoded contents. Supported formats are &#39;png&#39;, &#39;gif&#39;, and jpg&#39;.
     * 
     */
    public Optional<String> format() {
        return Optional.ofNullable(this.format);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessSsidsSplashSettingsSplashLogoImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String contents;
        private @Nullable String format;
        public Builder() {}
        public Builder(WirelessSsidsSplashSettingsSplashLogoImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contents = defaults.contents;
    	      this.format = defaults.format;
        }

        @CustomType.Setter
        public Builder contents(@Nullable String contents) {

            this.contents = contents;
            return this;
        }
        @CustomType.Setter
        public Builder format(@Nullable String format) {

            this.format = format;
            return this;
        }
        public WirelessSsidsSplashSettingsSplashLogoImage build() {
            final var _resultValue = new WirelessSsidsSplashSettingsSplashLogoImage();
            _resultValue.contents = contents;
            _resultValue.format = format;
            return _resultValue;
        }
    }
}
