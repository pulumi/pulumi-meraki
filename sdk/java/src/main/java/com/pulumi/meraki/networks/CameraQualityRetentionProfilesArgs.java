// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.inputs.CameraQualityRetentionProfilesVideoSettingsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CameraQualityRetentionProfilesArgs extends com.pulumi.resources.ResourceArgs {

    public static final CameraQualityRetentionProfilesArgs Empty = new CameraQualityRetentionProfilesArgs();

    /**
     * Whether or not to record audio. Can be either true or false. Defaults to false.
     * 
     */
    @Import(name="audioRecordingEnabled")
    private @Nullable Output<Boolean> audioRecordingEnabled;

    /**
     * @return Whether or not to record audio. Can be either true or false. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> audioRecordingEnabled() {
        return Optional.ofNullable(this.audioRecordingEnabled);
    }

    /**
     * Create redundant video backup using Cloud Archive. Can be either true or false. Defaults to false.
     * 
     */
    @Import(name="cloudArchiveEnabled")
    private @Nullable Output<Boolean> cloudArchiveEnabled;

    /**
     * @return Create redundant video backup using Cloud Archive. Can be either true or false. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> cloudArchiveEnabled() {
        return Optional.ofNullable(this.cloudArchiveEnabled);
    }

    /**
     * The maximum number of days for which the data will be stored, or &#39;null&#39; to keep data until storage space runs out. If the former, it can be one of [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 30, 60, 90] days.
     * 
     */
    @Import(name="maxRetentionDays")
    private @Nullable Output<Integer> maxRetentionDays;

    /**
     * @return The maximum number of days for which the data will be stored, or &#39;null&#39; to keep data until storage space runs out. If the former, it can be one of [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 30, 60, 90] days.
     * 
     */
    public Optional<Output<Integer>> maxRetentionDays() {
        return Optional.ofNullable(this.maxRetentionDays);
    }

    /**
     * Deletes footage older than 3 days in which no motion was detected. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
     * 
     */
    @Import(name="motionBasedRetentionEnabled")
    private @Nullable Output<Boolean> motionBasedRetentionEnabled;

    /**
     * @return Deletes footage older than 3 days in which no motion was detected. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
     * 
     */
    public Optional<Output<Boolean>> motionBasedRetentionEnabled() {
        return Optional.ofNullable(this.motionBasedRetentionEnabled);
    }

    /**
     * The version of the motion detector that will be used by the camera. Only applies to Gen 2 cameras. Defaults to v2.
     * 
     */
    @Import(name="motionDetectorVersion")
    private @Nullable Output<Integer> motionDetectorVersion;

    /**
     * @return The version of the motion detector that will be used by the camera. Only applies to Gen 2 cameras. Defaults to v2.
     * 
     */
    public Optional<Output<Integer>> motionDetectorVersion() {
        return Optional.ofNullable(this.motionDetectorVersion);
    }

    /**
     * The name of the new profile. Must be unique. This parameter is required.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the new profile. Must be unique. This parameter is required.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId", required=true)
    private Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Output<String> networkId() {
        return this.networkId;
    }

    /**
     * qualityRetentionProfileId path parameter. Quality retention profile ID
     * 
     */
    @Import(name="qualityRetentionProfileId")
    private @Nullable Output<String> qualityRetentionProfileId;

    /**
     * @return qualityRetentionProfileId path parameter. Quality retention profile ID
     * 
     */
    public Optional<Output<String>> qualityRetentionProfileId() {
        return Optional.ofNullable(this.qualityRetentionProfileId);
    }

    /**
     * Disable features that require additional bandwidth such as Motion Recap. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
     * 
     */
    @Import(name="restrictedBandwidthModeEnabled")
    private @Nullable Output<Boolean> restrictedBandwidthModeEnabled;

    /**
     * @return Disable features that require additional bandwidth such as Motion Recap. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
     * 
     */
    public Optional<Output<Boolean>> restrictedBandwidthModeEnabled() {
        return Optional.ofNullable(this.restrictedBandwidthModeEnabled);
    }

    /**
     * Schedule for which this camera will record video, or &#39;null&#39; to always record.
     * 
     */
    @Import(name="scheduleId")
    private @Nullable Output<String> scheduleId;

    /**
     * @return Schedule for which this camera will record video, or &#39;null&#39; to always record.
     * 
     */
    public Optional<Output<String>> scheduleId() {
        return Optional.ofNullable(this.scheduleId);
    }

    /**
     * Video quality and resolution settings for all the camera models.
     * 
     */
    @Import(name="videoSettings")
    private @Nullable Output<CameraQualityRetentionProfilesVideoSettingsArgs> videoSettings;

    /**
     * @return Video quality and resolution settings for all the camera models.
     * 
     */
    public Optional<Output<CameraQualityRetentionProfilesVideoSettingsArgs>> videoSettings() {
        return Optional.ofNullable(this.videoSettings);
    }

    private CameraQualityRetentionProfilesArgs() {}

    private CameraQualityRetentionProfilesArgs(CameraQualityRetentionProfilesArgs $) {
        this.audioRecordingEnabled = $.audioRecordingEnabled;
        this.cloudArchiveEnabled = $.cloudArchiveEnabled;
        this.maxRetentionDays = $.maxRetentionDays;
        this.motionBasedRetentionEnabled = $.motionBasedRetentionEnabled;
        this.motionDetectorVersion = $.motionDetectorVersion;
        this.name = $.name;
        this.networkId = $.networkId;
        this.qualityRetentionProfileId = $.qualityRetentionProfileId;
        this.restrictedBandwidthModeEnabled = $.restrictedBandwidthModeEnabled;
        this.scheduleId = $.scheduleId;
        this.videoSettings = $.videoSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CameraQualityRetentionProfilesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CameraQualityRetentionProfilesArgs $;

        public Builder() {
            $ = new CameraQualityRetentionProfilesArgs();
        }

        public Builder(CameraQualityRetentionProfilesArgs defaults) {
            $ = new CameraQualityRetentionProfilesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audioRecordingEnabled Whether or not to record audio. Can be either true or false. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder audioRecordingEnabled(@Nullable Output<Boolean> audioRecordingEnabled) {
            $.audioRecordingEnabled = audioRecordingEnabled;
            return this;
        }

        /**
         * @param audioRecordingEnabled Whether or not to record audio. Can be either true or false. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder audioRecordingEnabled(Boolean audioRecordingEnabled) {
            return audioRecordingEnabled(Output.of(audioRecordingEnabled));
        }

        /**
         * @param cloudArchiveEnabled Create redundant video backup using Cloud Archive. Can be either true or false. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder cloudArchiveEnabled(@Nullable Output<Boolean> cloudArchiveEnabled) {
            $.cloudArchiveEnabled = cloudArchiveEnabled;
            return this;
        }

        /**
         * @param cloudArchiveEnabled Create redundant video backup using Cloud Archive. Can be either true or false. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder cloudArchiveEnabled(Boolean cloudArchiveEnabled) {
            return cloudArchiveEnabled(Output.of(cloudArchiveEnabled));
        }

        /**
         * @param maxRetentionDays The maximum number of days for which the data will be stored, or &#39;null&#39; to keep data until storage space runs out. If the former, it can be one of [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 30, 60, 90] days.
         * 
         * @return builder
         * 
         */
        public Builder maxRetentionDays(@Nullable Output<Integer> maxRetentionDays) {
            $.maxRetentionDays = maxRetentionDays;
            return this;
        }

        /**
         * @param maxRetentionDays The maximum number of days for which the data will be stored, or &#39;null&#39; to keep data until storage space runs out. If the former, it can be one of [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 30, 60, 90] days.
         * 
         * @return builder
         * 
         */
        public Builder maxRetentionDays(Integer maxRetentionDays) {
            return maxRetentionDays(Output.of(maxRetentionDays));
        }

        /**
         * @param motionBasedRetentionEnabled Deletes footage older than 3 days in which no motion was detected. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
         * 
         * @return builder
         * 
         */
        public Builder motionBasedRetentionEnabled(@Nullable Output<Boolean> motionBasedRetentionEnabled) {
            $.motionBasedRetentionEnabled = motionBasedRetentionEnabled;
            return this;
        }

        /**
         * @param motionBasedRetentionEnabled Deletes footage older than 3 days in which no motion was detected. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
         * 
         * @return builder
         * 
         */
        public Builder motionBasedRetentionEnabled(Boolean motionBasedRetentionEnabled) {
            return motionBasedRetentionEnabled(Output.of(motionBasedRetentionEnabled));
        }

        /**
         * @param motionDetectorVersion The version of the motion detector that will be used by the camera. Only applies to Gen 2 cameras. Defaults to v2.
         * 
         * @return builder
         * 
         */
        public Builder motionDetectorVersion(@Nullable Output<Integer> motionDetectorVersion) {
            $.motionDetectorVersion = motionDetectorVersion;
            return this;
        }

        /**
         * @param motionDetectorVersion The version of the motion detector that will be used by the camera. Only applies to Gen 2 cameras. Defaults to v2.
         * 
         * @return builder
         * 
         */
        public Builder motionDetectorVersion(Integer motionDetectorVersion) {
            return motionDetectorVersion(Output.of(motionDetectorVersion));
        }

        /**
         * @param name The name of the new profile. Must be unique. This parameter is required.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the new profile. Must be unique. This parameter is required.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        /**
         * @param qualityRetentionProfileId qualityRetentionProfileId path parameter. Quality retention profile ID
         * 
         * @return builder
         * 
         */
        public Builder qualityRetentionProfileId(@Nullable Output<String> qualityRetentionProfileId) {
            $.qualityRetentionProfileId = qualityRetentionProfileId;
            return this;
        }

        /**
         * @param qualityRetentionProfileId qualityRetentionProfileId path parameter. Quality retention profile ID
         * 
         * @return builder
         * 
         */
        public Builder qualityRetentionProfileId(String qualityRetentionProfileId) {
            return qualityRetentionProfileId(Output.of(qualityRetentionProfileId));
        }

        /**
         * @param restrictedBandwidthModeEnabled Disable features that require additional bandwidth such as Motion Recap. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
         * 
         * @return builder
         * 
         */
        public Builder restrictedBandwidthModeEnabled(@Nullable Output<Boolean> restrictedBandwidthModeEnabled) {
            $.restrictedBandwidthModeEnabled = restrictedBandwidthModeEnabled;
            return this;
        }

        /**
         * @param restrictedBandwidthModeEnabled Disable features that require additional bandwidth such as Motion Recap. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
         * 
         * @return builder
         * 
         */
        public Builder restrictedBandwidthModeEnabled(Boolean restrictedBandwidthModeEnabled) {
            return restrictedBandwidthModeEnabled(Output.of(restrictedBandwidthModeEnabled));
        }

        /**
         * @param scheduleId Schedule for which this camera will record video, or &#39;null&#39; to always record.
         * 
         * @return builder
         * 
         */
        public Builder scheduleId(@Nullable Output<String> scheduleId) {
            $.scheduleId = scheduleId;
            return this;
        }

        /**
         * @param scheduleId Schedule for which this camera will record video, or &#39;null&#39; to always record.
         * 
         * @return builder
         * 
         */
        public Builder scheduleId(String scheduleId) {
            return scheduleId(Output.of(scheduleId));
        }

        /**
         * @param videoSettings Video quality and resolution settings for all the camera models.
         * 
         * @return builder
         * 
         */
        public Builder videoSettings(@Nullable Output<CameraQualityRetentionProfilesVideoSettingsArgs> videoSettings) {
            $.videoSettings = videoSettings;
            return this;
        }

        /**
         * @param videoSettings Video quality and resolution settings for all the camera models.
         * 
         * @return builder
         * 
         */
        public Builder videoSettings(CameraQualityRetentionProfilesVideoSettingsArgs videoSettings) {
            return videoSettings(Output.of(videoSettings));
        }

        public CameraQualityRetentionProfilesArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("CameraQualityRetentionProfilesArgs", "networkId");
            }
            return $;
        }
    }

}