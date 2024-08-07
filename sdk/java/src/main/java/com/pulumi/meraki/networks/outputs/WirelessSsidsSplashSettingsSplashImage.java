// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.WirelessSsidsSplashSettingsSplashImageImage;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WirelessSsidsSplashSettingsSplashImage {
    /**
     * @return The extension of the image file.
     * 
     */
    private @Nullable String extension;
    /**
     * @return Properties for setting a new image.
     * 
     */
    private @Nullable WirelessSsidsSplashSettingsSplashImageImage image;
    /**
     * @return The MD5 value of the image file.
     * 
     */
    private @Nullable String md5;

    private WirelessSsidsSplashSettingsSplashImage() {}
    /**
     * @return The extension of the image file.
     * 
     */
    public Optional<String> extension() {
        return Optional.ofNullable(this.extension);
    }
    /**
     * @return Properties for setting a new image.
     * 
     */
    public Optional<WirelessSsidsSplashSettingsSplashImageImage> image() {
        return Optional.ofNullable(this.image);
    }
    /**
     * @return The MD5 value of the image file.
     * 
     */
    public Optional<String> md5() {
        return Optional.ofNullable(this.md5);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessSsidsSplashSettingsSplashImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String extension;
        private @Nullable WirelessSsidsSplashSettingsSplashImageImage image;
        private @Nullable String md5;
        public Builder() {}
        public Builder(WirelessSsidsSplashSettingsSplashImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extension = defaults.extension;
    	      this.image = defaults.image;
    	      this.md5 = defaults.md5;
        }

        @CustomType.Setter
        public Builder extension(@Nullable String extension) {

            this.extension = extension;
            return this;
        }
        @CustomType.Setter
        public Builder image(@Nullable WirelessSsidsSplashSettingsSplashImageImage image) {

            this.image = image;
            return this;
        }
        @CustomType.Setter
        public Builder md5(@Nullable String md5) {

            this.md5 = md5;
            return this;
        }
        public WirelessSsidsSplashSettingsSplashImage build() {
            final var _resultValue = new WirelessSsidsSplashSettingsSplashImage();
            _resultValue.extension = extension;
            _resultValue.image = image;
            _resultValue.md5 = md5;
            return _resultValue;
        }
    }
}
