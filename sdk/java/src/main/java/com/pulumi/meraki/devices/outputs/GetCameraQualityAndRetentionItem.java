// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCameraQualityAndRetentionItem {
    private Boolean audioRecordingEnabled;
    private Boolean motionBasedRetentionEnabled;
    private Integer motionDetectorVersion;
    private String profileId;
    private String quality;
    private String resolution;
    private Boolean restrictedBandwidthModeEnabled;

    private GetCameraQualityAndRetentionItem() {}
    public Boolean audioRecordingEnabled() {
        return this.audioRecordingEnabled;
    }
    public Boolean motionBasedRetentionEnabled() {
        return this.motionBasedRetentionEnabled;
    }
    public Integer motionDetectorVersion() {
        return this.motionDetectorVersion;
    }
    public String profileId() {
        return this.profileId;
    }
    public String quality() {
        return this.quality;
    }
    public String resolution() {
        return this.resolution;
    }
    public Boolean restrictedBandwidthModeEnabled() {
        return this.restrictedBandwidthModeEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCameraQualityAndRetentionItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean audioRecordingEnabled;
        private Boolean motionBasedRetentionEnabled;
        private Integer motionDetectorVersion;
        private String profileId;
        private String quality;
        private String resolution;
        private Boolean restrictedBandwidthModeEnabled;
        public Builder() {}
        public Builder(GetCameraQualityAndRetentionItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioRecordingEnabled = defaults.audioRecordingEnabled;
    	      this.motionBasedRetentionEnabled = defaults.motionBasedRetentionEnabled;
    	      this.motionDetectorVersion = defaults.motionDetectorVersion;
    	      this.profileId = defaults.profileId;
    	      this.quality = defaults.quality;
    	      this.resolution = defaults.resolution;
    	      this.restrictedBandwidthModeEnabled = defaults.restrictedBandwidthModeEnabled;
        }

        @CustomType.Setter
        public Builder audioRecordingEnabled(Boolean audioRecordingEnabled) {
            if (audioRecordingEnabled == null) {
              throw new MissingRequiredPropertyException("GetCameraQualityAndRetentionItem", "audioRecordingEnabled");
            }
            this.audioRecordingEnabled = audioRecordingEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder motionBasedRetentionEnabled(Boolean motionBasedRetentionEnabled) {
            if (motionBasedRetentionEnabled == null) {
              throw new MissingRequiredPropertyException("GetCameraQualityAndRetentionItem", "motionBasedRetentionEnabled");
            }
            this.motionBasedRetentionEnabled = motionBasedRetentionEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder motionDetectorVersion(Integer motionDetectorVersion) {
            if (motionDetectorVersion == null) {
              throw new MissingRequiredPropertyException("GetCameraQualityAndRetentionItem", "motionDetectorVersion");
            }
            this.motionDetectorVersion = motionDetectorVersion;
            return this;
        }
        @CustomType.Setter
        public Builder profileId(String profileId) {
            if (profileId == null) {
              throw new MissingRequiredPropertyException("GetCameraQualityAndRetentionItem", "profileId");
            }
            this.profileId = profileId;
            return this;
        }
        @CustomType.Setter
        public Builder quality(String quality) {
            if (quality == null) {
              throw new MissingRequiredPropertyException("GetCameraQualityAndRetentionItem", "quality");
            }
            this.quality = quality;
            return this;
        }
        @CustomType.Setter
        public Builder resolution(String resolution) {
            if (resolution == null) {
              throw new MissingRequiredPropertyException("GetCameraQualityAndRetentionItem", "resolution");
            }
            this.resolution = resolution;
            return this;
        }
        @CustomType.Setter
        public Builder restrictedBandwidthModeEnabled(Boolean restrictedBandwidthModeEnabled) {
            if (restrictedBandwidthModeEnabled == null) {
              throw new MissingRequiredPropertyException("GetCameraQualityAndRetentionItem", "restrictedBandwidthModeEnabled");
            }
            this.restrictedBandwidthModeEnabled = restrictedBandwidthModeEnabled;
            return this;
        }
        public GetCameraQualityAndRetentionItem build() {
            final var _resultValue = new GetCameraQualityAndRetentionItem();
            _resultValue.audioRecordingEnabled = audioRecordingEnabled;
            _resultValue.motionBasedRetentionEnabled = motionBasedRetentionEnabled;
            _resultValue.motionDetectorVersion = motionDetectorVersion;
            _resultValue.profileId = profileId;
            _resultValue.quality = quality;
            _resultValue.resolution = resolution;
            _resultValue.restrictedBandwidthModeEnabled = restrictedBandwidthModeEnabled;
            return _resultValue;
        }
    }
}