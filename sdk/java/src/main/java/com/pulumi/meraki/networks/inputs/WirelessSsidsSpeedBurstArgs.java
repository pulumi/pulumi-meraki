// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessSsidsSpeedBurstArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessSsidsSpeedBurstArgs Empty = new WirelessSsidsSpeedBurstArgs();

    /**
     * Boolean indicating whether or not to allow users to temporarily exceed the bandwidth limit for short periods while still keeping them under the bandwidth limit over time.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Boolean indicating whether or not to allow users to temporarily exceed the bandwidth limit for short periods while still keeping them under the bandwidth limit over time.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private WirelessSsidsSpeedBurstArgs() {}

    private WirelessSsidsSpeedBurstArgs(WirelessSsidsSpeedBurstArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessSsidsSpeedBurstArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessSsidsSpeedBurstArgs $;

        public Builder() {
            $ = new WirelessSsidsSpeedBurstArgs();
        }

        public Builder(WirelessSsidsSpeedBurstArgs defaults) {
            $ = new WirelessSsidsSpeedBurstArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Boolean indicating whether or not to allow users to temporarily exceed the bandwidth limit for short periods while still keeping them under the bandwidth limit over time.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Boolean indicating whether or not to allow users to temporarily exceed the bandwidth limit for short periods while still keeping them under the bandwidth limit over time.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public WirelessSsidsSpeedBurstArgs build() {
            return $;
        }
    }

}