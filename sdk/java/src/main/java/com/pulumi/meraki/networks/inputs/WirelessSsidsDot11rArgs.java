// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessSsidsDot11rArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessSsidsDot11rArgs Empty = new WirelessSsidsDot11rArgs();

    /**
     * (Optional) Whether 802.11r is adaptive or not.
     * 
     */
    @Import(name="adaptive")
    private @Nullable Output<Boolean> adaptive;

    /**
     * @return (Optional) Whether 802.11r is adaptive or not.
     * 
     */
    public Optional<Output<Boolean>> adaptive() {
        return Optional.ofNullable(this.adaptive);
    }

    /**
     * Whether 802.11r is enabled or not.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether 802.11r is enabled or not.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private WirelessSsidsDot11rArgs() {}

    private WirelessSsidsDot11rArgs(WirelessSsidsDot11rArgs $) {
        this.adaptive = $.adaptive;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessSsidsDot11rArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessSsidsDot11rArgs $;

        public Builder() {
            $ = new WirelessSsidsDot11rArgs();
        }

        public Builder(WirelessSsidsDot11rArgs defaults) {
            $ = new WirelessSsidsDot11rArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adaptive (Optional) Whether 802.11r is adaptive or not.
         * 
         * @return builder
         * 
         */
        public Builder adaptive(@Nullable Output<Boolean> adaptive) {
            $.adaptive = adaptive;
            return this;
        }

        /**
         * @param adaptive (Optional) Whether 802.11r is adaptive or not.
         * 
         * @return builder
         * 
         */
        public Builder adaptive(Boolean adaptive) {
            return adaptive(Output.of(adaptive));
        }

        /**
         * @param enabled Whether 802.11r is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether 802.11r is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public WirelessSsidsDot11rArgs build() {
            return $;
        }
    }

}