// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceRfProfilesFiveGhzSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceRfProfilesFiveGhzSettingsArgs Empty = new ApplianceRfProfilesFiveGhzSettingsArgs();

    /**
     * Whether ax radio on 5Ghz band is on or off.
     * 
     */
    @Import(name="axEnabled")
    private @Nullable Output<Boolean> axEnabled;

    /**
     * @return Whether ax radio on 5Ghz band is on or off.
     * 
     */
    public Optional<Output<Boolean>> axEnabled() {
        return Optional.ofNullable(this.axEnabled);
    }

    /**
     * Min bitrate (Mbps) of 2.4Ghz band.
     * 
     */
    @Import(name="minBitrate")
    private @Nullable Output<Integer> minBitrate;

    /**
     * @return Min bitrate (Mbps) of 2.4Ghz band.
     * 
     */
    public Optional<Output<Integer>> minBitrate() {
        return Optional.ofNullable(this.minBitrate);
    }

    private ApplianceRfProfilesFiveGhzSettingsArgs() {}

    private ApplianceRfProfilesFiveGhzSettingsArgs(ApplianceRfProfilesFiveGhzSettingsArgs $) {
        this.axEnabled = $.axEnabled;
        this.minBitrate = $.minBitrate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceRfProfilesFiveGhzSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceRfProfilesFiveGhzSettingsArgs $;

        public Builder() {
            $ = new ApplianceRfProfilesFiveGhzSettingsArgs();
        }

        public Builder(ApplianceRfProfilesFiveGhzSettingsArgs defaults) {
            $ = new ApplianceRfProfilesFiveGhzSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param axEnabled Whether ax radio on 5Ghz band is on or off.
         * 
         * @return builder
         * 
         */
        public Builder axEnabled(@Nullable Output<Boolean> axEnabled) {
            $.axEnabled = axEnabled;
            return this;
        }

        /**
         * @param axEnabled Whether ax radio on 5Ghz band is on or off.
         * 
         * @return builder
         * 
         */
        public Builder axEnabled(Boolean axEnabled) {
            return axEnabled(Output.of(axEnabled));
        }

        /**
         * @param minBitrate Min bitrate (Mbps) of 2.4Ghz band.
         * 
         * @return builder
         * 
         */
        public Builder minBitrate(@Nullable Output<Integer> minBitrate) {
            $.minBitrate = minBitrate;
            return this;
        }

        /**
         * @param minBitrate Min bitrate (Mbps) of 2.4Ghz band.
         * 
         * @return builder
         * 
         */
        public Builder minBitrate(Integer minBitrate) {
            return minBitrate(Output.of(minBitrate));
        }

        public ApplianceRfProfilesFiveGhzSettingsArgs build() {
            return $;
        }
    }

}
