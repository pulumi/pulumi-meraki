// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCameraQualityRetentionProfilesItemVideoSettingsMV12MV22MV72 {
    private String quality;
    private String resolution;

    private GetCameraQualityRetentionProfilesItemVideoSettingsMV12MV22MV72() {}
    public String quality() {
        return this.quality;
    }
    public String resolution() {
        return this.resolution;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCameraQualityRetentionProfilesItemVideoSettingsMV12MV22MV72 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String quality;
        private String resolution;
        public Builder() {}
        public Builder(GetCameraQualityRetentionProfilesItemVideoSettingsMV12MV22MV72 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quality = defaults.quality;
    	      this.resolution = defaults.resolution;
        }

        @CustomType.Setter
        public Builder quality(String quality) {
            if (quality == null) {
              throw new MissingRequiredPropertyException("GetCameraQualityRetentionProfilesItemVideoSettingsMV12MV22MV72", "quality");
            }
            this.quality = quality;
            return this;
        }
        @CustomType.Setter
        public Builder resolution(String resolution) {
            if (resolution == null) {
              throw new MissingRequiredPropertyException("GetCameraQualityRetentionProfilesItemVideoSettingsMV12MV22MV72", "resolution");
            }
            this.resolution = resolution;
            return this;
        }
        public GetCameraQualityRetentionProfilesItemVideoSettingsMV12MV22MV72 build() {
            final var _resultValue = new GetCameraQualityRetentionProfilesItemVideoSettingsMV12MV22MV72();
            _resultValue.quality = quality;
            _resultValue.resolution = resolution;
            return _resultValue;
        }
    }
}