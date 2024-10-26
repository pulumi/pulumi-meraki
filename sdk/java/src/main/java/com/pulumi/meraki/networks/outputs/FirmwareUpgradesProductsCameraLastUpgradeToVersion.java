// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirmwareUpgradesProductsCameraLastUpgradeToVersion {
    /**
     * @return Name of the firmware version
     * 
     */
    private @Nullable String firmware;
    /**
     * @return Firmware version identifier
     * 
     */
    private @Nullable String id;
    /**
     * @return Release date of the firmware version
     * 
     */
    private @Nullable String releaseDate;
    /**
     * @return Release type of the firmware version
     * 
     */
    private @Nullable String releaseType;
    /**
     * @return Firmware version short name
     * 
     */
    private @Nullable String shortName;

    private FirmwareUpgradesProductsCameraLastUpgradeToVersion() {}
    /**
     * @return Name of the firmware version
     * 
     */
    public Optional<String> firmware() {
        return Optional.ofNullable(this.firmware);
    }
    /**
     * @return Firmware version identifier
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Release date of the firmware version
     * 
     */
    public Optional<String> releaseDate() {
        return Optional.ofNullable(this.releaseDate);
    }
    /**
     * @return Release type of the firmware version
     * 
     */
    public Optional<String> releaseType() {
        return Optional.ofNullable(this.releaseType);
    }
    /**
     * @return Firmware version short name
     * 
     */
    public Optional<String> shortName() {
        return Optional.ofNullable(this.shortName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirmwareUpgradesProductsCameraLastUpgradeToVersion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String firmware;
        private @Nullable String id;
        private @Nullable String releaseDate;
        private @Nullable String releaseType;
        private @Nullable String shortName;
        public Builder() {}
        public Builder(FirmwareUpgradesProductsCameraLastUpgradeToVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firmware = defaults.firmware;
    	      this.id = defaults.id;
    	      this.releaseDate = defaults.releaseDate;
    	      this.releaseType = defaults.releaseType;
    	      this.shortName = defaults.shortName;
        }

        @CustomType.Setter
        public Builder firmware(@Nullable String firmware) {

            this.firmware = firmware;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder releaseDate(@Nullable String releaseDate) {

            this.releaseDate = releaseDate;
            return this;
        }
        @CustomType.Setter
        public Builder releaseType(@Nullable String releaseType) {

            this.releaseType = releaseType;
            return this;
        }
        @CustomType.Setter
        public Builder shortName(@Nullable String shortName) {

            this.shortName = shortName;
            return this;
        }
        public FirmwareUpgradesProductsCameraLastUpgradeToVersion build() {
            final var _resultValue = new FirmwareUpgradesProductsCameraLastUpgradeToVersion();
            _resultValue.firmware = firmware;
            _resultValue.id = id;
            _resultValue.releaseDate = releaseDate;
            _resultValue.releaseType = releaseType;
            _resultValue.shortName = shortName;
            return _resultValue;
        }
    }
}
