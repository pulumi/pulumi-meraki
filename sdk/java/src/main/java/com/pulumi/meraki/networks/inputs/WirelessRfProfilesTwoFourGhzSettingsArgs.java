// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessRfProfilesTwoFourGhzSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessRfProfilesTwoFourGhzSettingsArgs Empty = new WirelessRfProfilesTwoFourGhzSettingsArgs();

    /**
     * Determines whether ax radio on 2.4Ghz band is on or off. Can be either true or false. If false, we highly recommend disabling band steering. Defaults to true.
     * 
     */
    @Import(name="axEnabled")
    private @Nullable Output<Boolean> axEnabled;

    /**
     * @return Determines whether ax radio on 2.4Ghz band is on or off. Can be either true or false. If false, we highly recommend disabling band steering. Defaults to true.
     * 
     */
    public Optional<Output<Boolean>> axEnabled() {
        return Optional.ofNullable(this.axEnabled);
    }

    /**
     * Sets max power (dBm) of 2.4Ghz band. Can be integer between 2 and 30. Defaults to 30.
     * 
     */
    @Import(name="maxPower")
    private @Nullable Output<Integer> maxPower;

    /**
     * @return Sets max power (dBm) of 2.4Ghz band. Can be integer between 2 and 30. Defaults to 30.
     * 
     */
    public Optional<Output<Integer>> maxPower() {
        return Optional.ofNullable(this.maxPower);
    }

    /**
     * Sets min bitrate (Mbps) of 2.4Ghz band. Can be one of &#39;1&#39;, &#39;2&#39;, &#39;5.5&#39;, &#39;6&#39;, &#39;9&#39;, &#39;11&#39;, &#39;12&#39;, &#39;18&#39;, &#39;24&#39;, &#39;36&#39;, &#39;48&#39; or &#39;54&#39;. Defaults to 11.
     * 
     */
    @Import(name="minBitrate")
    private @Nullable Output<Double> minBitrate;

    /**
     * @return Sets min bitrate (Mbps) of 2.4Ghz band. Can be one of &#39;1&#39;, &#39;2&#39;, &#39;5.5&#39;, &#39;6&#39;, &#39;9&#39;, &#39;11&#39;, &#39;12&#39;, &#39;18&#39;, &#39;24&#39;, &#39;36&#39;, &#39;48&#39; or &#39;54&#39;. Defaults to 11.
     * 
     */
    public Optional<Output<Double>> minBitrate() {
        return Optional.ofNullable(this.minBitrate);
    }

    /**
     * Sets min power (dBm) of 2.4Ghz band. Can be integer between 2 and 30. Defaults to 5.
     * 
     */
    @Import(name="minPower")
    private @Nullable Output<Integer> minPower;

    /**
     * @return Sets min power (dBm) of 2.4Ghz band. Can be integer between 2 and 30. Defaults to 5.
     * 
     */
    public Optional<Output<Integer>> minPower() {
        return Optional.ofNullable(this.minPower);
    }

    /**
     * The RX-SOP level controls the sensitivity of the radio. It is strongly recommended to use RX-SOP only after consulting a wireless expert. RX-SOP can be configured in the range of -65 to -95 (dBm). A value of null will reset this to the default.
     * 
     */
    @Import(name="rxsop")
    private @Nullable Output<Integer> rxsop;

    /**
     * @return The RX-SOP level controls the sensitivity of the radio. It is strongly recommended to use RX-SOP only after consulting a wireless expert. RX-SOP can be configured in the range of -65 to -95 (dBm). A value of null will reset this to the default.
     * 
     */
    public Optional<Output<Integer>> rxsop() {
        return Optional.ofNullable(this.rxsop);
    }

    /**
     * Sets valid auto channels for 2.4Ghz band. Can be one of &#39;1&#39;, &#39;6&#39; or &#39;11&#39;. Defaults to [1, 6, 11].
     * 
     */
    @Import(name="validAutoChannels")
    private @Nullable Output<List<Integer>> validAutoChannels;

    /**
     * @return Sets valid auto channels for 2.4Ghz band. Can be one of &#39;1&#39;, &#39;6&#39; or &#39;11&#39;. Defaults to [1, 6, 11].
     * 
     */
    public Optional<Output<List<Integer>>> validAutoChannels() {
        return Optional.ofNullable(this.validAutoChannels);
    }

    private WirelessRfProfilesTwoFourGhzSettingsArgs() {}

    private WirelessRfProfilesTwoFourGhzSettingsArgs(WirelessRfProfilesTwoFourGhzSettingsArgs $) {
        this.axEnabled = $.axEnabled;
        this.maxPower = $.maxPower;
        this.minBitrate = $.minBitrate;
        this.minPower = $.minPower;
        this.rxsop = $.rxsop;
        this.validAutoChannels = $.validAutoChannels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessRfProfilesTwoFourGhzSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessRfProfilesTwoFourGhzSettingsArgs $;

        public Builder() {
            $ = new WirelessRfProfilesTwoFourGhzSettingsArgs();
        }

        public Builder(WirelessRfProfilesTwoFourGhzSettingsArgs defaults) {
            $ = new WirelessRfProfilesTwoFourGhzSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param axEnabled Determines whether ax radio on 2.4Ghz band is on or off. Can be either true or false. If false, we highly recommend disabling band steering. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder axEnabled(@Nullable Output<Boolean> axEnabled) {
            $.axEnabled = axEnabled;
            return this;
        }

        /**
         * @param axEnabled Determines whether ax radio on 2.4Ghz band is on or off. Can be either true or false. If false, we highly recommend disabling band steering. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder axEnabled(Boolean axEnabled) {
            return axEnabled(Output.of(axEnabled));
        }

        /**
         * @param maxPower Sets max power (dBm) of 2.4Ghz band. Can be integer between 2 and 30. Defaults to 30.
         * 
         * @return builder
         * 
         */
        public Builder maxPower(@Nullable Output<Integer> maxPower) {
            $.maxPower = maxPower;
            return this;
        }

        /**
         * @param maxPower Sets max power (dBm) of 2.4Ghz band. Can be integer between 2 and 30. Defaults to 30.
         * 
         * @return builder
         * 
         */
        public Builder maxPower(Integer maxPower) {
            return maxPower(Output.of(maxPower));
        }

        /**
         * @param minBitrate Sets min bitrate (Mbps) of 2.4Ghz band. Can be one of &#39;1&#39;, &#39;2&#39;, &#39;5.5&#39;, &#39;6&#39;, &#39;9&#39;, &#39;11&#39;, &#39;12&#39;, &#39;18&#39;, &#39;24&#39;, &#39;36&#39;, &#39;48&#39; or &#39;54&#39;. Defaults to 11.
         * 
         * @return builder
         * 
         */
        public Builder minBitrate(@Nullable Output<Double> minBitrate) {
            $.minBitrate = minBitrate;
            return this;
        }

        /**
         * @param minBitrate Sets min bitrate (Mbps) of 2.4Ghz band. Can be one of &#39;1&#39;, &#39;2&#39;, &#39;5.5&#39;, &#39;6&#39;, &#39;9&#39;, &#39;11&#39;, &#39;12&#39;, &#39;18&#39;, &#39;24&#39;, &#39;36&#39;, &#39;48&#39; or &#39;54&#39;. Defaults to 11.
         * 
         * @return builder
         * 
         */
        public Builder minBitrate(Double minBitrate) {
            return minBitrate(Output.of(minBitrate));
        }

        /**
         * @param minPower Sets min power (dBm) of 2.4Ghz band. Can be integer between 2 and 30. Defaults to 5.
         * 
         * @return builder
         * 
         */
        public Builder minPower(@Nullable Output<Integer> minPower) {
            $.minPower = minPower;
            return this;
        }

        /**
         * @param minPower Sets min power (dBm) of 2.4Ghz band. Can be integer between 2 and 30. Defaults to 5.
         * 
         * @return builder
         * 
         */
        public Builder minPower(Integer minPower) {
            return minPower(Output.of(minPower));
        }

        /**
         * @param rxsop The RX-SOP level controls the sensitivity of the radio. It is strongly recommended to use RX-SOP only after consulting a wireless expert. RX-SOP can be configured in the range of -65 to -95 (dBm). A value of null will reset this to the default.
         * 
         * @return builder
         * 
         */
        public Builder rxsop(@Nullable Output<Integer> rxsop) {
            $.rxsop = rxsop;
            return this;
        }

        /**
         * @param rxsop The RX-SOP level controls the sensitivity of the radio. It is strongly recommended to use RX-SOP only after consulting a wireless expert. RX-SOP can be configured in the range of -65 to -95 (dBm). A value of null will reset this to the default.
         * 
         * @return builder
         * 
         */
        public Builder rxsop(Integer rxsop) {
            return rxsop(Output.of(rxsop));
        }

        /**
         * @param validAutoChannels Sets valid auto channels for 2.4Ghz band. Can be one of &#39;1&#39;, &#39;6&#39; or &#39;11&#39;. Defaults to [1, 6, 11].
         * 
         * @return builder
         * 
         */
        public Builder validAutoChannels(@Nullable Output<List<Integer>> validAutoChannels) {
            $.validAutoChannels = validAutoChannels;
            return this;
        }

        /**
         * @param validAutoChannels Sets valid auto channels for 2.4Ghz band. Can be one of &#39;1&#39;, &#39;6&#39; or &#39;11&#39;. Defaults to [1, 6, 11].
         * 
         * @return builder
         * 
         */
        public Builder validAutoChannels(List<Integer> validAutoChannels) {
            return validAutoChannels(Output.of(validAutoChannels));
        }

        /**
         * @param validAutoChannels Sets valid auto channels for 2.4Ghz band. Can be one of &#39;1&#39;, &#39;6&#39; or &#39;11&#39;. Defaults to [1, 6, 11].
         * 
         * @return builder
         * 
         */
        public Builder validAutoChannels(Integer... validAutoChannels) {
            return validAutoChannels(List.of(validAutoChannels));
        }

        public WirelessRfProfilesTwoFourGhzSettingsArgs build() {
            return $;
        }
    }

}